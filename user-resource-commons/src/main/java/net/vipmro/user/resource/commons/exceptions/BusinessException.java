package net.vipmro.user.resource.commons.exceptions;

import lombok.Data;
import net.vipmro.user.resource.commons.enums.ResultCode;

/**
 * @author zhumaer
 * @desc 业务异常类
 * @since 9/18/2017 3:00 PM
 */
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 194906846739586856L;

    protected String code;

    protected String message;

    protected ResultCode resultCode;

    protected Object data;

    public BusinessException(ResultCode resultCode, Object data) {
        this(resultCode);
        this.data = data;
    }

    public BusinessException(ResultCode resultCode) {
    	super(resultCode.message());
        this.resultCode = resultCode;
        this.code = resultCode.code().toString();
        this.message = resultCode.message();
    }

}
