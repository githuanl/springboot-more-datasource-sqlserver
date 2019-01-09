package cn.centersoft.controller;


import cn.centersoft.model.p.ManuCenterRepository;
import cn.centersoft.model.s.UserRepository;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: lh
 * @Date: 2019/1/9 17:47
 * @Description:
 */
@Controller
@RestController
public class BaseController {

    @Resource
    UserRepository userRepository;

    @Resource
    ManuCenterRepository manuCenterRepository;


    @RequestMapping("u" )
    public String getUser() {
        return JSON.toJSONString(userRepository.findAll());
    }

    @RequestMapping("c" )
    public String getCenter() {
        return JSON.toJSONString(manuCenterRepository.findAll());
    }


}
