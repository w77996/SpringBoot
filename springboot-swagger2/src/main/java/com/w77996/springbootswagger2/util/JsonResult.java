package com.w77996.springbootswagger2.util;

import lombok.Data;

@Data
public class JsonResult {

    private String status = null;

    private Object result = null;
}
