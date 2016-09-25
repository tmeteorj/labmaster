package cn.edu.tju.labmaster.dao;

import cn.edu.tju.labmaster.bean.Department;
import cn.edu.tju.labmaster.dao.DepartmentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Test Class For DepartmentDao
 * @author lhd, lx, npt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class DepartmentDaoTest {

    @Autowired
    private DepartmentDao departmentDao;

    @Test
    public void testInsertEntry() throws Exception {
        Department department = new Department();
        department.setRemark("inserted");
        int affectedRows = departmentDao.insertEntry(department);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Long id = 1L;
        int affectedRows = departmentDao.deleteByKey(id);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testDeleteByCondition() throws Exception {
        Department department = new Department();
        department.setId(1L);
        int affectedRows = departmentDao.deleteByCondition(department);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testUpdateByKey() throws Exception {
        Department department = new Department();
        department.setId(1L);
        department.setRemark("updated");
        int affectedRows = departmentDao.updateByKey(department);
        assertTrue(affectedRows == 1);
    }

    @Test
    public void testSelectByKey() throws Exception {
        Department department = departmentDao.selectByKey(1L);
        assertTrue(department.getId() == 1L);
    }

    @Test
    public void testSelectByCondition() throws Exception {
        Department department = new Department();
        department.setId(1L);
        List<Department> departmentList = departmentDao.selectByCondition(department);
        assertTrue(departmentList.size() == 1);
    }

    @Test
    public void testSelectCountByCondition() throws Exception {
        Department department = new Department();
        department.setId(1L);
        int count = departmentDao.selectCountByCondition(department);
        assertTrue(count == 1);
    }
}