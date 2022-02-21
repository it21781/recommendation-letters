package gr.hua.dit.ds.team8.controller;

import com.sun.istack.NotNull;
import gr.hua.dit.ds.team8.services.LetteridCreationParameters;



public class CreateLetteridFormData {
    @NotNull
    private String letterid;


    public String getLetterid() {
        return letterid;
    }

    public void setLetterid(String letterid) {
        this.letterid = letterid;
    }


    public LetteridCreationParameters toParameters() {
        return new LetteridCreationParameters(letterid);
    }
}