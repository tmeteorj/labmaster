package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.Menu;
import cn.edu.tju.labmaster.dao.MenuDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For MenuDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class MenuDaoTest {

    @Autowired
    private MenuDao menuDao;

    @Test
    public void testInsertEntry() throws Exception {
        Menu menu = new Menu();
        menu.setRemark("inserted");
        int affectedRows = menuDao.insertEntry(menu);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = menuDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        Menu menu = new Menu();
        menu.setId(1L);
        int affectedRows = menuDao.deleteByCondition(menu);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        Menu menu = new Menu();
        menu.setId(1L);
        menu.setRemark("updated");
        int affectedRows = menuDao.updateByKey(menu);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        Menu menu = menuDao.selectByKey(1L);
        assertTrue(menu.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        Menu menu = new Menu();
        menu.setId(1L);
        List<Menu> menuList = menuDao.selectByCondition(menu);
        assertTrue(menuList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        Menu menu = new Menu();
        menu.setId(1L);
        int count = menuDao.selectCountByCondition(menu);
        assertTrue(count == 1);
    }
}