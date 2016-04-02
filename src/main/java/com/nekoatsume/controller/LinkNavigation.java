package com.nekoatsume.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;
import com.nekoatsume.service.UserService;

/**
 *
 * @author Mata
 */
@Controller
public class LinkNavigation {

    /**
     *
     */
    protected static Logger logger = Logger.getLogger("controller");

    @Autowired
    UserService userService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView indexPage() {
        return new ModelAndView("accueil");
    }

    //permet d'aller à la page d'acceuil

    /**
     *
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = "/accueil", method = RequestMethod.GET)
    public String ModerationPage(Model model, Principal principal) {
        model.addAttribute("title", "Moderation Page");
        String userName = principal.getName();

        model.addAttribute("message", "WELCOME mr " + userName);
        return "accueil";
    }

    //-----------------connection de l'administrateur

    /**
     *
     * @return
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView firstAdminPage() {
        return new ModelAndView("admin-first");
    }

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/admin-users", method = RequestMethod.GET)
    public String listUser(Model model) {
        List<User> users = userService.listeUser();
        model.addAttribute("listuser", users);
        return "admin-users";
    }
    //----------------fin pour la connection de l'adminisatrateur

    //********ADD USER

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/newuser"}, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("edit", false);
        return "registration";
    }

    /**
     *
     * @param user
     * @param result
     * @param model
     * @return
     */
    @RequestMapping(value = {"/newuser"}, method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult result,
            ModelMap model) {
        try {
            User exist = userService.findByEmail(user.getadresse_mail());
            if (exist.getBanni() == 1) {
                return "banni";
            }
        } catch (Exception e) {
            userService.addUser(user);
            model.addAttribute("log", true);

            if (user.getLogin().isEmpty() || user.getPassword().isEmpty() || user.getadresse_mail().isEmpty()) {
                model.addAttribute("msg", true);
                return "registration";
            }

            model.addAttribute("userLog1", user.getLogin());
            model.addAttribute("userLog2", user.getPassword());
            return "login-form";
        }

        return null;
    }
    //*****END ADD USER

    //---------EDIT USER

    /**
     *
     * @param login
     * @param model
     * @return
     */
    @RequestMapping(value = {"/edituser-{login}"}, method = RequestMethod.GET)
    public String getEdit(@PathVariable String login, ModelMap model) {
        logger.debug("Received request to show edit page");

        User user = userService.getUser(login);
        model.addAttribute("user", user);
        model.addAttribute("login", user.getLogin());
        model.addAttribute("edit", true);

        return "edituser";
    }

    /**
     *
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = {"/edituser-{login}"}, method = RequestMethod.POST)
    public String postEdit(Model model, Principal principal) {
        String userName = principal.getName();
        User exist = userService.getUser(userName);
        userService.updateUser(exist);
        model.addAttribute("log", true);
        model.addAttribute("userLog1", exist.getLogin());
        model.addAttribute("userLog2", exist.getPassword());
        return "login-form";
    }
    //------------END EDIT USER

    //méthode pour bannir des utilisateurs

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/bannir-{id}", method = RequestMethod.GET)
    public String removeUser(@PathVariable("id") int id, Model model) {
        User user = userService.getUserById(id);
        userService.bannirUser(user);

        List<User> users = userService.listeUser();
        model.addAttribute("listuser", users);
        return "admin-users";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/revalider-{id}", method = RequestMethod.GET)
    public String revalidateUser(@PathVariable("id") int id, Model model) {
        User user = userService.getUserById(id);
        userService.revaliderUser(user);

        List<User> users = userService.listeUser();
        model.addAttribute("listuser", users);
        return "admin-users";
    }
}
