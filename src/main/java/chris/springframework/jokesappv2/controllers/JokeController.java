package chris.springframework.jokesappv2.controllers;

import chris.springframework.jokesappv2.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(@Qualifier("jokeServiceChuckNorris") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.sayJoke());
        return "index";
    }
}
