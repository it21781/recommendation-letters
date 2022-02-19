package gr.hua.dit.ds.team8.controller;

import gr.hua.dit.ds.team8.services.LetterService;
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


@Controller
@RequestMapping("/")
public class LetterController {
    private final LetterService service;

    public LetterController(LetterService service) {
        this.service = service;
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
        model.addAttribute("letters", service.getLetters());
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        System.out.println(username);

        return "/letter_check";
    }

}