package com.globallogic.testing.e2e.stepdefs;

import com.globallogic.testing.e2e.Utils;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;

import java.util.Locale;

import static java.util.Locale.ENGLISH;

/**
 * Register custom Cucumber parameter types.
 * <a href="https://cucumber.io/docs/cucumber/configuration/?lang=java">...</a>
 */
public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<>(
                "browser",
                "\"chrome\"|\"firefox\"|\"edge\"",
                Utils.Browser.class,
                (String s) -> Utils.Browser.valueOf(s.replaceAll("\"","").toUpperCase())
        ));

        typeRegistry.defineParameterType(new ParameterType<>(
                "month",
                "1|2|3|4|5|6|7|8|9|10|11|12|\"1\"|\"2\"|\"3\"|\"4\"|\"5\"|\"6\"|\"7\"|\"8\"|\"9\"|\"10\"|\"11\"|\"12\"",
                Integer.class,
                (String s) -> Integer.parseInt(s.replaceAll("\"", "")))
        );


    }
}
