package com.demo.lab1.Api;

import com.demo.lab1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api-user")
public class UserApi {
    @Autowired
    private UserService userService;
    @GetMapping("getAllUser")
    public ResponseEntity<?> doGetAllUser(@RequestParam String userName){
        Map<String,Object> result = new HashMap();
        try {
            result.put("success",true);
            result.put("message","Call api succes");
            result.put("data",userService.findByUserName(userName));
        }catch (Exception e){
            result.put("success",false);
            result.put("message","Call api fail");
            result.put("data",null);
        }
        return ResponseEntity.ok(result);
    }
}
