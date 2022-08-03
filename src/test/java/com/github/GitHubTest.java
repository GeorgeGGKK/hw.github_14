package com.github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest extends BaseTest{

    @Test
    void searchJUnit5Code(){
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $x("//a[text()='Soft assertions']").click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
