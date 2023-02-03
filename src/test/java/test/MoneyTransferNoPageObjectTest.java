package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MoneyTransferNoPageObjectTest {
    @Test
    void shouldTransferMoneyBetweenOwnCards() {
        open("http://localhost9999");

        $("[data-test-id=login] input").setValue("vasya");
        $("data-test-id=password] input").setValue("qwerty123");
        $("[data-test-id=action-verify]").click();

        $("[data-test-id=code] input").setValue("12345");
        $("[data-test-id=action-verify]").click();

        $("[data-test-id=dashboard]").shouldBe(visible);





    }


}
