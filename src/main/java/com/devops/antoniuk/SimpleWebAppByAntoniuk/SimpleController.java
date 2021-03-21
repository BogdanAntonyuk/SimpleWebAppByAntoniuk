package com.devops.antoniuk.SimpleWebAppByAntoniuk;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @GetMapping("/")
    public String getName(@RequestParam(name = "name", required = false, defaultValue = "everyone") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
}
