package com.netpluspay.nibssclient.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011J\n\u0010\u0018\u001a\u00020\u0019*\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/netpluspay/nibssclient/util/RandomNumUtil;", "", "()V", "formattedTime", "", "getFormattedTime", "()Ljava/lang/String;", "generateRandomRrn", "length", "", "getCurrentDateTime", "getDate", "milliSeconds", "", "mapDanbamitaleResponseToResponseWithRrn", "Lcom/netpluspay/nibssclient/models/TransactionWithRemark;", "input", "Lcom/danbamitale/epmslib/entities/TransactionResponse;", "remark", "rrn", "mapDanbamitaleResponseToResponseX", "Lcom/netpluspay/nibssclient/models/TransactionResponseX;", "mapTransactionResponseToString", "transResp", "mapNetPlusPayKeyHolderToDanBamitaleKeyHolder", "Lcom/danbamitale/epmslib/entities/KeyHolder;", "Lcom/netpluspay/nibssclient/models/KeyHolder;", "nibssclient_release"})
public final class RandomNumUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.RandomNumUtil INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String formattedTime = null;
    
    private RandomNumUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateRandomRrn(int length) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.KeyHolder mapNetPlusPayKeyHolderToDanBamitaleKeyHolder(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.KeyHolder $this$mapNetPlusPayKeyHolderToDanBamitaleKeyHolder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getCurrentDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String mapTransactionResponseToString(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionResponse transResp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDate(long milliSeconds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.TransactionResponseX mapDanbamitaleResponseToResponseX(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionResponse input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.TransactionWithRemark mapDanbamitaleResponseToResponseWithRrn(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionResponse input, @org.jetbrains.annotations.NotNull()
    java.lang.String remark, @org.jetbrains.annotations.Nullable()
    java.lang.String rrn) {
        return null;
    }
}