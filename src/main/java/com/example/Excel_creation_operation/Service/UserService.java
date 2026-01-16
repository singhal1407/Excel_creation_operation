package com.example.Excel_creation_operation.Service;

import com.example.Excel_creation_operation.Entity.UserEntity;
import com.example.Excel_creation_operation.Repository.UserRepository;
import jakarta.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public list<> saveData (List UserEntity)
    {
       Long id= UserRepository.findIdByNameAndRollno(String name,String rollno);
       if(id==null)
       {
           throw new RuntimeException("id is not found for particular name and rollno");
       }
       List<Tuple> UserRepository.fetchAllData(Long id,String roll);
       Workbook wb=new XSSFWorkbook();
       Sheet sheet=wb.createsheet();



    }
}
