package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.UserRole;
import cn.edu.tju.labmaster.dao.UserRoleDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class UserRoleService extends BaseService<UserRole, Long> {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    protected BaseDao<UserRole, Long> getDao() {
        return this.userRoleDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
