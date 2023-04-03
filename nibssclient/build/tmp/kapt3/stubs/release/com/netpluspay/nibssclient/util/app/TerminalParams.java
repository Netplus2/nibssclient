package com.netpluspay.nibssclient.util.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u00102\u001a\u0004\u0018\u00010\u0004J\u0006\u00103\u001a\u00020\u0016J\u0006\u00104\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006R\u0011\u0010 \u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001a\u0010.\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001a\u00a8\u00065"}, d2 = {"Lcom/netpluspay/nibssclient/util/app/TerminalParams;", "", "()V", "CLIENT_CERT_ASSET", "", "getCLIENT_CERT_ASSET", "()Ljava/lang/String;", "setCLIENT_CERT_ASSET", "(Ljava/lang/String;)V", "CLIENT_KEY_ASSET", "getCLIENT_KEY_ASSET", "setCLIENT_KEY_ASSET", "CONNECTION_HOST", "getCONNECTION_HOST", "setCONNECTION_HOST", "CONNECTION_PORT", "", "getCONNECTION_PORT", "()I", "setCONNECTION_PORT", "(I)V", "FILE_CONTENT", "", "getFILE_CONTENT", "()Z", "setFILE_CONTENT", "(Z)V", "ON_TEST_ENV", "getON_TEST_ENV", "setON_TEST_ENV", "PROD_HOST", "getPROD_HOST", "PROD_PORT", "getPROD_PORT", "TERMINAL_ID", "getTERMINAL_ID", "setTERMINAL_ID", "TERMINAL_SERIAL", "getTERMINAL_SERIAL", "setTERMINAL_SERIAL", "TEST_HOST", "getTEST_HOST", "setTEST_HOST", "TEST_PORT", "getTEST_PORT", "setTEST_PORT", "USE_SSL", "getUSE_SSL", "setUSE_SSL", "defaultTerminalId", "defaultTerminalSerial", "isClientCertInitialized", "isClientKeyInitialized", "nibssclient_release"})
public final class TerminalParams {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.app.TerminalParams INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PROD_HOST = null;
    private static final int PROD_PORT = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TEST_HOST;
    private static int TEST_PORT;
    private static boolean ON_TEST_ENV = false;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CONNECTION_HOST;
    private static int CONNECTION_PORT;
    private static boolean USE_SSL = true;
    private static boolean FILE_CONTENT = false;
    public static java.lang.String CLIENT_CERT_ASSET;
    public static java.lang.String CLIENT_KEY_ASSET;
    public static java.lang.String TERMINAL_ID;
    public static java.lang.String TERMINAL_SERIAL;
    
    private TerminalParams() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPROD_HOST() {
        return null;
    }
    
    public final int getPROD_PORT() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTEST_HOST() {
        return null;
    }
    
    public final void setTEST_HOST(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTEST_PORT() {
        return 0;
    }
    
    public final void setTEST_PORT(int p0) {
    }
    
    public final boolean getON_TEST_ENV() {
        return false;
    }
    
    public final void setON_TEST_ENV(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCONNECTION_HOST() {
        return null;
    }
    
    public final void setCONNECTION_HOST(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCONNECTION_PORT() {
        return 0;
    }
    
    public final void setCONNECTION_PORT(int p0) {
    }
    
    public final boolean getUSE_SSL() {
        return false;
    }
    
    public final void setUSE_SSL(boolean p0) {
    }
    
    public final boolean getFILE_CONTENT() {
        return false;
    }
    
    public final void setFILE_CONTENT(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCLIENT_CERT_ASSET() {
        return null;
    }
    
    public final void setCLIENT_CERT_ASSET(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCLIENT_KEY_ASSET() {
        return null;
    }
    
    public final void setCLIENT_KEY_ASSET(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTERMINAL_ID() {
        return null;
    }
    
    public final void setTERMINAL_ID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTERMINAL_SERIAL() {
        return null;
    }
    
    public final void setTERMINAL_SERIAL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isClientCertInitialized() {
        return false;
    }
    
    public final boolean isClientKeyInitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String defaultTerminalId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String defaultTerminalSerial() {
        return null;
    }
}