package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void config(){
        Configuration.baseUrl = "https://github.com/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "2160x1440";
    }
}
