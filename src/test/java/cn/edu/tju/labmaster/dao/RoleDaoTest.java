package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.Role;
import cn.edu.tju.labmaster.dao.RoleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For RoleDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class RoleDaoTest {

    @Autowired
    private RoleDao roleDao;

    @Test
    public void testInsertEntry() throws Exception {
        Role role = new Role();
        role.setRemark("inserted");
        int affectedRows = roleDao.insertEntry(role);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = roleDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        Role role = new Role();
        role.setId(1L);
        int affectedRows = roleDao.deleteByCondition(role);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        Role role = new Role();
        role.setId(1L);
        role.setRemark("updated");
        int affectedRows = roleDao.updateByKey(role);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        Role role = roleDao.selectByKey(1L);
        assertTrue(role.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        Role role = new Role();
        role.setId(1L);
        List<Role> roleList = roleDao.selectByCondition(role);
        assertTrue(roleList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        Role role = new Role();
        role.setId(1L);
        int count = roleDao.selectCountByCondition(role);
        assertTrue(count == 1);
    }
}