package sap.calm.task1.task1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long admissionNumber;

    String firstName;
    String lastName;
    Date dob;

    @Embedded
    Address address;

    char grade;

    @ElementCollection
    List<String> departments;



}
