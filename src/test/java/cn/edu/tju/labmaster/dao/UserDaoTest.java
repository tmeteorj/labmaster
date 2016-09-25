package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.User;
import cn.edu.tju.labmaster.dao.UserDao;
import cn.edu.tju.labmaster.enums.EmDeletedMark;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For UserDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertEntry() throws Exception {
        User user = new User();
        user.setRemark("inserted");
        user.setDeletedMark(EmDeletedMark.VALID.getCode());
        int affectedRows = userDao.insertEntry(user);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = userDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        User user = new User();
        user.setId(1L);
        int affectedRows = userDao.deleteByCondition(user);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        User user = new User();
        user.setId(1L);
        user.setRemark("updated");
        int affectedRows = userDao.updateByKey(user);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        User user = userDao.selectByKey(1L);
        assertTrue(user.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        User user = new User();
        user.setId(1L);
        List<User> userList = userDao.selectByCondition(user);
        assertTrue(userList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        User user = new User();
        user.setId(1L);
        int count = userDao.selectCountByCondition(user);
        assertTrue(count == 1);
    }
}