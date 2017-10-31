package com.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017-05-01.
 */
@Controller
public class IndexController {

    /**
     * 显示主页
     * @return
     */
    @RequestMapping("/index")
    public String showIndex() {
        return "index";

    }
}
