package com.demo.lab1.Service.Impl;

import com.demo.lab1.Entity.RoLeE;
import com.demo.lab1.Repository.RoleRepository;
import com.demo.lab1.Service.RoleService;
import com.demo.lab1.Status.RoleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoLeE> getAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public RoLeE saveRole(RoLeE role) {
        return roleRepository.save(role);
    }

    @Override
    public RoLeE updateRole(RoLeE role) {
        if (roleRepository.existsById(role.getRoleId())) {
            return roleRepository.save(role);
        } else {
            return null;
        }
    }

    @Override
    public RoLeE findByRoleId(Integer roleId) {
        return roleRepository.findByRoleId(roleId);
    }
}


