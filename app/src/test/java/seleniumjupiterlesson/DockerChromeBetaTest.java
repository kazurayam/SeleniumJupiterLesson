package seleniumjupiterlesson;


import io.github.bonigarcia.seljup.DockerBrowser;
import io.github.bonigarcia.seljup.EnabledIfDockerAvailable;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static io.github.bonigarcia.seljup.BrowserType.CHROME;
import static org.assertj.core.api.Assertions.assertThat;

@EnabledIfDockerAvailable
@ExtendWith(SeleniumJupiter.class)
public class DockerChromeBetaTest {

    @Test
    void test(@DockerBrowser(type = CHROME, version = "beta") WebDriver driver) {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java");
        assertThat(driver.getTitle().contains("Selenium WebDriver"));
    }
}
