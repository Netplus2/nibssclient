package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00f7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0002\u0010#J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\fH\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\fH\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u001fH\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\fH\u00c6\u0003J\u00b5\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010i\u001a\u00020\fH\u00d6\u0001J\t\u0010j\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0012\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\u0018\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010%\"\u0004\b?\u0010@R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010%R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010%\u00a8\u0006k"}, d2 = {"Lcom/netpluspay/nibssclient/models/TransactionWithRemark;", "", "AID", "", "rrn", "STAN", "TSI", "TVR", "accountType", "acquiringInstCode", "additionalAmount_54", "amount", "", "appCryptogram", "authCode", "cardExpiry", "cardHolder", "cardLabel", "id", "localDate_13", "localTime_12", "maskedPan", "merchantId", "originalForwardingInstCode", "otherAmount", "otherId", "responseCode", "responseDE55", "responseMessage", "terminalId", "transactionTimeInMillis", "", "transactionType", "transmissionDateTime", "remark", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAID", "()Ljava/lang/String;", "getSTAN", "getTSI", "getTVR", "getAccountType", "getAcquiringInstCode", "getAdditionalAmount_54", "getAmount", "()I", "getAppCryptogram", "getAuthCode", "getCardExpiry", "getCardHolder", "getCardLabel", "getId", "getLocalDate_13", "getLocalTime_12", "getMaskedPan", "getMerchantId", "getOriginalForwardingInstCode", "getOtherAmount", "getOtherId", "getRemark", "getResponseCode", "getResponseDE55", "getResponseMessage", "setResponseMessage", "(Ljava/lang/String;)V", "getRrn", "getTerminalId", "getTransactionTimeInMillis", "()J", "getTransactionType", "getTransmissionDateTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "nibssclient_debug"})
public final class TransactionWithRemark {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AID = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rrn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String STAN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TSI = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TVR = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String accountType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String acquiringInstCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String additionalAmount_54 = null;
    private final int amount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appCryptogram = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String authCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardExpiry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardHolder = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cardLabel = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String localDate_13 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String localTime_12 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String maskedPan = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String merchantId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalForwardingInstCode = null;
    private final int otherAmount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String otherId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String responseCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String responseDE55 = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String responseMessage;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String terminalId = null;
    private final long transactionTimeInMillis = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transmissionDateTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String remark = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.TransactionWithRemark copy(@org.jetbrains.annotations.NotNull()
    java.lang.String AID, @org.jetbrains.annotations.NotNull()
    java.lang.String rrn, @org.jetbrains.annotations.NotNull()
    java.lang.String STAN, @org.jetbrains.annotations.NotNull()
    java.lang.String TSI, @org.jetbrains.annotations.NotNull()
    java.lang.String TVR, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String acquiringInstCode, @org.jetbrains.annotations.NotNull()
    java.lang.String additionalAmount_54, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String appCryptogram, @org.jetbrains.annotations.NotNull()
    java.lang.String authCode, @org.jetbrains.annotations.NotNull()
    java.lang.String cardExpiry, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cardLabel, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String localDate_13, @org.jetbrains.annotations.NotNull()
    java.lang.String localTime_12, @org.jetbrains.annotations.NotNull()
    java.lang.String maskedPan, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantId, @org.jetbrains.annotations.NotNull()
    java.lang.String originalForwardingInstCode, int otherAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String otherId, @org.jetbrains.annotations.NotNull()
    java.lang.String responseCode, @org.jetbrains.annotations.NotNull()
    java.lang.String responseDE55, @org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long transactionTimeInMillis, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String transmissionDateTime, @org.jetbrains.annotations.NotNull()
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
    
    public TransactionWithRemark(@org.jetbrains.annotations.NotNull()
    java.lang.String AID, @org.jetbrains.annotations.NotNull()
    java.lang.String rrn, @org.jetbrains.annotations.NotNull()
    java.lang.String STAN, @org.jetbrains.annotations.NotNull()
    java.lang.String TSI, @org.jetbrains.annotations.NotNull()
    java.lang.String TVR, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String acquiringInstCode, @org.jetbrains.annotations.NotNull()
    java.lang.String additionalAmount_54, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String appCryptogram, @org.jetbrains.annotations.NotNull()
    java.lang.String authCode, @org.jetbrains.annotations.NotNull()
    java.lang.String cardExpiry, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cardLabel, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String localDate_13, @org.jetbrains.annotations.NotNull()
    java.lang.String localTime_12, @org.jetbrains.annotations.NotNull()
    java.lang.String maskedPan, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantId, @org.jetbrains.annotations.NotNull()
    java.lang.String originalForwardingInstCode, int otherAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String otherId, @org.jetbrains.annotations.NotNull()
    java.lang.String responseCode, @org.jetbrains.annotations.NotNull()
    java.lang.String responseDE55, @org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long transactionTimeInMillis, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String transmissionDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String remark) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRrn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSTAN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTSI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTVR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAcquiringInstCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdditionalAmount_54() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppCryptogram() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardExpiry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardHolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardLabel() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalDate_13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalTime_12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaskedPan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalForwardingInstCode() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int getOtherAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtherId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponseCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponseDE55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponseMessage() {
        return null;
    }
    
    public final void setResponseMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalId() {
        return null;
    }
    
    public final long component27() {
        return 0L;
    }
    
    public final long getTransactionTimeInMillis() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransmissionDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemark() {
        return null;
    }
}