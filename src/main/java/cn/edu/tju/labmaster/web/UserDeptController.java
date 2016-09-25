package cn.edu.tju.labmaster.web;

import cn.edu.tju.labmaster.bean.UserDept;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.common.Response;
import cn.edu.tju.labmaster.service.UserDeptService;
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
@RequestMapping("/userDept")
public class UserDeptController extends BaseController<UserDept, Long> {

    private static Logger logger = LoggerFactory.getLogger(UserDeptController.class);

    @Autowired
    private UserDeptService userDeptService;

    @Override
    protected BaseService<UserDept, Long> getService() {
        return this.userDeptService;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response<Integer> save(@RequestBody UserDept userDept){
        logger.info("save: " + JSON.toJSONString(userDept));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseSave(userDept));
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
    public Response<Page<UserDept>> list (HttpServletRequest request){
        logger.info("list");
        UserDept userDept = JSON.parseObject(request.getParameter("userDept"), UserDept.class);
        Page<UserDept> page = JSON.parseObject(request.getParameter("page"), new TypeReference<Page<UserDept>>(){});
        Response<Page<UserDept>> response;
        try {
            response = new Response<Page<UserDept>>(baseList(userDept, page));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Page<UserDept>>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/detail")
    @ResponseBody
    public Response<UserDept> detail(@PathVariable Long id){
        logger.info("detail: " + JSON.toJSONString(id));
        Response<UserDept> response;
        try {
            response = new Response<UserDept>(baseView(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<UserDept>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    // Customized Code Area Start

    // Customized Code Area End
}