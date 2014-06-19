package com.mkyong.common;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
import java.io.Serializable;
 
@ManagedBean(name="ajaxBean")
@SessionScoped
public class AjaxBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
 
	public String getName() {
	   return name;
	}
	public void setName(String name) {
	   this.name = name;
	}
	public String getSayWelcome(){
	   //check if null?
	   if("".equals(name) || name ==null){
		return "";
	   }else{
		return "Ajax message : Welcome " + name;
	   }
	}
}