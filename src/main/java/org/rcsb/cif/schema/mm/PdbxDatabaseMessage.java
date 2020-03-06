package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The PDBX_DATABASE_MESSAGE category provides information about
 * correspondance related to a structure deposition.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseMessage extends DelegatingCategory {
    public PdbxDatabaseMessage(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "message_id":
                return getMessageId();
            case "date":
                return getDate();
            case "content_type":
                return getContentType();
            case "message_type":
                return getMessageType();
            case "sender":
                return getSender();
            case "sender_address_fax":
                return getSenderAddressFax();
            case "sender_address_phone":
                return getSenderAddressPhone();
            case "sender_address_email":
                return getSenderAddressEmail();
            case "sender_address_mail":
                return getSenderAddressMail();
            case "receiver":
                return getReceiver();
            case "receiver_address_fax":
                return getReceiverAddressFax();
            case "receiver_address_phone":
                return getReceiverAddressPhone();
            case "receiver_address_email":
                return getReceiverAddressEmail();
            case "receiver_address_mail":
                return getReceiverAddressMail();
            case "message":
                return getMessage();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_database_message.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This is an unique and sequential identifier for a message.
     * @return StrColumn
     */
    public StrColumn getMessageId() {
        return delegate.getColumn("message_id", DelegatingStrColumn::new);
    }

    /**
     * This is the date when a message was sent or received.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * This code defines the content of the message.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return delegate.getColumn("content_type", DelegatingStrColumn::new);
    }

    /**
     * Defines how the message was sent or received.
     * @return StrColumn
     */
    public StrColumn getMessageType() {
        return delegate.getColumn("message_type", DelegatingStrColumn::new);
    }

    /**
     * The name of the sender.
     * @return StrColumn
     */
    public StrColumn getSender() {
        return delegate.getColumn("sender", DelegatingStrColumn::new);
    }

    /**
     * The FAX phone number of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressFax() {
        return delegate.getColumn("sender_address_fax", DelegatingStrColumn::new);
    }

    /**
     * The phone number of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressPhone() {
        return delegate.getColumn("sender_address_phone", DelegatingStrColumn::new);
    }

    /**
     * The email address of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressEmail() {
        return delegate.getColumn("sender_address_email", DelegatingStrColumn::new);
    }

    /**
     * The postal address of the sender.
     * @return StrColumn
     */
    public StrColumn getSenderAddressMail() {
        return delegate.getColumn("sender_address_mail", DelegatingStrColumn::new);
    }

    /**
     * The name of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiver() {
        return delegate.getColumn("receiver", DelegatingStrColumn::new);
    }

    /**
     * The FAX phone number of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressFax() {
        return delegate.getColumn("receiver_address_fax", DelegatingStrColumn::new);
    }

    /**
     * The phone number of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressPhone() {
        return delegate.getColumn("receiver_address_phone", DelegatingStrColumn::new);
    }

    /**
     * The email address of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressEmail() {
        return delegate.getColumn("receiver_address_email", DelegatingStrColumn::new);
    }

    /**
     * The postal address of the receiver.
     * @return StrColumn
     */
    public StrColumn getReceiverAddressMail() {
        return delegate.getColumn("receiver_address_mail", DelegatingStrColumn::new);
    }

    /**
     * The text of the message.
     * @return StrColumn
     */
    public StrColumn getMessage() {
        return delegate.getColumn("message", DelegatingStrColumn::new);
    }

}