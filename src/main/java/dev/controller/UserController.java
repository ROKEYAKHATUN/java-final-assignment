package dev.controller;

import dev.domain.User;
import dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "Users";
    }

    @GetMapping("/{id}")
    public String showUser(@PathVariable int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user/show";
    }

    @GetMapping("/create")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user) {
        userService.createUser(user);
        return "confirm";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @PostMapping("/edit/{id}")
    public String editUser(@PathVariable int id, @ModelAttribute User user) {
        user.setId(id);
        userService.editUser(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, Model model) {

        boolean isAuthenticated = userService.authenticateUser(user.getUsername(), user.getPassword());

        if (isAuthenticated) {
            String fullName = userService.getFullNameByUsername(user.getUsername());

            User userFromDatabase = new User();
            userFromDatabase.setFullName(fullName);

            model.addAttribute("user", userFromDatabase);
            return "home";
        } else {
            return "redirect:/login?error";
        }
    }

    @GetMapping("/home")
    public String home(Model model) {
        // Assuming you have a user object with the required data
        String user = userService.getFullNameByUsername("username"); // Replace with the actual username

        model.addAttribute("user", user);
        return "home";
    }


}
