package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2019年12月18日
 * @see
 * @since 1.0
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient1Application {

    @GetMapping("/user")
    public Authentication user(Authentication authentication){
        return authentication;
    }
    public static void main(String[] args) {
        SpringApplication.run(SsoClient1Application.class,args);
    }

}
