package cn.edu.tju.labmaster.web;

import cn.edu.tju.labmaster.bean.Menu;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.common.Response;
import cn.edu.tju.labmaster.service.MenuService;
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
@RequestMapping("/menu")
public class MenuController extends BaseController<Menu, Long> {

    private static Logger logger = LoggerFactory.getLogger(MenuController.class);

    @Autowired
    private MenuService menuService;

    @Override
    protected BaseService<Menu, Long> getService() {
        return this.menuService;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Response<Integer> save(@RequestBody Menu menu){
        logger.info("save: " + JSON.toJSONString(menu));
        Response<Integer> response;
        try {
            response = new Response<Integer>(baseSave(menu));
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
    public Response<Page<Menu>> list (HttpServletRequest request){
        logger.info("list");
        Menu menu = JSON.parseObject(request.getParameter("menu"), Menu.class);
        Page<Menu> page = JSON.parseObject(request.getParameter("page"), new TypeReference<Page<Menu>>(){});
        Response<Page<Menu>> response;
        try {
            response = new Response<Page<Menu>>(baseList(menu, page));
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Page<Menu>>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/{id}/detail")
    @ResponseBody
    public Response<Menu> detail(@PathVariable Long id){
        logger.info("detail: " + JSON.toJSONString(id));
        Response<Menu> response;
        try {
            response = new Response<Menu>(baseView(id));
        } catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
            response = new Response<Menu>(e.getMessage());
        }
        logger.info("response: " + JSON.toJSONString(response));
        return response;
    }

    // Customized Code Area Start

    // Customized Code Area End
}