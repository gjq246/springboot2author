package com.example.demo.vo;
/**
 *  JSON模型
 * 
  * 用户后台向前台返回的JSON对象
 * 
 */
import java.io.Serializable;

public class Json implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean success = false;

	private String msg = "";

	private Integer code = 200;

	private Object obj = null;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	

}
