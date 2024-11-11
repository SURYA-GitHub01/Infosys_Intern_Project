package com.Infosys_Project1.Infosys_Project1.Service;

import com.Infosys_Project1.Infosys_Project1.Entity.UserDTO;
import com.Infosys_Project1.Infosys_Project1.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private static UserRepo userRepo;

    public static List<UserDTO> getAllUsers() {
        return userRepo.findAll();
    }

    public static Optional<UserDTO> getUserById(Long userId) {
        return userRepo.findById(userId);
    }

    public static UserDTO createUser(UserDTO userDTO) {
        return userRepo.save(userDTO);
    }

    public static UserDTO saveUpdateUser(Long userId, UserDTO userDTO) {
        UserDTO user = userRepo.findById(userId).orElseThrow(() ->
                new RuntimeException("User Not Found With This ID"));

        user.setName(userDTO.getName());
        user.setPhoneNo(userDTO.getPhoneNo());
        user.setSocietyName(userDTO.getSocietyName());
        user.setFlatNo(userDTO.getFlatNo());
        user.setPostal(userDTO.getPostal());
        return userRepo.save(userDTO);
    }

    public static void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }
}
