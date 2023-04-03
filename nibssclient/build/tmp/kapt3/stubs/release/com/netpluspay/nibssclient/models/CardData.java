package com.netpluspay.nibssclient.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J1\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\n\u00a8\u0006)"}, d2 = {"Lcom/netpluspay/nibssclient/models/CardData;", "", "track2Data", "", "nibssIccSubset", "panSequenceNumber", "posEntryMode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "acquiringInstitutionIdCode", "getAcquiringInstitutionIdCode", "()Ljava/lang/String;", "setAcquiringInstitutionIdCode", "(Ljava/lang/String;)V", "expiryDate", "getExpiryDate", "setExpiryDate", "getNibssIccSubset", "pan", "getPan", "setPan", "getPanSequenceNumber", "pinBlock", "getPinBlock", "setPinBlock", "getPosEntryMode", "serviceCode", "getServiceCode", "setServiceCode", "getTrack2Data", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "nibssclient_release"})
public final class CardData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String track2Data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nibssIccSubset = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String panSequenceNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posEntryMode = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pinBlock;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pan;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String serviceCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String expiryDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String acquiringInstitutionIdCode;
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.models.CardData.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] NIBSS_TAGS = {"9F26", "9F27", "9F10", "9F37", "9F36", "95", "9A", "9C", "9F02", "5F2A", "82", "9F1A", "9F34", "9F33", "9F35", "9F1E", "84", "9F09", "9F03", "5F34", "8E"};
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.CardData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String track2Data, @org.jetbrains.annotations.NotNull()
    java.lang.String nibssIccSubset, @org.jetbrains.annotations.NotNull()
    java.lang.String panSequenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String posEntryMode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CardData(@org.jetbrains.annotations.NotNull()
    java.lang.String track2Data, @org.jetbrains.annotations.NotNull()
    java.lang.String nibssIccSubset, @org.jetbrains.annotations.NotNull()
    java.lang.String panSequenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String posEntryMode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrack2Data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNibssIccSubset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPanSequenceNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosEntryMode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPinBlock() {
        return null;
    }
    
    public final void setPinBlock(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPan() {
        return null;
    }
    
    public final void setPan(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceCode() {
        return null;
    }
    
    public final void setServiceCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiryDate() {
        return null;
    }
    
    public final void setExpiryDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAcquiringInstitutionIdCode() {
        return null;
    }
    
    public final void setAcquiringInstitutionIdCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/netpluspay/nibssclient/models/CardData$Companion;", "", "()V", "NIBSS_TAGS", "", "", "getNIBSS_TAGS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getAcquiringInstitutionIdCode", "track2Data", "getExpiryDate", "separatingChar", "", "getNibssTags", "iccData", "getPan", "getServiceCode", "initCardDataFromTrack", "Lcom/netpluspay/nibssclient/models/CardData;", "fullIcc", "nibssclient_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getNIBSS_TAGS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNibssTags(@org.jetbrains.annotations.NotNull()
        java.lang.String iccData) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.netpluspay.nibssclient.models.CardData initCardDataFromTrack(@org.jetbrains.annotations.NotNull()
        java.lang.String fullIcc) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPan(@org.jetbrains.annotations.NotNull()
        java.lang.String track2Data, char separatingChar) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExpiryDate(@org.jetbrains.annotations.NotNull()
        java.lang.String track2Data, char separatingChar) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceCode(@org.jetbrains.annotations.NotNull()
        java.lang.String track2Data, char separatingChar) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAcquiringInstitutionIdCode(@org.jetbrains.annotations.NotNull()
        java.lang.String track2Data) {
            return null;
        }
    }
}