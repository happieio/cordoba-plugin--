package ******* set a valid package name *******;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import android.util.Log;

public class *******3rdParamInWWWfunction******* extends CordovaPlugin {
    private final String pluginName = "******* Name used for native logging *******";

    @Override
    public boolean execute(final String action, final JSONArray data, final CallbackContext callbackContext) {
        Log.d(pluginName, pluginName + " called with options: " + data);
        if (action.equals("******* 4th param in www interface function *******")) {
            // DO SOME ACTION
        }
        else if(action.equals("******* 4th param in another www interface function")){
            //DO SOMETHING ELSE
        }
        return true;
    }

    private void anInternalMethod(final JSONArray data, final CallbackContext callbackContext) {
        final Context context = this.cordova.getActivity().getApplicationContext();
        this.cordova.getThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                //RUN STUFF ON A NEW THREAD
            }
        });
    }

    private void anotherInternalMethod() {
        //called by one of the logic branches in the execute method
    }
}