package org.rcsb.cif.parser;

import org.rcsb.cif.model.*;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CifParser {
    private static final String MIN_VERSION = "0.3";

    public static CifFile parseBinary(InputStream inputStream) throws ParsingException, IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[1024];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();

        return parseBinary(byteArray);
    }

    @SuppressWarnings("unchecked")
    private static CifFile parseBinary(byte[] data) throws ParsingException {
        Map<String, Object> unpacked = new ByteArray(data).parseAsMap();

        String versionString = (String) unpacked.get("version");
        if (!versionString.startsWith(MIN_VERSION)) {
            throw new ParsingException("Unsupported format version. Current " + versionString +
                    ", required " + MIN_VERSION + ".");
        }

        List<CifBlock> dataBlocks = Stream.of((Object[]) (unpacked.get("dataBlocks")))
                .map(entry -> {
                    Map<String, Object> map = (Map<String, Object>) entry;
                    String header = (String) map.get("header");
                    Map<String, CifCategory> categories = new LinkedHashMap<>();

                    for (Object o : (Object[]) map.get("categories")) {
                        Map<String, Object> cat = (Map<String, Object>) o;
                        String name = (String) cat.get("name");
                        categories.put(name.substring(1), createCategory(cat));
                    }

                    return new CifBlock(categories, header, new ArrayList<>());
                })
                .collect(Collectors.toList());

        return new CifFile(dataBlocks);
    }

    private static CifCategory createCategory(Map<String, Object> encodedCategory) {
        String name = (String) encodedCategory.get("name");
        int rowCount = (int) encodedCategory.get("rowCount");
        Object[] encodedFields = (Object[]) encodedCategory.get("columns");
        return new BinaryCifCategory(name, rowCount, encodedFields);
    }

    public static CifFile parseText(InputStream inputStream) throws ParsingException {
        return parseText(new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining(System.lineSeparator())));
    }

    public static CifFile parseText(String data) throws ParsingException {
        final List<CifBlock> dataBlocks = new ArrayList<>();
        final TokenizerState tokenizer = new TokenizerState(data);
        String blockHeader = "";

        FrameContext blockCtx = new FrameContext();

        boolean inSaveFrame = false;

        // the next three initial values are never used in valid files
        List<CifFrame> saveFrames = new ArrayList<>();
        FrameContext saveCtx = new FrameContext();
        CifFrame saveFrame = new CifFrame(saveCtx.getCategories(), "");

        tokenizer.moveNext();
        while (tokenizer.getTokenType() != CifTokenType.END) {
            CifTokenType token = tokenizer.getTokenType();

            // data block
            if (token == CifTokenType.DATA) {
                if (inSaveFrame) {
                    throw new ParsingException("Unexpected data block inside a save frame.", tokenizer.getLineNumber());
                }
                if (blockCtx.getCategories().size() > 0) {
                    dataBlocks.add(new CifBlock(blockCtx.getCategories(), blockHeader, saveFrames));
                }
                blockHeader = tokenizer.getData().substring(tokenizer.getTokenStart() + 5, tokenizer.getTokenEnd());
                blockCtx = new FrameContext();
                saveFrames.clear();
                tokenizer.moveNext();
            // save frame
            } else if (tokenizer.getTokenType() == CifTokenType.SAVE) {
                final String saveHeader = tokenizer.getData().substring(tokenizer.getTokenStart() + 5, tokenizer.getTokenEnd());
                if (saveHeader.isEmpty()) {
                    if (saveCtx.getCategories().size() > 0) {
                        saveFrames.add(saveFrame);
                    }
                    inSaveFrame = false;
                } else {
                    if (inSaveFrame) {
                        throw new ParsingException("Save frames cannot be nested.", tokenizer.getLineNumber());
                    }
                    inSaveFrame = true;
                    final String safeHeader = tokenizer.getData().substring(tokenizer.getTokenStart() + 5, tokenizer.getTokenEnd());
                    saveCtx = new FrameContext();
                    saveFrame = new CifFrame(saveCtx.getCategories(), safeHeader);
                }
                tokenizer.moveNext();
            // loop
            } else if (token == CifTokenType.LOOP) {
                tokenizer.handleLoop(inSaveFrame ? saveCtx : blockCtx);
            // single row
            } else if (token == CifTokenType.COLUMN_NAME) {
                tokenizer.handleSingle(inSaveFrame ? saveCtx : blockCtx);
            // out of options
            } else {
                throw new ParsingException("Unexpected token (" + token + "). Expected data_, loop_, or data name.", tokenizer.getLineNumber());
            }
        }

        // check if the latest save frame was terminated
        if (inSaveFrame) {
            throw new ParsingException("Unfinished save frame (" + saveFrame.getHeader() + ")", tokenizer.getLineNumber());
        }

        if (blockCtx.getCategories().size() > 0 || saveFrames.size() > 0) {
            dataBlocks.add(new CifBlock(blockCtx.getCategories(), blockHeader, saveFrames));
        }

        return new CifFile(dataBlocks);
    }
}
