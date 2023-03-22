package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HamburguerMenuUI {
    public static final Target LOG_IN_BUTTON = Target.the("Log in button").located(MobileBy.AccessibilityId("menu item log in"));

    public static final Target LOG_OUT_BUTTON = Target.the("Log out button").located(MobileBy.AccessibilityId("menu item log out"));
}
