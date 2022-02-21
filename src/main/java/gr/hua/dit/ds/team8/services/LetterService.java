package gr.hua.dit.ds.team8.services;

import gr.hua.dit.ds.team8.entity.Letter;

import java.util.List;

public interface LetterService {
        Letter createLetter(LetterCreationParameters parameters);

        List<Letter> getLetters();
}

