package davidson.cody.chucknorriswebapp.configurations;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckNorrisQuotesConfig {

    @Bean
    ChuckNorrisQuotes createChuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
    }

}
