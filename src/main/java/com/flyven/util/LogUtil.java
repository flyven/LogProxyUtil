package com.flyven.util;


/**
 * @Description:
 * @Author: ZhuWen
 * @Date: 2019/6/4 16:27
 */
public class LogUtil implements Logger{

    private LogUtil(){}

    private org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());

    private static class LogProxyUtilInstance{
        private static final LogUtil INSTANCE = new LogUtil();
    }

    public static LogUtil getInstance(){
        return LogProxyUtilInstance.INSTANCE;
    }

    @Override
    public void debug(Object message) {
        if (log.isDebugEnabled()){
            log.debug(message);
        }
    }

    @Override
    public void info(Object message) {
        if (log.isInfoEnabled()){
            log.info(message);
        }
    }

    @Override
    public void warn(Object message) {
        log.warn(message);
    }

    @Override
    public void error(Object message) {
        log.error(message);
    }

    @Override
    public void fatal(Object message) {
        log.fatal(message);
    }

}
