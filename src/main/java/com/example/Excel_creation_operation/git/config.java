package com.example.Excel_creation_operation.git;

import com.example.Excel_creation_operation.Repository.UserRepository;
import jakarta.persistence.Tuple;

import java.util.List;

public class config {


    public list<> saveData(List UserEntity) {
        Long id = UserRepository.findIdByNameAndRollno(String name, String rollno);
        if (id == null) {
            throw new RuntimeException("id is not found for particular name and rollno");
        }
        List<Tuple> UserRepository.fetchAllData(Long id, String roll);
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createsheet();
    }
}
