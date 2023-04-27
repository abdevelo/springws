package com.kbstar.controller;

import com.kbstar.dto.Item;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/item") // url에서 cust가 호출될 경우 담당할 controller를 만들어줘요
public class ItemController {
    @Autowired
    ItemService service;

    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    String dir = "item/";

    @RequestMapping("") // RequestMapping에 아무것도 적지 않으니 상위 클래스에 적힌 127.0.0.1/cust 시에 자동으로 실행될 클래스에요.
    public String main(Model model){
        model.addAttribute("left", dir+"left");
        model.addAttribute("center", dir+"center");
        return "index";
    }


    @RequestMapping("/add") // RequestMapping에 아무것도 적지 않으니 상위 클래스에 적힌 127.0.0.1/item 시에 자동으로 실행될 클래스에요.
    public String add(Model model){
        model.addAttribute("left", dir+"left");
        model.addAttribute("center", dir+"add");
        return "index";
    }

    @RequestMapping("/all") // RequestMapping에 아무것도 적지 않으니 상위 클래스에 적힌 127.0.0.1/item 시에 자동으로 실행될 클래스에요.
    public String all(Model model) {
        List<Item> list = null;
        try {
            list = service.get();
        } catch (Exception e) {
            log.info("에러...");
            e.printStackTrace();
        }
        model.addAttribute("allitem", list);
        model.addAttribute("left", dir+"left");
        model.addAttribute("center", dir+"all");
        return "index";
    }
}
