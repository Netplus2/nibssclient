package com.netpluspay.nibssclient.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/netpluspay/nibssclient/exception/NibssClientException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "messages", "", "nibssError", "Lcom/netpluspay/nibssclient/exception/NibssClientException$NibssError;", "(Ljava/lang/String;Lcom/netpluspay/nibssclient/exception/NibssClientException$NibssError;)V", "getNibssError", "()Lcom/netpluspay/nibssclient/exception/NibssClientException$NibssError;", "NibssError", "nibssclient_debug"})
public final class NibssClientException extends java.lang.Exception {
    @org.jetbrains.annotations.Nullable()
    private final com.netpluspay.nibssclient.exception.NibssClientException.NibssError nibssError = null;
    
    public NibssClientException(@org.jetbrains.annotations.Nullable()
    java.lang.String messages, @org.jetbrains.annotations.Nullable()
    com.netpluspay.nibssclient.exception.NibssClientException.NibssError nibssError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.netpluspay.nibssclient.exception.NibssClientException.NibssError getNibssError() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/netpluspay/nibssclient/exception/NibssClientException$NibssError;", "", "code", "", "error", "", "possibleCause", "possibleSolution", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/String;", "getPossibleCause", "setPossibleCause", "(Ljava/lang/String;)V", "getPossibleSolution", "setPossibleSolution", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/netpluspay/nibssclient/exception/NibssClientException$NibssError;", "equals", "", "other", "hashCode", "toString", "nibssclient_debug"})
    public static final class NibssError {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer code = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String possibleCause;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String possibleSolution;
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.exception.NibssClientException.NibssError copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.Nullable()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        java.lang.String possibleCause, @org.jetbrains.annotations.Nullable()
        java.lang.String possibleSolution) {
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
        
        public NibssError(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.Nullable()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        java.lang.String possibleCause, @org.jetbrains.annotations.Nullable()
        java.lang.String possibleSolution) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPossibleCause() {
            return null;
        }
        
        public final void setPossibleCause(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPossibleSolution() {
            return null;
        }
        
        public final void setPossibleSolution(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}