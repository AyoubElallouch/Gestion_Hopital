package com.elallouch.projet.repositories;

import com.elallouch.projet.entities.Medecin;
import com.elallouch.projet.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Page<Medecin> findByNomContains(String key, Pageable pageable);
}
