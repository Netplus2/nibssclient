package com.netpluspay.nibssclient.work;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/netpluspay/nibssclient/work/RepushFailedTransactionToBackendWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "stormApiService", "Lcom/netpluspay/nibssclient/network/StormApiService;", "transactionTrackingTableDao", "Lcom/netpluspay/nibssclient/dao/TransactionTrackingTableDao;", "doWork", "Landroidx/work/ListenableWorker$Result;", "onStopped", "", "repushTransactionTransaction", "transactionToRepush", "Lcom/netpluspay/nibssclient/work/ModelObjects$TransactionResponseXForTracking;", "decrementCounter", "Lkotlin/Function0;", "nibssclient_debug"})
public final class RepushFailedTransactionToBackendWorker extends androidx.work.Worker {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.netpluspay.nibssclient.network.StormApiService stormApiService = null;
    private final com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao = null;
    
    public RepushFailedTransactionToBackendWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workParams) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    private final void repushTransactionTransaction(com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking transactionToRepush, kotlin.jvm.functions.Function0<kotlin.Unit> decrementCounter) {
    }
    
    @java.lang.Override()
    public void onStopped() {
    }
}