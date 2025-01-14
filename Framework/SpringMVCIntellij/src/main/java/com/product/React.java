package com.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class React {
    @RequestMapping("/react")
    public String courseReact()
    {
        return "react";
    }
}
