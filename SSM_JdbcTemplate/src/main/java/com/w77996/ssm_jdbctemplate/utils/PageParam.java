package com.w77996.ssm_jdbctemplate.utils;

public class PageParam {
	/**
	 * 默认为10条
	 */
	public static final int PAGE_SIZE = 10;
	/**
	 * 起始页码
	 */
	private int page = 1;

	/**
	 * 每页显示条数
	 */
	private int limit = PAGE_SIZE;
	/**
	 * 排序字段
	 */
	private String sort;
	/**
	 * asc or desc
	 */
	private String dir = "desc";

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("page:" + page + "\n");
		sb.append("limit:" + limit + "\n");
		sb.append("sort:" + sort + "\n");
		sb.append("dir:" + dir);
		return sb.toString();
	}
}