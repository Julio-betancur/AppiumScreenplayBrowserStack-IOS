package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LogInUI {
    public static final Target USERNAME_TXT = Target.the("Username textfield").located(MobileBy.AccessibilityId("Username input field"));
    public static final Target PASSWORD_TXT = Target.the("Password textfield").located(MobileBy.AccessibilityId("Password input field"));
    public static final Target CONFIRM_LOGIN_BUTTON = Target.the("Button to log in").located(MobileBy.AccessibilityId("Login button"));

    

}
