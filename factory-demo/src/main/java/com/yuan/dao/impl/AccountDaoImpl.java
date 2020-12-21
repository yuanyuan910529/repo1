package com.yuan.dao.impl;

import com.yuan.dao.AccountDao;

/**
 * @author zyl
 * @create 2020-12-08 15:01
 */
public class AccountDaoImpl  implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("账户保存成功!");
    }
}
