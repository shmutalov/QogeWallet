package ml.gorynich.qogewallet;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;

import com.facebook.react.ReactActivity;

import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "QogeWallet";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        if (getResources().getBoolean(R.bool.portrait_only)) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

     /**
	   * Returns the instance of the {@link ReactActivityDelegate}. Here we use a util class {@link
	   * DefaultReactActivityDelegate} which allows you to easily enable Fabric and Concurrent React
	   * (aka React 18) with two boolean flags.
	   */
	  @Override
	  protected ReactActivityDelegate createReactActivityDelegate() {
	    return new DefaultReactActivityDelegate(
	        this,
	        getMainComponentName(),
	        // If you opted-in for the New Architecture, we enable the Fabric Renderer.
	        DefaultNewArchitectureEntryPoint.getFabricEnabled(), // fabricEnabled
	        // If you opted-in for the New Architecture, we enable Concurrent React (i.e. React 18).
	        DefaultNewArchitectureEntryPoint.getConcurrentReactEnabled() // concurrentRootEnabled
	        );
	  }
}
