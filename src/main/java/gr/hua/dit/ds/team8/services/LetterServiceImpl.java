package gr.hua.dit.ds.team8.services;


import gr.hua.dit.ds.team8.entity.Letter;
import gr.hua.dit.ds.team8.repository.LetterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LetterServiceImpl  implements  LetterService{
    private final LetterRepository repository;

    public LetterServiceImpl(LetterRepository repository) {
        this.repository = repository;
    }

    @Override
    public Letter createLetter(LetterCreationParameters parameters) {
         Letter letter = new Letter(parameters.getStudent_fn(), parameters.getStudent_ln(), parameters.getTeacher_fn(), parameters.getTeacher_ln(), parameters.getPurpose(), parameters.getMarks(), parameters.getEmail(),false);

        return repository.save(letter);
    }

    @Override
    public List<Letter> getLetters() {
        ArrayList<Letter> list = (ArrayList<Letter>) repository.findAll();

        return list;
    }

    @Override
    public Letter getLetterById(int letterid) {
        Optional<Letter> optletter = repository.findById(letterid);
        Letter letter = optletter.get();
        repository.deleteById(letterid);
        return letter;
    }

    @Override
    public Letter saveLetterById(Letter letter) {
        letter = new Letter(letter.getStudent_fn(),letter.getStudent_ln(),letter.getTeacher_fn(),letter.getTeacher_ln(),letter.getPurpose(),letter.getMarks(),letter.getEmail(),letter.getApproved());
        return repository.save(letter);
    }
}
