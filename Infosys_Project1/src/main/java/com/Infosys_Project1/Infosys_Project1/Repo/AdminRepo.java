package com.Infosys_Project1.Infosys_Project1.Repo;


import com.Infosys_Project1.Infosys_Project1.Entity.AdminDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<AdminDTO, Long> {
}
