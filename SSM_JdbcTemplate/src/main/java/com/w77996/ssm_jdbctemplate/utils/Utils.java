package com.w77996.ssm_jdbctemplate.utils;

import java.sql.Timestamp;
import java.util.Date;

public class Utils {
    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(new Date().getTime());
    }
}
