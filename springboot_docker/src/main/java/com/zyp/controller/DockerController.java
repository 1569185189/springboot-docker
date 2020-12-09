package com.zyp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/11/13 21:29
 */
@RestController
public class DockerController {
    @GetMapping("/docker")
    public String helloDocker(){
        return "hello docker";
    }
}
