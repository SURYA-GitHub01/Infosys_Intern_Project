package com.Infosys_Project1.Infosys_Project1.Service;

import com.Infosys_Project1.Infosys_Project1.Entity.AdminDTO;
import com.Infosys_Project1.Infosys_Project1.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    public AdminRepo adminRepo;


    public List<AdminDTO> getAllAdmins() {
        return adminRepo.findAll();
    }

    public Optional<AdminDTO> getAdminById(Long adminId) {
        return adminRepo.findById(adminId);
    }

    public AdminDTO createAdmin(AdminDTO adminDTO) {
        return adminRepo.save(adminDTO);
    }

    public AdminDTO updateAdmin(Long adminId, AdminDTO adminDTO) {
        AdminDTO admin = adminRepo.findById(adminId).orElseThrow(() ->
                new RuntimeException("Admin Not Found With This ID"));

        admin.setAdminName(adminDTO.getAdminName());
        admin.setPhoneNo(adminDTO.getPhoneNo());
        admin.setSocietyName(adminDTO.getSocietyName());
        admin.setSocietyAddress(adminDTO.getSocietyAddress());
        admin.setCity(adminDTO.getCity());
        admin.setDistrict(adminDTO.getDistrict());
        admin.setPostal(adminDTO.getPostal());
        return adminRepo.save(admin);
    }

    public void deleteAdmin(Long adminId) {
        adminRepo.deleteById(adminId);
    }
}
