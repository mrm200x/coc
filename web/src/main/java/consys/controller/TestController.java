package consys.controller;

import com.alibaba.fastjson.JSON;
import consys.model.TestUser;
import consys.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by HongBin on 2016/4/12.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("/json")
    @ResponseBody
    public String test(){
        return "11";
    }

    @RequestMapping("/leaf")
    public String leaf(){
        return "template/layout";
    }

    @RequestMapping("/easyui")
    public String eaysui(){
        return "admin/index";
    }

    @RequestMapping("/autojson")
    public String autojson(){
        return "test/autojson";
    }

    @RequestMapping("/leafset")
    public String leafet(Model model){
        model.addAttribute("username","乱码");
         return "test/leafset";
    }

    @RequestMapping("/fastJson")
    @ResponseBody
    public String fastJson(){
        TestUser u = new TestUser();
        u.setName("mu");
        u.setPassword("123");
        return JSON.toJSONString(u);
    }
}
