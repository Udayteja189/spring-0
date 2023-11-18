package com.uday.springdemo.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    @Id
    private int id;
    private String name;
    private String department;
    private int age;
}
