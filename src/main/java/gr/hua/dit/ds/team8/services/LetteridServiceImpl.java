package gr.hua.dit.ds.team8.services;

import gr.hua.dit.ds.team8.entity.Letterid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LetteridServiceImpl  implements  LetteridService {

    @Override
    public Letterid createLetterid(LetteridCreationParameters parameters) {
        Letterid letterid = new Letterid(parameters.getLetterid());
        return letterid;
    }
}