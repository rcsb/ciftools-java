package org.rcsb.cif.text;

class TokenizerState {
    String data;
    int position;
    int length;
    boolean isEscaped;
    int currentLineNumber;
    CIFTokenType currentTokenType;
    int currentTokenStart;
    int currentTokenEnd;

    TokenizerState(String data) {
        this.data = data;
    }
}
