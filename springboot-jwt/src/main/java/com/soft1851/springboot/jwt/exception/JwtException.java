package com.soft1851.springboot.jwt.exception;


import com.soft1851.springboot.jwt.common.ResultCode;

/**
 * @author jh_wu
 * @ClassName JwtException
 * @Description TODO
 * @Date 2020/4/15:16:54
 * @Version 1.0
 */
public class JwtException extends RuntimeException {

    protected ResultCode resultCode;

    public JwtException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}