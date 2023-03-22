package android.demoapk.tasks;

import android.demoapk.userinterface.HamburguerMenuUI;
import android.demoapk.userinterface.HomeUI;
import android.demoapk.userinterface.LogInUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginOnDemoApp implements Task {

    private String username,password;

    public LoginOnDemoApp(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.MENU_BUTTON),
                Click.on(HamburguerMenuUI.LOG_IN_BUTTON),
                Enter.theValue(username).into(LogInUI.USERNAME_TXT),
                Enter.theValue(password).into(LogInUI.PASSWORD_TXT),
                Click.on(LogInUI.CONFIRM_LOGIN_BUTTON)
        );
    }

    public static LoginOnDemoApp withCredentials(String username, String password){
        return Instrumented.instanceOf(LoginOnDemoApp.class).withProperties(username,password);
    }
}
