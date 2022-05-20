package org.rcsb.cif.text;

import org.rcsb.cif.ParsingException;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;
import org.rcsb.cif.model.text.TextCategory;
import org.rcsb.cif.model.text.TextColumn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class TokenizerState {
    private final String data;
    private final int length;

    private int position;
    private boolean isEscaped;
    private boolean isImportGet;
    boolean inSaveFrame;

    private int lineNumber;
    private CifTokenType tokenType;
    private int tokenStart;
    private int tokenEnd;

    TokenizerState(String data) {
        this.data = data;
        this.length = data.length();

        this.position = 0;
        this.isEscaped = false;
        this.isImportGet = false;
        this.inSaveFrame = false;

        this.lineNumber = 1;
        this.tokenType = CifTokenType.END;
        this.tokenStart = 0;
        this.tokenEnd = 0;
    }

    CifTokenType getTokenType() {
        return tokenType;
    }

    int getLineNumber() {
        return lineNumber;
    }

    int getTokenStart() {
        return tokenStart;
    }

    int getTokenEnd() {
        return tokenEnd;
    }

    String getData() {
        return data;
    }

    /**
     * Eat everything until a whitespace/newline occurs.
     */
    private void eatValue() {
        while (position < length) {
            switch (data.charAt(position)) {
                case '\t': case '\n': case '\r': case ' ':
                    tokenEnd = position;
                    return;
                default:
                    position++;
                    break;
            }
        }
        tokenEnd = position;
    }

    /**
     * Eats an escaped value. Handles the "degenerate" cases as well.
     * "Degenerate" cases:
     *  - 'xx'x' => xx'x
     *  - 'xxxNEWLINE => 'xxx
     * @param esc escaping char
     */
    private void eatEscaped(int esc) {
        position++;
        while (position < length) {
            int c = data.charAt(position);

            if (c == esc) {
                // check for end of file
                if (position + 1 >= length) {
                    tokenStart++;
                    tokenEnd = position;
                    isEscaped = true;
                    position++;
                    return;

                }

                int next = data.charAt(position + 1);
                if (next == '\t' || next == '\n' || next == '\r' || next == ' ') {
                    // get rid of the quotes
                    tokenStart++;
                    tokenEnd = position;
                    isEscaped = true;
                    position++;
                    return;
                }

            } else {
                // handle 'xxxNEWLINE => 'xxx
                if (c == '\r' || c == '\n') {
                    tokenEnd = position;
                    return;
                }
            }
            position++;
        }

        tokenEnd = position;
    }

    /**
     * Eats an escaped value "triple quote" (''') value.
     */
    private void eatTripleQuote() {
        position += 3;
        while (position < length) {
            if (data.charAt(position) == '\'' && isTripleQuoteAtPosition()) {
                tokenStart += 3;
                tokenEnd = position;
                isEscaped = true;
                position += 3;
                return;
            }

            position++;
        }

        tokenEnd = position;
    }

    private void eatImportGet() {
        // _import.get [{'save':orient_matrix  'file':templ_attr.cif}]
        // skipWhitespace(state)
        while (position < length) {
            if (data.charAt(position) == ']') {
                position++;
                tokenEnd = position;
                isImportGet = false;
                return;
            } else {
                position++;
            }
        }
    }

    /**
     * Eats a multiline token of the form NL;....NL;
     */
    private void eatMultiline() {
        int prev = ';';
        int pos = position + 1;

        while (pos < length) {
            int c = data.charAt(pos);
            if (c == ';' && (prev == '\n' || prev == '\r')) {
                position = pos + 1;
                // get rid of the ;
                tokenStart++;

                // remove trailing newlines
                pos--;
                c = data.charAt(pos);
                while (c == '\n' || c == '\r') {
                    pos--;
                    c = data.charAt(pos);
                }
                tokenEnd = pos + 1;

                isEscaped = true;
                return;
            } else {
                // handle line numbers
                if (c == '\r') {
                    lineNumber++;
                } else if (c == '\n' && prev != '\r') {
                    lineNumber++;
                }

                prev = c;
                pos++;
            }
        }

        position = pos;
    }

    /**
     * Skips until \n or \r occurs -- therefore the newlines get handled by the "skipWhitespace" function.
     */
    private void skipCommentLine() {
        while (position < length) {
            int c = data.charAt(position);
            if (c == '\r' || c == '\n') {
                return;
            }
            position++;
        }
    }

    /**
     * Skips all whitespaces - space, tab, \r, \n. Handles incrementing the line number.
     * @return the last character read
     */
    private int skipWhitespace() {
        int prev = '\n';
        while (position < length) {
            int c = data.charAt(position);
            switch (c) {
                case '\t': case ' ':
                    prev = c;
                    position++;
                    break;
                case '\n':
                    // handle \r\n
                    if (prev != '\r') {
                        lineNumber++;
                    }
                    prev = c;
                    position++;
                    break;
                case '\r':
                    prev = c;
                    position++;
                    lineNumber++;
                    break;
                default:
                    return prev;
            }
        }
        return prev;
    }

    private boolean isData() {
        // here we already assume the 5th char is _ and that the length >= 5
        return "data".equalsIgnoreCase(data.substring(tokenStart, tokenStart + 4));
    }

    private boolean isSave() {
        // here we already assume the 5th char is _ and that the length >= 5
        return "save".equalsIgnoreCase(data.substring(tokenStart, tokenStart + 4));
    }

    private boolean isLoop() {
        // here we already assume the 5th char is _ and that the length >= 5
        return "loop".equalsIgnoreCase(data.substring(tokenStart, tokenStart + 4));
    }

    private boolean isImportGet() {
        try {
            return "import.get".equalsIgnoreCase(data.substring(tokenStart + 1, tokenStart + 11));
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean isTripleQuoteAtPosition() {
        if (length - position < 2) {
            return false;
        }
        if (data.charAt(position + 1) != 39) return false; // '
        return data.charAt(position + 2) == 39; // '
    }

    /**
     * Checks if the current token shares the namespace with string at <start,end).
     */
    private boolean isNamespace(int start, int end) {
        int i;
        int nsLen = end - start;
        int offset = tokenStart - start;
        int tokenLen = tokenEnd - tokenStart;

        if (tokenLen < nsLen) {
            return false;
        }

        for (i = start; i < end; i++) {
            if (data.charAt(i) != data.charAt(i + offset)) {
                return false;
            }
        }

        if (nsLen == tokenLen) {
            return true;
        }
        return data.charAt(i + offset) == '.';
    }

    /**
     * Returns the index of '.' in the current token. If no '.' is present, returns currentTokenEnd.
     */
    private int getNamespaceEnd() {
        int index = data.substring(tokenStart, tokenEnd).indexOf(".");
        return index != -1 ? index + tokenStart : tokenEnd;
    }

    /**
     * Get the namespace string. endIndex is obtained by the getNamespaceEnd() function.
     */
    private String getNamespace(int endIndex) {
        return data.substring(tokenStart, endIndex);
    }

    private String getTokenString() {
        return data.substring(tokenStart, tokenEnd);
    }

    /**
     * Move to the next token.
     */
    private void moveNextInternal() {
        int prev = skipWhitespace();

        // end of file reached
        if (position >= length) {
            tokenType = CifTokenType.END;
            return;
        }

        tokenStart = position;
        tokenEnd = position;
        isEscaped = false;
        char c = data.charAt(position);
        switch (c) {
            case '#':
                skipCommentLine();
                tokenType = CifTokenType.COMMENT;
                break;
            case '"': case '\'':
                if (c == '\'' && isTripleQuoteAtPosition()) {
                    eatTripleQuote();
                    tokenType = CifTokenType.VALUE;
                    break;
                }
                eatEscaped(c);
                tokenType = CifTokenType.VALUE;
                break;
            case ';': // possible multiline value
                // multiline value must start at the beginning of the line
                if (prev == '\n' || prev == '\r') {
                    eatMultiline();
                } else {
                    eatValue();
                }
                tokenType = CifTokenType.VALUE;
                break;
            default:
                if (isImportGet) {
                    eatImportGet();
                } else {
                    eatValue();
                }

                // escaped is always Value
                if (isEscaped) {
                    tokenType = CifTokenType.VALUE;
                    // _ always means column name, including _import.get
                } else if (data.charAt(tokenStart) == '_') {
                    if (inSaveFrame && isImportGet()) {
                        isImportGet = true;
                    }
                    tokenType = CifTokenType.COLUMN_NAME;
                    // 5th char needs to be _ for data_ or loop_
                } else if (tokenEnd - tokenStart >= 5 && data.charAt(tokenStart + 4) == '_') {
                    if (isData()) {
                        tokenType = CifTokenType.DATA;
                    } else if (isSave()) {
                        tokenType = CifTokenType.SAVE;
                    } else if (isLoop()) {
                        tokenType = CifTokenType.LOOP;
                    } else {
                        tokenType = CifTokenType.VALUE;
                    }
                    // all other tests failed, we are at Value token.
                } else {
                    tokenType = CifTokenType.VALUE;
                }
        }
    }

    /**
     * Move to the next non-comment token.
     */
    void moveNext() {
        moveNextInternal();
        while (tokenType == CifTokenType.COMMENT) {
            moveNextInternal();
        }
    }

    /**
     * Reads a category containing a single row.
     * @param ctx the context values will be assigned to
     * @throws ParsingException throws when file is malformed
     */
    void handleSingle(FrameContext ctx) throws ParsingException {
        final int nsStart = tokenStart;
        final int nsEnd = getNamespaceEnd();
        final String name = getNamespace(nsEnd);
        final boolean isFlat = isFlatNamespace();
        final Map<String, Column<?>> fields = new LinkedCaseInsensitiveMap<>();
        final String categoryName = name.substring(1);

        while (tokenType == CifTokenType.COLUMN_NAME && isNamespace(nsStart, nsEnd)) {
            String columnName = isFlat ? "" : getTokenString().substring(name.length() + 1);
            moveNext();
            if (tokenType != CifTokenType.VALUE) {
                throw new ParsingException("Expected value.", lineNumber);
            }

            Column<?> cifColumn = createColumn(columnName, data, new int[] { tokenStart }, new int[] { tokenEnd });
            fields.put(columnName, cifColumn);
            moveNext();
        }

        ctx.getCategories().put(categoryName, createCategory(categoryName, fields));
    }

    /**
     * Reads a loop.
     * @param ctx the context values will be assigned to
     */
    void handleLoop(FrameContext ctx) {
        final int loopLine = lineNumber;

        moveNext();
        final String name = getNamespace(getNamespaceEnd());
        final boolean isFlat = isFlatNamespace();
        // performance 1.2: resizing of token lists is pronounced - provide initial guess to avoid excessive resizing
        int columnCountEstimate = 32;
        int rowCountEstimate = "_atom_site".equals(name) ? data.length() / 100 : 32;
        final List<String> columnNames = new ArrayList<>(columnCountEstimate);
        final List<List<Integer>> start = new ArrayList<>(columnCountEstimate);
        final List<List<Integer>> end = new ArrayList<>(columnCountEstimate);
        int tokenCount = 0;

        while (tokenType == CifTokenType.COLUMN_NAME) {
            String columnName = isFlat ? getTokenString() : getTokenString().substring(name.length() + 1);
            columnNames.add(columnName);
            moveNext();
            start.add(new ArrayList<>(rowCountEstimate));
            end.add(new ArrayList<>(rowCountEstimate));
        }

        while (tokenType == CifTokenType.VALUE) {
            int i = tokenCount % columnNames.size();
            start.get(i).add(tokenStart);
            end.get(i).add(tokenEnd);
            moveNext();
            tokenCount++;
        }

        if (start.size() % columnNames.size() != 0) {
            throw new ParsingException("The number of values for loop starting at line " + loopLine +
                    " is not a multiple of the number of columns.");
        }

        if (isFlat) {
            for (int i = 0; i < start.size(); i++) {
                String flatName = columnNames.get(i).substring(1);
                Column<?> cifColumn = createColumn("",
                        data,
                        toArray(start.get(i)),
                        toArray(end.get(i)));
                Map<String, Column<?>> columnMap = new LinkedHashMap<>(1);
                columnMap.put("", cifColumn);
                ctx.getCategories().put(flatName, createCategory(flatName, columnMap));
            }
        } else {
            String categoryName = name.substring(1);
            Map<String, Column<?>> columns = new LinkedCaseInsensitiveMap<>();
            for (int i = 0; i < start.size(); i++) {
                Column<?> cifColumn = createColumn(columnNames.get(i),
                        data,
                        toArray(start.get(i)),
                        toArray(end.get(i)));
                columns.put(columnNames.get(i), cifColumn);
            }
            ctx.getCategories().put(categoryName, createCategory(categoryName, columns));
        }
    }

    private boolean isFlatNamespace() {
        return !data.substring(tokenStart, tokenEnd).contains(".");
    }

    private int[] toArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private Column<?> createColumn(String columnName, String data, int[] startToken, int[] endToken) {
        return new TextColumn(columnName, startToken.length, data, startToken, endToken);
    }

    private Category createCategory(String categoryName, Map<String, Column<?>> textColumns) {
        return new TextCategory(categoryName, textColumns);
    }
}
