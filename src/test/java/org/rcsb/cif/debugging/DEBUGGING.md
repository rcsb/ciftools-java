# Code & Tools for Debugging BinaryCIF

Debugging issues with BinaryCIF files is challenging. This package provides code snippets and tooling that come in handy
when you need to investigate issues with a particular file. That file may or may not be written by another encoder.

## How to Verify Encodings

BinaryCIF files are decoded lazily by the Java and JavaScript/TypeScript implementations. This means you can create a 
`CifFile` object but might run into issues when accessing compromised columns. Make sure to access all present 
categories and columns ensure that all data of a file is written properly.

Do that by looping over all categories and request all `Column<?>` instances for all categories.
`VerifyEncodingTest#whenReadingFile_thenAllColumnsAccessible` demonstrates how to do that.