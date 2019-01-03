package net.vipmro.user.resource.web.handler;

import net.vipmro.user.resource.commons.exceptions.BusinessException;
import net.vipmro.user.resource.commons.result.DefaultErrorResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lh
 * @desc 统一异常处理器
 * @since 2018-11-26
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler extends BaseGlobalExceptionHandler {
	
	// /** 处理400类异常 */
	// @Override
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(ConstraintViolationException.class)
	// public DefaultErrorResult handleConstraintViolationException(ConstraintViolationException e, HttpServletRequest request) {
	// 	return super.handleConstraintViolationException(e, request);
	// }
	//
	// @Override
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(HttpMessageNotReadableException.class)
	// public DefaultErrorResult handleConstraintViolationException(HttpMessageNotReadableException e, HttpServletRequest request) {
	// 	return super.handleConstraintViolationException(e, request);
	// }
	//
	// @Override
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(BindException.class)
	// public DefaultErrorResult handleBindException(BindException e, HttpServletRequest request) {
	// 	return super.handleBindException(e, request);
	// }
	//
	// @Override
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(MethodArgumentNotValidException.class)
	// public DefaultErrorResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
	// 	return super.handleMethodArgumentNotValidException(e, request);
	// }
	
	@Override
	@ExceptionHandler(Exception.class)
	public ResponseEntity<DefaultErrorResult> handleException(Exception e, HttpServletRequest request) {
		return super.handleException(e, request);
	}
	
	@Override
	@ExceptionHandler(BusinessException.class)
	protected ResponseEntity<DefaultErrorResult> handleBusinessException(BusinessException e, HttpServletRequest request) {
		return super.handleBusinessException(e, request);
	}
	
	/** 处理运行时异常 */
	// @Override
	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	// @ExceptionHandler(RuntimeException.class)
	// public DefaultErrorResult handleRuntimeException(RuntimeException e, HttpServletRequest request) {
	// 	//TODO 可通过邮件、微信公众号等方式发送信息至开发人员、记录存档等操作
	// 	return super.handleRuntimeException(e, request);
	// }
	
}
