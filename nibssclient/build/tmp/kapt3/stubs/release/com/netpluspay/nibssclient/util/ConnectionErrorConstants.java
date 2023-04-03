package com.netpluspay.nibssclient.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/netpluspay/nibssclient/util/ConnectionErrorConstants;", "", "()V", "CONNECTION_ERROR_MESSAGE_1", "", "CONNECTION_ERROR_MESSAGE_2", "CONNECTION_ERROR_MESSAGE_3", "CONNECTION_ERROR_MESSAGE_4", "CONNECTION_ERROR_MESSAGE_5", "CONNECTION_ERROR_MESSAGE_6", "CONNECTION_ERROR_MESSAGE_7", "CONNECTION_ERROR_MESSAGE_8", "CONNECTION_ERROR_MESSAGE_9", "isConnectionError", "", "responseMessage", "nibssclient_release"})
public final class ConnectionErrorConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.ConnectionErrorConstants INSTANCE = null;
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_1 = "Connection timed out, failed to receive response from remote server";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_2 = "Could not connect to the internet, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_3 = "Could not connect with remote server, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_4 = "Could not connect with remote server, port is unreachable, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_5 = "Malformed url, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_6 = "Could not bind socket to local address or port, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_7 = "Could not create socket, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_8 = "Host address could not be recognized, check your connection settings and try again";
    private static final java.lang.String CONNECTION_ERROR_MESSAGE_9 = "Unknown service, check your connection settings and try again";
    
    private ConnectionErrorConstants() {
        super();
    }
    
    public final boolean isConnectionError(@org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage) {
        return false;
    }
}