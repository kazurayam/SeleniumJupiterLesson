package seleniumjupiterlesson;
import static io.github.bonigarcia.seljup.Browser.SAFARI;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import io.github.bonigarcia.seljup.EnabledIfBrowserAvailable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.safari.SafariDriver;

import static org.assertj.core.api.Assertions.assertThat;
@EnabledIfBrowserAvailable(SAFARI)
@ExtendWith(SeleniumJupiter.class)
public class SafariTest {

    @Test
    void test(SafariDriver driver) {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java");
        assertThat(driver.getTitle().contains("Selenium WebDriver"));
    }
}
