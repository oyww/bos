package com.oyww.bos.web.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HellloAction extends ActionSupport {
   private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        System.out.println(name);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setHeader("Content-Type","text/html;charset=UTF-8");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name",name);
        return "success";
    }
}
