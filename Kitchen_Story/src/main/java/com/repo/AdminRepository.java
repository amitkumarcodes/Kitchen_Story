package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
    // Custom query methods can be added here if needed
}
