package com.example.core.constant.enums;

import lombok.Getter;

/**
 * @author weibb
 */
@Getter
public enum ResultCode {

    SUCCESS(200, "操作成功"),
    BAD_REQUEST(400, "请求参数错误"),
    UNAUTHORIZED(401, "未认证或登录已过期"),
    FORBIDDEN(403, "无访问权限"),
    NOT_FOUND(404, "接口不存在"),
    INTERNAL_ERROR(500, "服务器内部错误"),

    // 自定义业务错误码（1000~1999）
    BUSINESS_ERROR(1000, "业务处理失败"),
    VALIDATION_ERROR(1001, "参数校验失败");

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}