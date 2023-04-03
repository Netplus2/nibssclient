package com.netpluspay.nibssclient.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/netpluspay/nibssclient/util/ResponseCodeWarrantingForReversalConstants;", "", "()V", "RESPONSE_CODE_APPROVED_FOR_PARTIAL_AMOUNT", "", "RESPONSE_CODE_APPROVED_UPDATE_TRACK_3", "RESPONSE_CODE_APPROVED_VIP", "RESPONSE_CODE_COMPLETED_PARTIALLY", "RESPONSE_CODE_SUSPECTED_MALFUNCTION", "RESPONSE_CODE_SYSTEM_MALFUNCTION", "doesResponseCodeWarrantsReversal", "", "responseCode", "wasTransactionCompletedPartially", "nibssclient_debug"})
public final class ResponseCodeWarrantingForReversalConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.ResponseCodeWarrantingForReversalConstants INSTANCE = null;
    private static final java.lang.String RESPONSE_CODE_COMPLETED_PARTIALLY = "32";
    private static final java.lang.String RESPONSE_CODE_APPROVED_FOR_PARTIAL_AMOUNT = "10";
    private static final java.lang.String RESPONSE_CODE_APPROVED_VIP = "11";
    private static final java.lang.String RESPONSE_CODE_APPROVED_UPDATE_TRACK_3 = "16";
    private static final java.lang.String RESPONSE_CODE_SUSPECTED_MALFUNCTION = "22";
    private static final java.lang.String RESPONSE_CODE_SYSTEM_MALFUNCTION = "96";
    
    private ResponseCodeWarrantingForReversalConstants() {
        super();
    }
    
    public final boolean wasTransactionCompletedPartially(@org.jetbrains.annotations.NotNull()
    java.lang.String responseCode) {
        return false;
    }
    
    public final boolean doesResponseCodeWarrantsReversal(@org.jetbrains.annotations.NotNull()
    java.lang.String responseCode) {
        return false;
    }
}