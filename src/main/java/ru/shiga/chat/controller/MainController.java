package ru.shiga.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
    @GetMapping
    public String index () {
        return "index";
    }

    @PostMapping("/chat")
    public String greetingSubmit(@RequestBody MultiValueMap<String, String> formData, Model model) {
        model.addAttribute("name", formData.get("username"));
        return "chat";
    }
}
