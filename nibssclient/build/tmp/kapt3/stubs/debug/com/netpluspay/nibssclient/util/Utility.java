package com.netpluspay.nibssclient.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0010J$\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\f\u00a8\u0006 "}, d2 = {"Lcom/netpluspay/nibssclient/util/Utility;", "", "()V", "gatewayErrorTransactionResponse", "Lcom/netpluspay/nibssclient/models/TransactionResponse;", "amount", "", "transactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "accountType", "Lcom/netpluspay/nibssclient/models/IsoAccountType;", "errorMessage", "", "getCustomRrn", "hex", "data", "", "hexStringToByteArray", "s", "hexToByteArray", "parseLongIntoNairaKoboString", "tempAmount", "currencySymbol", "toHexString", "b", "getTransactionResponseToLog", "Lcom/netpluspay/nibssclient/models/TransactionToLogBeforeConnectingToNibbs;", "Lcom/netpluspay/nibssclient/models/MakePaymentParams;", "cardScheme", "requestData", "Lcom/danbamitale/epmslib/entities/TransactionRequestData;", "rrn", "nibssclient_debug"})
public final class Utility {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.Utility INSTANCE = null;
    
    private Utility() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String hex(@org.jetbrains.annotations.NotNull()
    byte[] data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toHexString(@org.jetbrains.annotations.NotNull()
    byte[] b) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] hexToByteArray(@org.jetbrains.annotations.Nullable()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] hexStringToByteArray(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseLongIntoNairaKoboString(long tempAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String currencySymbol) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.TransactionResponse gatewayErrorTransactionResponse(long amount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomRrn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.TransactionToLogBeforeConnectingToNibbs getTransactionResponseToLog(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.MakePaymentParams $this$getTransactionResponseToLog, @org.jetbrains.annotations.NotNull()
    java.lang.String cardScheme, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionRequestData requestData, @org.jetbrains.annotations.Nullable()
    java.lang.String rrn) {
        return null;
    }
}