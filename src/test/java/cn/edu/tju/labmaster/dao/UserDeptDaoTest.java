package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.UserDept;
import cn.edu.tju.labmaster.dao.UserDeptDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For UserDeptDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class UserDeptDaoTest {

    @Autowired
    private UserDeptDao userDeptDao;

    @Test
    public void testInsertEntry() throws Exception {
        UserDept userDept = new UserDept();
        userDept.setRemark("inserted");
        int affectedRows = userDeptDao.insertEntry(userDept);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = userDeptDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        UserDept userDept = new UserDept();
        userDept.setId(1L);
        int affectedRows = userDeptDao.deleteByCondition(userDept);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        UserDept userDept = new UserDept();
        userDept.setId(1L);
        userDept.setRemark("updated");
        int affectedRows = userDeptDao.updateByKey(userDept);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        UserDept userDept = userDeptDao.selectByKey(1L);
        assertTrue(userDept.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        UserDept userDept = new UserDept();
        userDept.setId(1L);
        List<UserDept> userDeptList = userDeptDao.selectByCondition(userDept);
        assertTrue(userDeptList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        UserDept userDept = new UserDept();
        userDept.setId(1L);
        int count = userDeptDao.selectCountByCondition(userDept);
        assertTrue(count == 1);
    }
}