package cn.edu.tju.labmaster.web;

import cn.edu.tju.labmaster.bean.User;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.common.Response;
import cn.edu.tju.labmaster.service.UserService;
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
@RequestMapping("/user")
public class UserController extends BaseController<User, Long> {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Override
    protected BaseService<User, Long> getService() {
        return this.userService;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response<Integer> save(@RequestBody User user){
        logger.info("save: " + JSON.toJSONString(user));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseSave(user));
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
    public Response<Page<User>> list (HttpServletRequest request){
        logger.info("list");
        User user = JSON.parseObject(request.getParameter("user"), User.class);
        Page<User> page = JSON.parseObject(request.getParameter("page"), new TypeReference<Page<User>>(){});
        Response<Page<User>> response;
        try {
            response = new Response<Page<User>>(baseList(user, page));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Page<User>>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/detail")
    @ResponseBody
    public Response<User> detail(@PathVariable Long id){
        logger.info("detail: " + JSON.toJSONString(id));
        Response<User> response;
        try {
            response = new Response<User>(baseView(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<User>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    // Customized Code Area Start

    // Customized Code Area End
}