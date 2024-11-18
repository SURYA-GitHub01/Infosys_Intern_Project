package com.Infosys_Project1.Infosys_Project1.Service;

import com.Infosys_Project1.Infosys_Project1.Entity.UserRegistrationDTO;
import com.Infosys_Project1.Infosys_Project1.Repo.UserRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRegistrationService {
    @Autowired
    public UserRegistrationRepo userRegistrationRepo;

    public List<UserRegistrationDTO> getAllRegisteredUser() {
        return userRegistrationRepo.findAll();
    }

    public Optional<UserRegistrationDTO> getRegisteredUserById(Long userId) {
        return userRegistrationRepo.findById(userId);
    }

    public UserRegistrationDTO createUserRegistration(UserRegistrationDTO userRegistrationDTO) {
        return userRegistrationRepo.save(userRegistrationDTO);
    }

    public UserRegistrationDTO updateUserRegistration(Long userId, UserRegistrationDTO userRegistrationDTO) {
        UserRegistrationDTO userRegistration = userRegistrationRepo.findById(userId).orElseThrow(() ->
                new RuntimeException("User Not Found With This ID"));

        userRegistration.setEmail(userRegistration.getEmail());
        userRegistration.setPassword(userRegistration.getPassword());
        userRegistration.setRole(userRegistration.getRole());
        return userRegistrationRepo.save(userRegistrationDTO);

    }

    public void deleteRegisteredUserById(Long userId) {
        userRegistrationRepo.deleteById(userId);
    }
}
