package gr.hua.dit.ds.team8.services;


import gr.hua.dit.ds.team8.entity.Letter;
import gr.hua.dit.ds.team8.repository.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/letter_check")
public class RequestServlet extends HttpServlet {

    @Autowired
    private LetterRepository letterRepository;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form LETTER REQUEST fields
        String st_fn = request.getParameter("student_fn");
        String st_ln = request.getParameter("student_ln");
        String t_fn = request.getParameter("teacher_fn");
        String t_ln = request.getParameter("teacher_ln");
        // String purp = request.getParameter("purpose");
        //String marks = request.getParameter("marks");
        String email = request.getParameter("email");


        Letter letter = new Letter();

        letter.setStudent_fn(st_fn);
        letter.setStudent_ln(st_ln);
        letter.setTeacher_fn(t_fn);
        letter.setTeacher_ln(t_ln);
        letter.setEmail(email);
        letter.setApproved(false);
        letterRepository.save(letter);
/*
        System.out.println(letter.getStudent_ln());
        System.out.println(letter.getStudent_fn());
        System.out.println(letter.getTeacher_fn());
        System.out.println(letter.getTeacher_ln());
        System.out.println(letter.getEmail());
*/
    }

}

