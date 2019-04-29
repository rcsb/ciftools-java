package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPOSITION_MESSAGE_INFO category record internal messages
 * within the depositon and annotation system.
 */
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepositionDataSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("deposition_data_set_id", StrColumn::new) :
                getBinaryColumn("deposition_data_set_id"));
    }

    /**
     * The internal identifier assigned to each message.
     * @return StrColumn
     */
    public StrColumn getMessageId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_id", StrColumn::new) :
                getBinaryColumn("message_id"));
    }

    /**
     * A the date and time of message creation.
     * @return StrColumn
     */
    public StrColumn getTimestamp() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("timestamp", StrColumn::new) :
                getBinaryColumn("timestamp"));
    }

    /**
     * A the message creator.
     * @return StrColumn
     */
    public StrColumn getSender() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sender", StrColumn::new) :
                getBinaryColumn("sender"));
    }

    /**
     * A the message content type or class.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_type", StrColumn::new) :
                getBinaryColumn("content_type"));
    }

    /**
     * A the specific value of the content type or class
     * @return StrColumn
     */
    public StrColumn getContentValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_value", StrColumn::new) :
                getBinaryColumn("content_value"));
    }

    /**
     * The identifier of the parent message or the message to which the current message responds.
     * @return StrColumn
     */
    public StrColumn getParentMessageId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parent_message_id", StrColumn::new) :
                getBinaryColumn("parent_message_id"));
    }

    /**
     * The subject text of the message.
     * @return StrColumn
     */
    public StrColumn getMessageSubject() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_subject", StrColumn::new) :
                getBinaryColumn("message_subject"));
    }

    /**
     * The body of the message.
     * @return StrColumn
     */
    public StrColumn getMessageText() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_text", StrColumn::new) :
                getBinaryColumn("message_text"));
    }

    /**
     * The message type.
     * @return StrColumn
     */
    public StrColumn getMessageType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_type", StrColumn::new) :
                getBinaryColumn("message_type"));
    }

    /**
     * The message status.
     * @return StrColumn
     */
    public StrColumn getSendStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("send_status", StrColumn::new) :
                getBinaryColumn("send_status"));
    }
}
