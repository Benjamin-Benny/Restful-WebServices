package com.project.restful_webservices.hello_world;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path = "/hello/{name}")
    public String HelloUser(@PathVariable String name){
        return "Hello " + (name.substring(0,1).toUpperCase()) + name.substring(1);
    }
}
