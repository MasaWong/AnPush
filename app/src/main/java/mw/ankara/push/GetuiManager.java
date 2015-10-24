package mw.ankara.push;

import android.content.Context;

import com.igexin.sdk.PushManager;

/**
 * @author masawong
 * @since 8/13/15
 */
public class GetuiManager {

    public static void initialize(Context context) {
        PushManager.getInstance().initialize(context.getApplicationContext());
    }

    public static String getClientId(Context context) {
        return PushManager.getInstance().getClientid(context.getApplicationContext());
    }
}
