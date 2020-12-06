package edu.nf.ch08.service.impl;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;

import java.util.List;

/**
 * @author wangl
 * @date 2020/12/2
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //通过set方法注入UserDao的实现类
    //注意：此时注入的就是mapperProxy代理对象
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Users> listUser() {
        return userDao.listUser();
    }
}
