package com.mw.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class KickStart {
    @GetMapping(value = {"/index", "/"})
    @ResponseBody
    public Map testJson() {
        Map map = new HashMap();
        map.put("time", LocalDateTime.now());
        return map;
    }
}