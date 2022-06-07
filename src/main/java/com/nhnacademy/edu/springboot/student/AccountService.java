package com.nhnacademy.edu.springboot.student;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<Account> getAccounts();
    Account getAccount(Long id);
    Account createAccount(Account account);
    void deleteAccount(Long id);
}
