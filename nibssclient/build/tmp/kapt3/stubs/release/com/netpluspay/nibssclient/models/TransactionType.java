package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000ej\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7\u00a8\u00068"}, d2 = {"Lcom/netpluspay/nibssclient/models/TransactionType;", "", "(Ljava/lang/String;I)V", "MTI", "", "getMTI", "()I", "code", "", "getCode", "()Ljava/lang/String;", "hasAdditionalAmount", "", "getHasAdditionalAmount", "()Z", "hasOriginalAmount", "getHasOriginalAmount", "isReversible", "toString", "PURCHASE", "PURCHASE_WITH_CASH_BACK", "PURCHASE_WITH_ADDITIONAL_DATA", "CASH_ADVANCE", "REVERSAL", "REFUND", "PRE_AUTHORIZATION", "PRE_AUTHORIZATION_COMPLETION", "BALANCE", "MINI_STATEMENT", "LINK_ACCOUNT_INQUIRY", "PIN_CHANGE", "DEPOSIT", "TRANSFER", "BILL_PAYMENT", "PREPAID", "VOID", "BILLER_LIST_DOWNLOAD", "PRODUCT_LIST_DOWNLOAD", "BILLER_SUBSCRIPTION_INFO_DOWNLOAD", "PAYMENT_VALIDATION", "CASH", "PAYXPRESS", "TERMINAL_MASTER_KEY", "TERMINAL_SESSION_KEY", "TERMINAL_PIN_KEY", "TERMINAL_PARAMETER_DOWNLOAD", "CALL_HOME", "DAILY_TRANSACTION_REPORT_DOWNLOAD", "CA_PUBLIC_KEY_DOWNLOAD", "EMV_APPLICATION_AID_DOWNLOAD", "DYNAMIC_CURRENCY_CONVERSION", "INITIAL_PIN_ENCRYPTION_KEY_DOWNLOAD_EMV", "INITIAL_PIN_ENCRYPTION_KEY_DOWNLOAD_TRACK2_DATA", "TRANZAXIS_WORKING_KEY_INQUIRY", "TRANZAXIS_TRAFFIC_ENCRYPTION_WORKING_KEY", "TRANZAXIS_ECHO_TEST", "nibssclient_release"})
public enum TransactionType {
    /*public static final*/ PURCHASE /* = new PURCHASE() */,
    /*public static final*/ PURCHASE_WITH_CASH_BACK /* = new PURCHASE_WITH_CASH_BACK() */,
    /*public static final*/ PURCHASE_WITH_ADDITIONAL_DATA /* = new PURCHASE_WITH_ADDITIONAL_DATA() */,
    /*public static final*/ CASH_ADVANCE /* = new CASH_ADVANCE() */,
    /*public static final*/ REVERSAL /* = new REVERSAL() */,
    /*public static final*/ REFUND /* = new REFUND() */,
    /*public static final*/ PRE_AUTHORIZATION /* = new PRE_AUTHORIZATION() */,
    /*public static final*/ PRE_AUTHORIZATION_COMPLETION /* = new PRE_AUTHORIZATION_COMPLETION() */,
    /*public static final*/ BALANCE /* = new BALANCE() */,
    /*public static final*/ MINI_STATEMENT /* = new MINI_STATEMENT() */,
    /*public static final*/ LINK_ACCOUNT_INQUIRY /* = new LINK_ACCOUNT_INQUIRY() */,
    /*public static final*/ PIN_CHANGE /* = new PIN_CHANGE() */,
    /*public static final*/ DEPOSIT /* = new DEPOSIT() */,
    /*public static final*/ TRANSFER /* = new TRANSFER() */,
    /*public static final*/ BILL_PAYMENT /* = new BILL_PAYMENT() */,
    /*public static final*/ PREPAID /* = new PREPAID() */,
    /*public static final*/ VOID /* = new VOID() */,
    /*public static final*/ BILLER_LIST_DOWNLOAD /* = new BILLER_LIST_DOWNLOAD() */,
    /*public static final*/ PRODUCT_LIST_DOWNLOAD /* = new PRODUCT_LIST_DOWNLOAD() */,
    /*public static final*/ BILLER_SUBSCRIPTION_INFO_DOWNLOAD /* = new BILLER_SUBSCRIPTION_INFO_DOWNLOAD() */,
    /*public static final*/ PAYMENT_VALIDATION /* = new PAYMENT_VALIDATION() */,
    /*public static final*/ CASH /* = new CASH() */,
    /*public static final*/ PAYXPRESS /* = new PAYXPRESS() */,
    /*public static final*/ TERMINAL_MASTER_KEY /* = new TERMINAL_MASTER_KEY() */,
    /*public static final*/ TERMINAL_SESSION_KEY /* = new TERMINAL_SESSION_KEY() */,
    /*public static final*/ TERMINAL_PIN_KEY /* = new TERMINAL_PIN_KEY() */,
    /*public static final*/ TERMINAL_PARAMETER_DOWNLOAD /* = new TERMINAL_PARAMETER_DOWNLOAD() */,
    /*public static final*/ CALL_HOME /* = new CALL_HOME() */,
    /*public static final*/ DAILY_TRANSACTION_REPORT_DOWNLOAD /* = new DAILY_TRANSACTION_REPORT_DOWNLOAD() */,
    /*public static final*/ CA_PUBLIC_KEY_DOWNLOAD /* = new CA_PUBLIC_KEY_DOWNLOAD() */,
    /*public static final*/ EMV_APPLICATION_AID_DOWNLOAD /* = new EMV_APPLICATION_AID_DOWNLOAD() */,
    /*public static final*/ DYNAMIC_CURRENCY_CONVERSION /* = new DYNAMIC_CURRENCY_CONVERSION() */,
    /*public static final*/ INITIAL_PIN_ENCRYPTION_KEY_DOWNLOAD_EMV /* = new INITIAL_PIN_ENCRYPTION_KEY_DOWNLOAD_EMV() */,
    /*public static final*/ INITIAL_PIN_ENCRYPTION_KEY_DOWNLOAD_TRACK2_DATA /* = new INITIAL_PIN_ENCRYPTION_KEY_DOWNLOAD_TRACK2_DATA() */,
    /*public static final*/ TRANZAXIS_WORKING_KEY_INQUIRY /* = new TRANZAXIS_WORKING_KEY_INQUIRY() */,
    /*public static final*/ TRANZAXIS_TRAFFIC_ENCRYPTION_WORKING_KEY /* = new TRANZAXIS_TRAFFIC_ENCRYPTION_WORKING_KEY() */,
    /*public static final*/ TRANZAXIS_ECHO_TEST /* = new TRANZAXIS_ECHO_TEST() */;
    
    TransactionType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final int getMTI() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final boolean getHasOriginalAmount() {
        return false;
    }
    
    public final boolean getHasAdditionalAmount() {
        return false;
    }
    
    public final boolean isReversible() {
        return false;
    }
}