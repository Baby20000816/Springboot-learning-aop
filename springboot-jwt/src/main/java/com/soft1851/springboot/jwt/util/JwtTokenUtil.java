package com.soft1851.springboot.jwt.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.soft1851.springboot.jwt.common.ResultCode;
import com.soft1851.springboot.jwt.exception.JwtException;
import lombok.extern.slf4j.Slf4j;
import com.auth0.jwt.exceptions.TokenExpiredException;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author jh_wu
 * @ClassName JwtTokenUtil
 * @Description TODO
 * @Date 2020/4/15:15:43
 * @Version 1.0
 **/
@Slf4j
public class JwtTokenUtil {
    /**
     * 加密
     *
     * @param userId
     * @param userRole
     * @param expiresAt
     * @return String
     */
    public static String getToken(final String userId, final String userRole, Date expiresAt) {
        String token = null;
        token = JWT.create()
                .withIssuer("auth0")
                .withClaim("userId", userId)
                .withClaim("userRole", userRole)
                .withExpiresAt(expiresAt)
                // 使用了HMAC256加密算法, mySecret是用来加密数字签名的密钥
                .sign(Algorithm.HMAC256(DigestUtils.md5Hex("mySecret")));

        return token;
    }

    /**
     * 解密
     *
     * @param token
     * @return DecodedJWT
     */
    public static DecodedJWT deToken(final String token) {
        DecodedJWT jwt;
        JWTVerifier verifier = null;

            verifier = JWT.require(Algorithm.HMAC256(("a5beb6624e092adf7be31176c3079e64")))
                    .withIssuer("auth0")
                    .build();
            assert  verifier !=null;
            try {
                jwt = verifier.verify(token);
        } catch (TokenExpiredException e) {
            throw new JwtException("token失效", ResultCode.USER_TOKEN_EXPIRES);
        }
        return jwt;
    }

    /**
     * 获取userId
     * @param token
     * @return String
     */
    public static String getUserId(String token) {
        return deToken(token).getClaim("userId").asString();
    }

    /**
     * 获取role
     * @param token
     * @return String
     */
    public static String getUserRole(String token) {
        return deToken(token).getClaim("userRole").asString();
    }

    /**
     * 验证是否过期
     *
     * @param token
     * @return boolean
     */
    public static boolean isExpiration(String token) {
        return deToken(token).getExpiresAt().before(new Date());
    }
}
