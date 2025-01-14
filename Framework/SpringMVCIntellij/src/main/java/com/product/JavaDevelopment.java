package com.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaDevelopment {
    @RequestMapping("/javacourse")
    public String courseJava()
    {
        return "javacourse";
    }
}
