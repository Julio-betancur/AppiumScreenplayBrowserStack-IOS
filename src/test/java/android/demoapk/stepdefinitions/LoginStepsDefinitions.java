package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.TextQuestion;
import android.demoapk.tasks.LoginOnDemoApp;
import android.demoapk.userinterface.HomeUI;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepsDefinitions {

    @Given("{actor} wants to buy some clothes")
    public void userWantsToBuySomeClothes(Actor actor) throws MalformedURLException {
        actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
    }

    @When("{actor} introduce the valid credentials {word} {word}")
    public void userIntroduceTheValidCredentialsBobExampleCom(Actor actor, String username, String password) {
        actor.attemptsTo(
                LoginOnDemoApp.withCredentials(username,password)
        );
    }
    @Then("{actor} should see the {word} list")
    public void userShouldSeeTheProductsList(Actor actor,String expectedText) {
        JavascriptExecutor jse = (JavascriptExecutor) IOSDriver.driver;
        try {
            actor.should(seeThat("Texto de bienvenida", TextQuestion.value(HomeUI.HEADER_TXT),equalTo(expectedText)));
        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }


    }
}
