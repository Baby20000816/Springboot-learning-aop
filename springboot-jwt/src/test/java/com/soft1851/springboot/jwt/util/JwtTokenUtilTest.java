package com.soft1851.springboot.jwt.util;

import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * @ClassName Test
 * @Description TODO
 * @Author mq_xu
 * @Date 2020/4/15
 * @Version 1.0
 */
class JwtTokenUtilTest {

    public static void main(String[] args) {
        Date expiresAt = new Date(System.currentTimeMillis());
        // 生成token
        JwtTokenUtil encrypt = new JwtTokenUtil();
        String token = encrypt.getToken("1802333120","soft1851", expiresAt);

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        JwtTokenUtil decrypt = new JwtTokenUtil();
        DecodedJWT jwt = decrypt.deToken(token);
        System.out.println(jwt);

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("userId:  " + jwt.getClaim("userId"));
        System.out.println("userRole: " + jwt.getClaim("userRole").asString());
        System.out.println("过期时间：      " + jwt.getExpiresAt());

        long timeOut = System.currentTimeMillis();
        while (timeOut<=jwt.getExpiresAt().getTime()){
            timeOut=System.currentTimeMillis();
        }
        System.out.println("token已失效");
    }
}
