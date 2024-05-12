package com.springsecurity.securityspring.Controllers;

import com.springsecurity.securityspring.Models.Beneficiaire;
import com.springsecurity.securityspring.Repository.BeneficiaireRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeneficiaireController {

    private final BeneficiaireRepository repository;

    public BeneficiaireController(BeneficiaireRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/beneficiaire")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<Beneficiaire> getAll(){
        return repository.findAll();
    }
}
