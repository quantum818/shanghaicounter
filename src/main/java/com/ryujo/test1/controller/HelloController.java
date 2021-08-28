package com.ryujo.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.*;
import  java.util.*;

@Controller
@RequestMapping("zqpsm")
public class HelloController {
    long times;
    @GetMapping
    @ResponseBody
    public String sblyf(){
        String zqpsm;
        zqpsm="朱企平你妈死了"+String.valueOf(times)+"次";
        times++;
        return zqpsm;
    }
}

