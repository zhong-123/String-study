package edu.nf.ch12.service.impl;

import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.service.UserService;

/**
 * @author wangl
 * @date 2020/12/4
 */
public class StuServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("执行StuServiceImpl");
        userDao.add();
    }
}
