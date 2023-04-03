package com.netpluspay.nibssclient.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\'J,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0015\u001a\u00020\u0005H\'J\u0016\u0010\u0014\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\b\u0010\u0018\u001a\u00020\u0019H\'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0015\u001a\u00020\u0005H\'\u00a8\u0006\u001b"}, d2 = {"Lcom/netpluspay/nibssclient/dao/TransactionResponseDao;", "", "getEndOfDayTransaction", "Landroidx/lifecycle/LiveData;", "", "Lcom/danbamitale/epmslib/entities/TransactionResponse;", "beginningOfDay", "", "endOfDay", "terminalId", "", "getEndOfDayTransactionSingle", "Lio/reactivex/Single;", "getRefundableTransactions", "getTransactionByTransactionType", "transactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "getTransactions", "Landroidx/paging/DataSource$Factory;", "", "insertNewTransaction", "transactionResponse", "", "transactionResponses", "nukeAllTransactions", "Lio/reactivex/Completable;", "updateTransaction", "nibssclient_debug"})
public abstract interface TransactionResponseDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract io.reactivex.Single<java.lang.Long> insertNewTransaction(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionResponse transactionResponse);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertNewTransaction(@org.jetbrains.annotations.NotNull()
    java.util.List<com.danbamitale.epmslib.entities.TransactionResponse> transactionResponses);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Single<java.lang.Integer> updateTransaction(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionResponse transactionResponse);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactionresponse WHERE terminalId=:terminalId ORDER BY transactionTimeInMillis DESC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.danbamitale.epmslib.entities.TransactionResponse> getTransactions(@org.jetbrains.annotations.NotNull()
    java.lang.String terminalId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactionresponse WHERE transactionTimeInMillis >= :beginningOfDay and transactionTimeInMillis <= :endOfDay and terminalId=:terminalId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.danbamitale.epmslib.entities.TransactionResponse>> getEndOfDayTransaction(long beginningOfDay, long endOfDay, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactionresponse WHERE transactionTimeInMillis >= :beginningOfDay and transactionTimeInMillis <= :endOfDay and terminalId=:terminalId")
    public abstract io.reactivex.Single<java.util.List<com.danbamitale.epmslib.entities.TransactionResponse>> getEndOfDayTransactionSingle(long beginningOfDay, long endOfDay, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactionresponse WHERE transactionType=:transactionType ORDER BY id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.danbamitale.epmslib.entities.TransactionResponse>> getTransactionByTransactionType(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactionresponse WHERE transactionType=\'PURCHASE\' AND responseCode=\'00\'")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.danbamitale.epmslib.entities.TransactionResponse>> getRefundableTransactions();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM transactionresponse")
    public abstract io.reactivex.Completable nukeAllTransactions();
}