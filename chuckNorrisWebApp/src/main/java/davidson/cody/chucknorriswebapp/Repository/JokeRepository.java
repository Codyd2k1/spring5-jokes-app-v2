package davidson.cody.chucknorriswebapp.Repository;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Repository;

@Repository
public class JokeRepository{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeRepository(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String findJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
