package br.com.robas.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnersController {

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String listOwners() {
        return "owners/index";
    }
}
