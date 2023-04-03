package com.netpluspay.nibssclient.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.netpluspay.nibssclient.database.RoomTypeConverters;
import com.netpluspay.nibssclient.work.ModelObjects;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransactionTrackingTableDao_Impl implements TransactionTrackingTableDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ModelObjects.TransactionResponseXForTracking> __insertionAdapterOfTransactionResponseXForTracking;

  private final EntityDeletionOrUpdateAdapter<ModelObjects.TransactionResponseXForTracking> __deletionAdapterOfTransactionResponseXForTracking;

  public TransactionTrackingTableDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransactionResponseXForTracking = new EntityInsertionAdapter<ModelObjects.TransactionResponseXForTracking>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `transactionTrackingTable` (`temporalRRN`,`transRespX`,`status`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt,
          ModelObjects.TransactionResponseXForTracking value) {
        if (value.getTemporalRRN() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTemporalRRN());
        }
        final String _tmp = RoomTypeConverters.fromTransactionResponseX(value.getTransRespX());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getStatus() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStatus());
        }
      }
    };
    this.__deletionAdapterOfTransactionResponseXForTracking = new EntityDeletionOrUpdateAdapter<ModelObjects.TransactionResponseXForTracking>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `transactionTrackingTable` WHERE `temporalRRN` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt,
          ModelObjects.TransactionResponseXForTracking value) {
        if (value.getTemporalRRN() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTemporalRRN());
        }
      }
    };
  }

  @Override
  public Single<Long> insertTransactionForTracking(
      final ModelObjects.TransactionResponseXForTracking transResponse) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfTransactionResponseXForTracking.insertAndReturnId(transResponse);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<Integer> deleteTransactionAfterSuccessfulUpdateAtBackend(
      final ModelObjects.TransactionResponseXForTracking updatedTrans) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfTransactionResponseXForTracking.handle(updatedTrans);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public List<ModelObjects.TransactionResponseXForTracking> getAllYetToBeUpdatedTransactions() {
    final String _sql = "SELECT * FROM transactionTrackingTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTemporalRRN = CursorUtil.getColumnIndexOrThrow(_cursor, "temporalRRN");
      final int _cursorIndexOfTransRespX = CursorUtil.getColumnIndexOrThrow(_cursor, "transRespX");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final List<ModelObjects.TransactionResponseXForTracking> _result = new ArrayList<ModelObjects.TransactionResponseXForTracking>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ModelObjects.TransactionResponseXForTracking _item;
        final String _tmpTemporalRRN;
        if (_cursor.isNull(_cursorIndexOfTemporalRRN)) {
          _tmpTemporalRRN = null;
        } else {
          _tmpTemporalRRN = _cursor.getString(_cursorIndexOfTemporalRRN);
        }
        final ModelObjects.TransactionResponseX _tmpTransRespX;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfTransRespX)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfTransRespX);
        }
        _tmpTransRespX = RoomTypeConverters.toTransactionResponseX(_tmp);
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        _item = new ModelObjects.TransactionResponseXForTracking(_tmpTemporalRRN,_tmpTransRespX,_tmpStatus);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
