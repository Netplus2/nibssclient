package com.netpluspay.nibssclient.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001c"}, d2 = {"Lcom/netpluspay/nibssclient/util/Singletons;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "getConfigData", "Lcom/danbamitale/epmslib/entities/ConfigData;", "getCurrentlyLoggedInUser", "Lcom/netpluspay/nibssclient/models/User;", "getGsonInstance", "getKeyHolder", "Lcom/danbamitale/epmslib/entities/KeyHolder;", "getPartnerThreshold", "", "getSavedConfigurationData", "Lcom/netpluspay/nibssclient/models/ConfigurationData;", "setConfigData", "", "configData", "setPartnerThreshold", "partnerThresh", "setUseStormTid", "useStormTid", "", "settKeyHolder", "keyHolder", "nibssclient_release"})
public final class Singletons {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.Singletons INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.gson.Gson gson = null;
    
    private Singletons() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.google.gson.Gson getGsonInstance() {
        return null;
    }
    
    public final void setPartnerThreshold(int partnerThresh) {
    }
    
    public final int getPartnerThreshold() {
        return 0;
    }
    
    public final void setUseStormTid(boolean useStormTid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.netpluspay.nibssclient.models.User getCurrentlyLoggedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.ConfigurationData getSavedConfigurationData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.KeyHolder getKeyHolder() {
        return null;
    }
    
    public final void settKeyHolder(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.KeyHolder keyHolder) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.ConfigData getConfigData() {
        return null;
    }
    
    public final void setConfigData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConfigData configData) {
    }
}