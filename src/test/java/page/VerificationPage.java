package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

        private SelenideElement codeField = $("[data-test-id=code]");
        private SelenideElement verifyButton = $("[data-test-id=action-verify]");

        public VerificationPage() {
            codeField.shouldBe(visible);
        }

        public DashboardPage validVerrify(DataHelper.VerificationCode verificationCode) {
            verifyButton.click();
            return new DashboardPage();
        }

    }

