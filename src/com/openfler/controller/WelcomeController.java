package com.openfler.controller;

import com.openfler.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/")
    public String index(@ModelAttribute("model") ModelMap model) {

        return "/index";
    }
}
