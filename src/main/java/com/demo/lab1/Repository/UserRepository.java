package com.demo.lab1.Repository;

import com.demo.lab1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT user_id" +
            ",user_name,password" +
            ",fullname,address" +
            ",age" +
            ",role_id " +
            "FROM User  WHERE user_name = ?1", nativeQuery = true)
    List<User> findByUserName(@Param("userName") String userName);
}
