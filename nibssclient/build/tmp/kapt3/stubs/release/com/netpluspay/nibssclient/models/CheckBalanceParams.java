package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/netpluspay/nibssclient/models/CheckBalanceParams;", "", "cardData", "Lcom/netpluspay/nibssclient/models/CardData;", "accountType", "Lcom/netpluspay/nibssclient/models/IsoAccountType;", "terminalId", "", "(Lcom/netpluspay/nibssclient/models/CardData;Lcom/netpluspay/nibssclient/models/IsoAccountType;Ljava/lang/String;)V", "getAccountType", "()Lcom/netpluspay/nibssclient/models/IsoAccountType;", "setAccountType", "(Lcom/netpluspay/nibssclient/models/IsoAccountType;)V", "action", "getCardData", "()Lcom/netpluspay/nibssclient/models/CardData;", "getTerminalId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "nibssclient_release"})
public final class CheckBalanceParams {
    @org.jetbrains.annotations.NotNull()
    private final com.netpluspay.nibssclient.models.CardData cardData = null;
    @org.jetbrains.annotations.NotNull()
    private com.netpluspay.nibssclient.models.IsoAccountType accountType;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String terminalId = null;
    private final java.lang.String action = "checkBalance";
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.CheckBalanceParams copy(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
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
    public CheckBalanceParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CheckBalanceParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CheckBalanceParams(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.CardData cardData, @org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.IsoAccountType getAccountType() {
        return null;
    }
    
    public final void setAccountType(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.models.IsoAccountType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerminalId() {
        return null;
    }
}