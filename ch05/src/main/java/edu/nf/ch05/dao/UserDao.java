package edu.nf.ch05.dao;

import edu.nf.ch05.entity.Users;

/**
 * @author wangl
 * @date 2020/12/1
 */
public interface UserDao {
    /**
     * 添加用户
     * @param user
     */
    void save(Users user);
}
