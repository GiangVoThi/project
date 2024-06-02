package com.demo.lab1.Api;

import com.demo.lab1.Entity.RoLeE;
import com.demo.lab1.Repository.RoleRepository;
import com.demo.lab1.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api/role")
@RestController
public class RoleApi {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleService roleService;

    @GetMapping("/getAllRole")
    public ResponseEntity<?> doGetAllRole() {
        Map<String, Object> response = new HashMap();
        try {
            response.put("data", roleService.getAllRole());
            response.put("message", "data success");
            response.put("success", true);
        } catch (Exception e) {
            response.put("data", null);
            response.put("message", "data failed");
            response.put("success", false);
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("/saveRole")
    public ResponseEntity<?> saveRole(@RequestBody RoLeE role) {
        Map<String, Object> response = new HashMap();
        try {
            response.put("data", roleRepository.save(role));
            response.put("message", "data success");
            response.put("success", true);
        } catch (Exception e) {
            response.put("data",null);
            response.put("message", "data failed");
            response.put("success", false);
        }
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateRole")
    public ResponseEntity<?> updateRole(@RequestBody RoLeE role) {
        Map<String, Object> response = new HashMap();
        try{
            if (roleRepository.existsById(role.getRoleId())) {
                response.put("data", roleRepository.save(role));
                response.put("message", "data success");
                response.put("success", true);
            } else {
                response.put("data", null);
                response.put("message", "data failed");
                response.put("success", false);
            }
        } catch (Exception e) {
            response.put("data", null);
            response.put("message", "data failed");
            response.put("success", false);
            e.printStackTrace();

        }
        return ResponseEntity.ok(response);
    }
    @GetMapping("/findRoleById")
    public ResponseEntity<?> findRoleById(@RequestParam Integer roleId){
        Map<String, Object> response = new HashMap();
        try {
            response.put("data", roleService.findByRoleId(roleId));
            response.put("message", "data success");
            response.put("success", true);
        } catch (Exception e) {
            response.put("data", null);
            response.put("message", "data failed");
            response.put("success", false);
        }
        return ResponseEntity.ok(response);
    }
}
