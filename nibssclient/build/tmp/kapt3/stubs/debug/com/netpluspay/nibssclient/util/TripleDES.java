package com.netpluspay.nibssclient.util;

import java.lang.System;

/**
 * @author Derek
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0007J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/netpluspay/nibssclient/util/TripleDES;", "", "()V", "GetKey", "", "key", "Hex2String", "", "data", "String2Hex", "decrypt", "decrypt_CBC", "encrypt", "encrypt_CBC", "IV", "nibssclient_debug"})
public final class TripleDES {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.util.TripleDES INSTANCE = null;
    
    private TripleDES() {
        super();
    }
    
    /**
     * get correct length key for triple DES operation
     * @param key
     * @return
     */
    @kotlin.jvm.JvmStatic()
    private static final byte[] GetKey(byte[] key) {
        return null;
    }
    
    /**
     * encrypt data in ECB mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final byte[] encrypt(@org.jetbrains.annotations.Nullable()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] key) {
        return null;
    }
    
    /**
     * decrypt data in ECB mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final byte[] decrypt(@org.jetbrains.annotations.Nullable()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] key) {
        return null;
    }
    
    /**
     * encrypt data in CBC mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final byte[] encrypt_CBC(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final byte[] encrypt_CBC(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] key, @org.jetbrains.annotations.NotNull()
    byte[] IV) {
        return null;
    }
    
    /**
     * decrypt data in CBC mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final byte[] decrypt_CBC(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] key) {
        return null;
    }
    
    /**
     * encrypt data in ECB mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * decrypt data in ECB mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * encrypt data in CBC mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String encrypt_CBC(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * decrypt data in CBC mode
     * @param data
     * @param key
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String decrypt_CBC(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * Convert Byte Array to Hex String
     * @param data
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String Hex2String(@org.jetbrains.annotations.Nullable()
    byte[] data) {
        return null;
    }
    
    /**
     * Convert Hex String to byte array
     * @param data
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final byte[] String2Hex(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
}