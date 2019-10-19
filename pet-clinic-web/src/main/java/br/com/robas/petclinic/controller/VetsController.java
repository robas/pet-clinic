package br.com.robas.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String listVets() {

        return "vets/index";
    }
}
