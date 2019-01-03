package net.vipmro.user.resource.commons.annoations.special;

import net.vipmro.user.resource.commons.result.PlatformResult;
import net.vipmro.user.resource.commons.result.Result;

import java.lang.annotation.*;

/**
 * @author lh
 * @desc 破坏基本规则的　特殊业务　该注解是为了适配　千帆商贸已使用的返回格式
 * @since 4/1/2018 3:00 PM
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QfsmResponseData {

    Class<? extends Result> value() default PlatformResult.class;

}
