package cn.edu.tju.labmaster.web;

import cn.edu.tju.labmaster.bean.UserRole;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.common.Response;
import cn.edu.tju.labmaster.service.UserRoleService;
import cn.edu.tju.labmaster.service.base.BaseService;
import cn.edu.tju.labmaster.web.base.BaseController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller
 * @author lhd, lx, npt
 */
@Controller
@RequestMapping("/userRole")
public class UserRoleController extends BaseController<UserRole, Long> {

    private static Logger logger = LoggerFactory.getLogger(UserRoleController.class);

    @Autowired
    private UserRoleService userRoleService;

    @Override
    protected BaseService<UserRole, Long> getService() {
        return this.userRoleService;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response<Integer> save(@RequestBody UserRole userRole){
        logger.info("save: " + JSON.toJSONString(userRole));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseSave(userRole));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Integer>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/delete")
    @ResponseBody
    public Response<Integer> delete(@PathVariable Long id){
        logger.info("delete: " + JSON.toJSONString(id));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseDelete(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Integer>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/list")
    @ResponseBody
    public Response<Page<UserRole>> list (HttpServletRequest request){
        logger.info("list");
        UserRole userRole = JSON.parseObject(request.getParameter("userRole"), UserRole.class);
        Page<UserRole> page = JSON.parseObject(request.getParameter("page"), new TypeReference<Page<UserRole>>(){});
        Response<Page<UserRole>> response;
        try {
            response = new Response<Page<UserRole>>(baseList(userRole, page));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Page<UserRole>>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/detail")
    @ResponseBody
    public Response<UserRole> detail(@PathVariable Long id){
        logger.info("detail: " + JSON.toJSONString(id));
        Response<UserRole> response;
        try {
            response = new Response<UserRole>(baseView(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<UserRole>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    // Customized Code Area Start

    // Customized Code Area End
}