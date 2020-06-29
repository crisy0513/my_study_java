package com.example.demo_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author wangchenxin
 * @desc spring security 配置类
 * @date 2020/6/28  16:22
 * @desc
 */

@Configuration
@EnableWebSecurity//开启websecurity功能
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启方法级别的保护（在进入方法钱进行权限验证）
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserService userService;
    /**
     * 做了spring security的基本配置，并通过AuthenticationManagerBuilder对象在内存中创建了一个认证用户的信息，该用户名为admin密码为1234有ROOT角色。
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("root").password(new BCryptPasswordEncoder().encode("1234")).roles("ROOT","USER");
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("admin").password(new BCryptPasswordEncoder().encode("1234")).roles("ADMIN");
        auth.userDetailsService(userService);
    }

    /**
     * 配置HttpSecurity
     * @param httpSecurity
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/css/**","/login").permitAll()//不需要验证
                .antMatchers("/user/**").hasRole("USER")//限定角色
                .antMatchers("/blog/**").hasRole("USER")//限定角色
                .and()
                .formLogin().loginPage("/login").failureForwardUrl("/login-error")//登陆是login，登陆失败
                .and()
                .exceptionHandling().accessDeniedPage("/sorry");//异常处理重定向
        httpSecurity.logout().logoutSuccessUrl("/login");//注销登陆成功重定向到登录页
    }
}
