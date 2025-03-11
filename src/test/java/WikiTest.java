import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class WikiTest {

    @Test
    void softAssertionsIncludesJUnit() {

        open("https://school.qa.guru/");
    }
}

