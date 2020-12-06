package edu.nf.ch05.service.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UserDaoImpl;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangl
 * @date 2020/12/1
 */
public class UserServiceImpl implements UserService {

    private UserDao userdao;

    public UserServiceImpl() {
    }

    /**
     * 构造方法注入
     * @param userdao
     */
    public UserServiceImpl(UserDao userdao) {
        this.userdao = userdao;
    }

    /**
     * 提供一个set方法给Spring容器，这个方法就是注入的入口方法。
     * 那么Spring就会调用这个方法，从容器中将一个UserDao的实现类
     * 给注入进来，赋值给上面的接口
     *
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.userdao = dao;
    }

    @Override
    public void add(Users user) {
        userdao.save(user);
    }
}
