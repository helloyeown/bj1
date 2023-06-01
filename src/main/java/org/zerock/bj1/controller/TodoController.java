package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/todo/")
public class TodoController {
    
    @GetMapping("list")
    public void list(){
        log.info("get    list.......");
    }

    @GetMapping("add")
    public void add(){
        log.info("get    add.........");
    }

    @PostMapping("add")
    public String add(){
        log.info("post    add...........");
        return "redirect:/todo/list";
    }

    @GetMapping("read/{tno}")
    public String readForm(@PathVariable("tno") long tno){
        log.info("get    read..........");
        return "/todo/read";
    }

    @GetMapping("modify/{tno}")
    public String modifyForm(@PathVariable("tno") long tno){
        log.info("get    modify.........");
        return "/todo/modify";
    }

    @PostMapping("modify/{tno}")
    public String modify(@PathVariable("tno") long tno){
        log.info("post    modify.........");
        return "redirect:/todo/read/" + tno;
    } 

    @PostMapping("remove")
    public String remove(){
        log.info("post    delete........")
        return "redirect:/todo/list";
    }

}
