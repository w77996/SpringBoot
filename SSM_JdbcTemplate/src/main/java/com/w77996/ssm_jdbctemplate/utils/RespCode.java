package com.w77996.ssm_jdbctemplate.utils;

/**
 * -100~-199 系统错误;-200~-299 参数错误;-300~-399 数据类型错误
 * 
 */
public enum RespCode {
	SYS_OK(0, "操作成功！"),
	SYS_EXP(1, "操作失败，请重试！"),
	SYS_ERR(2, "系统错误，请重试！"),
	SYS_AUTH(3, "您没有权限访问！"),
	ERR_PARAM(11, "请求参数非法！"),
	NOTEXIST_PARAM(12, "必要参数不存在！"),
	PHONE_INVALID(13, "电话号码不合法！"),
	SYS_ERR_NEED_OP(18, "系统错误，请联系管理员手动维护数据！"),
	API_DEPRECATED(19, "该接口已经被弃用！"),

	// user
	U_TOKEN_ERR(20, "用户身份信息失效，请重新登录！"),
	U_NOT_EXIST(21, "用户信息不存在！"),
	U_ALREADY_REGED(22, "该手机号已经注册！"),
	U_TEL_NOT_REGED(23, "该手机号尚未注册！"),
	U_AUTHCODE_NOTEXIST(24, "验证码不存在或已失效！"),
	U_AUTHCODE_ERR(25, "验证码错误！"),
	U_BINGDING_ERR(26, "设备绑定失败，请核对设备信息！"),
	U_USERNAME_PWD_ERR(27, "用户手机号或密码错误！"),
	U_INFO_INCOMPLETE(29, "用户信息不全，请补全信息！"),

	// 设备
	DEV_REQ_TYPE_ERR(30, "请求type错误！"),
	DEV_NOT_EXIST(31, "用户不存在！"),
	DEV_NOT_LOGIN(32, "设备没有登录！"),

	// sos白名单
	WL_ALREADY_EXIT(40, "该电话已经加入白名单");

	RespCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private int code;
	private String msg;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
