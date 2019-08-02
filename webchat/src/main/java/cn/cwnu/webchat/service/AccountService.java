package cn.cwnu.webchat.service;

import cn.cwnu.webchat.mapper.AccountMapper;
import cn.cwnu.webchat.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;
    public Account getAccountByAccount(String account){
        return this.accountMapper.selectOneByExample(account);
    }
    public List<Account> getAll(){
        return this.accountMapper.selectAll();
    }
}
