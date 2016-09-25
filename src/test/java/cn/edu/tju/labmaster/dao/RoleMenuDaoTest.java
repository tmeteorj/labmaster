package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.RoleMenu;
import cn.edu.tju.labmaster.dao.RoleMenuDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For RoleMenuDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class RoleMenuDaoTest {

    @Autowired
    private RoleMenuDao roleMenuDao;

    @Test
    public void testInsertEntry() throws Exception {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRemark("inserted");
        int affectedRows = roleMenuDao.insertEntry(roleMenu);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = roleMenuDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setId(1L);
        int affectedRows = roleMenuDao.deleteByCondition(roleMenu);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setId(1L);
        roleMenu.setRemark("updated");
        int affectedRows = roleMenuDao.updateByKey(roleMenu);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        RoleMenu roleMenu = roleMenuDao.selectByKey(1L);
        assertTrue(roleMenu.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setId(1L);
        List<RoleMenu> roleMenuList = roleMenuDao.selectByCondition(roleMenu);
        assertTrue(roleMenuList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setId(1L);
        int count = roleMenuDao.selectCountByCondition(roleMenu);
        assertTrue(count == 1);
    }
}