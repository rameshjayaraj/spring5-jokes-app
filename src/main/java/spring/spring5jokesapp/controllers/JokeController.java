package spring.spring5jokesapp.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.spring5jokesapp.services.JokeService;

public class JokeController {

    private final JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
