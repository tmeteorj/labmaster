package cn.edu.tju.labmaster.web;

import cn.edu.tju.labmaster.bean.RoleMenu;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.common.Response;
import cn.edu.tju.labmaster.service.RoleMenuService;
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
@RequestMapping("/roleMenu")
public class RoleMenuController extends BaseController<RoleMenu, Long> {

    private static Logger logger = LoggerFactory.getLogger(RoleMenuController.class);

    @Autowired
    private RoleMenuService roleMenuService;

    @Override
    protected BaseService<RoleMenu, Long> getService() {
        return this.roleMenuService;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response<Integer> save(@RequestBody RoleMenu roleMenu){
        logger.info("save: " + JSON.toJSONString(roleMenu));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseSave(roleMenu));
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
    public Response<Page<RoleMenu>> list (HttpServletRequest request){
        logger.info("list");
        RoleMenu roleMenu = JSON.parseObject(request.getParameter("roleMenu"), RoleMenu.class);
        Page<RoleMenu> page = JSON.parseObject(request.getParameter("page"), new TypeReference<Page<RoleMenu>>(){});
        Response<Page<RoleMenu>> response;
        try {
            response = new Response<Page<RoleMenu>>(baseList(roleMenu, page));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Page<RoleMenu>>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/detail")
    @ResponseBody
    public Response<RoleMenu> detail(@PathVariable Long id){
        logger.info("detail: " + JSON.toJSONString(id));
        Response<RoleMenu> response;
        try {
            response = new Response<RoleMenu>(baseView(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<RoleMenu>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    // Customized Code Area Start

    // Customized Code Area End
}