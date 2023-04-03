package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\bl\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0003\u00a2\u0006\u0002\u0010&J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\fH\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\fH\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020$H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\fH\u00c6\u0003J\u00d2\u0002\u0010\u008f\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0003H\u00c6\u0001J\u0016\u0010\u0090\u0001\u001a\u00030\u0091\u00012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u00d6\u0001J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010(\"\u0004\bJ\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010:\"\u0004\bN\u0010<R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010*R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010(\"\u0004\bV\u0010*R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\u001a\u0010\u001b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010:\"\u0004\bZ\u0010<R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010(\"\u0004\b\\\u0010*R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010(\"\u0004\b^\u0010*R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010(\"\u0004\b`\u0010*R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010(\"\u0004\bb\u0010*R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010(\"\u0004\bd\u0010*R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010(\"\u0004\bf\u0010*R\u001a\u0010\"\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010:\"\u0004\bh\u0010<R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010(\"\u0004\bn\u0010*\u00a8\u0006\u0096\u0001"}, d2 = {"Lcom/netpluspay/nibssclient/models/NibssResponse;", "", "AID", "", "RRN", "STAN", "TSI", "TVR", "accountType", "Lcom/danbamitale/epmslib/utils/IsoAccountType;", "acquiringInstCode", "additionalAmount", "", "amount", "appCryptogram", "authCode", "cardExpiry", "cardHolder", "cardLabel", "echoData", "errorMessage", "id", "localDate", "localTime", "maskedPan", "merchantId", "originalForwardingInstCode", "otherAmount", "otherId", "responseCode", "remark", "responseDE55", "responseMessage", "terminalId", "transactionTimeInMillis", "transactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "transmissionDateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/danbamitale/epmslib/utils/IsoAccountType;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/danbamitale/epmslib/entities/TransactionType;Ljava/lang/String;)V", "getAID", "()Ljava/lang/String;", "setAID", "(Ljava/lang/String;)V", "getRRN", "setRRN", "getSTAN", "setSTAN", "getTSI", "setTSI", "getTVR", "setTVR", "getAccountType", "()Lcom/danbamitale/epmslib/utils/IsoAccountType;", "setAccountType", "(Lcom/danbamitale/epmslib/utils/IsoAccountType;)V", "getAcquiringInstCode", "setAcquiringInstCode", "getAdditionalAmount", "()J", "setAdditionalAmount", "(J)V", "getAmount", "setAmount", "getAppCryptogram", "setAppCryptogram", "getAuthCode", "setAuthCode", "getCardExpiry", "setCardExpiry", "getCardHolder", "setCardHolder", "getCardLabel", "setCardLabel", "getEchoData", "setEchoData", "getErrorMessage", "setErrorMessage", "getId", "setId", "getLocalDate", "setLocalDate", "getLocalTime", "setLocalTime", "getMaskedPan", "setMaskedPan", "getMerchantId", "setMerchantId", "getOriginalForwardingInstCode", "setOriginalForwardingInstCode", "getOtherAmount", "setOtherAmount", "getOtherId", "setOtherId", "getRemark", "setRemark", "getResponseCode", "setResponseCode", "getResponseDE55", "setResponseDE55", "getResponseMessage", "setResponseMessage", "getTerminalId", "setTerminalId", "getTransactionTimeInMillis", "setTransactionTimeInMillis", "getTransactionType", "()Lcom/danbamitale/epmslib/entities/TransactionType;", "setTransactionType", "(Lcom/danbamitale/epmslib/entities/TransactionType;)V", "getTransmissionDateTime", "setTransmissionDateTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "nibssclient_release"})
public final class NibssResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String AID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String RRN;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String STAN;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TSI;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TVR;
    @org.jetbrains.annotations.NotNull()
    private com.danbamitale.epmslib.utils.IsoAccountType accountType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String acquiringInstCode;
    private long additionalAmount;
    private long amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String appCryptogram;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String authCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cardExpiry;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cardHolder;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cardLabel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String echoData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorMessage;
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String localDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String localTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String maskedPan;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String merchantId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String originalForwardingInstCode;
    private long otherAmount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otherId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String responseCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remark;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String responseDE55;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String responseMessage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String terminalId;
    private long transactionTimeInMillis;
    @org.jetbrains.annotations.NotNull()
    private com.danbamitale.epmslib.entities.TransactionType transactionType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transmissionDateTime;
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.NibssResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String AID, @org.jetbrains.annotations.NotNull()
    java.lang.String RRN, @org.jetbrains.annotations.NotNull()
    java.lang.String STAN, @org.jetbrains.annotations.NotNull()
    java.lang.String TSI, @org.jetbrains.annotations.NotNull()
    java.lang.String TVR, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String acquiringInstCode, long additionalAmount, long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String appCryptogram, @org.jetbrains.annotations.NotNull()
    java.lang.String authCode, @org.jetbrains.annotations.NotNull()
    java.lang.String cardExpiry, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cardLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String echoData, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String localDate, @org.jetbrains.annotations.NotNull()
    java.lang.String localTime, @org.jetbrains.annotations.NotNull()
    java.lang.String maskedPan, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantId, @org.jetbrains.annotations.NotNull()
    java.lang.String originalForwardingInstCode, long otherAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String otherId, @org.jetbrains.annotations.NotNull()
    java.lang.String responseCode, @org.jetbrains.annotations.Nullable()
    java.lang.String remark, @org.jetbrains.annotations.Nullable()
    java.lang.String responseDE55, @org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long transactionTimeInMillis, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String transmissionDateTime) {
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
    
    public NibssResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String AID, @org.jetbrains.annotations.NotNull()
    java.lang.String RRN, @org.jetbrains.annotations.NotNull()
    java.lang.String STAN, @org.jetbrains.annotations.NotNull()
    java.lang.String TSI, @org.jetbrains.annotations.NotNull()
    java.lang.String TVR, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String acquiringInstCode, long additionalAmount, long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String appCryptogram, @org.jetbrains.annotations.NotNull()
    java.lang.String authCode, @org.jetbrains.annotations.NotNull()
    java.lang.String cardExpiry, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String cardLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String echoData, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String localDate, @org.jetbrains.annotations.NotNull()
    java.lang.String localTime, @org.jetbrains.annotations.NotNull()
    java.lang.String maskedPan, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantId, @org.jetbrains.annotations.NotNull()
    java.lang.String originalForwardingInstCode, long otherAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String otherId, @org.jetbrains.annotations.NotNull()
    java.lang.String responseCode, @org.jetbrains.annotations.Nullable()
    java.lang.String remark, @org.jetbrains.annotations.Nullable()
    java.lang.String responseDE55, @org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long transactionTimeInMillis, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String transmissionDateTime) {
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
    
    public final void setAID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRRN() {
        return null;
    }
    
    public final void setRRN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSTAN() {
        return null;
    }
    
    public final void setSTAN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTSI() {
        return null;
    }
    
    public final void setTSI(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTVR() {
        return null;
    }
    
    public final void setTVR(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.utils.IsoAccountType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.utils.IsoAccountType getAccountType() {
        return null;
    }
    
    public final void setAccountType(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAcquiringInstCode() {
        return null;
    }
    
    public final void setAcquiringInstCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getAdditionalAmount() {
        return 0L;
    }
    
    public final void setAdditionalAmount(long p0) {
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getAmount() {
        return 0L;
    }
    
    public final void setAmount(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppCryptogram() {
        return null;
    }
    
    public final void setAppCryptogram(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthCode() {
        return null;
    }
    
    public final void setAuthCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardExpiry() {
        return null;
    }
    
    public final void setCardExpiry(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardHolder() {
        return null;
    }
    
    public final void setCardHolder(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardLabel() {
        return null;
    }
    
    public final void setCardLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEchoData() {
        return null;
    }
    
    public final void setEchoData(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long component17() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalDate() {
        return null;
    }
    
    public final void setLocalDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalTime() {
        return null;
    }
    
    public final void setLocalTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaskedPan() {
        return null;
    }
    
    public final void setMaskedPan(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantId() {
        return null;
    }
    
    public final void setMerchantId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalForwardingInstCode() {
        return null;
    }
    
    public final void setOriginalForwardingInstCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component23() {
        return 0L;
    }
    
    public final long getOtherAmount() {
        return 0L;
    }
    
    public final void setOtherAmount(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtherId() {
        return null;
    }
    
    public final void setOtherId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponseCode() {
        return null;
    }
    
    public final void setResponseCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemark() {
        return null;
    }
    
    public final void setRemark(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResponseDE55() {
        return null;
    }
    
    public final void setResponseDE55(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
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
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalId() {
        return null;
    }
    
    public final void setTerminalId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component30() {
        return 0L;
    }
    
    public final long getTransactionTimeInMillis() {
        return 0L;
    }
    
    public final void setTransactionTimeInMillis(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType component31() {
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
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransmissionDateTime() {
        return null;
    }
    
    public final void setTransmissionDateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}