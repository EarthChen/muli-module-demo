package com.earthchen.spring.boot.form;

import com.earthchen.spring.boot.validator.annotation.IsIdNumber;
import com.earthchen.spring.boot.validator.annotation.IsPhoneNumber;
import lombok.Data;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Data
public class UserForm {

    @IsPhoneNumber
    private String phoneNumber;

    @IsIdNumber
    private String idNumber;
}
