package org.rcsb.cif.model.generated.pdbxdatabasemessage;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This is an unique and sequential identifier for a message.
     * @return MessageId
     */
    public MessageId getMessageId() {
        return (MessageId) (isText ? textFields.computeIfAbsent("message_id",
                MessageId::new) : getBinaryColumn("message_id"));
    }

    /**
     * This is the date when a message was sent or received.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * This code defines the content of the message.
     * @return ContentType
     */
    public ContentType getContentType() {
        return (ContentType) (isText ? textFields.computeIfAbsent("content_type",
                ContentType::new) : getBinaryColumn("content_type"));
    }

    /**
     * Defines how the message was sent or received.
     * @return MessageType
     */
    public MessageType getMessageType() {
        return (MessageType) (isText ? textFields.computeIfAbsent("message_type",
                MessageType::new) : getBinaryColumn("message_type"));
    }

    /**
     * The name of the sender.
     * @return Sender
     */
    public Sender getSender() {
        return (Sender) (isText ? textFields.computeIfAbsent("sender",
                Sender::new) : getBinaryColumn("sender"));
    }

    /**
     * The FAX phone number of the sender.
     * @return SenderAddressFax
     */
    public SenderAddressFax getSenderAddressFax() {
        return (SenderAddressFax) (isText ? textFields.computeIfAbsent("sender_address_fax",
                SenderAddressFax::new) : getBinaryColumn("sender_address_fax"));
    }

    /**
     * The phone number of the sender.
     * @return SenderAddressPhone
     */
    public SenderAddressPhone getSenderAddressPhone() {
        return (SenderAddressPhone) (isText ? textFields.computeIfAbsent("sender_address_phone",
                SenderAddressPhone::new) : getBinaryColumn("sender_address_phone"));
    }

    /**
     * The email address of the sender.
     * @return SenderAddressEmail
     */
    public SenderAddressEmail getSenderAddressEmail() {
        return (SenderAddressEmail) (isText ? textFields.computeIfAbsent("sender_address_email",
                SenderAddressEmail::new) : getBinaryColumn("sender_address_email"));
    }

    /**
     * The postal address of the sender.
     * @return SenderAddressMail
     */
    public SenderAddressMail getSenderAddressMail() {
        return (SenderAddressMail) (isText ? textFields.computeIfAbsent("sender_address_mail",
                SenderAddressMail::new) : getBinaryColumn("sender_address_mail"));
    }

    /**
     * The name of the receiver.
     * @return Receiver
     */
    public Receiver getReceiver() {
        return (Receiver) (isText ? textFields.computeIfAbsent("receiver",
                Receiver::new) : getBinaryColumn("receiver"));
    }

    /**
     * The FAX phone number of the receiver.
     * @return ReceiverAddressFax
     */
    public ReceiverAddressFax getReceiverAddressFax() {
        return (ReceiverAddressFax) (isText ? textFields.computeIfAbsent("receiver_address_fax",
                ReceiverAddressFax::new) : getBinaryColumn("receiver_address_fax"));
    }

    /**
     * The phone number of the receiver.
     * @return ReceiverAddressPhone
     */
    public ReceiverAddressPhone getReceiverAddressPhone() {
        return (ReceiverAddressPhone) (isText ? textFields.computeIfAbsent("receiver_address_phone",
                ReceiverAddressPhone::new) : getBinaryColumn("receiver_address_phone"));
    }

    /**
     * The email address of the receiver.
     * @return ReceiverAddressEmail
     */
    public ReceiverAddressEmail getReceiverAddressEmail() {
        return (ReceiverAddressEmail) (isText ? textFields.computeIfAbsent("receiver_address_email",
                ReceiverAddressEmail::new) : getBinaryColumn("receiver_address_email"));
    }

    /**
     * The postal address of the receiver.
     * @return ReceiverAddressMail
     */
    public ReceiverAddressMail getReceiverAddressMail() {
        return (ReceiverAddressMail) (isText ? textFields.computeIfAbsent("receiver_address_mail",
                ReceiverAddressMail::new) : getBinaryColumn("receiver_address_mail"));
    }

    /**
     * The text of the message.
     * @return Message
     */
    public Message getMessage() {
        return (Message) (isText ? textFields.computeIfAbsent("message",
                Message::new) : getBinaryColumn("message"));
    }
}
