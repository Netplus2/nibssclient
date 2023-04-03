package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J?\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\t\u00104\u001a\u00020\u000bH\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u00065"}, d2 = {"Lcom/netpluspay/nibssclient/models/RefundTransactionParams;", "", "cardData", "Lcom/netpluspay/nibssclient/models/CardData;", "transactionResponse", "Lcom/netpluspay/nibssclient/models/TransactionResponse;", "accountType", "Lcom/netpluspay/nibssclient/models/IsoAccountType;", "messageReasonCode", "Lcom/netpluspay/nibssclient/models/MessageReasonCode;", "terminalId", "", "(Lcom/netpluspay/nibssclient/models/CardData;Lcom/netpluspay/nibssclient/models/TransactionResponse;Lcom/netpluspay/nibssclient/models/IsoAccountType;Lcom/netpluspay/nibssclient/models/MessageReasonCode;Ljava/lang/String;)V", "getAccountType", "()Lcom/netpluspay/nibssclient/models/IsoAccountType;", "setAccountType", "(Lcom/netpluspay/nibssclient/models/IsoAccountType;)V", "action", "getCardData", "()Lcom/netpluspay/nibssclient/models/CardData;", "fundWallet", "", "getFundWallet", "()Z", "setFundWallet", "(Z)V", "getMessageReasonCode", "()Lcom/netpluspay/nibssclient/models/MessageReasonCode;", "setMessageReasonCode", "(Lcom/netpluspay/nibssclient/models/MessageReasonCode;)V", "originalDataElements", "Lcom/netpluspay/nibssclient/models/OriginalDataElements;", "getOriginalDataElements", "()Lcom/netpluspay/nibssclient/models/OriginalDataElements;", "setOriginalDataElements", "(Lcom/netpluspay/nibssclient/models/OriginalDataElements;)V", "getTerminalId", "()Ljava/lang/String;", "getTransactionResponse", "()Lcom/netpluspay/nibssclient/models/TransactionResponse;", "setTransactionResponse", "(Lcom/netpluspay/nibssclient/models/TransactionResponse;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "nibssclient_release"})
public final class RefundTransactionParams {
    @org.jetbrains.annotations.NotNull()
    private final com.netpluspay.nibssclient.models.CardData cardData = null;
    @org.jetbrains.annotations.Nullable()
    private com.netpluspay.nibssclient.models.TransactionResponse transactionResponse;
    @org.jetbrains.annotations.NotNull()
    private com.netpluspay.nibssclient.models.IsoAccountType accountType;
    @org.jetbrains.annotations.NotNull()
    private com.netpluspay.nibssclient.models.MessageReasonCode messageReasonCode;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String terminalId = null;
    private final java.lang.String action = "refundTransaction";
    private boolean fundWallet = true;
    @org.jetbrains.annotations.Nullable()
    private com.netpluspay.nibssclient.models.OriginalDataElements originalDataElements;
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.RefundTransactionParams copy(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.TransactionResponse transactionResponse, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode messageReasonCode, @org.jetbrains.annotations.Nullable()
    java.lang.String terminalId) {
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
    
    @kotlin.jvm.JvmOverloads()
    public RefundTransactionParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.TransactionResponse transactionResponse) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public RefundTransactionParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.TransactionResponse transactionResponse, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public RefundTransactionParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.TransactionResponse transactionResponse, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode messageReasonCode) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public RefundTransactionParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.TransactionResponse transactionResponse, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode messageReasonCode, @org.jetbrains.annotations.Nullable()
    java.lang.String terminalId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.CardData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.CardData getCardData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.netpluspay.nibssclient.models.TransactionResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.netpluspay.nibssclient.models.TransactionResponse getTransactionResponse() {
        return null;
    }
    
    public final void setTransactionResponse(@org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.TransactionResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType getAccountType() {
        return null;
    }
    
    public final void setAccountType(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.MessageReasonCode component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.MessageReasonCode getMessageReasonCode() {
        return null;
    }
    
    public final void setMessageReasonCode(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MessageReasonCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerminalId() {
        return null;
    }
    
    public final boolean getFundWallet() {
        return false;
    }
    
    public final void setFundWallet(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.netpluspay.nibssclient.models.OriginalDataElements getOriginalDataElements() {
        return null;
    }
    
    public final void setOriginalDataElements(@org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.OriginalDataElements p0) {
    }
}