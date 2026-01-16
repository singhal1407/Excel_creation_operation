package com.example.Excel_creation_operation.Controller;

import com.example.Excel_creation_operation.Entity.UserEntity;
import com.example.Excel_creation_operation.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

@RestController
public class UserController {

    @PostMapping("/Create Excel")
    public ResponseEntity<UserEntity> createExcel(@RequestBody UserEntity userEntity) {


        UserEntity userEntity = UserService.saveData(userEntity);
        return response.ok() userEntit

    }


}