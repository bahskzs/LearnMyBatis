package com.yqy.dao;

import com.yqy.datasource.DataConnection;
import com.yqy.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.logging.Logger;

public class UserDaoTest {

    private DataConnection dataConnection = new DataConnection();
    private Logger logger = Logger.getLogger(String.valueOf(UserDaoTest.class));
    @Test
    public void getUserById() throws IOException {
        SqlSession sqlSession = dataConnection.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        logger.info("username :"+ user.getUserName());
        logger.info("userId :"+ user.getUserId());
    }
}