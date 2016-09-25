package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.Menu;
import cn.edu.tju.labmaster.dao.MenuDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class MenuService extends BaseService<Menu, Long> {

    @Autowired
    private MenuDao menuDao;

    @Override
    protected BaseDao<Menu, Long> getDao() {
        return this.menuDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
