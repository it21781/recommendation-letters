package gr.hua.dit.ds.team8.services;

import gr.hua.dit.ds.team8.entity.Letter;
import gr.hua.dit.ds.team8.repository.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LetterService {

    @Autowired
    private LetterRepository letterRepository;

    public void registerLetter(Letter letter){

        Letter newLetter = new Letter();
        newLetter.setStudent_fn();
        newLetter.setStudent_ln();
        newLetter.setTeacher_fn();
        newLetter.setTeacher_ln();
        newLetter.setEmail();
        newLetter.setApproved(false);
        letterRepository.save(newLetter);
    }
}
