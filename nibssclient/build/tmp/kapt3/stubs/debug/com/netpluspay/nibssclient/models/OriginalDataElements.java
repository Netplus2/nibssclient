package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00061"}, d2 = {"Lcom/netpluspay/nibssclient/models/OriginalDataElements;", "", "originalTransactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "originalAmount", "", "originalAuthorizationCode", "", "originalTransmissionTime", "originalSTAN", "originalRRN", "originalAcquiringInstCode", "reversalReasonCode", "Lcom/netpluspay/nibssclient/models/MessageReasonCode;", "originalForwardingInstCode", "(Lcom/danbamitale/epmslib/entities/TransactionType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/netpluspay/nibssclient/models/MessageReasonCode;Ljava/lang/String;)V", "getOriginalAcquiringInstCode", "()Ljava/lang/String;", "getOriginalAmount", "()J", "getOriginalAuthorizationCode", "getOriginalForwardingInstCode", "setOriginalForwardingInstCode", "(Ljava/lang/String;)V", "getOriginalRRN", "getOriginalSTAN", "getOriginalTransactionType", "()Lcom/danbamitale/epmslib/entities/TransactionType;", "getOriginalTransmissionTime", "getReversalReasonCode", "()Lcom/netpluspay/nibssclient/models/MessageReasonCode;", "setReversalReasonCode", "(Lcom/netpluspay/nibssclient/models/MessageReasonCode;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "nibssclient_debug"})
public final class OriginalDataElements {
    @org.jetbrains.annotations.NotNull()
    private final com.danbamitale.epmslib.entities.TransactionType originalTransactionType = null;
    private final long originalAmount = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalAuthorizationCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalTransmissionTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalSTAN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalRRN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalAcquiringInstCode = null;
    @org.jetbrains.annotations.NotNull()
    private com.netpluspay.nibssclient.models.MessageReasonCode reversalReasonCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String originalForwardingInstCode;
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.OriginalDataElements copy(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType originalTransactionType, long originalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String originalAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTransmissionTime, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSTAN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalRRN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalAcquiringInstCode, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode reversalReasonCode, @org.jetbrains.annotations.Nullable()
    java.lang.String originalForwardingInstCode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public OriginalDataElements(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType originalTransactionType, long originalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String originalAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTransmissionTime, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSTAN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalRRN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalAcquiringInstCode, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode reversalReasonCode, @org.jetbrains.annotations.Nullable()
    java.lang.String originalForwardingInstCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType getOriginalTransactionType() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getOriginalAmount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalAuthorizationCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalTransmissionTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalSTAN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalRRN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalAcquiringInstCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.MessageReasonCode component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.MessageReasonCode getReversalReasonCode() {
        return null;
    }
    
    public final void setReversalReasonCode(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalForwardingInstCode() {
        return null;
    }
    
    public final void setOriginalForwardingInstCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}