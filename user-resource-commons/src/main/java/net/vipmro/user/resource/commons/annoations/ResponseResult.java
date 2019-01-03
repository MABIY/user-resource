package net.vipmro.user.resource.commons.annoations;

import net.vipmro.user.resource.commons.result.PlatformResult;
import net.vipmro.user.resource.commons.result.Result;

import java.lang.annotation.*;

/**
 * @author lh
 * @desc 接口返回结果增强  会通过拦截器拦截后放入标记，在WebResponseBodyHandler进行结果处理
 * @since 2018-11-26
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {

    Class<? extends Result> value() default PlatformResult.class;

}
