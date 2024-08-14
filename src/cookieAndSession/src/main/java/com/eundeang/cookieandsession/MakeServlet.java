package com.eundeang.cookieandsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/makeCookie")
public class MakeServlet extends HttpServlet {
    static int cooNum = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("쿠키 발급요청이 들어와서 쿠키 생성할거에용");

        //특정 컨벤션이 있으니, 웹 쿠키 검색해서 확인해볼것
        Cookie cookie = new Cookie("eundeangCookie"+cooNum, "hi"+cooNum);
        cookie.setMaxAge(60*5);
        cookie.setDomain("programmers.co.kr"); //ip+포트 정도를 도메인이라구 함, 이 메서드는 이 쿠키를 들고갈 도메인을 결정
        cookie.setPath("/checkCookie");

        //발급
        resp.addCookie(cookie);
        cooNum++;

        System.out.println(cookie);
    }
}
