package com.yuan.ui;

import com.yuan.factory.BeanFactory;
import com.yuan.service.AccountService;
import com.yuan.service.impl.AccountServiceImpl;

/**
 * @author zyl
 * @create 2020-12-08 15:03
 */
public class Client {

    public static void main(String[] args) {

//        AccountService accountService = new AccountServiceImpl();
        for (int i = 0; i < 5; i++) {
            AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }

    }


}
