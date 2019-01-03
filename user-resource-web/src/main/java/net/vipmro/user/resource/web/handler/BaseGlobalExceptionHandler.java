package net.vipmro.user.resource.web.handler;

import lombok.extern.slf4j.Slf4j;
import net.vipmro.user.resource.commons.enums.ResultCode;
import net.vipmro.user.resource.commons.exceptions.BusinessException;
import net.vipmro.user.resource.commons.result.DefaultErrorResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lh
 * @desc 全局异常处理基础类
 * @since 2018-11-26
 */
@Slf4j
public class BaseGlobalExceptionHandler {
	
	// /**
	//  * 处理验证参数封装错误时异常
	//  */
	// protected DefaultErrorResult handleConstraintViolationException(HttpMessageNotReadableException e, HttpServletRequest request) {
	// 	log.info("handleConstraintViolationException start, uri:{}, caused by: ", request.getRequestURI(), e);
	// 	return DefaultErrorResult.failure(ResultCode.PARAM_IS_INVALID, e, HttpStatus.BAD_REQUEST);
	// }
	//
	// /**
	//  * 处理参数绑定时异常（反400错误码）
	//  */
	// protected DefaultErrorResult handleBindException(BindException e, HttpServletRequest request) {
	// 	log.info("handleBindException start, uri:{}, caused by: ", request.getRequestURI(), e);
	// 	List<ParameterInvalidItem> parameterInvalidItemList = ParameterInvalidItemHelper.convertBindingResultToMapParameterInvalidItemList(e.getBindingResult());
	// 	return DefaultErrorResult.failure(ResultCode.PARAM_IS_INVALID, e, HttpStatus.BAD_REQUEST, parameterInvalidItemList);
	// }
	//
	// /**
	//  * 处理使用@Validated注解时，参数验证错误异常（反400错误码）
	//  */
	// protected DefaultErrorResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
	// 	log.info("handleMethodArgumentNotValidException start, uri:{}, caused by: ", request.getRequestURI(), e);
	// 	List<ParameterInvalidItem> parameterInvalidItemList = ParameterInvalidItemHelper.convertBindingResultToMapParameterInvalidItemList(e.getBindingResult());
	// 	return DefaultErrorResult.failure(ResultCode.PARAM_IS_INVALID, e, HttpStatus.BAD_REQUEST, parameterInvalidItemList);
	// }
	
	
	/**
	 * 处理运行时系统异常（反500错误码）
	 */
	protected ResponseEntity<DefaultErrorResult> handleException(Exception e, HttpServletRequest request) {
		log.error("handleRuntimeException start, uri:{}, caused by: ", request.getRequestURI(), e);
		DefaultErrorResult defaultErrorResult = DefaultErrorResult.failure(ResultCode.SYSTEM_INNER_ERROR, e);
		return ResponseEntity
				.status(HttpStatus.valueOf(defaultErrorResult.getStatus()))
				.body(defaultErrorResult);
	}
	
	/**
	 * 处理通用自定义业务异常
	 */
	protected ResponseEntity<DefaultErrorResult> handleBusinessException(BusinessException e, HttpServletRequest request) {
		log.info("handleBusinessException start, uri:{}, exception:{}, caused by: {}", request.getRequestURI(), e.getClass(), e.getMessage());
		DefaultErrorResult defaultErrorResult = DefaultErrorResult.failure(e);
		return ResponseEntity
				.status(HttpStatus.valueOf(defaultErrorResult.getStatus()))
				.body(defaultErrorResult);
	}
	
	/**
	 * 处理运行时系统异常（反500错误码）
	 */
	protected DefaultErrorResult handleRuntimeException(RuntimeException e, HttpServletRequest request) {
		log.error("handleRuntimeException start, uri:{}, caused by: ", request.getRequestURI(), e);
		return DefaultErrorResult.failure(ResultCode.SYSTEM_INNER_ERROR, e, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
