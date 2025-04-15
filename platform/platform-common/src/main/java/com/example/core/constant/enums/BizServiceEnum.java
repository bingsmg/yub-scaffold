package com.example.core.constant.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author weibb
 */
@Getter
@RequiredArgsConstructor
public enum BizServiceEnum {
    PHONE_EXIST(10001,"该手机号码已经注册！");
    private final int code;
    private final String msg;
}
