package com.flyven.util;

/**
 * @Author ZhuWen
 * @Date:2019/5/10 17:12
 */
public class LogMysqlUtil implements Logger{

    private LogMysqlUtil(){}

    private static final org.apache.log4j.Logger MYSQLLOG = org.apache.log4j.Logger.getLogger("MYSQLLOG");

    private static class LogProxyUtilInstance{
        private static final LogMysqlUtil INSTANCE = new LogMysqlUtil();
    }

    public static LogMysqlUtil getInstance(){
        return LogMysqlUtil.LogProxyUtilInstance.INSTANCE;
    }

    @Override
    public void debug(Object message){
        if (MYSQLLOG.isDebugEnabled()){
            MYSQLLOG.debug(message);
        }
    }

    @Override
    public void info(Object message){
        if (MYSQLLOG.isInfoEnabled()){
            MYSQLLOG.info(message);
        }
    }

    @Override
    public void warn(Object message){
        MYSQLLOG.warn(message);
    }

    @Override
    public void error(Object message){
        MYSQLLOG.error(message);
    }

    @Override
    public void fatal(Object message){
        MYSQLLOG.fatal(message);
    }
}
