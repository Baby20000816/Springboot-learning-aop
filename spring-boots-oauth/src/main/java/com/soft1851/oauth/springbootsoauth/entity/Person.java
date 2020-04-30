package com.soft1851.oauth.springbootsoauth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author jh_wu
 * @ClassName Person
 * @Description TODO
 * @Date 2020/4/30:14:28
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull(message = "Id 不能为空")
    private String id;

    @Size(max = 30)
    @NotNull(message = "name不能为空")
    private String name;

    @Min(18)
    private Integer age;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号格式错误")
    @NotBlank(message = "手机号不能为空")
    private String phone;

    @NotNull(message = "email不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))",message = "sex 值不在可选范围")
    @NotNull(message = "sex 不能为空")
    private String sex;
}
