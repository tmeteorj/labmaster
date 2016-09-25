package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.Role;
import cn.edu.tju.labmaster.dao.RoleDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class RoleService extends BaseService<Role, Long> {

    @Autowired
    private RoleDao roleDao;

    @Override
    protected BaseDao<Role, Long> getDao() {
        return this.roleDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
