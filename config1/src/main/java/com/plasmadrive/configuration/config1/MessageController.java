package com.plasmadrive.configuration.config1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private MyBean myBean;

    public MessageController(MyBean myBean) {
        this.myBean = myBean;
    }

    @RequestMapping("/message")
    public String message() {
        return myBean.getMessage();
    }
}
