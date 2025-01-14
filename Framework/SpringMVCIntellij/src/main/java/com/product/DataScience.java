package com.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataScience {
    @RequestMapping("/datascience")
    public String courseJava()
    {
        return "datascience";
    }
}
