package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The PDBX_DATABASE_MESSAGE category provides information about
 * correspondance related to a structure deposition.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDatabaseMessage extends BaseCategory {
    public PdbxDatabaseMessage(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDatabaseMessage(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDatabaseMessage(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_database_message.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This is an unique and sequential identifier for a message.
     * @return StrColumn
     */
    public StrColumn getMessageId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_id", StrColumn::new) :
                getBinaryColumn("message_id"));
    }

    /**
     * This is the date when a message was sent or received.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * This code defines the content of the message.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_type", StrColumn::new) :
                getBinaryColumn("content_type"));
    }

    /**
     * Defines how the message was sent or received.
     * @return StrColumn
     */
    public StrColumn getMessageType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_type", StrColumn::new) :
                getBinaryColumn("message_type"));
    }

    /**
     * The name of the sender.
     * @return StrColumn
     */
    public StrColumn getSender() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sender", StrColumn::new) :
                getBinaryColumn("sender"));
    }

    /**
     * The FAX phone number of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressFax() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sender_address_fax", StrColumn::new) :
                getBinaryColumn("sender_address_fax"));
    }

    /**
     * The phone number of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressPhone() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sender_address_phone", StrColumn::new) :
                getBinaryColumn("sender_address_phone"));
    }

    /**
     * The email address of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sender_address_email", StrColumn::new) :
                getBinaryColumn("sender_address_email"));
    }

    /**
     * The postal address of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressMail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sender_address_mail", StrColumn::new) :
                getBinaryColumn("sender_address_mail"));
    }

    /**
     * The name of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiver() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("receiver", StrColumn::new) :
                getBinaryColumn("receiver"));
    }

    /**
     * The FAX phone number of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressFax() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("receiver_address_fax", StrColumn::new) :
                getBinaryColumn("receiver_address_fax"));
    }

    /**
     * The phone number of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressPhone() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("receiver_address_phone", StrColumn::new) :
                getBinaryColumn("receiver_address_phone"));
    }

    /**
     * The email address of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressEmail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("receiver_address_email", StrColumn::new) :
                getBinaryColumn("receiver_address_email"));
    }

    /**
     * The postal address of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressMail() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("receiver_address_mail", StrColumn::new) :
                getBinaryColumn("receiver_address_mail"));
    }

    /**
     * The text of the message.
     * @return StrColumn
     */
    public StrColumn getMessage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message", StrColumn::new) :
                getBinaryColumn("message"));
    }
}
