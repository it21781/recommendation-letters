package gr.hua.dit.ds.team8.services;


import gr.hua.dit.ds.team8.entity.Letter;
import gr.hua.dit.ds.team8.repository.LetterRepository;
import org.springframework.stereotype.Service;

@Service
public class LetterServiceImpl  implements  LetterService{
    private final LetterRepository repository;

    public LetterServiceImpl(LetterRepository repository) {
        this.repository = repository;
    }

    @Override
    public Letter createLetter(LetterCreationParameters parameters) {
         Letter letter = new Letter(parameters.getStudent_fn(), parameters.getStudent_ln(), parameters.getTeacher_fn(), parameters.getTeacher_ln(), parameters.getEmail(),false);

        return repository.save(letter);
    }
}