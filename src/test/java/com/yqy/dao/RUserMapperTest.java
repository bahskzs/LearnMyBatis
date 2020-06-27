package com.yqy.dao;

import com.yqy.datasource.DataConnection;
import com.yqy.entity.RUser;
import com.yqy.entity.RUserExample;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class RUserMapperTest {
    private DataConnection dataConnection = new DataConnection();
    private Logger logger = Logger.getLogger(String.valueOf(RUserMapperTest.class));
    @Test
    public void countByExample() throws IOException {
        SqlSession sqlSession = dataConnection.getSqlSession();
        RUserMapper rUserMapper = sqlSession.getMapper(RUserMapper.class);
        RUserExample rUserExample = new RUserExample();
        Long nums = rUserMapper.countByExample(rUserExample);
        logger.info("nums: "+nums);
    }
}