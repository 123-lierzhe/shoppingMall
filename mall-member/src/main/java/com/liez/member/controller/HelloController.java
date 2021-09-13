package com.liez.member.controller;

import com.liez.common.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("")
    public R hello(){
        String msg = "你好，natapp";
        return R.oK().data("msg",msg);
    }
}
