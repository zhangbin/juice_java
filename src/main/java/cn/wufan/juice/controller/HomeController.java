package cn.wufan.juice.controller;

import cn.wufan.juice.entity.Product;
import cn.wufan.juice.service.ProductService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by zhangbin on 2017/7/21.
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("/home/main")
    public String main(){
        return "web/main";
    }

    @RequestMapping("/")
    public String getHomePage(String name, Integer category, Model model) {

        model.addAttribute("products", productService.findAll(name, category));
        model.addAttribute("hots", productService.hots());
        return "web/home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        System.out.println("====login ========");
        return "login";
    }

}
