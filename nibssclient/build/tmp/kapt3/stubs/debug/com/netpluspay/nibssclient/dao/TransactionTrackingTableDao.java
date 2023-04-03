package com.netpluspay.nibssclient.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/netpluspay/nibssclient/dao/TransactionTrackingTableDao;", "", "deleteTransactionAfterSuccessfulUpdateAtBackend", "Lio/reactivex/Single;", "", "updatedTrans", "Lcom/netpluspay/nibssclient/work/ModelObjects$TransactionResponseXForTracking;", "getAllYetToBeUpdatedTransactions", "", "insertTransactionForTracking", "", "transResponse", "nibssclient_debug"})
public abstract interface TransactionTrackingTableDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract io.reactivex.Single<java.lang.Long> insertTransactionForTracking(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking transResponse);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.Single<java.lang.Integer> deleteTransactionAfterSuccessfulUpdateAtBackend(@org.jetbrains.annotations.NotNull()
    com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking updatedTrans);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactionTrackingTable")
    public abstract java.util.List<com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking> getAllYetToBeUpdatedTransactions();
}