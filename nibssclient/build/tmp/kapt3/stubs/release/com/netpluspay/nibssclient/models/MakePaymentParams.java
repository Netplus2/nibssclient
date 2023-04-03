package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rB/\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000eB)\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0010BW\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\nH\u00c6\u0003J\t\u0010@\u001a\u00020\fH\u00c6\u0003J\t\u0010A\u001a\u00020\bH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010D\u001a\u00020&2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010I\u001a\u00020&R\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:\u00a8\u0006J"}, d2 = {"Lcom/netpluspay/nibssclient/models/MakePaymentParams;", "", "terminalId", "", "amount", "", "otherAmount", "cardData", "Lcom/danbamitale/epmslib/entities/CardData;", "transactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "isoAccountType", "Lcom/netpluspay/nibssclient/models/IsoAccountType;", "(Ljava/lang/String;JJLcom/danbamitale/epmslib/entities/CardData;Lcom/danbamitale/epmslib/entities/TransactionType;Lcom/netpluspay/nibssclient/models/IsoAccountType;)V", "(JJLcom/danbamitale/epmslib/entities/CardData;Lcom/danbamitale/epmslib/entities/TransactionType;Lcom/netpluspay/nibssclient/models/IsoAccountType;)V", "(Ljava/lang/String;JJLcom/danbamitale/epmslib/entities/CardData;)V", "(JJLcom/danbamitale/epmslib/entities/CardData;)V", "action", "accountType", "remark", "(Ljava/lang/String;Ljava/lang/String;JJLcom/danbamitale/epmslib/entities/TransactionType;Lcom/netpluspay/nibssclient/models/IsoAccountType;Lcom/danbamitale/epmslib/entities/CardData;Ljava/lang/String;)V", "getAccountType", "()Lcom/netpluspay/nibssclient/models/IsoAccountType;", "setAccountType", "(Lcom/netpluspay/nibssclient/models/IsoAccountType;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getAmount", "()J", "setAmount", "(J)V", "getCardData", "()Lcom/danbamitale/epmslib/entities/CardData;", "setCardData", "(Lcom/danbamitale/epmslib/entities/CardData;)V", "fundWallet", "", "getFundWallet", "()Z", "setFundWallet", "(Z)V", "originalDataElements", "Lcom/netpluspay/nibssclient/models/OriginalDataElements;", "getOriginalDataElements", "()Lcom/netpluspay/nibssclient/models/OriginalDataElements;", "setOriginalDataElements", "(Lcom/netpluspay/nibssclient/models/OriginalDataElements;)V", "getOtherAmount", "setOtherAmount", "getRemark", "setRemark", "getTerminalId", "setTerminalId", "getTransactionType", "()Lcom/danbamitale/epmslib/entities/TransactionType;", "setTransactionType", "(Lcom/danbamitale/epmslib/entities/TransactionType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "validate", "nibssclient_release"})
public final class MakePaymentParams {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String action;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String terminalId;
    private long amount;
    private long otherAmount;
    @org.jetbrains.annotations.NotNull()
    private com.danbamitale.epmslib.entities.TransactionType transactionType;
    @org.jetbrains.annotations.NotNull()
    private com.netpluspay.nibssclient.models.IsoAccountType accountType;
    @org.jetbrains.annotations.NotNull()
    private com.danbamitale.epmslib.entities.CardData cardData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remark;
    private boolean fundWallet = true;
    @org.jetbrains.annotations.Nullable()
    private com.netpluspay.nibssclient.models.OriginalDataElements originalDataElements;
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.MakePaymentParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData, @org.jetbrains.annotations.Nullable()
    java.lang.String remark) {
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
    
    public MakePaymentParams(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData, @org.jetbrains.annotations.Nullable()
    java.lang.String remark) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerminalId() {
        return null;
    }
    
    public final void setTerminalId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getAmount() {
        return 0L;
    }
    
    public final void setAmount(long p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getOtherAmount() {
        return 0L;
    }
    
    public final void setOtherAmount(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType getTransactionType() {
        return null;
    }
    
    public final void setTransactionType(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType component6() {
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
    public final com.danbamitale.epmslib.entities.CardData component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.CardData getCardData() {
        return null;
    }
    
    public final void setCardData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemark() {
        return null;
    }
    
    public final void setRemark(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getFundWallet() {
        return false;
    }
    
    public final void setFundWallet(boolean p0) {
    }
    
    public MakePaymentParams(@org.jetbrains.annotations.Nullable()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType isoAccountType) {
        super();
    }
    
    public MakePaymentParams(long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType isoAccountType) {
        super();
    }
    
    public MakePaymentParams(@org.jetbrains.annotations.Nullable()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData) {
        super();
    }
    
    public MakePaymentParams(long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData) {
        super();
    }
    
    public final boolean validate() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.netpluspay.nibssclient.models.OriginalDataElements getOriginalDataElements() {
        return null;
    }
    
    public final void setOriginalDataElements(@org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.models.OriginalDataElements p0) {
    }
}