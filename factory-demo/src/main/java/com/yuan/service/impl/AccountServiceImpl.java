package com.yuan.service.impl;

import com.yuan.dao.AccountDao;
import com.yuan.dao.impl.AccountDaoImpl;
import com.yuan.factory.BeanFactory;
import com.yuan.service.AccountService;

/**
 * @author zyl
 * @create 2020-12-08 15:02
 */
public class AccountServiceImpl  implements AccountService {

//    private int num = 1;
//        private AccountDao accountDao = new AccountDaoImpl();
    private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
//        num++;
    }
}
