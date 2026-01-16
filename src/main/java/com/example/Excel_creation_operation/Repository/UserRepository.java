package com.example.Excel_creation_operation.Repository;

import com.example.Excel_creation_operation.Entity.UserEntity;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    @Query("select id from UserEntity where name=:name And rollno=:rollno")
    Long findIdByNameAndRollno (@Param("name") String name ,@Param("rollno") String rollno);

    @Query(value="select UserEntity.age" +
            "UserEntity.name" +
            "UserEntity.rollno" +
         "From UserEntity t" +

    )



    List<Tuple>fetchAllData (@Param("id") Long id, @Param("role") String role);
}
