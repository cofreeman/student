package com.nhnacademy.edu.springboot.student;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Account {

    @Id
    private Long id;
    private String number;

    private Integer balance;

}
