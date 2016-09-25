package cn.edu.tju.labmaster.service;

import cn.edu.tju.labmaster.bean.User;
import cn.edu.tju.labmaster.dao.UserDao;
import cn.edu.tju.labmaster.dao.base.BaseDao;
import cn.edu.tju.labmaster.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 * @author lhd, lx, npt
 */
@Service
public class UserService extends BaseService<User, Long> {

    @Autowired
    private UserDao userDao;

    @Override
    protected BaseDao<User, Long> getDao() {
        return this.userDao;
    }

    // Customized Code Area Start

    // Customized Code Area End
}
