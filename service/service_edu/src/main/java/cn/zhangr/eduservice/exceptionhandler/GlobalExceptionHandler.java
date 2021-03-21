package cn.zhangr.eduservice.exceptionhandler;

import cn.zhangr.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public R error(Exception e){
//        e.printStackTrace();
//        return R.error().message("执行了全局异常处理");
//    }
//
//    @ExceptionHandler(ArithmeticException.class)
//    @ResponseBody
//    public R error(ArithmeticException e){
//        e.printStackTrace();
//        return R.error().message("执行了ArithmeticException异常处理");
//    }
//
//    @ExceptionHandler(GuliException.class)
//    @ResponseBody
//    public R error(GuliException e){
//        e.printStackTrace();
//        log.error(e.getMessage());
//        return R.error().message(e.getMsg()).code(e.getCode());
//    }
}
