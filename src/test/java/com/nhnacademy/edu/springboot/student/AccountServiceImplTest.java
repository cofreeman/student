package com.nhnacademy.edu.springboot.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class AccountServiceImplTest {


    @Autowired
    AccountService accountService;

    @Test
    void  getAccount() {

        List<Account> accounts = accountService.getAccounts();

        assertThat(accounts).hasSize(1);
    }
}