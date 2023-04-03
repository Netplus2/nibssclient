package com.netpluspay.nibssclient.models;

import java.lang.System;

/**
 * @param masterKey
 * @param sessionKey
 * @param pinKey
 * @param track2Key
 * @param bdk
 * @param isTest
 */
@androidx.room.Entity()
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J;\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010+\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020\u0010H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0010H\u00d6\u0001R\u0010\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\b\nR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000e\u00a8\u00067"}, d2 = {"Lcom/netpluspay/nibssclient/models/KeyHolder;", "Landroid/os/Parcelable;", "masterKey", "", "sessionKey", "pinKey", "track2Key", "bdk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "baseKey", "baseKey$1", "getBdk", "()Ljava/lang/String;", "setBdk", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "isValid", "", "()Z", "getMasterKey", "setMasterKey", "getPinKey", "setPinKey", "<set-?>", "Lcom/netpluspay/nibssclient/models/PosMode;", "posMode", "getPosMode", "()Lcom/netpluspay/nibssclient/models/PosMode;", "getSessionKey", "setSessionKey", "getTrack2Key", "setTrack2Key", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "nibssclient_debug"})
public final class KeyHolder implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String masterKey;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sessionKey;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pinKey;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String track2Key;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bdk;
    @androidx.room.PrimaryKey()
    private int id = 1;
    private java.lang.String baseKey$1 = "DB99F003EB17F590E8DBCCA66CDD7E72";
    @org.jetbrains.annotations.NotNull()
    private com.netpluspay.nibssclient.models.PosMode posMode = com.netpluspay.nibssclient.models.PosMode.EPMS;
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.models.KeyHolder.Companion Companion = null;
    @androidx.room.Ignore()
    private static java.lang.String baseKey = "0101010101010101";
    public static final android.os.Parcelable.Creator<com.netpluspay.nibssclient.models.KeyHolder> CREATOR = null;
    
    /**
     * @param masterKey
     * @param sessionKey
     * @param pinKey
     * @param track2Key
     * @param bdk
     * @param isTest
     */
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.KeyHolder copy(@org.jetbrains.annotations.NotNull()
    java.lang.String masterKey, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String pinKey, @org.jetbrains.annotations.NotNull()
    java.lang.String track2Key, @org.jetbrains.annotations.NotNull()
    java.lang.String bdk) {
        return null;
    }
    
    /**
     * @param masterKey
     * @param sessionKey
     * @param pinKey
     * @param track2Key
     * @param bdk
     * @param isTest
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @param masterKey
     * @param sessionKey
     * @param pinKey
     * @param track2Key
     * @param bdk
     * @param isTest
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param masterKey
     * @param sessionKey
     * @param pinKey
     * @param track2Key
     * @param bdk
     * @param isTest
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public KeyHolder() {
        super();
    }
    
    public KeyHolder(@org.jetbrains.annotations.NotNull()
    java.lang.String masterKey, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String pinKey, @org.jetbrains.annotations.NotNull()
    java.lang.String track2Key, @org.jetbrains.annotations.NotNull()
    java.lang.String bdk) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMasterKey() {
        return null;
    }
    
    public final void setMasterKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionKey() {
        return null;
    }
    
    public final void setSessionKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPinKey() {
        return null;
    }
    
    public final void setPinKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrack2Key() {
        return null;
    }
    
    public final void setTrack2Key(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBdk() {
        return null;
    }
    
    public final void setBdk(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final boolean isValid() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.netpluspay.nibssclient.models.PosMode getPosMode() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.netpluspay.nibssclient.models.KeyHolder> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.netpluspay.nibssclient.models.KeyHolder createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.netpluspay.nibssclient.models.KeyHolder[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/netpluspay/nibssclient/models/KeyHolder$Companion;", "", "()V", "baseKey", "", "getClearMasterKey", "kotlin.jvm.PlatformType", "encryptedMasterKey", "setHostKeyComponents", "", "firstComponent", "secondComponent", "nibssclient_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setHostKeyComponents(@org.jetbrains.annotations.NotNull()
        java.lang.String firstComponent, @org.jetbrains.annotations.NotNull()
        java.lang.String secondComponent) {
        }
        
        public final java.lang.String getClearMasterKey(@org.jetbrains.annotations.NotNull()
        java.lang.String encryptedMasterKey) {
            return null;
        }
    }
}