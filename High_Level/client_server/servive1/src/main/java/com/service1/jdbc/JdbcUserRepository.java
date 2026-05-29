package com.service1.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUserRepository {
    

    @Autowired
    org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;

    public void createTable(){
        JdbcTemplate.execute("CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY,user_name VARCHAR(100),age INT)");

    }

    public void insertUser(String name,int age){
        String insertQuery = "INSERT INTO users(user_name,age) VALUES (?,?)";
        JdbcTemplate.update(insertQuery,name,age);
    }

    public List<JdbcUser> getUsers(){
        String selectQuery = "SELECT * FROM users";
        return JdbcTemplate.query(selectQuery,(rs,rowNum) -> {
            JdbcUser user = new JdbcUser();
            user.setUserId(rs.getInt("user_id"));
            user.setUsername(rs.getString("user_name"));
            user.setAge(rs.getInt("age"));
            return user;
        });
    }

}
