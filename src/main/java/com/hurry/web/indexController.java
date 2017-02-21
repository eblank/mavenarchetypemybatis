package com.hurry.web;

import com.hurry.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luxp on 2017/2/20.
 */
@Controller
@RequestMapping("/default")
public class indexController {

    @RequestMapping
    @ResponseBody
    public User index() {

        User user = new User("小明", "xiaoMing", 10, "肉");
        return user;
    }
}
