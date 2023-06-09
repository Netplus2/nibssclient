package com.netpluspay.nibssclient.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.netpluspay.nibssclient.database.RoomTypeConverters.class})
@androidx.room.Database(entities = {com.danbamitale.epmslib.entities.TransactionResponse.class, com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking.class}, version = 8, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/netpluspay/nibssclient/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "transactionResponseDao", "Lcom/netpluspay/nibssclient/dao/TransactionResponseDao;", "transactionTrackingTableDao", "Lcom/netpluspay/nibssclient/dao/TransactionTrackingTableDao;", "Companion", "nibssclient_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.database.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.netpluspay.nibssclient.database.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.netpluspay.nibssclient.dao.TransactionResponseDao transactionResponseDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/netpluspay/nibssclient/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/netpluspay/nibssclient/database/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getDatabaseInstance", "nibssclient_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.database.AppDatabase getDatabaseInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.netpluspay.nibssclient.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}