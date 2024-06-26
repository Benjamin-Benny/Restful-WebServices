package com.project.restful_webservices.hello_world;

import lombok.Data;

@Data
public class HelloWorldBean {

    private final String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
