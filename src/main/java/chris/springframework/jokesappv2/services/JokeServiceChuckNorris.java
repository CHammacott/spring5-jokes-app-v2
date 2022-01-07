package chris.springframework.jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceChuckNorris implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceChuckNorris() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
