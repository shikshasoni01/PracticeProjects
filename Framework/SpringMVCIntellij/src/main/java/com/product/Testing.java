package com.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testing {
    @RequestMapping("/testing")
    public String courseTesting()
    {
        return "testing";
    }
}
