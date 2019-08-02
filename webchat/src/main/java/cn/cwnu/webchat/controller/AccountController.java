package cn.cwnu.webchat.controller;

import cn.cwnu.webchat.pojo.Account;
import cn.cwnu.webchat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    @PostMapping("/login")
    public String login(HttpServletRequest request, ModelAndView mv, HttpSession session){
        String phone=request.getParameter("phone");
        String password=request.getParameter("password");
        Account account=accountService.getAccountByPhone(phone);
        if (account.getPassword().equals(password)){
            mv.setViewName("chat");
            session.setAttribute("account",account);
            return "true";
        }
        else {
            mv.setViewName("login");
            mv.addObject("msg","电话或密码错误");
            return "false";
        }
    }
}
