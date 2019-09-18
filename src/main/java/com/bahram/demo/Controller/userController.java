package com.bahram.demo.Controller;

import com.se.project.template.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
//    @GetMapping("/employee/add")
//    public String getAddPage(Model model){
//        model.addAttribute("user", new User());
//        return "user";
//    }
    @GetMapping("/employee/add")
    public String getAddPage(){
        return "employee";
    }
}
