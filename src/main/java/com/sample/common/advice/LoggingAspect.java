package com.sample.common.advice;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** ログ出力のアスペクトクラス. */
@Aspect
@Component
@Slf4j
public class LoggingAspect {

    /** publicメソッドのポイントカット. システムエラーログ出力*/
    @Pointcut("execution(* com.sample..*.*(..))")
    private void publicLog() {}

    /** Daoアノテーションのポイントカット. db操作ログ出力 */
    @Pointcut("@within(org.springframework.stereotype.Repository)")
    private void dbLog() {}

    /** Controllerアノテーションのポイントカット. */
    @Pointcut("@within(org.springframework.stereotype.Controller)")
    private void controllerLog() {}

    /** Serviceアノテーションのポイントカット. */
    @Pointcut("@within(org.springframework.stereotype.Service)")
    private void serviceLog() {}

    /**
     * メソッド実行前にログ出力します.
     *
     * @param jp ジョインポイント
     */
    @Before("publicLog() && (dbLog() || controllerLog() || serviceLog())")
    public void doBefore(JoinPoint jp) {

        Signature sig = jp.getSignature();
        String args = "無し";
        if(jp.getArgs() != null && jp.getArgs().length > 0 ) {
            args = Arrays.toString(jp.getArgs());
        }
        log.info("【操作開始】クラス名：" + jp.getTarget().getClass().toString() + "." + "メソッド："+sig.getDeclaringTypeName());
    }

    /**
     * メソッド実行後にログ出力します.
     *
     * @param jp ジョインポイント
     */
    @AfterReturning(pointcut="publicLog() && (dbLog() || controllerLog() || serviceLog())", returning="returnValue")
    public void doAfterReturning(JoinPoint jp,Object returnValue) {
        Signature sig = jp.getSignature();
        log.info("【操作終了】クラス名：" + jp.getTarget().getClass().toString() + "." + "メソッド："+sig.getDeclaringTypeName() + "."+sig.getName()+"#戻り値：" + returnValue);
    }

    /**
     * エラーが発生した場合、ログ出力します.
     *
     * @param jp ジョインポイント
     */
    @AfterThrowing (pointcut="publicLog() && (dbLog() || controllerLog() || serviceLog())",throwing="ex")
    public void doAfterThrowing(JoinPoint jp,Exception ex) {
        Signature sig = jp.getSignature();
        StringWriter erMessage=new StringWriter();
        ex.printStackTrace(new PrintWriter(erMessage));
        log.info("【エラー】クラス名：" + jp.getTarget().getClass().toString() + "." + "メソッド："+sig.getDeclaringTypeName() + "."+sig.getName()+"#エラーメッセージ：" + erMessage.toString());

    }
}

