package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/netpluspay/nibssclient/models/AccountBalance;", "", "accountType", "Lcom/netpluspay/nibssclient/models/IsoAccountType;", "amountType", "", "currencyCode", "amountSign", "", "amount", "", "(Lcom/netpluspay/nibssclient/models/IsoAccountType;Ljava/lang/String;Ljava/lang/String;CJ)V", "getAccountType", "()Lcom/netpluspay/nibssclient/models/IsoAccountType;", "getAmount", "()J", "getAmountSign", "()C", "getAmountType", "()Ljava/lang/String;", "getCurrencyCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "nibssclient_debug"})
public final class AccountBalance {
    @org.jetbrains.annotations.NotNull()
    private final com.netpluspay.nibssclient.models.IsoAccountType accountType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String amountType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currencyCode = null;
    private final char amountSign = '\u0000';
    private final long amount = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.AccountBalance copy(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String amountType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, char amountSign, long amount) {
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
    
    public AccountBalance(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.NotNull()
    java.lang.String amountType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, char amountSign, long amount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType getAccountType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmountType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final char component4() {
        return '\u0000';
    }
    
    public final char getAmountSign() {
        return '\u0000';
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getAmount() {
        return 0L;
    }
}