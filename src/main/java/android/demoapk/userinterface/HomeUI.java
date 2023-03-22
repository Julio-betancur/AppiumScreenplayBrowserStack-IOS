package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target MENU_BUTTON = Target.the("menu button").located(MobileBy.AccessibilityId("tab bar option menu"));
    public static final Target HEADER_TXT = Target.the("Header text of products").located(MobileBy.xpath("//XCUIElementTypeStaticText[@label='Products']"));
    public static final Target CONFIRM_LOGOUT_BTN = Target.the("Button to confirm logout").located(MobileBy.xpath("//XCUIElementTypeButton[@name='Log Out']"));
    public static final Target CONFIRM_LOGOUT_TXT = Target.the("Text to confirm logout").located(MobileBy.xpath("//XCUIElementTypeStaticText[contains(@value,'logged')]"));


}


