package com.w77996.ssm_jdbctemplate.service.impl;

import com.w77996.ssm_jdbctemplate.entity.User;
import com.w77996.ssm_jdbctemplate.service.UserService;
import com.w77996.ssm_jdbctemplate.utils.PageParam;
import com.w77996.ssm_jdbctemplate.utils.Pagination;
import com.w77996.ssm_jdbctemplate.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public User getUserById(Long userId) {
        String sql = " SELECT * FROM t_user WHERE user_id = ?";
        List<User> list = jdbcTemplate.query(sql, new Object[] { userId },
                new BeanPropertyRowMapper<User>(User.class));
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        } else {
            logger.info("getLatest return null.id");
        }
        return null;
    }




    @Override
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        String sql = " SELECT * FROM t_user WHERE user_email = ? OR user_phone = ? AND user_state = ? order by id desc LIMIT 1";
        List<User> list = jdbcTemplate.query(sql, new Object[] { emailOrPhone,emailOrPhone, state },
                new BeanPropertyRowMapper<User>(User.class));
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        } else {
            logger.info("getLatest return null.phone");
        }
        return null;
    }
    @Override
    public List<User> getAllUser() {
        String sql = "select * from t_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        if (list != null && !list.isEmpty()) {
            return list;
        } else {
            logger.info("cannot find userinfo");
        }
        return null;
    }

    public boolean inserUser(String username,String phone,String email,String user_pwd) {
        Timestamp now = Utils.getCurrentTimestamp();
        int i = jdbcTemplate.update(
                "insert into t_user (user_name, user_phone, user_email, user_pwd, pwd_salt, create_time,modify_time,is_delete) values (?,?,?,?,?,?,?,?)",
                new Object[] { username, phone, email, user_pwd, phone, now,now,0 },
                new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP ,Types.TIMESTAMP ,Types.INTEGER });
        return i == 1;
    }

    @Override
    public boolean updateUser(String username,String phone,String email,String user_pwd) {
        Timestamp now = Utils.getCurrentTimestamp();
        int i = jdbcTemplate.update(
                "insert into t_user (user_name, user_phone, user_email, user_pwd, pwd_salt, create_time,modify_time,is_delete) values (?,?,?,?,?,?,?,?)",
                new Object[] { username, phone, email, user_pwd, phone, now,now,0 },
                new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP ,Types.TIMESTAMP ,Types.INTEGER });
        return i == 1;
    }

    @Override
    public Pagination<User> find(Long user_id,PageParam pageParam) {
        String sql = "select * from heart_rate where user_id=?";
        return new Pagination<User>(sql, new Object[] { user_id }, pageParam, jdbcTemplate, User.class);

    }
}