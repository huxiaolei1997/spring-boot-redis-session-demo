package com.xlh.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年11月29日 18:57 胡晓磊 Exp $
 */
@RestController
public class SpringSessionController {

    @GetMapping(value = "/getSession")
    public String getSession(HttpSession session) {
        return session.getId();
    }
}
