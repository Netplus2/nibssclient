package com.netpluspay.nibssclient.util.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/netpluspay/nibssclient/util/app/NibssClient;", "", "()V", "init", "", "clientCertAssetFile", "", "clientKeyAssetFile", "fileContent", "", "terminalId", "terminalSerial", "init2", "setTestParams", "host", "port", "", "useSSL", "useTestEnvironment", "nibssclient_release"})
public final class NibssClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.app.NibssClient INSTANCE = null;
    
    private NibssClient() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String clientCertAssetFile, @org.jetbrains.annotations.NotNull()
    java.lang.String clientKeyAssetFile, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String clientCertAssetFile, @org.jetbrains.annotations.NotNull()
    java.lang.String clientKeyAssetFile, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial, boolean fileContent) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void init2(@org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String clientCertAssetFile, @org.jetbrains.annotations.NotNull()
    java.lang.String clientKeyAssetFile) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    java.lang.String clientCertAssetFile, @org.jetbrains.annotations.NotNull()
    java.lang.String clientKeyAssetFile, boolean fileContent) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void useTestEnvironment(boolean useTestEnvironment) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setTestParams(@org.jetbrains.annotations.NotNull()
    java.lang.String host, int port) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void useSSL(boolean useSSL) {
    }
}