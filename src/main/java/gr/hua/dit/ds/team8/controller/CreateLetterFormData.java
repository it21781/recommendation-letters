package gr.hua.dit.ds.team8.controller;

import com.sun.istack.NotNull;
import gr.hua.dit.ds.team8.services.LetterCreationParameters;



public class CreateLetterFormData {
    @NotNull
    private String student_fn;
    @NotNull
    private String student_ln;
    @NotNull
    private String teacher_fn;
    @NotNull
    private String teacher_ln;
    @NotNull
    private String email;


    public String getStudent_fn() {
        return student_fn;
    }

    public void setStudent_fn(String student_fn) {
        this.student_fn = student_fn;
    }

    public String getStudent_ln() {
        return student_ln;
    }

    public void setStudent_ln(String student_ln) {
        this.student_ln = student_ln;
    }

    public String getTeacher_fn() {
        return teacher_fn;
    }

    public void setTeacher_fn(String teacher_fn) {
        this.teacher_fn = teacher_fn;
    }

    public String getTeacher_ln() {
        return teacher_ln;
    }

    public void setTeacher_ln(String teacher_ln) {
        this.teacher_ln = teacher_ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LetterCreationParameters toParameters() {
        return new LetterCreationParameters(student_fn,student_ln,teacher_fn,teacher_ln,email);
    }
}
