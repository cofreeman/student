package com.nhnacademy.edu.springboot.student;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<Account> getAccounts();
    Optional<Account> getAccount(Long id);
}
