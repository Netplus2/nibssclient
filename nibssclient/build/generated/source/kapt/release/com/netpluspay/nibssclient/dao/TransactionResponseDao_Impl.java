package com.netpluspay.nibssclient.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.danbamitale.epmslib.entities.PosMode;
import com.danbamitale.epmslib.entities.TransactionResponse;
import com.danbamitale.epmslib.entities.TransactionType;
import com.danbamitale.epmslib.utils.IsoAccountType;
import com.netpluspay.nibssclient.database.RoomTypeConverters;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransactionResponseDao_Impl implements TransactionResponseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TransactionResponse> __insertionAdapterOfTransactionResponse;

  private final EntityDeletionOrUpdateAdapter<TransactionResponse> __updateAdapterOfTransactionResponse;

  private final SharedSQLiteStatement __preparedStmtOfNukeAllTransactions;

  public TransactionResponseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransactionResponse = new EntityInsertionAdapter<TransactionResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `TransactionResponse` (`transactionType`,`maskedPan`,`amount`,`transmissionDateTime`,`STAN`,`RRN`,`localTime_12`,`localDate_13`,`otherAmount`,`acquiringInstCode`,`originalForwardingInstCode`,`authCode`,`responseCode`,`additionalAmount_54`,`echoData`,`cardLabel`,`cardExpiry`,`cardHolder`,`TVR`,`TSI`,`AID`,`appCryptogram`,`transactionTimeInMillis`,`accountType`,`terminalId`,`merchantId`,`otherId`,`id`,`source`,`interSwitchThreshold`,`errorMessage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionResponse value) {
        final String _tmp = RoomTypeConverters.convertTransactionResponseEnumToString(value.getTransactionType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getMaskedPan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMaskedPan());
        }
        stmt.bindLong(3, value.getAmount());
        if (value.getTransmissionDateTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTransmissionDateTime());
        }
        if (value.getSTAN() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSTAN());
        }
        if (value.getRRN() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRRN());
        }
        if (value.getLocalTime_12() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLocalTime_12());
        }
        if (value.getLocalDate_13() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLocalDate_13());
        }
        stmt.bindLong(9, value.getOtherAmount());
        if (value.getAcquiringInstCode() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAcquiringInstCode());
        }
        if (value.getOriginalForwardingInstCode() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOriginalForwardingInstCode());
        }
        if (value.getAuthCode() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAuthCode());
        }
        if (value.getResponseCode() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getResponseCode());
        }
        if (value.getAdditionalAmount_54() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getAdditionalAmount_54());
        }
        if (value.getEchoData() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getEchoData());
        }
        if (value.getCardLabel() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getCardLabel());
        }
        if (value.getCardExpiry() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getCardExpiry());
        }
        if (value.getCardHolder() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getCardHolder());
        }
        if (value.getTVR() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getTVR());
        }
        if (value.getTSI() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTSI());
        }
        if (value.getAID() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getAID());
        }
        if (value.getAppCryptogram() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getAppCryptogram());
        }
        stmt.bindLong(23, value.getTransactionTimeInMillis());
        final String _tmp_1 = RoomTypeConverters.convertIsoAccountEnumToString(value.getAccountType());
        if (_tmp_1 == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, _tmp_1);
        }
        if (value.getTerminalId() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getTerminalId());
        }
        if (value.getMerchantId() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getMerchantId());
        }
        if (value.getOtherId() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getOtherId());
        }
        stmt.bindLong(28, value.getId());
        if (value.getSource() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, __PosMode_enumToString(value.getSource()));
        }
        stmt.bindLong(30, value.getInterSwitchThreshold());
        if (value.getErrorMessage() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getErrorMessage());
        }
      }
    };
    this.__updateAdapterOfTransactionResponse = new EntityDeletionOrUpdateAdapter<TransactionResponse>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TransactionResponse` SET `transactionType` = ?,`maskedPan` = ?,`amount` = ?,`transmissionDateTime` = ?,`STAN` = ?,`RRN` = ?,`localTime_12` = ?,`localDate_13` = ?,`otherAmount` = ?,`acquiringInstCode` = ?,`originalForwardingInstCode` = ?,`authCode` = ?,`responseCode` = ?,`additionalAmount_54` = ?,`echoData` = ?,`cardLabel` = ?,`cardExpiry` = ?,`cardHolder` = ?,`TVR` = ?,`TSI` = ?,`AID` = ?,`appCryptogram` = ?,`transactionTimeInMillis` = ?,`accountType` = ?,`terminalId` = ?,`merchantId` = ?,`otherId` = ?,`id` = ?,`source` = ?,`interSwitchThreshold` = ?,`errorMessage` = ? WHERE `RRN` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionResponse value) {
        final String _tmp = RoomTypeConverters.convertTransactionResponseEnumToString(value.getTransactionType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getMaskedPan() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMaskedPan());
        }
        stmt.bindLong(3, value.getAmount());
        if (value.getTransmissionDateTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTransmissionDateTime());
        }
        if (value.getSTAN() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSTAN());
        }
        if (value.getRRN() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRRN());
        }
        if (value.getLocalTime_12() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLocalTime_12());
        }
        if (value.getLocalDate_13() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLocalDate_13());
        }
        stmt.bindLong(9, value.getOtherAmount());
        if (value.getAcquiringInstCode() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAcquiringInstCode());
        }
        if (value.getOriginalForwardingInstCode() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOriginalForwardingInstCode());
        }
        if (value.getAuthCode() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAuthCode());
        }
        if (value.getResponseCode() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getResponseCode());
        }
        if (value.getAdditionalAmount_54() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getAdditionalAmount_54());
        }
        if (value.getEchoData() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getEchoData());
        }
        if (value.getCardLabel() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getCardLabel());
        }
        if (value.getCardExpiry() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getCardExpiry());
        }
        if (value.getCardHolder() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getCardHolder());
        }
        if (value.getTVR() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getTVR());
        }
        if (value.getTSI() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTSI());
        }
        if (value.getAID() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getAID());
        }
        if (value.getAppCryptogram() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getAppCryptogram());
        }
        stmt.bindLong(23, value.getTransactionTimeInMillis());
        final String _tmp_1 = RoomTypeConverters.convertIsoAccountEnumToString(value.getAccountType());
        if (_tmp_1 == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, _tmp_1);
        }
        if (value.getTerminalId() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getTerminalId());
        }
        if (value.getMerchantId() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getMerchantId());
        }
        if (value.getOtherId() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getOtherId());
        }
        stmt.bindLong(28, value.getId());
        if (value.getSource() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, __PosMode_enumToString(value.getSource()));
        }
        stmt.bindLong(30, value.getInterSwitchThreshold());
        if (value.getErrorMessage() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getErrorMessage());
        }
        if (value.getRRN() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getRRN());
        }
      }
    };
    this.__preparedStmtOfNukeAllTransactions = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM transactionresponse";
        return _query;
      }
    };
  }

  @Override
  public Single<Long> insertNewTransaction(final TransactionResponse transactionResponse) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfTransactionResponse.insertAndReturnId(transactionResponse);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void insertNewTransaction(final List<TransactionResponse> transactionResponses) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTransactionResponse.insert(transactionResponses);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<Integer> updateTransaction(final TransactionResponse transactionResponse) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfTransactionResponse.handle(transactionResponse);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable nukeAllTransactions() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfNukeAllTransactions.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfNukeAllTransactions.release(_stmt);
        }
      }
    });
  }

  @Override
  public DataSource.Factory<Integer, TransactionResponse> getTransactions(final String terminalId) {
    final String _sql = "SELECT * FROM transactionresponse WHERE terminalId=? ORDER BY transactionTimeInMillis DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (terminalId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, terminalId);
    }
    return new DataSource.Factory<Integer, TransactionResponse>() {
      @Override
      public LimitOffsetDataSource<TransactionResponse> create() {
        return new LimitOffsetDataSource<TransactionResponse>(__db, _statement, false, true , "transactionresponse") {
          @Override
          protected List<TransactionResponse> convertRows(Cursor cursor) {
            final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(cursor, "transactionType");
            final int _cursorIndexOfMaskedPan = CursorUtil.getColumnIndexOrThrow(cursor, "maskedPan");
            final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(cursor, "amount");
            final int _cursorIndexOfTransmissionDateTime = CursorUtil.getColumnIndexOrThrow(cursor, "transmissionDateTime");
            final int _cursorIndexOfSTAN = CursorUtil.getColumnIndexOrThrow(cursor, "STAN");
            final int _cursorIndexOfRRN = CursorUtil.getColumnIndexOrThrow(cursor, "RRN");
            final int _cursorIndexOfLocalTime12 = CursorUtil.getColumnIndexOrThrow(cursor, "localTime_12");
            final int _cursorIndexOfLocalDate13 = CursorUtil.getColumnIndexOrThrow(cursor, "localDate_13");
            final int _cursorIndexOfOtherAmount = CursorUtil.getColumnIndexOrThrow(cursor, "otherAmount");
            final int _cursorIndexOfAcquiringInstCode = CursorUtil.getColumnIndexOrThrow(cursor, "acquiringInstCode");
            final int _cursorIndexOfOriginalForwardingInstCode = CursorUtil.getColumnIndexOrThrow(cursor, "originalForwardingInstCode");
            final int _cursorIndexOfAuthCode = CursorUtil.getColumnIndexOrThrow(cursor, "authCode");
            final int _cursorIndexOfResponseCode = CursorUtil.getColumnIndexOrThrow(cursor, "responseCode");
            final int _cursorIndexOfAdditionalAmount54 = CursorUtil.getColumnIndexOrThrow(cursor, "additionalAmount_54");
            final int _cursorIndexOfEchoData = CursorUtil.getColumnIndexOrThrow(cursor, "echoData");
            final int _cursorIndexOfCardLabel = CursorUtil.getColumnIndexOrThrow(cursor, "cardLabel");
            final int _cursorIndexOfCardExpiry = CursorUtil.getColumnIndexOrThrow(cursor, "cardExpiry");
            final int _cursorIndexOfCardHolder = CursorUtil.getColumnIndexOrThrow(cursor, "cardHolder");
            final int _cursorIndexOfTVR = CursorUtil.getColumnIndexOrThrow(cursor, "TVR");
            final int _cursorIndexOfTSI = CursorUtil.getColumnIndexOrThrow(cursor, "TSI");
            final int _cursorIndexOfAID = CursorUtil.getColumnIndexOrThrow(cursor, "AID");
            final int _cursorIndexOfAppCryptogram = CursorUtil.getColumnIndexOrThrow(cursor, "appCryptogram");
            final int _cursorIndexOfTransactionTimeInMillis = CursorUtil.getColumnIndexOrThrow(cursor, "transactionTimeInMillis");
            final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(cursor, "accountType");
            final int _cursorIndexOfTerminalId = CursorUtil.getColumnIndexOrThrow(cursor, "terminalId");
            final int _cursorIndexOfMerchantId = CursorUtil.getColumnIndexOrThrow(cursor, "merchantId");
            final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(cursor, "otherId");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(cursor, "source");
            final int _cursorIndexOfInterSwitchThreshold = CursorUtil.getColumnIndexOrThrow(cursor, "interSwitchThreshold");
            final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(cursor, "errorMessage");
            final List<TransactionResponse> _res = new ArrayList<TransactionResponse>(cursor.getCount());
            while(cursor.moveToNext()) {
              final TransactionResponse _item;
              _item = new TransactionResponse();
              final TransactionType _tmpTransactionType;
              final String _tmp;
              if (cursor.isNull(_cursorIndexOfTransactionType)) {
                _tmp = null;
              } else {
                _tmp = cursor.getString(_cursorIndexOfTransactionType);
              }
              _tmpTransactionType = RoomTypeConverters.convertTransactionResponseToEnum(_tmp);
              _item.setTransactionType(_tmpTransactionType);
              final String _tmpMaskedPan;
              if (cursor.isNull(_cursorIndexOfMaskedPan)) {
                _tmpMaskedPan = null;
              } else {
                _tmpMaskedPan = cursor.getString(_cursorIndexOfMaskedPan);
              }
              _item.setMaskedPan(_tmpMaskedPan);
              final long _tmpAmount;
              _tmpAmount = cursor.getLong(_cursorIndexOfAmount);
              _item.setAmount(_tmpAmount);
              final String _tmpTransmissionDateTime;
              if (cursor.isNull(_cursorIndexOfTransmissionDateTime)) {
                _tmpTransmissionDateTime = null;
              } else {
                _tmpTransmissionDateTime = cursor.getString(_cursorIndexOfTransmissionDateTime);
              }
              _item.setTransmissionDateTime(_tmpTransmissionDateTime);
              final String _tmpSTAN;
              if (cursor.isNull(_cursorIndexOfSTAN)) {
                _tmpSTAN = null;
              } else {
                _tmpSTAN = cursor.getString(_cursorIndexOfSTAN);
              }
              _item.setSTAN(_tmpSTAN);
              final String _tmpRRN;
              if (cursor.isNull(_cursorIndexOfRRN)) {
                _tmpRRN = null;
              } else {
                _tmpRRN = cursor.getString(_cursorIndexOfRRN);
              }
              _item.setRRN(_tmpRRN);
              final String _tmpLocalTime_12;
              if (cursor.isNull(_cursorIndexOfLocalTime12)) {
                _tmpLocalTime_12 = null;
              } else {
                _tmpLocalTime_12 = cursor.getString(_cursorIndexOfLocalTime12);
              }
              _item.setLocalTime_12(_tmpLocalTime_12);
              final String _tmpLocalDate_13;
              if (cursor.isNull(_cursorIndexOfLocalDate13)) {
                _tmpLocalDate_13 = null;
              } else {
                _tmpLocalDate_13 = cursor.getString(_cursorIndexOfLocalDate13);
              }
              _item.setLocalDate_13(_tmpLocalDate_13);
              final long _tmpOtherAmount;
              _tmpOtherAmount = cursor.getLong(_cursorIndexOfOtherAmount);
              _item.setOtherAmount(_tmpOtherAmount);
              final String _tmpAcquiringInstCode;
              if (cursor.isNull(_cursorIndexOfAcquiringInstCode)) {
                _tmpAcquiringInstCode = null;
              } else {
                _tmpAcquiringInstCode = cursor.getString(_cursorIndexOfAcquiringInstCode);
              }
              _item.setAcquiringInstCode(_tmpAcquiringInstCode);
              final String _tmpOriginalForwardingInstCode;
              if (cursor.isNull(_cursorIndexOfOriginalForwardingInstCode)) {
                _tmpOriginalForwardingInstCode = null;
              } else {
                _tmpOriginalForwardingInstCode = cursor.getString(_cursorIndexOfOriginalForwardingInstCode);
              }
              _item.setOriginalForwardingInstCode(_tmpOriginalForwardingInstCode);
              final String _tmpAuthCode;
              if (cursor.isNull(_cursorIndexOfAuthCode)) {
                _tmpAuthCode = null;
              } else {
                _tmpAuthCode = cursor.getString(_cursorIndexOfAuthCode);
              }
              _item.setAuthCode(_tmpAuthCode);
              final String _tmpResponseCode;
              if (cursor.isNull(_cursorIndexOfResponseCode)) {
                _tmpResponseCode = null;
              } else {
                _tmpResponseCode = cursor.getString(_cursorIndexOfResponseCode);
              }
              _item.setResponseCode(_tmpResponseCode);
              final String _tmpAdditionalAmount_54;
              if (cursor.isNull(_cursorIndexOfAdditionalAmount54)) {
                _tmpAdditionalAmount_54 = null;
              } else {
                _tmpAdditionalAmount_54 = cursor.getString(_cursorIndexOfAdditionalAmount54);
              }
              _item.setAdditionalAmount_54(_tmpAdditionalAmount_54);
              final String _tmpEchoData;
              if (cursor.isNull(_cursorIndexOfEchoData)) {
                _tmpEchoData = null;
              } else {
                _tmpEchoData = cursor.getString(_cursorIndexOfEchoData);
              }
              _item.setEchoData(_tmpEchoData);
              final String _tmpCardLabel;
              if (cursor.isNull(_cursorIndexOfCardLabel)) {
                _tmpCardLabel = null;
              } else {
                _tmpCardLabel = cursor.getString(_cursorIndexOfCardLabel);
              }
              _item.setCardLabel(_tmpCardLabel);
              final String _tmpCardExpiry;
              if (cursor.isNull(_cursorIndexOfCardExpiry)) {
                _tmpCardExpiry = null;
              } else {
                _tmpCardExpiry = cursor.getString(_cursorIndexOfCardExpiry);
              }
              _item.setCardExpiry(_tmpCardExpiry);
              final String _tmpCardHolder;
              if (cursor.isNull(_cursorIndexOfCardHolder)) {
                _tmpCardHolder = null;
              } else {
                _tmpCardHolder = cursor.getString(_cursorIndexOfCardHolder);
              }
              _item.setCardHolder(_tmpCardHolder);
              final String _tmpTVR;
              if (cursor.isNull(_cursorIndexOfTVR)) {
                _tmpTVR = null;
              } else {
                _tmpTVR = cursor.getString(_cursorIndexOfTVR);
              }
              _item.setTVR(_tmpTVR);
              final String _tmpTSI;
              if (cursor.isNull(_cursorIndexOfTSI)) {
                _tmpTSI = null;
              } else {
                _tmpTSI = cursor.getString(_cursorIndexOfTSI);
              }
              _item.setTSI(_tmpTSI);
              final String _tmpAID;
              if (cursor.isNull(_cursorIndexOfAID)) {
                _tmpAID = null;
              } else {
                _tmpAID = cursor.getString(_cursorIndexOfAID);
              }
              _item.setAID(_tmpAID);
              final String _tmpAppCryptogram;
              if (cursor.isNull(_cursorIndexOfAppCryptogram)) {
                _tmpAppCryptogram = null;
              } else {
                _tmpAppCryptogram = cursor.getString(_cursorIndexOfAppCryptogram);
              }
              _item.setAppCryptogram(_tmpAppCryptogram);
              final long _tmpTransactionTimeInMillis;
              _tmpTransactionTimeInMillis = cursor.getLong(_cursorIndexOfTransactionTimeInMillis);
              _item.setTransactionTimeInMillis(_tmpTransactionTimeInMillis);
              final IsoAccountType _tmpAccountType;
              final String _tmp_1;
              if (cursor.isNull(_cursorIndexOfAccountType)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = cursor.getString(_cursorIndexOfAccountType);
              }
              _tmpAccountType = RoomTypeConverters.convertIsoAccountStringToEnum(_tmp_1);
              _item.setAccountType(_tmpAccountType);
              final String _tmpTerminalId;
              if (cursor.isNull(_cursorIndexOfTerminalId)) {
                _tmpTerminalId = null;
              } else {
                _tmpTerminalId = cursor.getString(_cursorIndexOfTerminalId);
              }
              _item.setTerminalId(_tmpTerminalId);
              final String _tmpMerchantId;
              if (cursor.isNull(_cursorIndexOfMerchantId)) {
                _tmpMerchantId = null;
              } else {
                _tmpMerchantId = cursor.getString(_cursorIndexOfMerchantId);
              }
              _item.setMerchantId(_tmpMerchantId);
              final String _tmpOtherId;
              if (cursor.isNull(_cursorIndexOfOtherId)) {
                _tmpOtherId = null;
              } else {
                _tmpOtherId = cursor.getString(_cursorIndexOfOtherId);
              }
              _item.setOtherId(_tmpOtherId);
              final long _tmpId;
              _tmpId = cursor.getLong(_cursorIndexOfId);
              _item.setId(_tmpId);
              final PosMode _tmpSource;
              _tmpSource = __PosMode_stringToEnum(cursor.getString(_cursorIndexOfSource));
              _item.setSource(_tmpSource);
              final long _tmpInterSwitchThreshold;
              _tmpInterSwitchThreshold = cursor.getLong(_cursorIndexOfInterSwitchThreshold);
              _item.setInterSwitchThreshold(_tmpInterSwitchThreshold);
              final String _tmpErrorMessage;
              if (cursor.isNull(_cursorIndexOfErrorMessage)) {
                _tmpErrorMessage = null;
              } else {
                _tmpErrorMessage = cursor.getString(_cursorIndexOfErrorMessage);
              }
              _item.setErrorMessage(_tmpErrorMessage);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<List<TransactionResponse>> getEndOfDayTransaction(final long beginningOfDay,
      final long endOfDay, final String terminalId) {
    final String _sql = "SELECT * FROM transactionresponse WHERE transactionTimeInMillis >= ? and transactionTimeInMillis <= ? and terminalId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, beginningOfDay);
    _argIndex = 2;
    _statement.bindLong(_argIndex, endOfDay);
    _argIndex = 3;
    if (terminalId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, terminalId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"transactionresponse"}, false, new Callable<List<TransactionResponse>>() {
      @Override
      public List<TransactionResponse> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfMaskedPan = CursorUtil.getColumnIndexOrThrow(_cursor, "maskedPan");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfTransmissionDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "transmissionDateTime");
          final int _cursorIndexOfSTAN = CursorUtil.getColumnIndexOrThrow(_cursor, "STAN");
          final int _cursorIndexOfRRN = CursorUtil.getColumnIndexOrThrow(_cursor, "RRN");
          final int _cursorIndexOfLocalTime12 = CursorUtil.getColumnIndexOrThrow(_cursor, "localTime_12");
          final int _cursorIndexOfLocalDate13 = CursorUtil.getColumnIndexOrThrow(_cursor, "localDate_13");
          final int _cursorIndexOfOtherAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "otherAmount");
          final int _cursorIndexOfAcquiringInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "acquiringInstCode");
          final int _cursorIndexOfOriginalForwardingInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "originalForwardingInstCode");
          final int _cursorIndexOfAuthCode = CursorUtil.getColumnIndexOrThrow(_cursor, "authCode");
          final int _cursorIndexOfResponseCode = CursorUtil.getColumnIndexOrThrow(_cursor, "responseCode");
          final int _cursorIndexOfAdditionalAmount54 = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalAmount_54");
          final int _cursorIndexOfEchoData = CursorUtil.getColumnIndexOrThrow(_cursor, "echoData");
          final int _cursorIndexOfCardLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "cardLabel");
          final int _cursorIndexOfCardExpiry = CursorUtil.getColumnIndexOrThrow(_cursor, "cardExpiry");
          final int _cursorIndexOfCardHolder = CursorUtil.getColumnIndexOrThrow(_cursor, "cardHolder");
          final int _cursorIndexOfTVR = CursorUtil.getColumnIndexOrThrow(_cursor, "TVR");
          final int _cursorIndexOfTSI = CursorUtil.getColumnIndexOrThrow(_cursor, "TSI");
          final int _cursorIndexOfAID = CursorUtil.getColumnIndexOrThrow(_cursor, "AID");
          final int _cursorIndexOfAppCryptogram = CursorUtil.getColumnIndexOrThrow(_cursor, "appCryptogram");
          final int _cursorIndexOfTransactionTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionTimeInMillis");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "accountType");
          final int _cursorIndexOfTerminalId = CursorUtil.getColumnIndexOrThrow(_cursor, "terminalId");
          final int _cursorIndexOfMerchantId = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantId");
          final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(_cursor, "otherId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfInterSwitchThreshold = CursorUtil.getColumnIndexOrThrow(_cursor, "interSwitchThreshold");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final List<TransactionResponse> _result = new ArrayList<TransactionResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionResponse _item;
            _item = new TransactionResponse();
            final TransactionType _tmpTransactionType;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTransactionType);
            }
            _tmpTransactionType = RoomTypeConverters.convertTransactionResponseToEnum(_tmp);
            _item.setTransactionType(_tmpTransactionType);
            final String _tmpMaskedPan;
            if (_cursor.isNull(_cursorIndexOfMaskedPan)) {
              _tmpMaskedPan = null;
            } else {
              _tmpMaskedPan = _cursor.getString(_cursorIndexOfMaskedPan);
            }
            _item.setMaskedPan(_tmpMaskedPan);
            final long _tmpAmount;
            _tmpAmount = _cursor.getLong(_cursorIndexOfAmount);
            _item.setAmount(_tmpAmount);
            final String _tmpTransmissionDateTime;
            if (_cursor.isNull(_cursorIndexOfTransmissionDateTime)) {
              _tmpTransmissionDateTime = null;
            } else {
              _tmpTransmissionDateTime = _cursor.getString(_cursorIndexOfTransmissionDateTime);
            }
            _item.setTransmissionDateTime(_tmpTransmissionDateTime);
            final String _tmpSTAN;
            if (_cursor.isNull(_cursorIndexOfSTAN)) {
              _tmpSTAN = null;
            } else {
              _tmpSTAN = _cursor.getString(_cursorIndexOfSTAN);
            }
            _item.setSTAN(_tmpSTAN);
            final String _tmpRRN;
            if (_cursor.isNull(_cursorIndexOfRRN)) {
              _tmpRRN = null;
            } else {
              _tmpRRN = _cursor.getString(_cursorIndexOfRRN);
            }
            _item.setRRN(_tmpRRN);
            final String _tmpLocalTime_12;
            if (_cursor.isNull(_cursorIndexOfLocalTime12)) {
              _tmpLocalTime_12 = null;
            } else {
              _tmpLocalTime_12 = _cursor.getString(_cursorIndexOfLocalTime12);
            }
            _item.setLocalTime_12(_tmpLocalTime_12);
            final String _tmpLocalDate_13;
            if (_cursor.isNull(_cursorIndexOfLocalDate13)) {
              _tmpLocalDate_13 = null;
            } else {
              _tmpLocalDate_13 = _cursor.getString(_cursorIndexOfLocalDate13);
            }
            _item.setLocalDate_13(_tmpLocalDate_13);
            final long _tmpOtherAmount;
            _tmpOtherAmount = _cursor.getLong(_cursorIndexOfOtherAmount);
            _item.setOtherAmount(_tmpOtherAmount);
            final String _tmpAcquiringInstCode;
            if (_cursor.isNull(_cursorIndexOfAcquiringInstCode)) {
              _tmpAcquiringInstCode = null;
            } else {
              _tmpAcquiringInstCode = _cursor.getString(_cursorIndexOfAcquiringInstCode);
            }
            _item.setAcquiringInstCode(_tmpAcquiringInstCode);
            final String _tmpOriginalForwardingInstCode;
            if (_cursor.isNull(_cursorIndexOfOriginalForwardingInstCode)) {
              _tmpOriginalForwardingInstCode = null;
            } else {
              _tmpOriginalForwardingInstCode = _cursor.getString(_cursorIndexOfOriginalForwardingInstCode);
            }
            _item.setOriginalForwardingInstCode(_tmpOriginalForwardingInstCode);
            final String _tmpAuthCode;
            if (_cursor.isNull(_cursorIndexOfAuthCode)) {
              _tmpAuthCode = null;
            } else {
              _tmpAuthCode = _cursor.getString(_cursorIndexOfAuthCode);
            }
            _item.setAuthCode(_tmpAuthCode);
            final String _tmpResponseCode;
            if (_cursor.isNull(_cursorIndexOfResponseCode)) {
              _tmpResponseCode = null;
            } else {
              _tmpResponseCode = _cursor.getString(_cursorIndexOfResponseCode);
            }
            _item.setResponseCode(_tmpResponseCode);
            final String _tmpAdditionalAmount_54;
            if (_cursor.isNull(_cursorIndexOfAdditionalAmount54)) {
              _tmpAdditionalAmount_54 = null;
            } else {
              _tmpAdditionalAmount_54 = _cursor.getString(_cursorIndexOfAdditionalAmount54);
            }
            _item.setAdditionalAmount_54(_tmpAdditionalAmount_54);
            final String _tmpEchoData;
            if (_cursor.isNull(_cursorIndexOfEchoData)) {
              _tmpEchoData = null;
            } else {
              _tmpEchoData = _cursor.getString(_cursorIndexOfEchoData);
            }
            _item.setEchoData(_tmpEchoData);
            final String _tmpCardLabel;
            if (_cursor.isNull(_cursorIndexOfCardLabel)) {
              _tmpCardLabel = null;
            } else {
              _tmpCardLabel = _cursor.getString(_cursorIndexOfCardLabel);
            }
            _item.setCardLabel(_tmpCardLabel);
            final String _tmpCardExpiry;
            if (_cursor.isNull(_cursorIndexOfCardExpiry)) {
              _tmpCardExpiry = null;
            } else {
              _tmpCardExpiry = _cursor.getString(_cursorIndexOfCardExpiry);
            }
            _item.setCardExpiry(_tmpCardExpiry);
            final String _tmpCardHolder;
            if (_cursor.isNull(_cursorIndexOfCardHolder)) {
              _tmpCardHolder = null;
            } else {
              _tmpCardHolder = _cursor.getString(_cursorIndexOfCardHolder);
            }
            _item.setCardHolder(_tmpCardHolder);
            final String _tmpTVR;
            if (_cursor.isNull(_cursorIndexOfTVR)) {
              _tmpTVR = null;
            } else {
              _tmpTVR = _cursor.getString(_cursorIndexOfTVR);
            }
            _item.setTVR(_tmpTVR);
            final String _tmpTSI;
            if (_cursor.isNull(_cursorIndexOfTSI)) {
              _tmpTSI = null;
            } else {
              _tmpTSI = _cursor.getString(_cursorIndexOfTSI);
            }
            _item.setTSI(_tmpTSI);
            final String _tmpAID;
            if (_cursor.isNull(_cursorIndexOfAID)) {
              _tmpAID = null;
            } else {
              _tmpAID = _cursor.getString(_cursorIndexOfAID);
            }
            _item.setAID(_tmpAID);
            final String _tmpAppCryptogram;
            if (_cursor.isNull(_cursorIndexOfAppCryptogram)) {
              _tmpAppCryptogram = null;
            } else {
              _tmpAppCryptogram = _cursor.getString(_cursorIndexOfAppCryptogram);
            }
            _item.setAppCryptogram(_tmpAppCryptogram);
            final long _tmpTransactionTimeInMillis;
            _tmpTransactionTimeInMillis = _cursor.getLong(_cursorIndexOfTransactionTimeInMillis);
            _item.setTransactionTimeInMillis(_tmpTransactionTimeInMillis);
            final IsoAccountType _tmpAccountType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfAccountType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfAccountType);
            }
            _tmpAccountType = RoomTypeConverters.convertIsoAccountStringToEnum(_tmp_1);
            _item.setAccountType(_tmpAccountType);
            final String _tmpTerminalId;
            if (_cursor.isNull(_cursorIndexOfTerminalId)) {
              _tmpTerminalId = null;
            } else {
              _tmpTerminalId = _cursor.getString(_cursorIndexOfTerminalId);
            }
            _item.setTerminalId(_tmpTerminalId);
            final String _tmpMerchantId;
            if (_cursor.isNull(_cursorIndexOfMerchantId)) {
              _tmpMerchantId = null;
            } else {
              _tmpMerchantId = _cursor.getString(_cursorIndexOfMerchantId);
            }
            _item.setMerchantId(_tmpMerchantId);
            final String _tmpOtherId;
            if (_cursor.isNull(_cursorIndexOfOtherId)) {
              _tmpOtherId = null;
            } else {
              _tmpOtherId = _cursor.getString(_cursorIndexOfOtherId);
            }
            _item.setOtherId(_tmpOtherId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final PosMode _tmpSource;
            _tmpSource = __PosMode_stringToEnum(_cursor.getString(_cursorIndexOfSource));
            _item.setSource(_tmpSource);
            final long _tmpInterSwitchThreshold;
            _tmpInterSwitchThreshold = _cursor.getLong(_cursorIndexOfInterSwitchThreshold);
            _item.setInterSwitchThreshold(_tmpInterSwitchThreshold);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            _item.setErrorMessage(_tmpErrorMessage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<List<TransactionResponse>> getEndOfDayTransactionSingle(final long beginningOfDay,
      final long endOfDay, final String terminalId) {
    final String _sql = "SELECT * FROM transactionresponse WHERE transactionTimeInMillis >= ? and transactionTimeInMillis <= ? and terminalId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, beginningOfDay);
    _argIndex = 2;
    _statement.bindLong(_argIndex, endOfDay);
    _argIndex = 3;
    if (terminalId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, terminalId);
    }
    return RxRoom.createSingle(new Callable<List<TransactionResponse>>() {
      @Override
      public List<TransactionResponse> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfMaskedPan = CursorUtil.getColumnIndexOrThrow(_cursor, "maskedPan");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfTransmissionDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "transmissionDateTime");
          final int _cursorIndexOfSTAN = CursorUtil.getColumnIndexOrThrow(_cursor, "STAN");
          final int _cursorIndexOfRRN = CursorUtil.getColumnIndexOrThrow(_cursor, "RRN");
          final int _cursorIndexOfLocalTime12 = CursorUtil.getColumnIndexOrThrow(_cursor, "localTime_12");
          final int _cursorIndexOfLocalDate13 = CursorUtil.getColumnIndexOrThrow(_cursor, "localDate_13");
          final int _cursorIndexOfOtherAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "otherAmount");
          final int _cursorIndexOfAcquiringInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "acquiringInstCode");
          final int _cursorIndexOfOriginalForwardingInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "originalForwardingInstCode");
          final int _cursorIndexOfAuthCode = CursorUtil.getColumnIndexOrThrow(_cursor, "authCode");
          final int _cursorIndexOfResponseCode = CursorUtil.getColumnIndexOrThrow(_cursor, "responseCode");
          final int _cursorIndexOfAdditionalAmount54 = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalAmount_54");
          final int _cursorIndexOfEchoData = CursorUtil.getColumnIndexOrThrow(_cursor, "echoData");
          final int _cursorIndexOfCardLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "cardLabel");
          final int _cursorIndexOfCardExpiry = CursorUtil.getColumnIndexOrThrow(_cursor, "cardExpiry");
          final int _cursorIndexOfCardHolder = CursorUtil.getColumnIndexOrThrow(_cursor, "cardHolder");
          final int _cursorIndexOfTVR = CursorUtil.getColumnIndexOrThrow(_cursor, "TVR");
          final int _cursorIndexOfTSI = CursorUtil.getColumnIndexOrThrow(_cursor, "TSI");
          final int _cursorIndexOfAID = CursorUtil.getColumnIndexOrThrow(_cursor, "AID");
          final int _cursorIndexOfAppCryptogram = CursorUtil.getColumnIndexOrThrow(_cursor, "appCryptogram");
          final int _cursorIndexOfTransactionTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionTimeInMillis");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "accountType");
          final int _cursorIndexOfTerminalId = CursorUtil.getColumnIndexOrThrow(_cursor, "terminalId");
          final int _cursorIndexOfMerchantId = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantId");
          final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(_cursor, "otherId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfInterSwitchThreshold = CursorUtil.getColumnIndexOrThrow(_cursor, "interSwitchThreshold");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final List<TransactionResponse> _result = new ArrayList<TransactionResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionResponse _item;
            _item = new TransactionResponse();
            final TransactionType _tmpTransactionType;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTransactionType);
            }
            _tmpTransactionType = RoomTypeConverters.convertTransactionResponseToEnum(_tmp);
            _item.setTransactionType(_tmpTransactionType);
            final String _tmpMaskedPan;
            if (_cursor.isNull(_cursorIndexOfMaskedPan)) {
              _tmpMaskedPan = null;
            } else {
              _tmpMaskedPan = _cursor.getString(_cursorIndexOfMaskedPan);
            }
            _item.setMaskedPan(_tmpMaskedPan);
            final long _tmpAmount;
            _tmpAmount = _cursor.getLong(_cursorIndexOfAmount);
            _item.setAmount(_tmpAmount);
            final String _tmpTransmissionDateTime;
            if (_cursor.isNull(_cursorIndexOfTransmissionDateTime)) {
              _tmpTransmissionDateTime = null;
            } else {
              _tmpTransmissionDateTime = _cursor.getString(_cursorIndexOfTransmissionDateTime);
            }
            _item.setTransmissionDateTime(_tmpTransmissionDateTime);
            final String _tmpSTAN;
            if (_cursor.isNull(_cursorIndexOfSTAN)) {
              _tmpSTAN = null;
            } else {
              _tmpSTAN = _cursor.getString(_cursorIndexOfSTAN);
            }
            _item.setSTAN(_tmpSTAN);
            final String _tmpRRN;
            if (_cursor.isNull(_cursorIndexOfRRN)) {
              _tmpRRN = null;
            } else {
              _tmpRRN = _cursor.getString(_cursorIndexOfRRN);
            }
            _item.setRRN(_tmpRRN);
            final String _tmpLocalTime_12;
            if (_cursor.isNull(_cursorIndexOfLocalTime12)) {
              _tmpLocalTime_12 = null;
            } else {
              _tmpLocalTime_12 = _cursor.getString(_cursorIndexOfLocalTime12);
            }
            _item.setLocalTime_12(_tmpLocalTime_12);
            final String _tmpLocalDate_13;
            if (_cursor.isNull(_cursorIndexOfLocalDate13)) {
              _tmpLocalDate_13 = null;
            } else {
              _tmpLocalDate_13 = _cursor.getString(_cursorIndexOfLocalDate13);
            }
            _item.setLocalDate_13(_tmpLocalDate_13);
            final long _tmpOtherAmount;
            _tmpOtherAmount = _cursor.getLong(_cursorIndexOfOtherAmount);
            _item.setOtherAmount(_tmpOtherAmount);
            final String _tmpAcquiringInstCode;
            if (_cursor.isNull(_cursorIndexOfAcquiringInstCode)) {
              _tmpAcquiringInstCode = null;
            } else {
              _tmpAcquiringInstCode = _cursor.getString(_cursorIndexOfAcquiringInstCode);
            }
            _item.setAcquiringInstCode(_tmpAcquiringInstCode);
            final String _tmpOriginalForwardingInstCode;
            if (_cursor.isNull(_cursorIndexOfOriginalForwardingInstCode)) {
              _tmpOriginalForwardingInstCode = null;
            } else {
              _tmpOriginalForwardingInstCode = _cursor.getString(_cursorIndexOfOriginalForwardingInstCode);
            }
            _item.setOriginalForwardingInstCode(_tmpOriginalForwardingInstCode);
            final String _tmpAuthCode;
            if (_cursor.isNull(_cursorIndexOfAuthCode)) {
              _tmpAuthCode = null;
            } else {
              _tmpAuthCode = _cursor.getString(_cursorIndexOfAuthCode);
            }
            _item.setAuthCode(_tmpAuthCode);
            final String _tmpResponseCode;
            if (_cursor.isNull(_cursorIndexOfResponseCode)) {
              _tmpResponseCode = null;
            } else {
              _tmpResponseCode = _cursor.getString(_cursorIndexOfResponseCode);
            }
            _item.setResponseCode(_tmpResponseCode);
            final String _tmpAdditionalAmount_54;
            if (_cursor.isNull(_cursorIndexOfAdditionalAmount54)) {
              _tmpAdditionalAmount_54 = null;
            } else {
              _tmpAdditionalAmount_54 = _cursor.getString(_cursorIndexOfAdditionalAmount54);
            }
            _item.setAdditionalAmount_54(_tmpAdditionalAmount_54);
            final String _tmpEchoData;
            if (_cursor.isNull(_cursorIndexOfEchoData)) {
              _tmpEchoData = null;
            } else {
              _tmpEchoData = _cursor.getString(_cursorIndexOfEchoData);
            }
            _item.setEchoData(_tmpEchoData);
            final String _tmpCardLabel;
            if (_cursor.isNull(_cursorIndexOfCardLabel)) {
              _tmpCardLabel = null;
            } else {
              _tmpCardLabel = _cursor.getString(_cursorIndexOfCardLabel);
            }
            _item.setCardLabel(_tmpCardLabel);
            final String _tmpCardExpiry;
            if (_cursor.isNull(_cursorIndexOfCardExpiry)) {
              _tmpCardExpiry = null;
            } else {
              _tmpCardExpiry = _cursor.getString(_cursorIndexOfCardExpiry);
            }
            _item.setCardExpiry(_tmpCardExpiry);
            final String _tmpCardHolder;
            if (_cursor.isNull(_cursorIndexOfCardHolder)) {
              _tmpCardHolder = null;
            } else {
              _tmpCardHolder = _cursor.getString(_cursorIndexOfCardHolder);
            }
            _item.setCardHolder(_tmpCardHolder);
            final String _tmpTVR;
            if (_cursor.isNull(_cursorIndexOfTVR)) {
              _tmpTVR = null;
            } else {
              _tmpTVR = _cursor.getString(_cursorIndexOfTVR);
            }
            _item.setTVR(_tmpTVR);
            final String _tmpTSI;
            if (_cursor.isNull(_cursorIndexOfTSI)) {
              _tmpTSI = null;
            } else {
              _tmpTSI = _cursor.getString(_cursorIndexOfTSI);
            }
            _item.setTSI(_tmpTSI);
            final String _tmpAID;
            if (_cursor.isNull(_cursorIndexOfAID)) {
              _tmpAID = null;
            } else {
              _tmpAID = _cursor.getString(_cursorIndexOfAID);
            }
            _item.setAID(_tmpAID);
            final String _tmpAppCryptogram;
            if (_cursor.isNull(_cursorIndexOfAppCryptogram)) {
              _tmpAppCryptogram = null;
            } else {
              _tmpAppCryptogram = _cursor.getString(_cursorIndexOfAppCryptogram);
            }
            _item.setAppCryptogram(_tmpAppCryptogram);
            final long _tmpTransactionTimeInMillis;
            _tmpTransactionTimeInMillis = _cursor.getLong(_cursorIndexOfTransactionTimeInMillis);
            _item.setTransactionTimeInMillis(_tmpTransactionTimeInMillis);
            final IsoAccountType _tmpAccountType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfAccountType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfAccountType);
            }
            _tmpAccountType = RoomTypeConverters.convertIsoAccountStringToEnum(_tmp_1);
            _item.setAccountType(_tmpAccountType);
            final String _tmpTerminalId;
            if (_cursor.isNull(_cursorIndexOfTerminalId)) {
              _tmpTerminalId = null;
            } else {
              _tmpTerminalId = _cursor.getString(_cursorIndexOfTerminalId);
            }
            _item.setTerminalId(_tmpTerminalId);
            final String _tmpMerchantId;
            if (_cursor.isNull(_cursorIndexOfMerchantId)) {
              _tmpMerchantId = null;
            } else {
              _tmpMerchantId = _cursor.getString(_cursorIndexOfMerchantId);
            }
            _item.setMerchantId(_tmpMerchantId);
            final String _tmpOtherId;
            if (_cursor.isNull(_cursorIndexOfOtherId)) {
              _tmpOtherId = null;
            } else {
              _tmpOtherId = _cursor.getString(_cursorIndexOfOtherId);
            }
            _item.setOtherId(_tmpOtherId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final PosMode _tmpSource;
            _tmpSource = __PosMode_stringToEnum(_cursor.getString(_cursorIndexOfSource));
            _item.setSource(_tmpSource);
            final long _tmpInterSwitchThreshold;
            _tmpInterSwitchThreshold = _cursor.getLong(_cursorIndexOfInterSwitchThreshold);
            _item.setInterSwitchThreshold(_tmpInterSwitchThreshold);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            _item.setErrorMessage(_tmpErrorMessage);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TransactionResponse>> getTransactionByTransactionType(
      final TransactionType transactionType) {
    final String _sql = "SELECT * FROM transactionresponse WHERE transactionType=? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = RoomTypeConverters.convertTransactionResponseEnumToString(transactionType);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"transactionresponse"}, false, new Callable<List<TransactionResponse>>() {
      @Override
      public List<TransactionResponse> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfMaskedPan = CursorUtil.getColumnIndexOrThrow(_cursor, "maskedPan");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfTransmissionDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "transmissionDateTime");
          final int _cursorIndexOfSTAN = CursorUtil.getColumnIndexOrThrow(_cursor, "STAN");
          final int _cursorIndexOfRRN = CursorUtil.getColumnIndexOrThrow(_cursor, "RRN");
          final int _cursorIndexOfLocalTime12 = CursorUtil.getColumnIndexOrThrow(_cursor, "localTime_12");
          final int _cursorIndexOfLocalDate13 = CursorUtil.getColumnIndexOrThrow(_cursor, "localDate_13");
          final int _cursorIndexOfOtherAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "otherAmount");
          final int _cursorIndexOfAcquiringInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "acquiringInstCode");
          final int _cursorIndexOfOriginalForwardingInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "originalForwardingInstCode");
          final int _cursorIndexOfAuthCode = CursorUtil.getColumnIndexOrThrow(_cursor, "authCode");
          final int _cursorIndexOfResponseCode = CursorUtil.getColumnIndexOrThrow(_cursor, "responseCode");
          final int _cursorIndexOfAdditionalAmount54 = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalAmount_54");
          final int _cursorIndexOfEchoData = CursorUtil.getColumnIndexOrThrow(_cursor, "echoData");
          final int _cursorIndexOfCardLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "cardLabel");
          final int _cursorIndexOfCardExpiry = CursorUtil.getColumnIndexOrThrow(_cursor, "cardExpiry");
          final int _cursorIndexOfCardHolder = CursorUtil.getColumnIndexOrThrow(_cursor, "cardHolder");
          final int _cursorIndexOfTVR = CursorUtil.getColumnIndexOrThrow(_cursor, "TVR");
          final int _cursorIndexOfTSI = CursorUtil.getColumnIndexOrThrow(_cursor, "TSI");
          final int _cursorIndexOfAID = CursorUtil.getColumnIndexOrThrow(_cursor, "AID");
          final int _cursorIndexOfAppCryptogram = CursorUtil.getColumnIndexOrThrow(_cursor, "appCryptogram");
          final int _cursorIndexOfTransactionTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionTimeInMillis");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "accountType");
          final int _cursorIndexOfTerminalId = CursorUtil.getColumnIndexOrThrow(_cursor, "terminalId");
          final int _cursorIndexOfMerchantId = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantId");
          final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(_cursor, "otherId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfInterSwitchThreshold = CursorUtil.getColumnIndexOrThrow(_cursor, "interSwitchThreshold");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final List<TransactionResponse> _result = new ArrayList<TransactionResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionResponse _item;
            _item = new TransactionResponse();
            final TransactionType _tmpTransactionType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfTransactionType);
            }
            _tmpTransactionType = RoomTypeConverters.convertTransactionResponseToEnum(_tmp_1);
            _item.setTransactionType(_tmpTransactionType);
            final String _tmpMaskedPan;
            if (_cursor.isNull(_cursorIndexOfMaskedPan)) {
              _tmpMaskedPan = null;
            } else {
              _tmpMaskedPan = _cursor.getString(_cursorIndexOfMaskedPan);
            }
            _item.setMaskedPan(_tmpMaskedPan);
            final long _tmpAmount;
            _tmpAmount = _cursor.getLong(_cursorIndexOfAmount);
            _item.setAmount(_tmpAmount);
            final String _tmpTransmissionDateTime;
            if (_cursor.isNull(_cursorIndexOfTransmissionDateTime)) {
              _tmpTransmissionDateTime = null;
            } else {
              _tmpTransmissionDateTime = _cursor.getString(_cursorIndexOfTransmissionDateTime);
            }
            _item.setTransmissionDateTime(_tmpTransmissionDateTime);
            final String _tmpSTAN;
            if (_cursor.isNull(_cursorIndexOfSTAN)) {
              _tmpSTAN = null;
            } else {
              _tmpSTAN = _cursor.getString(_cursorIndexOfSTAN);
            }
            _item.setSTAN(_tmpSTAN);
            final String _tmpRRN;
            if (_cursor.isNull(_cursorIndexOfRRN)) {
              _tmpRRN = null;
            } else {
              _tmpRRN = _cursor.getString(_cursorIndexOfRRN);
            }
            _item.setRRN(_tmpRRN);
            final String _tmpLocalTime_12;
            if (_cursor.isNull(_cursorIndexOfLocalTime12)) {
              _tmpLocalTime_12 = null;
            } else {
              _tmpLocalTime_12 = _cursor.getString(_cursorIndexOfLocalTime12);
            }
            _item.setLocalTime_12(_tmpLocalTime_12);
            final String _tmpLocalDate_13;
            if (_cursor.isNull(_cursorIndexOfLocalDate13)) {
              _tmpLocalDate_13 = null;
            } else {
              _tmpLocalDate_13 = _cursor.getString(_cursorIndexOfLocalDate13);
            }
            _item.setLocalDate_13(_tmpLocalDate_13);
            final long _tmpOtherAmount;
            _tmpOtherAmount = _cursor.getLong(_cursorIndexOfOtherAmount);
            _item.setOtherAmount(_tmpOtherAmount);
            final String _tmpAcquiringInstCode;
            if (_cursor.isNull(_cursorIndexOfAcquiringInstCode)) {
              _tmpAcquiringInstCode = null;
            } else {
              _tmpAcquiringInstCode = _cursor.getString(_cursorIndexOfAcquiringInstCode);
            }
            _item.setAcquiringInstCode(_tmpAcquiringInstCode);
            final String _tmpOriginalForwardingInstCode;
            if (_cursor.isNull(_cursorIndexOfOriginalForwardingInstCode)) {
              _tmpOriginalForwardingInstCode = null;
            } else {
              _tmpOriginalForwardingInstCode = _cursor.getString(_cursorIndexOfOriginalForwardingInstCode);
            }
            _item.setOriginalForwardingInstCode(_tmpOriginalForwardingInstCode);
            final String _tmpAuthCode;
            if (_cursor.isNull(_cursorIndexOfAuthCode)) {
              _tmpAuthCode = null;
            } else {
              _tmpAuthCode = _cursor.getString(_cursorIndexOfAuthCode);
            }
            _item.setAuthCode(_tmpAuthCode);
            final String _tmpResponseCode;
            if (_cursor.isNull(_cursorIndexOfResponseCode)) {
              _tmpResponseCode = null;
            } else {
              _tmpResponseCode = _cursor.getString(_cursorIndexOfResponseCode);
            }
            _item.setResponseCode(_tmpResponseCode);
            final String _tmpAdditionalAmount_54;
            if (_cursor.isNull(_cursorIndexOfAdditionalAmount54)) {
              _tmpAdditionalAmount_54 = null;
            } else {
              _tmpAdditionalAmount_54 = _cursor.getString(_cursorIndexOfAdditionalAmount54);
            }
            _item.setAdditionalAmount_54(_tmpAdditionalAmount_54);
            final String _tmpEchoData;
            if (_cursor.isNull(_cursorIndexOfEchoData)) {
              _tmpEchoData = null;
            } else {
              _tmpEchoData = _cursor.getString(_cursorIndexOfEchoData);
            }
            _item.setEchoData(_tmpEchoData);
            final String _tmpCardLabel;
            if (_cursor.isNull(_cursorIndexOfCardLabel)) {
              _tmpCardLabel = null;
            } else {
              _tmpCardLabel = _cursor.getString(_cursorIndexOfCardLabel);
            }
            _item.setCardLabel(_tmpCardLabel);
            final String _tmpCardExpiry;
            if (_cursor.isNull(_cursorIndexOfCardExpiry)) {
              _tmpCardExpiry = null;
            } else {
              _tmpCardExpiry = _cursor.getString(_cursorIndexOfCardExpiry);
            }
            _item.setCardExpiry(_tmpCardExpiry);
            final String _tmpCardHolder;
            if (_cursor.isNull(_cursorIndexOfCardHolder)) {
              _tmpCardHolder = null;
            } else {
              _tmpCardHolder = _cursor.getString(_cursorIndexOfCardHolder);
            }
            _item.setCardHolder(_tmpCardHolder);
            final String _tmpTVR;
            if (_cursor.isNull(_cursorIndexOfTVR)) {
              _tmpTVR = null;
            } else {
              _tmpTVR = _cursor.getString(_cursorIndexOfTVR);
            }
            _item.setTVR(_tmpTVR);
            final String _tmpTSI;
            if (_cursor.isNull(_cursorIndexOfTSI)) {
              _tmpTSI = null;
            } else {
              _tmpTSI = _cursor.getString(_cursorIndexOfTSI);
            }
            _item.setTSI(_tmpTSI);
            final String _tmpAID;
            if (_cursor.isNull(_cursorIndexOfAID)) {
              _tmpAID = null;
            } else {
              _tmpAID = _cursor.getString(_cursorIndexOfAID);
            }
            _item.setAID(_tmpAID);
            final String _tmpAppCryptogram;
            if (_cursor.isNull(_cursorIndexOfAppCryptogram)) {
              _tmpAppCryptogram = null;
            } else {
              _tmpAppCryptogram = _cursor.getString(_cursorIndexOfAppCryptogram);
            }
            _item.setAppCryptogram(_tmpAppCryptogram);
            final long _tmpTransactionTimeInMillis;
            _tmpTransactionTimeInMillis = _cursor.getLong(_cursorIndexOfTransactionTimeInMillis);
            _item.setTransactionTimeInMillis(_tmpTransactionTimeInMillis);
            final IsoAccountType _tmpAccountType;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfAccountType)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfAccountType);
            }
            _tmpAccountType = RoomTypeConverters.convertIsoAccountStringToEnum(_tmp_2);
            _item.setAccountType(_tmpAccountType);
            final String _tmpTerminalId;
            if (_cursor.isNull(_cursorIndexOfTerminalId)) {
              _tmpTerminalId = null;
            } else {
              _tmpTerminalId = _cursor.getString(_cursorIndexOfTerminalId);
            }
            _item.setTerminalId(_tmpTerminalId);
            final String _tmpMerchantId;
            if (_cursor.isNull(_cursorIndexOfMerchantId)) {
              _tmpMerchantId = null;
            } else {
              _tmpMerchantId = _cursor.getString(_cursorIndexOfMerchantId);
            }
            _item.setMerchantId(_tmpMerchantId);
            final String _tmpOtherId;
            if (_cursor.isNull(_cursorIndexOfOtherId)) {
              _tmpOtherId = null;
            } else {
              _tmpOtherId = _cursor.getString(_cursorIndexOfOtherId);
            }
            _item.setOtherId(_tmpOtherId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final PosMode _tmpSource;
            _tmpSource = __PosMode_stringToEnum(_cursor.getString(_cursorIndexOfSource));
            _item.setSource(_tmpSource);
            final long _tmpInterSwitchThreshold;
            _tmpInterSwitchThreshold = _cursor.getLong(_cursorIndexOfInterSwitchThreshold);
            _item.setInterSwitchThreshold(_tmpInterSwitchThreshold);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            _item.setErrorMessage(_tmpErrorMessage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TransactionResponse>> getRefundableTransactions() {
    final String _sql = "SELECT * FROM transactionresponse WHERE transactionType='PURCHASE' AND responseCode='00'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"transactionresponse"}, false, new Callable<List<TransactionResponse>>() {
      @Override
      public List<TransactionResponse> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionType");
          final int _cursorIndexOfMaskedPan = CursorUtil.getColumnIndexOrThrow(_cursor, "maskedPan");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfTransmissionDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "transmissionDateTime");
          final int _cursorIndexOfSTAN = CursorUtil.getColumnIndexOrThrow(_cursor, "STAN");
          final int _cursorIndexOfRRN = CursorUtil.getColumnIndexOrThrow(_cursor, "RRN");
          final int _cursorIndexOfLocalTime12 = CursorUtil.getColumnIndexOrThrow(_cursor, "localTime_12");
          final int _cursorIndexOfLocalDate13 = CursorUtil.getColumnIndexOrThrow(_cursor, "localDate_13");
          final int _cursorIndexOfOtherAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "otherAmount");
          final int _cursorIndexOfAcquiringInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "acquiringInstCode");
          final int _cursorIndexOfOriginalForwardingInstCode = CursorUtil.getColumnIndexOrThrow(_cursor, "originalForwardingInstCode");
          final int _cursorIndexOfAuthCode = CursorUtil.getColumnIndexOrThrow(_cursor, "authCode");
          final int _cursorIndexOfResponseCode = CursorUtil.getColumnIndexOrThrow(_cursor, "responseCode");
          final int _cursorIndexOfAdditionalAmount54 = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalAmount_54");
          final int _cursorIndexOfEchoData = CursorUtil.getColumnIndexOrThrow(_cursor, "echoData");
          final int _cursorIndexOfCardLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "cardLabel");
          final int _cursorIndexOfCardExpiry = CursorUtil.getColumnIndexOrThrow(_cursor, "cardExpiry");
          final int _cursorIndexOfCardHolder = CursorUtil.getColumnIndexOrThrow(_cursor, "cardHolder");
          final int _cursorIndexOfTVR = CursorUtil.getColumnIndexOrThrow(_cursor, "TVR");
          final int _cursorIndexOfTSI = CursorUtil.getColumnIndexOrThrow(_cursor, "TSI");
          final int _cursorIndexOfAID = CursorUtil.getColumnIndexOrThrow(_cursor, "AID");
          final int _cursorIndexOfAppCryptogram = CursorUtil.getColumnIndexOrThrow(_cursor, "appCryptogram");
          final int _cursorIndexOfTransactionTimeInMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "transactionTimeInMillis");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "accountType");
          final int _cursorIndexOfTerminalId = CursorUtil.getColumnIndexOrThrow(_cursor, "terminalId");
          final int _cursorIndexOfMerchantId = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantId");
          final int _cursorIndexOfOtherId = CursorUtil.getColumnIndexOrThrow(_cursor, "otherId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfInterSwitchThreshold = CursorUtil.getColumnIndexOrThrow(_cursor, "interSwitchThreshold");
          final int _cursorIndexOfErrorMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "errorMessage");
          final List<TransactionResponse> _result = new ArrayList<TransactionResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionResponse _item;
            _item = new TransactionResponse();
            final TransactionType _tmpTransactionType;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTransactionType);
            }
            _tmpTransactionType = RoomTypeConverters.convertTransactionResponseToEnum(_tmp);
            _item.setTransactionType(_tmpTransactionType);
            final String _tmpMaskedPan;
            if (_cursor.isNull(_cursorIndexOfMaskedPan)) {
              _tmpMaskedPan = null;
            } else {
              _tmpMaskedPan = _cursor.getString(_cursorIndexOfMaskedPan);
            }
            _item.setMaskedPan(_tmpMaskedPan);
            final long _tmpAmount;
            _tmpAmount = _cursor.getLong(_cursorIndexOfAmount);
            _item.setAmount(_tmpAmount);
            final String _tmpTransmissionDateTime;
            if (_cursor.isNull(_cursorIndexOfTransmissionDateTime)) {
              _tmpTransmissionDateTime = null;
            } else {
              _tmpTransmissionDateTime = _cursor.getString(_cursorIndexOfTransmissionDateTime);
            }
            _item.setTransmissionDateTime(_tmpTransmissionDateTime);
            final String _tmpSTAN;
            if (_cursor.isNull(_cursorIndexOfSTAN)) {
              _tmpSTAN = null;
            } else {
              _tmpSTAN = _cursor.getString(_cursorIndexOfSTAN);
            }
            _item.setSTAN(_tmpSTAN);
            final String _tmpRRN;
            if (_cursor.isNull(_cursorIndexOfRRN)) {
              _tmpRRN = null;
            } else {
              _tmpRRN = _cursor.getString(_cursorIndexOfRRN);
            }
            _item.setRRN(_tmpRRN);
            final String _tmpLocalTime_12;
            if (_cursor.isNull(_cursorIndexOfLocalTime12)) {
              _tmpLocalTime_12 = null;
            } else {
              _tmpLocalTime_12 = _cursor.getString(_cursorIndexOfLocalTime12);
            }
            _item.setLocalTime_12(_tmpLocalTime_12);
            final String _tmpLocalDate_13;
            if (_cursor.isNull(_cursorIndexOfLocalDate13)) {
              _tmpLocalDate_13 = null;
            } else {
              _tmpLocalDate_13 = _cursor.getString(_cursorIndexOfLocalDate13);
            }
            _item.setLocalDate_13(_tmpLocalDate_13);
            final long _tmpOtherAmount;
            _tmpOtherAmount = _cursor.getLong(_cursorIndexOfOtherAmount);
            _item.setOtherAmount(_tmpOtherAmount);
            final String _tmpAcquiringInstCode;
            if (_cursor.isNull(_cursorIndexOfAcquiringInstCode)) {
              _tmpAcquiringInstCode = null;
            } else {
              _tmpAcquiringInstCode = _cursor.getString(_cursorIndexOfAcquiringInstCode);
            }
            _item.setAcquiringInstCode(_tmpAcquiringInstCode);
            final String _tmpOriginalForwardingInstCode;
            if (_cursor.isNull(_cursorIndexOfOriginalForwardingInstCode)) {
              _tmpOriginalForwardingInstCode = null;
            } else {
              _tmpOriginalForwardingInstCode = _cursor.getString(_cursorIndexOfOriginalForwardingInstCode);
            }
            _item.setOriginalForwardingInstCode(_tmpOriginalForwardingInstCode);
            final String _tmpAuthCode;
            if (_cursor.isNull(_cursorIndexOfAuthCode)) {
              _tmpAuthCode = null;
            } else {
              _tmpAuthCode = _cursor.getString(_cursorIndexOfAuthCode);
            }
            _item.setAuthCode(_tmpAuthCode);
            final String _tmpResponseCode;
            if (_cursor.isNull(_cursorIndexOfResponseCode)) {
              _tmpResponseCode = null;
            } else {
              _tmpResponseCode = _cursor.getString(_cursorIndexOfResponseCode);
            }
            _item.setResponseCode(_tmpResponseCode);
            final String _tmpAdditionalAmount_54;
            if (_cursor.isNull(_cursorIndexOfAdditionalAmount54)) {
              _tmpAdditionalAmount_54 = null;
            } else {
              _tmpAdditionalAmount_54 = _cursor.getString(_cursorIndexOfAdditionalAmount54);
            }
            _item.setAdditionalAmount_54(_tmpAdditionalAmount_54);
            final String _tmpEchoData;
            if (_cursor.isNull(_cursorIndexOfEchoData)) {
              _tmpEchoData = null;
            } else {
              _tmpEchoData = _cursor.getString(_cursorIndexOfEchoData);
            }
            _item.setEchoData(_tmpEchoData);
            final String _tmpCardLabel;
            if (_cursor.isNull(_cursorIndexOfCardLabel)) {
              _tmpCardLabel = null;
            } else {
              _tmpCardLabel = _cursor.getString(_cursorIndexOfCardLabel);
            }
            _item.setCardLabel(_tmpCardLabel);
            final String _tmpCardExpiry;
            if (_cursor.isNull(_cursorIndexOfCardExpiry)) {
              _tmpCardExpiry = null;
            } else {
              _tmpCardExpiry = _cursor.getString(_cursorIndexOfCardExpiry);
            }
            _item.setCardExpiry(_tmpCardExpiry);
            final String _tmpCardHolder;
            if (_cursor.isNull(_cursorIndexOfCardHolder)) {
              _tmpCardHolder = null;
            } else {
              _tmpCardHolder = _cursor.getString(_cursorIndexOfCardHolder);
            }
            _item.setCardHolder(_tmpCardHolder);
            final String _tmpTVR;
            if (_cursor.isNull(_cursorIndexOfTVR)) {
              _tmpTVR = null;
            } else {
              _tmpTVR = _cursor.getString(_cursorIndexOfTVR);
            }
            _item.setTVR(_tmpTVR);
            final String _tmpTSI;
            if (_cursor.isNull(_cursorIndexOfTSI)) {
              _tmpTSI = null;
            } else {
              _tmpTSI = _cursor.getString(_cursorIndexOfTSI);
            }
            _item.setTSI(_tmpTSI);
            final String _tmpAID;
            if (_cursor.isNull(_cursorIndexOfAID)) {
              _tmpAID = null;
            } else {
              _tmpAID = _cursor.getString(_cursorIndexOfAID);
            }
            _item.setAID(_tmpAID);
            final String _tmpAppCryptogram;
            if (_cursor.isNull(_cursorIndexOfAppCryptogram)) {
              _tmpAppCryptogram = null;
            } else {
              _tmpAppCryptogram = _cursor.getString(_cursorIndexOfAppCryptogram);
            }
            _item.setAppCryptogram(_tmpAppCryptogram);
            final long _tmpTransactionTimeInMillis;
            _tmpTransactionTimeInMillis = _cursor.getLong(_cursorIndexOfTransactionTimeInMillis);
            _item.setTransactionTimeInMillis(_tmpTransactionTimeInMillis);
            final IsoAccountType _tmpAccountType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfAccountType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfAccountType);
            }
            _tmpAccountType = RoomTypeConverters.convertIsoAccountStringToEnum(_tmp_1);
            _item.setAccountType(_tmpAccountType);
            final String _tmpTerminalId;
            if (_cursor.isNull(_cursorIndexOfTerminalId)) {
              _tmpTerminalId = null;
            } else {
              _tmpTerminalId = _cursor.getString(_cursorIndexOfTerminalId);
            }
            _item.setTerminalId(_tmpTerminalId);
            final String _tmpMerchantId;
            if (_cursor.isNull(_cursorIndexOfMerchantId)) {
              _tmpMerchantId = null;
            } else {
              _tmpMerchantId = _cursor.getString(_cursorIndexOfMerchantId);
            }
            _item.setMerchantId(_tmpMerchantId);
            final String _tmpOtherId;
            if (_cursor.isNull(_cursorIndexOfOtherId)) {
              _tmpOtherId = null;
            } else {
              _tmpOtherId = _cursor.getString(_cursorIndexOfOtherId);
            }
            _item.setOtherId(_tmpOtherId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final PosMode _tmpSource;
            _tmpSource = __PosMode_stringToEnum(_cursor.getString(_cursorIndexOfSource));
            _item.setSource(_tmpSource);
            final long _tmpInterSwitchThreshold;
            _tmpInterSwitchThreshold = _cursor.getLong(_cursorIndexOfInterSwitchThreshold);
            _item.setInterSwitchThreshold(_tmpInterSwitchThreshold);
            final String _tmpErrorMessage;
            if (_cursor.isNull(_cursorIndexOfErrorMessage)) {
              _tmpErrorMessage = null;
            } else {
              _tmpErrorMessage = _cursor.getString(_cursorIndexOfErrorMessage);
            }
            _item.setErrorMessage(_tmpErrorMessage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __PosMode_enumToString(final PosMode _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case EPMS: return "EPMS";
      case POSVAS: return "POSVAS";
      case ISW: return "ISW";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private PosMode __PosMode_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "EPMS": return PosMode.EPMS;
      case "POSVAS": return PosMode.POSVAS;
      case "ISW": return PosMode.ISW;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
