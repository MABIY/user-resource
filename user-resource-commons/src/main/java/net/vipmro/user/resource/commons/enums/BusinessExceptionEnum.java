package net.vipmro.user.resource.commons.enums;

import org.springframework.http.HttpStatus;

/**
 * @author lh
 * @desc 异常、HTTP状态码、默认自定义返回码 映射类
 * @since 2018-11-26
 */
public enum BusinessExceptionEnum {
	
	/**
	 * 无效参数
	 */
	PARAMETER_INVALID(ResultCode.PARAM_IS_INVALID);
	
	private HttpStatus httpStatus;
	
	private ResultCode resultCode;
	
	BusinessExceptionEnum(ResultCode resultCode) {
		this.httpStatus = HttpStatus.OK;
		this.resultCode = resultCode;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	public ResultCode getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}
	
}
