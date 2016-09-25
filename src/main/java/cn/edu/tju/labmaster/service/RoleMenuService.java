package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.RoleMenu;
import cn.edu.tju.labmaster.dao.RoleMenuDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class RoleMenuService extends BaseService<RoleMenu, Long> {

    @Autowired
    private RoleMenuDao roleMenuDao;

    @Override
    protected BaseDao<RoleMenu, Long> getDao() {
        return this.roleMenuDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
