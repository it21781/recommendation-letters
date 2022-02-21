package gr.hua.dit.ds.team8.controller;

import gr.hua.dit.ds.team8.entity.Letter;
import gr.hua.dit.ds.team8.services.LetterService;
import gr.hua.dit.ds.team8.services.LetteridService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Iterator;


@Controller
@RequestMapping("/")
public class LetterController {
    private final LetterService service;
    private final LetteridService serviceid;

    public LetterController(LetterService service, LetteridService serviceid) {
        this.service = service;
        this.serviceid = serviceid;
    }

    @GetMapping("/letter_request")
    public String showCreateUserForm(Model model) {
        model.addAttribute("formData", new CreateLetterFormData());
        return "/letter_request";
    }

    @PostMapping("/letter_request")
    public String doCreateLetter(@Valid @ModelAttribute("formData") CreateLetterFormData formData,
                                 BindingResult bindingResult,
                                 Model model) {
        if (bindingResult.hasErrors()) {
            return "/letter_request";
        }

        service.createLetter(formData.toParameters());

        return "redirect:/letter_request/success";
    }

    @GetMapping("/letter_check")
    public String listLetters(Model model) {

        ArrayList<Letter> Letters = new ArrayList();
        Letters.addAll(service.getLetters());
        Iterator<Letter> iter = Letters.iterator();

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }

        while (iter.hasNext()) {
            if (iter.next().toString().contains(username.substring(0, 1).toUpperCase() + username.substring(1))) {
                continue;
            }
            iter.remove();
        }
        model.addAttribute("letters", Letters);
        model.addAttribute("formId", new CreateLetteridFormData());

        return "/letter_check";
    }

    @PostMapping("/letter_check")
    public String doCreateLetterid(@Valid @ModelAttribute("formId") CreateLetteridFormData formId,
                                 BindingResult bindingResult,
                                 Model model) {
        if (bindingResult.hasErrors()) {
            return "/letter_check";
        }

        String letterid = String.valueOf(serviceid.createLetterid(formId.toParameters()));
        System.out.println(letterid);

        return "redirect:/letter_request/success";
    }

}