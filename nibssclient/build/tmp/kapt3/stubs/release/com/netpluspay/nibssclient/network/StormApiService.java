package com.netpluspay.nibssclient.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/netpluspay/nibssclient/network/StormApiService;", "", "getPartnerInterSwitchThreshold", "Lio/reactivex/Single;", "Lcom/netpluspay/nibssclient/models/GetPartnerInterSwitchThresholdResponse;", "partnerId", "", "logTransactionBeforeMakingPayment", "Lcom/netpluspay/nibssclient/models/ResponseBodyAfterLoginToBackend;", "dataToLog", "Lcom/netpluspay/nibssclient/models/TransactionToLogBeforeConnectingToNibbs;", "updateLogAfterConnectingToNibss", "Lcom/netpluspay/nibssclient/models/LogToBackendResponse;", "rrn", "data", "Lcom/netpluspay/nibssclient/models/DataToLogAfterConnectingToNibss;", "updateLogAfterConnectingToNibss2", "Lretrofit2/Response;", "nibssclient_release"})
public abstract interface StormApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/pos_transaction")
    public abstract io.reactivex.Single<com.netpluspay.nibssclient.models.ResponseBodyAfterLoginToBackend> logTransactionBeforeMakingPayment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.netpluspay.nibssclient.models.TransactionToLogBeforeConnectingToNibbs dataToLog);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/pos_transaction/{rrn}")
    public abstract io.reactivex.Single<com.netpluspay.nibssclient.models.LogToBackendResponse> updateLogAfterConnectingToNibss(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "rrn")
    java.lang.String rrn, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.netpluspay.nibssclient.models.DataToLogAfterConnectingToNibss data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/pos_transaction/{rrn}")
    public abstract io.reactivex.Single<retrofit2.Response<com.netpluspay.nibssclient.models.LogToBackendResponse>> updateLogAfterConnectingToNibss2(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "rrn")
    java.lang.String rrn, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.netpluspay.nibssclient.models.DataToLogAfterConnectingToNibss data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/partners/{partnerId}/isw_threshold")
    public abstract io.reactivex.Single<com.netpluspay.nibssclient.models.GetPartnerInterSwitchThresholdResponse> getPartnerInterSwitchThreshold(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "partnerId")
    java.lang.String partnerId);
}