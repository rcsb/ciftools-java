package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPOSITION_MESSAGE_INFO category record internal messages
 * within the depositon and annotation system.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepositionMessageInfo extends DelegatingCategory {
    public PdbxDepositionMessageInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "deposition_data_set_id":
                return getDepositionDataSetId();
            case "message_id":
                return getMessageId();
            case "timestamp":
                return getTimestamp();
            case "sender":
                return getSender();
            case "content_type":
                return getContentType();
            case "content_value":
                return getContentValue();
            case "parent_message_id":
                return getParentMessageId();
            case "message_subject":
                return getMessageSubject();
            case "message_text":
                return getMessageText();
            case "message_type":
                return getMessageType();
            case "send_status":
                return getSendStatus();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal index for the each message.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepositionDataSetId() {
        return delegate.getColumn("deposition_data_set_id", DelegatingStrColumn::new);
    }

    /**
     * The internal identifier assigned to each message.
     * @return StrColumn
     */
    public StrColumn getMessageId() {
        return delegate.getColumn("message_id", DelegatingStrColumn::new);
    }

    /**
     * A the date and time of message creation.
     * @return StrColumn
     */
    public StrColumn getTimestamp() {
        return delegate.getColumn("timestamp", DelegatingStrColumn::new);
    }

    /**
     * A the message creator.
     * @return StrColumn
     */
    public StrColumn getSender() {
        return delegate.getColumn("sender", DelegatingStrColumn::new);
    }

    /**
     * A the message content type or class.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return delegate.getColumn("content_type", DelegatingStrColumn::new);
    }

    /**
     * A the specific value of the content type or class
     * @return StrColumn
     */
    public StrColumn getContentValue() {
        return delegate.getColumn("content_value", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the parent message or the message to which the current message responds.
     * @return StrColumn
     */
    public StrColumn getParentMessageId() {
        return delegate.getColumn("parent_message_id", DelegatingStrColumn::new);
    }

    /**
     * The subject text of the message.
     * @return StrColumn
     */
    public StrColumn getMessageSubject() {
        return delegate.getColumn("message_subject", DelegatingStrColumn::new);
    }

    /**
     * The body of the message.
     * @return StrColumn
     */
    public StrColumn getMessageText() {
        return delegate.getColumn("message_text", DelegatingStrColumn::new);
    }

    /**
     * The message type.
     * @return StrColumn
     */
    public StrColumn getMessageType() {
        return delegate.getColumn("message_type", DelegatingStrColumn::new);
    }

    /**
     * The message status.
     * @return StrColumn
     */
    public StrColumn getSendStatus() {
        return delegate.getColumn("send_status", DelegatingStrColumn::new);
    }

}