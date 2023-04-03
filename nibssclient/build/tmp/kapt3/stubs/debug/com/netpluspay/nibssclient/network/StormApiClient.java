package com.netpluspay.nibssclient.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/netpluspay/nibssclient/network/StormApiClient;", "", "()V", "Companion", "nibssclient_debug"})
public final class StormApiClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.network.StormApiClient.Companion Companion = null;
    private static com.netpluspay.nibssclient.network.StormApiService LOGGING_INSTANCE;
    private static com.netpluspay.nibssclient.network.RrnApiService RRN_LOGGING_INSTANCE;
    
    public StormApiClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\n\u001a\u00020\u0006J\t\u0010\u000b\u001a\u00020\fH\u0082 J\u0006\u0010\r\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/netpluspay/nibssclient/network/StormApiClient$Companion;", "", "()V", "LOGGING_INSTANCE", "Lcom/netpluspay/nibssclient/network/StormApiService;", "RRN_LOGGING_INSTANCE", "Lcom/netpluspay/nibssclient/network/RrnApiService;", "getBaseOkhttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "getBaseOkhttpClientBuilderForRrn", "getRrnServiceInstance", "getRrnUrl", "", "getStormApiLoginInstance", "nibssclient_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final okhttp3.OkHttpClient.Builder getBaseOkhttpClientBuilder() {
            return null;
        }
        
        private final okhttp3.OkHttpClient.Builder getBaseOkhttpClientBuilderForRrn() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.network.StormApiService getStormApiLoginInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.network.RrnApiService getRrnServiceInstance() {
            return null;
        }
        
        private final native java.lang.String getRrnUrl() {
            return null;
        }
    }
}