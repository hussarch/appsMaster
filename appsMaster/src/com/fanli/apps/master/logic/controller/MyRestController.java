package com.fanli.apps.master.logic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.xiao
 * Created on 2016年1月11日 上午10:44:25
 * © 2015 Fanli.com
 * 
 */
@RestController
public class MyRestController {

    @RequestMapping("/greeting")
    public GreatingMsg getMsg(){
        return new GreatingMsg("Hope", "Never give up in every satuation");
    }
    
    public class GreatingMsg{
        private String name;
        private String msg;
        
        public GreatingMsg(String name, String msg){
            this.name = name;
            this.msg = msg;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
        
    }
}
