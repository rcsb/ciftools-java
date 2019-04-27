package org.rcsb.cif.model.pdbxdepositionmessageinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepositionMessageInfo extends BaseCategory {
    public PdbxDepositionMessageInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepositionMessageInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepositionMessageInfo(String name) {
        super(name);
    }

    /**
     * Ordinal index for the each message.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return DepositionDataSetId
     */
    public DepositionDataSetId getDepositionDataSetId() {
        return (DepositionDataSetId) (isText ? textFields.computeIfAbsent("deposition_data_set_id",
                DepositionDataSetId::new) : getBinaryColumn("deposition_data_set_id"));
    }

    /**
     * The internal identifier assigned to each message.
     * @return MessageId
     */
    public MessageId getMessageId() {
        return (MessageId) (isText ? textFields.computeIfAbsent("message_id",
                MessageId::new) : getBinaryColumn("message_id"));
    }

    /**
     * A the date and time of message creation.
     * @return Timestamp
     */
    public Timestamp getTimestamp() {
        return (Timestamp) (isText ? textFields.computeIfAbsent("timestamp",
                Timestamp::new) : getBinaryColumn("timestamp"));
    }

    /**
     * A the message creator.
     * @return Sender
     */
    public Sender getSender() {
        return (Sender) (isText ? textFields.computeIfAbsent("sender",
                Sender::new) : getBinaryColumn("sender"));
    }

    /**
     * A the message content type or class.
     * @return ContentType
     */
    public ContentType getContentType() {
        return (ContentType) (isText ? textFields.computeIfAbsent("content_type",
                ContentType::new) : getBinaryColumn("content_type"));
    }

    /**
     * A the specific value of the content type or class
     * @return ContentValue
     */
    public ContentValue getContentValue() {
        return (ContentValue) (isText ? textFields.computeIfAbsent("content_value",
                ContentValue::new) : getBinaryColumn("content_value"));
    }

    /**
     * The identifier of the parent message or the message to which the current message responds.
     * @return ParentMessageId
     */
    public ParentMessageId getParentMessageId() {
        return (ParentMessageId) (isText ? textFields.computeIfAbsent("parent_message_id",
                ParentMessageId::new) : getBinaryColumn("parent_message_id"));
    }

    /**
     * The subject text of the message.
     * @return MessageSubject
     */
    public MessageSubject getMessageSubject() {
        return (MessageSubject) (isText ? textFields.computeIfAbsent("message_subject",
                MessageSubject::new) : getBinaryColumn("message_subject"));
    }

    /**
     * The body of the message.
     * @return MessageText
     */
    public MessageText getMessageText() {
        return (MessageText) (isText ? textFields.computeIfAbsent("message_text",
                MessageText::new) : getBinaryColumn("message_text"));
    }

    /**
     * The message type.
     * @return MessageType
     */
    public MessageType getMessageType() {
        return (MessageType) (isText ? textFields.computeIfAbsent("message_type",
                MessageType::new) : getBinaryColumn("message_type"));
    }

    /**
     * The message status.
     * @return SendStatus
     */
    public SendStatus getSendStatus() {
        return (SendStatus) (isText ? textFields.computeIfAbsent("send_status",
                SendStatus::new) : getBinaryColumn("send_status"));
    }
}
