package com.eventexpert;

import com.facebook.react.ReactActivity;
import com.devfd.RNGeocoder.RNGeocoderPackage;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
             new MainReactPackage(),
             new RNGeocoderPackage()); // <------ add this
    }


    @Override
    protected String getMainComponentName() {
        return "EventExpert";
    }
}
