package com.springsecurity.securityspring.Repository;

import com.springsecurity.securityspring.Models.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaireRepository extends JpaRepository<Beneficiaire,Long> {
}
