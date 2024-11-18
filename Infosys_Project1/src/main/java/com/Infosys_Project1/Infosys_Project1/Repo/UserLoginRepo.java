package com.Infosys_Project1.Infosys_Project1.Repo;

import com.Infosys_Project1.Infosys_Project1.Entity.UserLoginDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserLoginRepo extends JpaRepository<UserLoginDTO,Long> {
    Optional<UserLoginDTO> findByEmail(String email);
}
