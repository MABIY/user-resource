package net.vipmro.user.resource.commons.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.vipmro.user.resource.commons.enums.ResultCode;
import net.vipmro.user.resource.commons.exceptions.BusinessException;
import net.vipmro.user.resource.commons.util.RequestContextUtil;
import net.vipmro.user.resource.commons.util.StringUtil;
import org.springframework.http.HttpStatus;

import java.util.Date;

/**
 * @author lh
 * @desc 默认全局错误返回结果
 * 备注：该返回信息是spring boot的默认异常时返回结果{@link }，目前也是我们服务的默认返回结果
 * @since 2018-11-26
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DefaultErrorResult implements Result {

    private static final long serialVersionUID = 1899083570489722793L;

    /**
     * HTTP响应状态码 {@link HttpStatus}
     */
    private Integer status;

    /**
     * HTTP响应状态码的英文提示
     */
    private String error;

    /**
     * 异常堆栈的精简信息
     */
    private String message;

    /**
     * 我们系统内部自定义的返回值编码，{@link ResultCode} 它是对错误更加详细的编码
     * <p>
     * 备注：spring boot默认返回异常时，该字段为null
     */
    private Integer code;

    /**
     * 调用接口路径
     */
    private String path;

    /**
     * 异常的名字
     */
    private String exception;

    /**
     * 异常的错误传递的数据
     */
    private Object errors;

    /**
     * 时间戳
     */
    private Date timestamp;

    public static DefaultErrorResult failure(ResultCode resultCode, Throwable e, HttpStatus httpStatus, Object errors) {
        DefaultErrorResult result = DefaultErrorResult.failure(resultCode, e, httpStatus);
        result.setErrors(errors);
        return result;
    }

    public static DefaultErrorResult failure(ResultCode resultCode, Throwable e, HttpStatus httpStatus) {
        String path = RequestContextUtil.getRequest().getRequestURI();
        return DefaultErrorResult.builder()
                .code(resultCode.code())
                .message(resultCode.message())
                .status(httpStatus.value())
                .error(httpStatus.getReasonPhrase())
				.exception(e.getClass().getName())
                .path(path)
                .timestamp(new Date())
                .build();
    }
    
    public static DefaultErrorResult failure(ResultCode resultCode, Throwable e) {
        String path = RequestContextUtil.getRequest().getRequestURI();
        return DefaultErrorResult.builder()
				.code(resultCode.code())
                .message(resultCode.message())
                .status(HttpStatus.OK.value())
                .error(HttpStatus.OK.getReasonPhrase())
                .exception(e.getClass().getName())
                .path(path)
                .timestamp(new Date())
                .build();
    }
    
    public static DefaultErrorResult failure(BusinessException e) {
        DefaultErrorResult defaultErrorResult = DefaultErrorResult.failure(e.getResultCode() == null ? ResultCode.SUCCESS : e.getResultCode(), e, HttpStatus.OK, e.getData());
        if (StringUtil.isNotEmpty(e.getMessage())) {
            defaultErrorResult.setMessage(e.getMessage());
        }
        return defaultErrorResult;
    }
    
    
}
