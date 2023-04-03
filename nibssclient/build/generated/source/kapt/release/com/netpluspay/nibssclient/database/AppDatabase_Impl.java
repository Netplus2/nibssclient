package com.netpluspay.nibssclient.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.netpluspay.nibssclient.dao.TransactionResponseDao;
import com.netpluspay.nibssclient.dao.TransactionResponseDao_Impl;
import com.netpluspay.nibssclient.dao.TransactionTrackingTableDao;
import com.netpluspay.nibssclient.dao.TransactionTrackingTableDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TransactionTrackingTableDao _transactionTrackingTableDao;

  private volatile TransactionResponseDao _transactionResponseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(8) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TransactionResponse` (`transactionType` TEXT NOT NULL, `maskedPan` TEXT NOT NULL, `amount` INTEGER NOT NULL, `transmissionDateTime` TEXT NOT NULL, `STAN` TEXT NOT NULL, `RRN` TEXT NOT NULL, `localTime_12` TEXT NOT NULL, `localDate_13` TEXT NOT NULL, `otherAmount` INTEGER NOT NULL, `acquiringInstCode` TEXT NOT NULL, `originalForwardingInstCode` TEXT NOT NULL, `authCode` TEXT NOT NULL, `responseCode` TEXT NOT NULL, `additionalAmount_54` TEXT NOT NULL, `echoData` TEXT, `cardLabel` TEXT NOT NULL, `cardExpiry` TEXT NOT NULL, `cardHolder` TEXT NOT NULL, `TVR` TEXT NOT NULL, `TSI` TEXT NOT NULL, `AID` TEXT NOT NULL, `appCryptogram` TEXT NOT NULL, `transactionTimeInMillis` INTEGER NOT NULL, `accountType` TEXT NOT NULL, `terminalId` TEXT NOT NULL, `merchantId` TEXT NOT NULL, `otherId` TEXT NOT NULL, `id` INTEGER NOT NULL, `source` TEXT NOT NULL, `interSwitchThreshold` INTEGER NOT NULL, `errorMessage` TEXT, PRIMARY KEY(`RRN`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transactionTrackingTable` (`temporalRRN` TEXT NOT NULL, `transRespX` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`temporalRRN`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c069027c948fee1c567c76f1aa5533ce')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `TransactionResponse`");
        _db.execSQL("DROP TABLE IF EXISTS `transactionTrackingTable`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTransactionResponse = new HashMap<String, TableInfo.Column>(31);
        _columnsTransactionResponse.put("transactionType", new TableInfo.Column("transactionType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("maskedPan", new TableInfo.Column("maskedPan", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("transmissionDateTime", new TableInfo.Column("transmissionDateTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("STAN", new TableInfo.Column("STAN", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("RRN", new TableInfo.Column("RRN", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("localTime_12", new TableInfo.Column("localTime_12", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("localDate_13", new TableInfo.Column("localDate_13", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("otherAmount", new TableInfo.Column("otherAmount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("acquiringInstCode", new TableInfo.Column("acquiringInstCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("originalForwardingInstCode", new TableInfo.Column("originalForwardingInstCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("authCode", new TableInfo.Column("authCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("responseCode", new TableInfo.Column("responseCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("additionalAmount_54", new TableInfo.Column("additionalAmount_54", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("echoData", new TableInfo.Column("echoData", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("cardLabel", new TableInfo.Column("cardLabel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("cardExpiry", new TableInfo.Column("cardExpiry", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("cardHolder", new TableInfo.Column("cardHolder", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("TVR", new TableInfo.Column("TVR", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("TSI", new TableInfo.Column("TSI", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("AID", new TableInfo.Column("AID", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("appCryptogram", new TableInfo.Column("appCryptogram", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("transactionTimeInMillis", new TableInfo.Column("transactionTimeInMillis", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("accountType", new TableInfo.Column("accountType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("terminalId", new TableInfo.Column("terminalId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("merchantId", new TableInfo.Column("merchantId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("otherId", new TableInfo.Column("otherId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("interSwitchThreshold", new TableInfo.Column("interSwitchThreshold", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionResponse.put("errorMessage", new TableInfo.Column("errorMessage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactionResponse = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactionResponse = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactionResponse = new TableInfo("TransactionResponse", _columnsTransactionResponse, _foreignKeysTransactionResponse, _indicesTransactionResponse);
        final TableInfo _existingTransactionResponse = TableInfo.read(_db, "TransactionResponse");
        if (! _infoTransactionResponse.equals(_existingTransactionResponse)) {
          return new RoomOpenHelper.ValidationResult(false, "TransactionResponse(com.danbamitale.epmslib.entities.TransactionResponse).\n"
                  + " Expected:\n" + _infoTransactionResponse + "\n"
                  + " Found:\n" + _existingTransactionResponse);
        }
        final HashMap<String, TableInfo.Column> _columnsTransactionTrackingTable = new HashMap<String, TableInfo.Column>(3);
        _columnsTransactionTrackingTable.put("temporalRRN", new TableInfo.Column("temporalRRN", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTrackingTable.put("transRespX", new TableInfo.Column("transRespX", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTrackingTable.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactionTrackingTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactionTrackingTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactionTrackingTable = new TableInfo("transactionTrackingTable", _columnsTransactionTrackingTable, _foreignKeysTransactionTrackingTable, _indicesTransactionTrackingTable);
        final TableInfo _existingTransactionTrackingTable = TableInfo.read(_db, "transactionTrackingTable");
        if (! _infoTransactionTrackingTable.equals(_existingTransactionTrackingTable)) {
          return new RoomOpenHelper.ValidationResult(false, "transactionTrackingTable(com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking).\n"
                  + " Expected:\n" + _infoTransactionTrackingTable + "\n"
                  + " Found:\n" + _existingTransactionTrackingTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c069027c948fee1c567c76f1aa5533ce", "88a262385d498244b65fa79984432dd5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "TransactionResponse","transactionTrackingTable");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `TransactionResponse`");
      _db.execSQL("DELETE FROM `transactionTrackingTable`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TransactionTrackingTableDao.class, TransactionTrackingTableDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TransactionResponseDao.class, TransactionResponseDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TransactionTrackingTableDao transactionTrackingTableDao() {
    if (_transactionTrackingTableDao != null) {
      return _transactionTrackingTableDao;
    } else {
      synchronized(this) {
        if(_transactionTrackingTableDao == null) {
          _transactionTrackingTableDao = new TransactionTrackingTableDao_Impl(this);
        }
        return _transactionTrackingTableDao;
      }
    }
  }

  @Override
  public TransactionResponseDao transactionResponseDao() {
    if (_transactionResponseDao != null) {
      return _transactionResponseDao;
    } else {
      synchronized(this) {
        if(_transactionResponseDao == null) {
          _transactionResponseDao = new TransactionResponseDao_Impl(this);
        }
        return _transactionResponseDao;
      }
    }
  }
}
