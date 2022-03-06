package com.facebook.reactnative.androidsdk;

import com.facebook.FacebookSdk;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/**
 * This is a {@link NativeModule} that allows JS to use SDK settings in Facebook Android SDK.
 */
@ReactModule(name = FBSettingsModule.NAME)
public class FBSettingsModule extends ReactContextBaseJavaModule {

    public static final String NAME = "FBSettings";

    private static ReactApplicationContext reactContext;

    public FBSettingsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        FBSettingsModule.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }
    
    /**
     * Initialize the sdk
     * [FB SDK Best Practices for GDPR Compliance](https://developers.facebook.com/docs/app-events/gdpr-compliance/)
     */
    @ReactMethod
    public static void initializeSDK() {
        FacebookSdk.sdkInitialize(reactContext);
        FacebookSdk.fullyInitialize();
    }

    /**
     * Set app id
     * @param appID app id
     */
    @ReactMethod
    public static void setAppID(String appID) {
        FacebookSdk.setApplicationId(appID);
    }
}
