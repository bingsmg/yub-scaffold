package com.example.core.util;

import com.example.core.constant.enums.BizServiceEnum;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

import static com.example.core.constant.enums.ResultCode.INTERNAL_ERROR;
import static com.example.core.constant.enums.ResultCode.SUCCESS;

/**
 * 响应信息主体
 *
 * @param <T>
 * @author weibb
 */
@Data
public class R<T> implements Serializable {

	@Serial
	private static final long serialVersionUID = -6453746264876022296L;

	private boolean success;
	private int code;
	private String msg;
	private T data;

	public static <T> R<T> ok() {
		return restResult(true, SUCCESS.getCode(), SUCCESS.getMessage(), null);
	}

	public static <T> R<T> ok(T data) {
		return restResult(true, SUCCESS.getCode(), SUCCESS.getMessage(), data);
	}

	public static <T> R<T> ok(T data, String msg) {
		return restResult(true, SUCCESS.getCode(), msg, data);
	}

	public static <T> R<T> failed() {
		return restResult(false, INTERNAL_ERROR.getCode(), INTERNAL_ERROR.getMessage(), null);
	}


	public static <T> R<T> failed(BizServiceEnum bizServiceEnum) {
		return restResult(false, bizServiceEnum.getCode(), bizServiceEnum.getMsg(), null);
	}

	public static <T> R<T> failed(String msg) {
		return restResult(false, INTERNAL_ERROR.getCode(), msg, null);
	}

	public static <T> R<T> failed(int code,String msg) {
		return restResult(false, code, msg, null);
	}

	public static <T> R<T> failed(T data) {
		return restResult(false, INTERNAL_ERROR.getCode(), INTERNAL_ERROR.getMessage(), null);
	}

	public static <T> R<T> failed(T data, String msg) {
		return restResult(false, INTERNAL_ERROR.getCode(), INTERNAL_ERROR.getMessage(), data);
	}

	private static <T> R<T> restResult(boolean success, int code, String msg, T data) {
		R<T> apiResult = new R<>();
		apiResult.setCode(code);
		apiResult.setData(data);
		apiResult.setMsg(msg);
		return apiResult;
	}

}
