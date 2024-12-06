package com.example.spring.repository;

import com.example.spring.model.Contact;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContactoRepository extends JpaRepository<Contact, Long> {
    
}
