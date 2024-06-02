package com.demo.lab1.Repository;

import com.demo.lab1.Entity.RoLeE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoLeE, Integer> {
    @Query(value = " SELECT role_id, role_name  , description\n" +
                   " FROM role\n" +
                   " WHERE role_id = ?1", nativeQuery = true)
    RoLeE findByRoleId(Integer roleId);
}
