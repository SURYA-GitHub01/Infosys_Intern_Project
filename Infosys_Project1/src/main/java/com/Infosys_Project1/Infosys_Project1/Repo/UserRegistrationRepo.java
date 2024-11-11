package com.Infosys_Project1.Infosys_Project1.Repo;

import com.Infosys_Project1.Infosys_Project1.Entity.UserRegistrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistrationDTO,Long> {
}
