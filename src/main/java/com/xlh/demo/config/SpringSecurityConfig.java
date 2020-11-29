package com.xlh.demo.config;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年11月29日 19:00 胡晓磊 Exp $
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author kongfutech
 * @version securityConfig: SecurityConfig.java, v 0.1 2019-06-24 19:26 kongfutech Exp $
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    // Authentication : Admin --> Roles
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(
                org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).withUser("admin").password("haha").roles("ADMIN");
    }

    // Authorization : Role -> Access
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers("/").hasRole("ADMIN").anyRequest()
                .authenticated();
    }
}

