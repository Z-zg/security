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
        Account account1=new Account();
        account1.setAccount(account);
        return this.accountMapper.selectOne(account1);
    }
    public List<Account> getAll(){
        return this.accountMapper.selectAll();
    }
    public Account getAccountByPhone(String phone){
        Account account=new Account();
        account.setPhone(phone);
        return this.accountMapper.selectOne(account);
    }
}
