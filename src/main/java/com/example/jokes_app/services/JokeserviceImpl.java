package com.example.jokes_app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeserviceImpl implements Jokeservice {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeserviceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
