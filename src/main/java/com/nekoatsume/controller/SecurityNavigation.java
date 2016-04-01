package com.nekoatsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nekoatsume.model.User;
import com.nekoatsume.service.UserService;
//c'est le controlleur pour la connexion de l'utilisateur

@Controller
public class SecurityNavigation {

    @Autowired
    UserService userService;

    //permet de se connecter
    @RequestMapping(value = {"/", "/user-login.html"}, method = RequestMethod.GET)
    public ModelAndView loginForm() {

        return new ModelAndView("login-form");

    }

    //récupère les données de l'utilisateur
    @RequestMapping(value = {"/user-login"}, method = RequestMethod.POST)
    public String loginOk(@RequestParam("login") String login, ModelMap mod) {
        User existinguser = userService.getUser(login);
        if (existinguser.getBanni() == 1) {
            return "banni";
        } else {
            return "acceuil";
        }
    }

    @RequestMapping(value = "/banni", method = RequestMethod.GET)
    public ModelAndView userbanni() {
        return new ModelAndView("banni");
    }

    //dans le cas d'une erreur
    @RequestMapping(value = "/error-login", method = RequestMethod.GET)
    public ModelAndView invalidLogin() {
        ModelAndView modelAndView = new ModelAndView("login-form");
        modelAndView.addObject("error", true);
        return modelAndView;
    }
}
