package davidson.cody.chucknorriswebapp.Controller;

import davidson.cody.chucknorriswebapp.Service.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(@Qualifier("jokeService")JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/getRandomJoke")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.retrieveJoke());

        return "jokes/displaySingleJoke";
    }

}
