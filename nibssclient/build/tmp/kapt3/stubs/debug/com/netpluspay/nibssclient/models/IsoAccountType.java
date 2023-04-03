package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/netpluspay/nibssclient/models/IsoAccountType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "DEFAULT_UNSPECIFIED", "SAVINGS", "CURRENT", "CREDIT", "UNIVERSAL_ACCOUNT", "INVESTMENT_ACCOUNT", "BONUS_ACCOUNT", "Companion", "nibssclient_debug"})
public enum IsoAccountType {
    /*public static final*/ DEFAULT_UNSPECIFIED /* = new DEFAULT_UNSPECIFIED(null) */,
    /*public static final*/ SAVINGS /* = new SAVINGS(null) */,
    /*public static final*/ CURRENT /* = new CURRENT(null) */,
    /*public static final*/ CREDIT /* = new CREDIT(null) */,
    /*public static final*/ UNIVERSAL_ACCOUNT /* = new UNIVERSAL_ACCOUNT(null) */,
    /*public static final*/ INVESTMENT_ACCOUNT /* = new INVESTMENT_ACCOUNT(null) */,
    /*public static final*/ BONUS_ACCOUNT /* = new BONUS_ACCOUNT(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.models.IsoAccountType.Companion Companion = null;
    
    IsoAccountType(java.lang.String code) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/netpluspay/nibssclient/models/IsoAccountType$Companion;", "", "()V", "parseIntAccountType", "Lcom/netpluspay/nibssclient/models/IsoAccountType;", "type", "", "parseStringAccountType", "acctType", "", "nibssclient_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.models.IsoAccountType parseStringAccountType(@org.jetbrains.annotations.NotNull()
        java.lang.String acctType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.models.IsoAccountType parseIntAccountType(int type) {
            return null;
        }
    }
}