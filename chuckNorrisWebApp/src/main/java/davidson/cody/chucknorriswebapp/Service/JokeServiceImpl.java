package davidson.cody.chucknorriswebapp.Service;

import davidson.cody.chucknorriswebapp.Repository.JokeRepository;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service("jokeService")
public class JokeServiceImpl implements JokeService {

    private final JokeRepository jokeRepository;

    public JokeServiceImpl(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @Override
    public String retrieveJoke() {
        return jokeRepository.findJoke();
    }
}
