package com.example.demo_security;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * @author wangchenxin
 * @date 2020/6/29  10:31
 * @desc
 */
@Entity
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
