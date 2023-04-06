package com.hanhf.demo.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String userId;
    private String userName;
}

