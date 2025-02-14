package davidson.cody.chucknorriswebapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorrisWebAppApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ChuckNorrisWebAppApplication.class, args);

    }

}
