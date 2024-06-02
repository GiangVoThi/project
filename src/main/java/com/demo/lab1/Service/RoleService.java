package com.demo.lab1.Service;

import com.demo.lab1.Entity.RoLeE;
import com.demo.lab1.Status.RoleStatus;

import java.util.List;

public interface RoleService {
    List<RoLeE>getAllRole();
    RoLeE saveRole(RoLeE role);
    RoLeE updateRole(RoLeE role);
    RoLeE findByRoleId(Integer roleId);
}
