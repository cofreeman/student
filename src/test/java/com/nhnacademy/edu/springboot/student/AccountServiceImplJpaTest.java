package com.nhnacademy.edu.springboot.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AccountServiceImplJpaTest {

    @Autowired
    AccountRepository accountRepository;


    @Test
    void getAccounts() {

        Account account = new Account(1L,"sds",13);
        accountRepository.save(account);
        Optional<Account> findId = accountRepository.findById(account.getId());
        Optional<Account> finded = accountRepository.findByNumber(account.getNumber());

        assertThat(findId).isPresent();
        assertThat(findId.orElse(null)).isEqualTo(account);
        assertThat(finded).isPresent();
        assertThat(finded.orElse(null)).isEqualTo(account);

    }
}