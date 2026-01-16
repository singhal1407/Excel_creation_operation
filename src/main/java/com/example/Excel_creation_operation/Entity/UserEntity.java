package com.example.Excel_creation_operation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class UserEntity {
    @Id
    private Long id;
    private String name;
    private String rolno;

}
