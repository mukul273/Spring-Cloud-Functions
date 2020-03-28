package com.spring.cloud.functions.functionService;

import java.util.function.Function;

public class FunctionService implements Function<String, String> {

    @Override
    public String apply(String args) {
        return "FunctionalService says:"+args ;
    }
}