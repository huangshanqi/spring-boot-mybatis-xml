package cn.evilcoder.tutorials.controller;

import cn.evilcoder.tutorials.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huangshanqi on 2017/7/20.
 */
@Controller
public class WelcomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/helloword", method = RequestMethod.GET)
    @ResponseBody
    public Object hellword() {
        return "hello word";
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Object findUserById(@PathVariable(value = "userId") long userId) {
        return userService.findById(userId);
    }


}
