package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.UserDept;
import cn.edu.tju.labmaster.dao.UserDeptDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class UserDeptService extends BaseService<UserDept, Long> {

    @Autowired
    private UserDeptDao userDeptDao;

    @Override
    protected BaseDao<UserDept, Long> getDao() {
        return this.userDeptDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
