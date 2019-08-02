package cn.cwnu.webchat.controller;

import cn.cwnu.webchat.pojo.Account;
import cn.cwnu.webchat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("/account/{account}")
    public Account getAccountByAccount(@PathVariable("account") String account){
        return accountService.getAccountByAccount(account);
    }
    @GetMapping("/accounts")
    public List<Account> getAll(){
        return accountService.getAll();
    }
}
