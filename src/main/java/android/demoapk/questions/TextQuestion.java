package android.demoapk.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TextQuestion implements Question<String> {

    private Target element;

    public TextQuestion(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static TextQuestion value(Target element){
        return Instrumented.instanceOf(TextQuestion.class).withProperties(element);
    }
}
