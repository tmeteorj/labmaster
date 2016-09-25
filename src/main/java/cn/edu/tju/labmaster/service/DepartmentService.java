package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.Department;
import cn.edu.tju.labmaster.dao.DepartmentDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class DepartmentService extends BaseService<Department, Long> {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    protected BaseDao<Department, Long> getDao() {
        return this.departmentDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
