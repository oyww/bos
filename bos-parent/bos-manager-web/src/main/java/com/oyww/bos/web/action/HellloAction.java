package com.oyww.bos.web.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.oyww.bos.service.TestService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HellloAction extends ActionSupport {
   private String name;
   @Autowired
   private TestService testService;


    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        System.out.println(name);
        String say = testService.say(name);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setHeader("Content-Type","text/html;charset=UTF-8");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name",say);
        return "success";
    }
}
