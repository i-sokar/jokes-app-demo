package com.example.jokes_app.controllers;

import com.example.jokes_app.services.Jokeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class jokeController {

    private final Jokeservice jokeservice;
    public jokeController(Jokeservice jokeservice) {
        this.jokeservice = jokeservice;
    }
@RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeservice.getJoke());

        return "index";
    }
}
