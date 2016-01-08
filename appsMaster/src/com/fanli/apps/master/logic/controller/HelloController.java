package com.fanli.apps.master.logic.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yi.xiao
 * Created on 2016年1月5日 上午9:11:55
 * © 2015 Fanli.com
 * 
 */
@Controller
public class HelloController {
    
    @RequestMapping("/hi.do")
    public String sayHi(Model model){
        model.addAttribute("msg", "Hello this is the first msg from 中文饿个");
        return "hello";
    }
    
    @RequestMapping(value = "/ajax.do",  produces = {"text/html;charset=UTF-8"})
    @ResponseBody
    public String ajax(){
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "中文 " + formatter.format(new Date());
    }
    
    @RequestMapping(path="/content", method=RequestMethod.GET)
    public ModelAndView getContent() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("contView");
        Map<String, Object> contentList = new HashMap<>();
        contentList.put("name", "好的gew");
        contentList.put("mp", new String[]{"a", "b", "各位"});
        mav.addObject("sampleContentList", contentList);
        return mav;
    }
    
}
