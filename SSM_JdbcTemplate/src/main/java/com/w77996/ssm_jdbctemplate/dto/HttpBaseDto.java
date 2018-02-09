package com.w77996.ssm_jdbctemplate.dto;

import java.util.HashMap;
import java.util.Map;

import com.w77996.ssm_jdbctemplate.utils.Pagination;
import com.w77996.ssm_jdbctemplate.utils.RespCode;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class HttpBaseDto {

	protected int code;
	protected String message;
	protected Object data;

	public HttpBaseDto() {
		this.code = RespCode.SYS_OK.getCode();
		this.message = RespCode.SYS_OK.getMsg();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setPageData(Pagination pagination, Object data) {
		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("count", pagination.getTotalRows());
		dataMap.put("currentPage", pagination.getCurrentPage());
		dataMap.put("numsPerPage", pagination.getPageSize());
		dataMap.put("totalPages", pagination.getTotalPages());
		dataMap.put("data", data);
		this.data = dataMap;
	}
}
