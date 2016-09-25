package cn.edu.tju.labmaster.web;

import cn.edu.tju.labmaster.bean.Department;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.common.Response;
import cn.edu.tju.labmaster.service.DepartmentService;
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
@RequestMapping("/department")
public class DepartmentController extends BaseController<Department, Long> {

    private static Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @Override
    protected BaseService<Department, Long> getService() {
        return this.departmentService;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response<Integer> save(@RequestBody Department department){
        logger.info("save: " + JSON.toJSONString(department));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseSave(department));
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
    public Response<Page<Department>> list (HttpServletRequest request){
        logger.info("list");
        Department department = JSON.parseObject(request.getParameter("department"), Department.class);
        Page<Department> page = JSON.parseObject(request.getParameter("page"), new TypeReference<Page<Department>>(){});
        Response<Page<Department>> response;
        try {
            response = new Response<Page<Department>>(baseList(department, page));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Page<Department>>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/detail")
    @ResponseBody
    public Response<Department> detail(@PathVariable Long id){
        logger.info("detail: " + JSON.toJSONString(id));
        Response<Department> response;
        try {
            response = new Response<Department>(baseView(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Department>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    // Customized Code Area Start

    // Customized Code Area End
}