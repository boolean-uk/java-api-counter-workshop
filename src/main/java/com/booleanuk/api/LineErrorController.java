package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.servlet.error.ErrorController;

@RestController
@RequestMapping("/error")
public class LineErrorController implements ErrorController {

    @GetMapping
    public String error() {
        return "Wrong line number";
    }

}
