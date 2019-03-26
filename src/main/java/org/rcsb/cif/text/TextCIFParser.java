package org.rcsb.cif.text;

import org.rcsb.cif.api.CIFFile;
import org.rcsb.cif.api.CIFParser;
import org.rcsb.cif.api.DataBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextCIFParser implements CIFParser {
    @Override
    public CIFFile parse(InputStream inputStream) throws IOException {
        return parseInternal(new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining(System.lineSeparator())));
    }

    private void eatValue(TokenizerState state) {
        while (state.position < state.length) {
            switch (Character.codePointAt(state.data, state.position)) {
                case 9:
                case 10:
                case 13:
                case 32: /* \t, \n, \r, ' ' */
                    state.currentTokenEnd = state.position;
                    return;
                default:
                    ++state.position;
                    break;
            }
        }
        state.currentTokenEnd = state.position;
    }

    private void eatEscaped(TokenizerState state, int esc) {
        int next;
        int c;

        ++state.position;
        while (state.position < state.length) {
            c = Character.codePointAt(state.data, state.position);

            if (c == esc) {
                try {
                    next = Character.codePointAt(state.data, state.position + 1);
                    switch (next) {
                        case 9:
                        case 10:
                        case 13:
                        case 32: /* \t, \n, \r, ' ' */
                            // get rid of quotes
                            state.currentTokenStart++;
                            state.currentTokenEnd = state.position;
                            state.isEscaped = true;
                            ++state.position;
                            return;
                        default:
                            ++state.position;
                            break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // get rid of quotes
                    state.currentTokenStart++;
                    state.currentTokenEnd = state.position;
                    state.isEscaped = true;
                    ++state.position;
                    return;
                }
            } else {
                // handle "xxxNEWLINE => "xxx
                if (c == 10 || c == 13) {
                    state.currentTokenEnd = state.position;
                    return;
                }
                ++state.position;
            }
        }

        state.currentTokenEnd = state.position;
    }

    int eatMultiline(TokenizerState state) {
        int prev = 59;
        int pos = state.position + 1;
        int c;
        while (pos < state.length) {
            c = Character.codePointAt(state.data, pos);
            if (c == 59 && (prev == 10 || prev == 13) /* ;, \n, \r */) {
                state.position = pos + 1;
                // get rid of ;
                state.currentTokenStart++;

                // remove trailing newlines
                pos--;
                c = Character.codePointAt(state.data, pos);
                while (c == 10 || c == 13) {
                    pos--;
                    c = Character.codePointAt(state.data, pos);
                }
                state.currentTokenEnd = pos + 1;

                state.isEscaped = true;
                return prev;
            } else {
                // handle line numbers
                if (c == 13 /* \r */) {
                    state.currentLineNumber++;
                } else if (c == 10 && prev != 13 /* \r\n */) {
                    state.currentLineNumber++;
                }

                prev = c;
                ++pos;
            }
        }

        state.position = pos;
        return prev;
    }

    void skipCommentLine(TokenizerState state) {
        while (state.position < state.length) {
            int c = Character.codePointAt(state.data, state.position);
            if (c == 10 || c == 13) {
                return;
            }
            ++state.position;
        }
    }

    int skipWhitespace(TokenizerState state) {
        int prev = 10;
        while (state.position < state.length) {
            int c = Character.codePointAt(state.data, state.position);
            switch (c) {
                case 9: case 32: /* \t, ' ' */
                    prev = c;
                    ++state.position;
                    break;
                case 10: /* \n */
                    if (prev != 13) {
                        ++state.currentLineNumber;
                    }
                    prev = c;
                    ++state.position;
                    break;
                case 13: /* \r */
                    prev = c;
                    ++state.position;
                    ++state.currentLineNumber;
                    break;
                default:
                    return prev;
            }
        }
        return prev;
    }

    boolean isData(TokenizerState state) {
        int c = Character.codePointAt(state.data, state.currentTokenStart);
        if (c != 68 && c != 100) {
            return false;
        }
        c = Character.codePointAt(state.data, state.currentTokenStart + 1);
        if (c != 65 && c != 97) {
            return false;
        }
        c = Character.codePointAt(state.data, state.currentTokenStart + 2);
        if (c != 84 && c != 116) {
            return false;
        }
        c = Character.codePointAt(state.data, state.currentTokenStart + 3);
        return c == 65 || c == 97;
    }

    boolean isSave(TokenizerState state) {
        // here we already assume the 5th char is _ and that the length >= 5

        // s/S
        int c = Character.codePointAt(state.data, state.currentTokenStart);
        if (c != 83 && c != 115) {
            return false;
        }
        // a/A
        c = Character.codePointAt(state.data, state.currentTokenStart + 1);
        if (c != 65 && c != 97) {
            return false;
        }
        // v/V
        c = Character.codePointAt(state.data, state.currentTokenStart + 2);
        if (c != 86 && c != 118) {
            return false;
        }
        // e/E
        c = Character.codePointAt(state.data, state.currentTokenStart + 3);
        return c == 69 || c == 101;
    }

    boolean isLoop(TokenizerState state) {
        // here we already assume the 5th char is _ and that the length >= 5

        if (state.currentTokenEnd - state.currentTokenStart != 5) {
            return false;
        }

        // l/L
        int c = Character.codePointAt(state.data, state.currentTokenStart);
        if (c != 76 && c != 108) {
            return false;
        }
        // o/O
        c = Character.codePointAt(state.data, state.currentTokenStart + 1);
        if (c != 79 && c != 111) {
            return false;
        }
        // o/O
        c = Character.codePointAt(state.data, state.currentTokenStart + 2);
        if (c != 79 && c != 111) {
            return false;
        }
        // p/P
        c = Character.codePointAt(state.data, state.currentTokenStart + 3);
        return c == 80 || c == 112;
    }

    boolean isNamespace(TokenizerState state, int start, int end) {
        int i;
        int nsLen = end - start;
        int offset = state.currentTokenStart - start;
        int tokenLen = state.currentTokenEnd - state.currentTokenStart;

        if (tokenLen < nsLen) {
            return false;
        }

        for (i = start; i < end; ++i) {
            if (Character.codePointAt(state.data, i) != Character.codePointAt(state.data, i + offset)) {
                return false;
            }
        }

        if (nsLen == tokenLen) {
            return true;
        }
        return Character.codePointAt(state.data, i + offset) == 46;
    }

    int getNamespaceEnd(TokenizerState state) {
        int i = state.currentTokenStart;
        for (; i < state.currentTokenEnd; i++) {
            if (Character.codePointAt(state.data, i) == 46) {
                return i;
            }
        }
        return i;
    }

    String getNamespace(TokenizerState state, int endIndex) {
        return state.data.substring(state.currentTokenStart, endIndex);
    }

    String getTokenString(TokenizerState state) {
        return state.data.substring(state.currentTokenStart, state.currentTokenEnd);
    }

    /**
     * Move to the next token.
     */
    void moveNextInternal(TokenizerState state) {
        int prev = skipWhitespace(state);

        if (state.position >= state.length) {
            state.currentTokenType = CIFTokenType.END;
            return;
        }

        state.currentTokenStart = state.position;
        state.currentTokenEnd = state.position;
        state.isEscaped = false;
        int c = Character.codePointAt(state.data, state.position);
        switch (c) {
            case 35: // #, comment
                skipCommentLine(state);
                state.currentTokenType = CIFTokenType.COMMENT;
                break;
            case 34: // ", escaped value
            case 39: // ', escaped value
                eatEscaped(state, c);
                state.currentTokenType = CIFTokenType.VALUE;
                break;
            case 59: // ;, possible multiline value
                // multiline value must start at the beginning of the line.
                if (prev == 10 || prev == 13) { // /n or /r
                    eatMultiline(state);
                } else {
                    eatValue(state);
                }
                state.currentTokenType = CIFTokenType.VALUE;
                break;
            default:
                eatValue(state);
                // escaped is always Value
                if (state.isEscaped) {
                    state.currentTokenType = CIFTokenType.VALUE;
                    // _ always means column name
                } else if (Character.codePointAt(state.data, state.currentTokenStart) == 95) { // _
                    state.currentTokenType = CIFTokenType.COLUMN_NAME;
                    // 5th char needs to be _ for data_ or loop_
                } else if (state.currentTokenEnd - state.currentTokenStart >= 5 &&
                        Character.codePointAt(state.data, state.currentTokenStart + 4) == 95) {
                    if (isData(state)) state.currentTokenType = CIFTokenType.DATA;
                    else if (isSave(state)) state.currentTokenType = CIFTokenType.SAVE;
                    else if (isLoop(state)) state.currentTokenType = CIFTokenType.LOOP;
                    else state.currentTokenType = CIFTokenType.VALUE;
                    // all other tests failed, we are at Value token.
                } else {
                    state.currentTokenType = CIFTokenType.VALUE;
                }
                break;
        }
    }

    void moveNext(TokenizerState state) {
        moveNextInternal(state);
        while (state.currentTokenType == CIFTokenType.COMMENT) {
            moveNextInternal(state);
        }
    }

    /**
     * Reads a category containing a single row.
     */
    void handleSingle(TokenizerState tokenizer, TextDataBlock block) {
        int nsStart = tokenizer.currentTokenStart;
        int nsEnd = getNamespaceEnd(tokenizer);
        String name = getNamespace(tokenizer, nsEnd);

        String column;
        List<String> columns = new ArrayList<>();
        List<Integer> tokens = new ArrayList<>();
        int tokenCount = 0;

        while (true) {
            if (tokenizer.currentTokenType != CIFTokenType.COLUMN_NAME || !isNamespace(tokenizer, nsStart, nsEnd)) {
                break;
            }

            column = getTokenString(tokenizer);
            moveNext(tokenizer);
            if (tokenizer.currentTokenType != CIFTokenType.VALUE) {
                throw new Error();
            }
            columns.add(column);
            tokens.add(tokenizer.currentTokenStart);
            tokens.add(tokenizer.currentTokenEnd);
            tokenCount++;

            moveNext(tokenizer);
        }

        block.addCategory(new TextCategory(block.getData(),
                name,
                nsStart,
                tokenizer.currentTokenStart,
                columns,
                tokens.stream().mapToInt(i -> i).toArray(),
                tokenCount));
    }

    /**
     * Reads a loop.
     */
    void handleLoop(TokenizerState tokenizer, TextDataBlock block) {
        int start = tokenizer.currentTokenStart;
        int loopLine = tokenizer.currentLineNumber;

        moveNext(tokenizer);
        String name = getNamespace(tokenizer, getNamespaceEnd(tokenizer));
        List<String> columns = new ArrayList<>();
        List<Integer> tokens = new ArrayList<>();
        int tokenCount = 0;

        while (tokenizer.currentTokenType == CIFTokenType.COLUMN_NAME) {
            columns.add(getTokenString(tokenizer));
            moveNext(tokenizer);
        }

        while (tokenizer.currentTokenType == CIFTokenType.VALUE) {
            tokens.add(tokenizer.currentTokenStart);
            tokens.add(tokenizer.currentTokenEnd);
            tokenCount++;
            moveNext(tokenizer);
        }

        if (tokenCount % columns.size() != 0) {
            throw new Error("The number of values for loop starting at line " + loopLine + " is not a multiple of the number of columns.");
        }

        block.addCategory(new TextCategory(block.getData(),
                name,
                start,
                tokenizer.currentTokenStart,
                columns,
                tokens.stream().mapToInt(i -> i).toArray(),
                tokenCount));
    }

    /**
     * Parses an mmCIF file.
     *
     * @returns CifParserResult wrapper of the result.
     */
    CIFFile parseInternal(String data) {
        TokenizerState tokenizer = new TokenizerState(data);
        String id;
        CIFFile file = new TextCIFFile(data);
        TextDataBlock block = new TextDataBlock(data, "default");
        TextDataBlock saveFrame = new TextDataBlock(data, "empty");
        boolean inSaveFrame = false;
        List<DataBlock> blockSaveFrames;

        moveNext(tokenizer);
        while (tokenizer.currentTokenType != CIFTokenType.END) {
            CIFTokenType token = tokenizer.currentTokenType;

            // Data block
            if (token == CIFTokenType.DATA) {
                if (inSaveFrame) {
                    throw new Error("Unexpected data block inside a save frame.");
                }
                if (block.getCategories().size() > 0) {
                    file.getDataBlocks().add(block);
                }
                block = new TextDataBlock(data,
                        data.substring(tokenizer.currentTokenStart + 5, tokenizer.currentTokenEnd));
                moveNext(tokenizer);
                // Save frame
            } else if (token == CIFTokenType.SAVE) {
                id = data.substring(tokenizer.currentTokenStart + 5, tokenizer.currentTokenEnd);

                if (id.length() == 0) {
                    if (saveFrame.getCategories().size() > 0) {
                        blockSaveFrames = block.getAdditionalData().computeIfAbsent("saveFrames", k -> new ArrayList<>());
                        blockSaveFrames.add(saveFrame);
                    }
                    inSaveFrame = false;
                } else {
                    if (inSaveFrame) {
                        throw new Error("Save frames cannot be nested.");
                    }
                    inSaveFrame = true;
                    saveFrame = new TextDataBlock(data, id);
                }
                moveNext(tokenizer);
                // Loop
            } else if (token == CIFTokenType.LOOP) {
                handleLoop(tokenizer, inSaveFrame ? saveFrame : block);
                // Single row
            } else if (token == CIFTokenType.COLUMN_NAME) {
                handleSingle(tokenizer, inSaveFrame ? saveFrame : block);
                // Out of options
            } else {
                throw new Error("Unexpected token. Expected data_, loop_, or data name.");
            }
        }

        // Check if the latest save frame was closed.
        if (inSaveFrame) {
            throw new Error("Unfinished save frame (`" + saveFrame.getHeader() + "`).");
        }

        if (block.getCategories().size() > 0) {
            file.getDataBlocks().add(block);
        }

        return file;
    }
}
