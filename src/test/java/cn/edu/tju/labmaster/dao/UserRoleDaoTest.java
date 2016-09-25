package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.UserRole;
import cn.edu.tju.labmaster.dao.UserRoleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For UserRoleDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class UserRoleDaoTest {

    @Autowired
    private UserRoleDao userRoleDao;

    @Test
    public void testInsertEntry() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setRemark("inserted");
        int affectedRows = userRoleDao.insertEntry(userRole);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = userRoleDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        int affectedRows = userRoleDao.deleteByCondition(userRole);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        userRole.setRemark("updated");
        int affectedRows = userRoleDao.updateByKey(userRole);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        UserRole userRole = userRoleDao.selectByKey(1L);
        assertTrue(userRole.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        List<UserRole> userRoleList = userRoleDao.selectByCondition(userRole);
        assertTrue(userRoleList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        int count = userRoleDao.selectCountByCondition(userRole);
        assertTrue(count == 1);
    }
}