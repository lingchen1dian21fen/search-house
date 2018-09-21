package com.cbo.entity;

import com.cbo.SearchHouseApplicationTests;
import com.cbo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: chengbo
 * @Date: 2018/9/20
 */
public class UserRepositoryTest extends SearchHouseApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        Assert.assertEquals("chengbo",user.getName());
    }

}
