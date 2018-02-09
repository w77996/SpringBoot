package com.w77996.ssm_jdbctemplate.exception;


import com.w77996.ssm_jdbctemplate.utils.RespCode;

/**
 * 业务异常
 * 
 */
public class BizException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6403032157266337458L;

	private int code;
	private String msg;

	public BizException() {
	}

	public BizException(int code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}

	public BizException(RespCode respCode) {
		super(respCode.getMsg());
		this.code = respCode.getCode();
		this.msg = respCode.getMsg();
	}

	public BizException(int code, String msg, Throwable e) {
		super(msg, e);
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
