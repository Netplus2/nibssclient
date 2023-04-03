package com.netpluspay.nibssclient.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jv\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u00010\"2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"H\u0002JX\u0010;\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\"2\u0006\u0010@\u001a\u00020AH\u0002J$\u0010B\u001a\b\u0012\u0004\u0012\u00020C0,2\u0006\u0010.\u001a\u00020/2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\"J6\u0010G\u001a\b\u0012\u0004\u0012\u00020C0,2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\u0006\u0010H\u001a\u00020\"H\u0002J&\u0010I\u001a\b\u0012\u0004\u0012\u00020C0,2\u0006\u0010.\u001a\u00020/2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\"H\u0002J&\u0010J\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e0K0,2\u0006\u0010.\u001a\u00020/H\u0002J,\u0010L\u001a\b\u0012\u0004\u0012\u00020\"0,2\u0006\u0010.\u001a\u00020/2\u0006\u0010!\u001a\u00020\"2\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"J&\u0010O\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e0K0,2\u0006\u0010.\u001a\u00020/H\u0002J\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020\"0,H\u0002J\u0014\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0T0,H\u0002J\b\u0010U\u001a\u00020\"H\u0002J6\u0010V\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010W\u001a\u00020$2\u0006\u0010<\u001a\u00020=2\u0006\u00109\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0002J,\u0010X\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e0K0,2\u0006\u0010.\u001a\u00020/2\u0006\u0010Y\u001a\u00020\"J\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0,2\u0006\u0010\\\u001a\u00020=H\u0002J\u0016\u0010]\u001a\u00020Q2\u0006\u0010.\u001a\u00020/2\u0006\u0010Y\u001a\u00020\"JV\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"JX\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"H\u0002JX\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"H\u0002J`\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\"2\b\u00104\u001a\u0004\u0018\u00010\"H\u0002Jx\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\"2\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u00010\"2\u0006\u0010:\u001a\u00020\"H\u0002J\b\u0010c\u001a\u00020QH\u0002J\u0018\u0010d\u001a\u00020Q2\u0006\u0010e\u001a\u00020f2\u0006\u00107\u001a\u000208H\u0002J\b\u0010g\u001a\u00020QH\u0002J\b\u0010h\u001a\u00020QH\u0002J\b\u0010i\u001a\u00020QH\u0002J(\u0010j\u001a\u00020Q2\u0006\u00109\u001a\u00020\"2\u0006\u0010e\u001a\u00020-2\u0006\u0010k\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010l\u001a\u00020Q2\u0006\u0010m\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006n"}, d2 = {"Lcom/netpluspay/nibssclient/service/NetposPaymentClient;", "", "()V", "amountDbl", "", "amountLong", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "configData", "Lcom/danbamitale/epmslib/entities/ConfigData;", "configurationData", "Lcom/netpluspay/nibssclient/models/ConfigurationData;", "connectionData", "Lcom/danbamitale/epmslib/entities/ConnectionData;", "currentlyLoggedInUser", "Lcom/netpluspay/nibssclient/models/UserData;", "gson", "Lcom/google/gson/Gson;", "iswPaymentProcessorObject", "Lcom/isw/gateway/TransactionProcessorWrapper;", "keyHolder", "Lcom/danbamitale/epmslib/entities/KeyHolder;", "rrnApiService", "Lcom/netpluspay/nibssclient/network/RrnApiService;", "stormApiService", "Lcom/netpluspay/nibssclient/network/StormApiService;", "terminalConfigurator", "Lcom/danbamitale/epmslib/processors/TerminalConfigurator;", "terminalId", "", "transResp", "Lcom/danbamitale/epmslib/entities/TransactionResponse;", "transactionResponseDao", "Lcom/netpluspay/nibssclient/dao/TransactionResponseDao;", "user", "Lcom/netpluspay/nibssclient/models/User;", "workManager", "Landroidx/work/WorkManager;", "abstractedCheckForIswThresholdToProcessIswPayment", "Lio/reactivex/Single;", "Lcom/netpluspay/nibssclient/models/TransactionWithRemark;", "context", "Landroid/content/Context;", "makePaymentParams", "cardScheme", "cardHolder", "remark", "stan", "interSwitchObject", "iswToken", "transactionTrackingTableDao", "Lcom/netpluspay/nibssclient/dao/TransactionTrackingTableDao;", "rrn", "mId", "abstractedPaymentWithIswImplementation", "transactionToLog", "Lcom/netpluspay/nibssclient/models/TransactionToLogBeforeConnectingToNibbs;", "params", "Lcom/netpluspay/nibssclient/models/MakePaymentParams;", "requestData", "Lcom/danbamitale/epmslib/entities/TransactionRequestData;", "balanceEnquiry", "Lcom/netpluspay/nibssclient/models/CheckAccountBalanceResponse;", "cardData", "Lcom/danbamitale/epmslib/entities/CardData;", "accountType", "balanceEnquiryIsw", "destinationAcc", "balanceEnquiryNibss", "callHome", "Lkotlin/Pair;", "callHomeToRefreshSessionKeys", "keyHolderClearSessionKey", "terminalSerialNumber", "configureTerminal", "finish", "", "getIswTokenAtRuntime", "getRRn", "Lretrofit2/Response;", "getTerminalId", "handleTransactionUpdateAndReturnSingle", "it", "init", "serializedUserData", "logTransactionToBackEndBeforeMakingPayment", "Lcom/netpluspay/nibssclient/models/ResponseBodyAfterLoginToBackend;", "dataToLog", "logUser", "makePayment", "makePaymentIsw", "makePaymentNibss", "makePaymentViaNibss", "processTransactionViaInterSwitchMakePayment", "repushTransactionsToBackend", "saveTransactionForTracking", "transactionResponse", "Lcom/netpluspay/nibssclient/work/ModelObjects$TransactionResponseXForTracking;", "setCurrentlyLoggedInUser", "setTerminalId", "setUpIswToken", "updateTransactionInBackendAfterMakingPayment", "status", "validateField", "amount", "nibssclient_release"})
public final class NetposPaymentClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.netpluspay.nibssclient.service.NetposPaymentClient INSTANCE = null;
    private static com.netpluspay.nibssclient.dao.TransactionResponseDao transactionResponseDao;
    private static androidx.work.WorkManager workManager;
    private static final com.google.gson.Gson gson = null;
    private static double amountDbl = 0.0;
    private static long amountLong = 0L;
    private static com.danbamitale.epmslib.entities.TransactionResponse transResp;
    private static final com.netpluspay.nibssclient.network.StormApiService stormApiService = null;
    private static final com.netpluspay.nibssclient.network.RrnApiService rrnApiService = null;
    private static com.netpluspay.nibssclient.models.ConfigurationData configurationData;
    private static com.netpluspay.nibssclient.models.User user;
    private static com.danbamitale.epmslib.entities.ConnectionData connectionData;
    private static java.lang.String terminalId;
    private static com.netpluspay.nibssclient.models.UserData currentlyLoggedInUser;
    private static com.danbamitale.epmslib.processors.TerminalConfigurator terminalConfigurator;
    private static com.isw.gateway.TransactionProcessorWrapper iswPaymentProcessorObject;
    private static final kotlin.Lazy compositeDisposable$delegate = null;
    private static com.danbamitale.epmslib.entities.KeyHolder keyHolder;
    private static com.danbamitale.epmslib.entities.ConfigData configData;
    
    private NetposPaymentClient() {
        super();
    }
    
    private final java.lang.String getTerminalId() {
        return null;
    }
    
    private final void setCurrentlyLoggedInUser() {
    }
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    /**
     * Registers the parameters of the user and the terminal
     * @param context: Context
     * @param serializedUserData: String
     * Example user data is as follows: UserData(
     *    businessName = "Netplus",
     *    partnerName = "Netplus",
     *    partnerId = "5de231d9-1be0-4c31-8658-6e15892f2b83",
     *    terminalId = "2033ALZP",
     *    terminalSerialNumber = "1234556789", // This is just a placeholder, Kindly replace with yours
     *    businessAddress = "Marwa Lagos",
     *    customerName = "Test Account"
     *    )
     *
     * @return Unit
     */
    public final void logUser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serializedUserData) {
    }
    
    private final void setTerminalId() {
    }
    
    private final void validateField(long amount) {
    }
    
    /**
     * Configures the terminal and sets up other neccessary data
     * @param context: Context
     * @param configureSilently: Boolean
     * @param serializedUserData: String
     * @return Single<Pair<KeyHolder?, ConfigData?>> Single of pair of Keyholder and configData objects
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<kotlin.Pair<com.danbamitale.epmslib.entities.KeyHolder, com.danbamitale.epmslib.entities.ConfigData>> init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serializedUserData) {
        return null;
    }
    
    private final io.reactivex.Single<kotlin.Pair<com.danbamitale.epmslib.entities.KeyHolder, com.danbamitale.epmslib.entities.ConfigData>> callHome(android.content.Context context) {
        return null;
    }
    
    /**
     * Calls Home to refresh the session key
     * Can be called after at an interval of 5 - 10 minutes or if the app has been idle for a while
     *
     * @param context
     * @param terminalId
     * @param keyHolderClearSessionKey
     * @param terminalSerialNumber
     * @return String, which when successful is "00" else, call the configure terminal to get a new session key
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> callHomeToRefreshSessionKeys(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    java.lang.String keyHolderClearSessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerialNumber) {
        return null;
    }
    
    private final io.reactivex.Single<kotlin.Pair<com.danbamitale.epmslib.entities.KeyHolder, com.danbamitale.epmslib.entities.ConfigData>> configureTerminal(android.content.Context context) {
        return null;
    }
    
    private final void repushTransactionsToBackend() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> makePayment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    java.lang.String makePaymentParams, @org.jetbrains.annotations.NotNull()
    java.lang.String cardScheme, @org.jetbrains.annotations.NotNull()
    java.lang.String cardHolder, @org.jetbrains.annotations.NotNull()
    java.lang.String remark, @org.jetbrains.annotations.NotNull()
    java.lang.String rrn, @org.jetbrains.annotations.NotNull()
    java.lang.String stan) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> makePaymentNibss(android.content.Context context, java.lang.String terminalId, java.lang.String makePaymentParams, java.lang.String cardScheme, java.lang.String cardHolder, java.lang.String remark, java.lang.String rrn, java.lang.String stan) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> makePaymentIsw(android.content.Context context, java.lang.String terminalId, java.lang.String makePaymentParams, java.lang.String cardScheme, java.lang.String cardHolder, java.lang.String remark, java.lang.String rrn, java.lang.String stan) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> abstractedCheckForIswThresholdToProcessIswPayment(android.content.Context context, java.lang.String terminalId, java.lang.String makePaymentParams, java.lang.String cardScheme, java.lang.String cardHolder, java.lang.String remark, java.lang.String stan, java.lang.String interSwitchObject, java.lang.String iswToken, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao, java.lang.String rrn, java.lang.String mId) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> processTransactionViaInterSwitchMakePayment(android.content.Context context, java.lang.String terminalId, java.lang.String makePaymentParams, java.lang.String cardScheme, java.lang.String cardHolder, java.lang.String remark, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao, java.lang.String rrn, java.lang.String interSwitchObject, java.lang.String iswToken, java.lang.String stan, java.lang.String mId) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> abstractedPaymentWithIswImplementation(android.content.Context context, com.netpluspay.nibssclient.models.TransactionToLogBeforeConnectingToNibbs transactionToLog, com.netpluspay.nibssclient.models.MakePaymentParams params, java.lang.String cardScheme, java.lang.String cardHolder, java.lang.String remark, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao, java.lang.String rrn, com.danbamitale.epmslib.entities.TransactionRequestData requestData) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> handleTransactionUpdateAndReturnSingle(com.danbamitale.epmslib.entities.TransactionResponse it, com.netpluspay.nibssclient.models.TransactionToLogBeforeConnectingToNibbs transactionToLog, java.lang.String rrn, java.lang.String remark, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.TransactionWithRemark> makePaymentViaNibss(android.content.Context context, java.lang.String terminalId, java.lang.String makePaymentParams, java.lang.String cardScheme, java.lang.String cardHolder, java.lang.String remark, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao, java.lang.String rrn, java.lang.String stan) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.ResponseBodyAfterLoginToBackend> logTransactionToBackEndBeforeMakingPayment(com.netpluspay.nibssclient.models.TransactionToLogBeforeConnectingToNibbs dataToLog) {
        return null;
    }
    
    private final void updateTransactionInBackendAfterMakingPayment(java.lang.String rrn, com.netpluspay.nibssclient.models.TransactionWithRemark transactionResponse, java.lang.String status, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao) {
    }
    
    private final void saveTransactionForTracking(com.netpluspay.nibssclient.work.ModelObjects.TransactionResponseXForTracking transactionResponse, com.netpluspay.nibssclient.dao.TransactionTrackingTableDao transactionTrackingTableDao) {
    }
    
    private final void setUpIswToken() {
    }
    
    private final io.reactivex.Single<java.lang.String> getIswTokenAtRuntime() {
        return null;
    }
    
    private final io.reactivex.Single<retrofit2.Response<java.lang.String>> getRRn() {
        return null;
    }
    
    /**
     * Checks account balance
     * @param context
     * @param cardData An object of card data
     * @param accountType
     * @return CheckAccountBalanceResponse
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.netpluspay.nibssclient.models.CheckAccountBalanceResponse> balanceEnquiry(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.CheckAccountBalanceResponse> balanceEnquiryNibss(android.content.Context context, com.danbamitale.epmslib.entities.CardData cardData, java.lang.String accountType) {
        return null;
    }
    
    private final io.reactivex.Single<com.netpluspay.nibssclient.models.CheckAccountBalanceResponse> balanceEnquiryIsw(com.danbamitale.epmslib.entities.CardData cardData, java.lang.String accountType, java.lang.String mId, java.lang.String iswToken, java.lang.String destinationAcc) {
        return null;
    }
    
    /**
     * This method should be called on the ondestroy method of the lifecycle owner (Fragment or activity) where this class, NetposPaymentClient, is used
     */
    public final void finish() {
    }
}