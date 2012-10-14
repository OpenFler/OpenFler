package com.openfler.controller;

import java.util.ArrayList;
import java.util.List;

import com.openfler.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private static List<User> userList = new ArrayList<User>();

    @RequestMapping(value = {"/users/list"}, method = RequestMethod.GET)
    public String userList(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("userList", userList);
        return "/users/list";
    }

    @RequestMapping(value = {"/users/{id}"}, method = RequestMethod.GET)
    public String show(@PathVariable("id") Long parkId, @ModelAttribute("model") ModelMap model) {
        model.addAttribute("userList", userList);
        return "/users/show";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("user") User user) {
        return "redirect:/users/list";
    }

    @RequestMapping(value = "/users/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable("id") Long parkId, @ModelAttribute("model") ModelMap model) {
        model.addAttribute("userList", userList);
        return "/users/edit";
    }
}
