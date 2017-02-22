package it.pkg.web;

import it.pkg.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * Created by luxp on 2017/2/20.
 */
@Controller
@RequestMapping("/")
public class indexController {

    @RequestMapping
    @ResponseBody
    public User index() {
        Charset charset = Charset.forName("UTF-8");

        User user = new User("小明", "xiaoMing", 10, new Date(), "肉");
        return user;
    }
}
