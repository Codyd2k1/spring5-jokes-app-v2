package davidson.cody.chucknorriswebapp.Repository;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Repository;

@Repository
public class JokeRepository{
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public String findJoke() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
        String randomQuote = chuckNorrisQuotes.getRandomQuote();
        return randomQuote;
    }
}
