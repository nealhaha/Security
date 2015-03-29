package com.security.dao;

import com.security.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author rui.deng  Date: 2015/3/9 Time: 23:34
 * @version 1.0.0
 */
@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 记录用户的登录日志
     *
     * @param logginLog
     */
    public void insertLoginLog(LoginLog logginLog) {
        String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) "
                + "VALUES(?,?,?)";
        Object[] args = {logginLog.getUserId(), logginLog.getIp(), logginLog.getLoginDate()};
        jdbcTemplate.update(sqlStr, args);
    }
}
