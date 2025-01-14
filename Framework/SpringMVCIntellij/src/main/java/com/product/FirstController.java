package com.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

    @RequestMapping("/")
    public String display()
    {
        return "index";
    }
    @RequestMapping("/welcome")
    public String welcomePage()
    {
        return "welcome";
    }
    @RequestMapping("/login")
    public String loginPage()
    {
        return "login";
    }
   // @RequestMapping("/course")
//    public String CoursePage(HttpServletRequest request)
//    {
//        String name= request.getParameter("UserName");
//        String password=request.getParameter("Password");
//
//        if(name.equals("shiksha") && password.equals("soni"))
//        return "course";
//        else
//            return "errorpage";
//    }
//      @RequestMapping("/course")
//    public String CoursePage(@RequestParam("UserName") String name,@RequestParam("Password")String password)
//    {
//        if(name.equals("shiksha") && password.equals("soni"))
//        return "course";
//        else
//            return "errorpage";
//    }
   @RequestMapping("/course")
   public String CoursePage(@RequestParam("UserName") String name, @RequestParam("Password")String password, Model model)
   {
       String user= "you are "+name+" Welcome  .";
       model.addAttribute("User" ,user);

        if(name.equals("shiksha") && password.equals("soni"))
        return "course";
        else
            return "errorpage";
   }

}
