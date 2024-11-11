package com.Infosys_Project1.Infosys_Project1.Controller;

import com.Infosys_Project1.Infosys_Project1.Entity.AdminDTO;
import com.Infosys_Project1.Infosys_Project1.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    public AdminService adminService;

    @GetMapping("/getAllAdmins")
    public List<AdminDTO> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/getAdminsById/{adminId}")
    public Optional<AdminDTO> getAdminById(@PathVariable Long adminId) {
        return adminService.getAdminById(adminId);
    }

    @PostMapping("/createAdmin")
    public String createAdmin(@RequestBody AdminDTO adminDTO) {
        adminService.createAdmin(adminDTO);
        return "Admin Created Successfully";
    }

    @PutMapping("/updateAdmin/{adminId}")
    public String updateAdmin(@PathVariable Long adminId, @RequestBody AdminDTO adminDTO) {
        adminService.updateAdmin(adminId, adminDTO);
        return "Admin Updated Successfully";
    }

    @DeleteMapping("/deleteAdmin/{adminId}")
    public String deleteAdmin(@PathVariable Long adminId) {
        adminService.deleteAdmin(adminId);
        return "Admin Deleted Successfully";
    }


}
