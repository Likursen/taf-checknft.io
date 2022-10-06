package io.checknft.api.tests;

import io.checknft.api.utils.PropertiesLoader;
import io.checknft.api.utils.interfaces.Property;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    private static final Property properties = PropertiesLoader.getProperties();
    protected final static String TOKEN = properties.token();

    @BeforeMethod
    public void beforeMethod() {
        RestAssured.baseURI = "https://checknft.io/";
    }
}