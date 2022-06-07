package com.nhnacademy.edu.springboot.student;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Student {

    private final String name;
    private final int score;
}
