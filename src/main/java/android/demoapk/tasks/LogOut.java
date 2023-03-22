package android.demoapk.tasks;

import android.demoapk.userinterface.HamburguerMenuUI;
import android.demoapk.userinterface.HomeUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LogOut implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.MENU_BUTTON),
                Click.on(HamburguerMenuUI.LOG_OUT_BUTTON),
                Click.on(HomeUI.CONFIRM_LOGOUT_BTN)
        );
    }

    public static LogOut fromDemoApp(){
        return Instrumented.instanceOf(LogOut.class).withProperties();
    }
}
