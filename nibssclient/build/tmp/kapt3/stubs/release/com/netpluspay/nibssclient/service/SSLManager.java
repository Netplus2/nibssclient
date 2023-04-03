package com.netpluspay.nibssclient.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0003\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/netpluspay/nibssclient/service/SSLManager;", "", "()V", "accessFile", "Ljava/io/InputStream;", "resource", "", "getFromString", "Ljava/security/PrivateKey;", "context", "Landroid/content/Context;", "getKeyMangerFactory", "Ljavax/net/ssl/KeyManagerFactory;", "getSSLFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSSLSocket", "Ljavax/net/ssl/SSLSocket;", "getSSLSockets", "getX509Certificate", "Ljava/security/cert/X509Certificate;", "inputStream", "trustEveryOne", "", "Ljavax/net/ssl/X509TrustManager;", "()[Ljavax/net/ssl/X509TrustManager;", "nibssclient_release"})
public final class SSLManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.service.SSLManager INSTANCE = null;
    
    private SSLManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.SSLSocket getSSLSockets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.SSLSocket getSSLSocket(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final javax.net.ssl.SSLSocketFactory getSSLFactory(android.content.Context context) {
        return null;
    }
    
    private final javax.net.ssl.KeyManagerFactory getKeyMangerFactory(android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.security.PrivateKey getFromString(android.content.Context context) throws java.lang.Exception {
        return null;
    }
    
    private final java.security.cert.X509Certificate getX509Certificate(java.io.InputStream inputStream) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.FileNotFoundException.class})
    private final java.io.InputStream accessFile(java.lang.String resource) throws java.io.FileNotFoundException {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"TrustAllX509TrustManager"})
    private final javax.net.ssl.X509TrustManager[] trustEveryOne() {
        return null;
    }
}