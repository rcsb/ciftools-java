package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ARRAY_DATA  category are the containers for
 * the array data items described in the category ARRAY_STRUCTURE.
 * 
 * It is recognized that the data in this category need to be used in
 * two distinct ways.  During a data collection the lack of ancillary
 * data and timing constraints in processing data may dictate the
 * need to make a 'miniCBF', nothing more than an essential minimum
 * of information to record the results of the data collection.  In that
 * case it is proper to use the ARRAY_DATA  category as a
 * container for just a single image and a compacted, beamline-dependent
 * list of data collection parameter values.  In such
 * a case, only the tags '_array_data.header_convention',
 * '_array_data.header_contents'  and '_array_data.data' need be
 * populated.
 * 
 * For full processing and archiving, most of the tags in this
 * dictionary will need to be populated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ArrayData extends DelegatingCategory {
    public ArrayData(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "array_id":
                return getArrayId();
            case "binary_id":
                return getBinaryId();
            case "data":
                return getData();
            case "external_data_id":
                return getExternalDataId();
            case "header_contents":
                return getHeaderContents();
            case "header_convention":
                return getHeaderConvention();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This item is a pointer to _array_structure.id  in the
     * ARRAY_STRUCTURE  category.
     * 
     * If not given, it defaults to 1.
     * @return StrColumn
     */
    public StrColumn getArrayId() {
        return delegate.getColumn("array_id", DelegatingStrColumn::new);
    }

    /**
     * This item is an integer identifier which, along with
     * _array_data.array_id, should uniquely identify the
     * particular block of array data.
     * 
     * If _array_data.binary_id  is not explicitly given,
     * it defaults to 1.
     * 
     * The value of _array_data.binary_id  distinguishes
     * among multiple sets of data with the same array
     * structure.
     * 
     * If the MIME header of the data array specifies a
     * value for X-Binary-ID, the value of  _array_data.binary_id
     * should be equal to the value given for X-Binary-ID.
     * @return IntColumn
     */
    public IntColumn getBinaryId() {
        return delegate.getColumn("binary_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _array_data.data  contains the array data
     * encapsulated in a STAR string.  The value of this item is
     * required unless a value is given for
     * _array_data.external_data_id  instead, in which
     * case, a null value of '.' should be given here.
     * 
     * The representation used is a variant on the
     * Multipurpose Internet Mail Extensions (MIME) specified
     * in RFC 2045-2049 by N. Freed et al.  The boundary
     * delimiter used in writing an imgCIF or CBF is
     * \n--CIF-BINARY-FORMAT-SECTION-- (including the
     * required initial \n--, where \n represents the system
     * newline character(s)).
     * 
     * The Content-Type may be any of the discrete types permitted
     * in RFC 2045; 'application/octet-stream' is recommended
     * for diffraction images in the ARRAY_DATA category.
     * Note:  When appropriate in other categories, e.g. for
     * photographs of crystals, more precise types, such as
     * 'image/jpeg', 'image/tiff', 'image/png', etc. should be used.
     * 
     * If an octet stream was compressed, the compression should
     * be specified by the parameter
     * conversions="X-CBF_PACKED"
     * or the parameter
     * conversions="X-CBF_CANONICAL"
     * or the parameter
     * conversions="X-CBF_BYTE_OFFSET"
     * or the parameter
     * conversions="X-CBF_BACKGROUND_OFFSET_DELTA"
     * 
     * If the parameter
     * conversions="X-CBF_PACKED"
     * is given it may be further modified with the parameters
     * uncorrelated_sections
     * or
     * flat
     * (e.g. conversions="X-CBF_PACKED flat").
     * In such cases the _array_structure.compression_type_flag
     * should also be present with the corresponding value.
     * 
     * If the "uncorrelated_sections" parameter is
     * given, each section will be compressed without using
     * the prior section for averaging.
     * 
     * If the "flat" parameter is given, each
     * image will be treated as one long row.
     * 
     * Note that X-CBF_CANONICAL and X-CBF_PACKED are
     * slower but more efficient compressions than the others.
     * The X-CBF_BYTE_OFFSET compression is a good compromise
     * between speed and efficiency for ordinary diffraction
     * images.  The X-CBF_BACKGROUND_OFFSET_DELTA compression
     * is oriented towards sparse data, such as masks and
     * tables of replacement pixel values for images with
     * overloaded spots.
     * 
     * The Content-Transfer-Encoding may be 'BASE64',
     * 'Quoted-Printable', 'X-BASE8', 'X-BASE10',
     * 'X-BASE16' or 'X-BASE32K', for an imgCIF or 'BINARY'
     * for a CBF.  The octal, decimal and hexadecimal transfer
     * encodings are provided for convenience in debugging and
     * are not recommended for archiving and data interchange.
     * 
     * In a CIF, one of the parameters 'charset=us-ascii',
     * 'charset=utf-8' or 'charset=utf-16' may be used on the
     * Content-Transfer-Encoding to specify the character set
     * used for the external presentation of the encoded data.
     * If no charset parameter is given, the character set of
     * the enclosing CIF is assumed.  In any case, if a BOM
     * flag is detected (FE FF for big-endian UTF-16, FF FE for
     * little-endian UTF-16 or EF BB BF for UTF-8) is detected,
     * the indicated charset will be assumed until the end of the
     * encoded data or the detection of a different BOM.  The
     * charset of the Content-Transfer-Encoding is not the character
     * set of the encoded data, only the character set of the
     * presentation of the encoded data and should be respecified
     * for each distinct STAR string.
     * 
     * In an imgCIF file, the encoded binary data begin after
     * the empty line terminating the header.  In an imgCIF file,
     * the encoded binary data ends with the terminating boundary
     * delimiter '\n--CIF-BINARY-FORMAT-SECTION----'
     * in the currently effective charset or with the '\n;'
     * that terminates the STAR string.
     * 
     * In a CBF, the raw binary data begin after an empty line
     * terminating the header and after the sequence:
     * 
     * Octet   Hex   Decimal  Purpose
     * 0     0C       12    Ctrl-L: page break
     * 1     1A       26    Ctrl-Z: stop listings, MS-DOS
     * 2     04       04    Ctrl-D: stop listings, UNIX
     * 3     D5      213    binary section begins
     * 
     * None of these octets are included in the calculation of
     * the message size or in the calculation of the
     * message digest.
     * 
     * The X-Binary-Size header specifies the size of the
     * equivalent binary data in octets.  If compression was
     * used, this size is the size after compression, including
     * any book-keeping fields.  An adjustment is made for
     * the deprecated binary formats in which eight bytes of binary
     * header are used for the compression type.  In this case,
     * the eight bytes used for the compression type are subtracted
     * from the size, so that the same size will be reported
     * if the compression type is supplied in the MIME header.
     * Use of the MIME header is the recommended way to
     * supply the compression type.  In general, no portion of
     * the  binary header is included in the calculation of the size.
     * 
     * The X-Binary-Element-Type header specifies the type of
     * binary data in the octets, using the same descriptive
     * phrases as in _array_structure.encoding_type.  The default
     * value is 'unsigned 32-bit integer'.
     * 
     * An MD5 message digest may, optionally, be used. The 'RSA Data
     * Security, Inc. MD5 Message-Digest Algorithm' should be used.
     * No portion of the header is included in the calculation of the
     * message digest.
     * 
     * If the Transfer Encoding is 'X-BASE8', 'X-BASE10' or
     * 'X-BASE16', the data are presented as octal, decimal or
     * hexadecimal data organized into lines or words.  Each word
     * is created by composing octets of data in fixed groups of
     * 2, 3, 4, 6 or 8 octets, either in the order ...4321 ('big-
     * endian') or 1234... ('little-endian').  If there are fewer
     * than the specified number of octets to fill the last word,
     * then the missing octets are presented as '==' for each
     * missing octet.  Exactly two equal signs are used for each
     * missing octet even for octal and decimal encoding.
     * The format of lines is:
     * 
     * rnd xxxxxx xxxxxx xxxxxx
     * 
     * where r is 'H', 'O' or 'D' for hexadecimal, octal or
     * decimal, n is the number of octets per word and d is '&lt;'
     * or '&gt;' for the '...4321' and '1234...' octet orderings,
     * respectively.  The '==' padding for the last word should
     * be on the appropriate side to correspond to the missing
     * octets, e.g.
     * 
     * H4&lt; FFFFFFFF FFFFFFFF 07FFFFFF ====0000
     * 
     * or
     * 
     * H3&gt; FF0700 00====
     * 
     * For these hexadecimal, octal and decimal formats only,
     * comments beginning with '#' are permitted to improve
     * readability.
     * 
     * BASE64 encoding follows MIME conventions.  Octets are
     * in groups of three: c1, c2, c3.  The resulting 24 bits
     * are broken into four six-bit quantities, starting with
     * the high-order six bits (c1 &gt;&gt; 2) of the first octet, then
     * the low-order two bits of the first octet followed by the
     * high-order four bits of the second octet [(c1 &amp; 3)&lt;&lt;4 | (c2&gt;&gt;4)],
     * then the bottom four bits of the second octet followed by the
     * high-order two bits of the last octet [(c2 &amp; 15)&lt;&lt;2 | (c3&gt;&gt;6)],
     * then the bottom six bits of the last octet (c3 &amp; 63).  Each
     * of these four quantities is translated into an ASCII character
     * using the mapping:
     * 
     * 1         2         3         4         5         6
     * 0123456789012345678901234567890123456789012345678901234567890123
     * |         |         |         |         |         |         |
     * ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/
     * 
     * with short groups of octets padded on the right with one '='
     * if c3 is missing, and with '==' if both c2 and c3 are missing.
     * 
     * X-BASE32K encoding is similar to BASE64 encoding, except that
     * sets of 15 octets are encoded as sets of 8 16-bit Unicode
     * characters, by breaking the 120 bits into 8 15-bit quantities.
     * 256 is added to each 15-bit quantity to bring it into a
     * printable Unicode range.  When encoding, zero padding is used
     * to fill out the last 15-bit quantity.  If 8 or more bits of
     * padding are used, a single equals sign (hexadecimal 003D) is
     * appended.  Embedded whitespace and newlines are introduced
     * to produce lines of no more than 80 characters each.  On
     * decoding, all printable ASCII characters and ASCII whitespace
     * characters are ignored except for any trailing equals signs.
     * The number of trailing equals signs indicated the number of
     * trailing octets to be trimmed from the end of the decoded data
     * (see Darakev et al., 2006).
     * 
     * QUOTED-PRINTABLE encoding also follows MIME conventions, copying
     * octets without translation if their ASCII values are 32...38,
     * 42, 48...57, 59, 60, 62, 64...126 and the octet is not a ';'
     * in column 1.  All other characters are translated to =nn, where
     * nn is the hexadecimal encoding of the octet.  All lines are
     * 'wrapped' with a terminating '=' (i.e. the MIME conventions
     * for an implicit line terminator are never used).
     * 
     * The 'X-Binary-Element-Byte-Order' can specify either
     * 'BIG_ENDIAN' or 'LITTLE_ENDIAN' byte order of the image
     * data.  Only LITTLE_ENDIAN is recommended.  Processors
     * may treat BIG_ENDIAN as a warning of data that can
     * only be processed by special software.
     * 
     * The 'X-Binary-Number-of-Elements' specifies the number of
     * elements (not the number of octets) in the decompressed,
     * decoded image.
     * 
     * The optional 'X-Binary-Size-Fastest-Dimension' specifies the
     * number of elements (not the number of octets) in one row of the
     * fastest changing dimension of the binary data array. This
     * information must be in the MIME header for proper operation of
     * some of the decompression algorithms.
     * 
     * The optional 'X-Binary-Size-Second-Dimension' specifies the
     * number of elements (not the number of octets) in one column of
     * the second-fastest changing dimension of the binary data array.
     * This information must be in the MIME header for proper operation
     * of some of the decompression algorithms.
     * 
     * The optional 'X-Binary-Size-Third-Dimension' specifies the
     * number of sections for the third-fastest changing dimension of
     * the binary data array.
     * 
     * The optional 'X-Binary-Size-Padding' specifies the size in
     * octets of an optional padding after the binary array data and
     * before the closing flags for a binary section.
     * 
     * Reference:
     * 
     * Darakev, G., Litchev, V., Mitev, K. Z. &amp; Bernstein, H. J. (2006).
     * 'Efficient Support of Binary Data in the XML Implementation of
     * the NeXus File Format', abstract W0165, ACA Summer Meeting,
     * Honolulu, HI, USA, July 2006.
     * @return StrColumn
     */
    public StrColumn getData() {
        return delegate.getColumn("data", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _array_data_external_data.id  in the
     * ARRAY_DATA_EXTERNAL_DATA  category.
     * 
     * If not given, then the actual array data should be specified as
     * the value of _array_data.data.  If
     * both values are given, the value on _array_data.data  takes
     * precedence, and a warning of a possible conflict should be issued.
     * @return StrColumn
     */
    public StrColumn getExternalDataId() {
        return delegate.getColumn("external_data_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a text field for use in minimal CBF files to carry
     * essential header information to be kept with image data
     * in _array_data.data when the tags that normally carry the
     * structured metadata for the image have not been populated.
     * 
     * Normally this data item should not appear when the full set
     * of tags has been populated and _diffrn_data_frame.details
     * appears.
     * @return StrColumn
     */
    public StrColumn getHeaderContents() {
        return delegate.getColumn("header_contents", DelegatingStrColumn::new);
    }

    /**
     * This item is an identifier for the convention followed in
     * constructing the contents of _array_data.header_contents
     * 
     * The permitted values are of an image creator identifier
     * followed by an underscore and a version string.  To avoid
     * confusion about conventions, all creator identifiers
     * should be registered with the IUCr and the conventions
     * for all identifiers and versions should be posted on
     * the MEDSBIO.org web site.
     * @return StrColumn
     */
    public StrColumn getHeaderConvention() {
        return delegate.getColumn("header_convention", DelegatingStrColumn::new);
    }

}