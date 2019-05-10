package com.flyven.util;

/**
 * @Author ZhuWen
 * @Date:2019/5/10 17:12
 */
public class LogDlogfileUtil implements Logger{

    private LogDlogfileUtil(){}

    private static final org.apache.log4j.Logger DLOGFILE = org.apache.log4j.Logger.getLogger("DLOGFILE");

    private static class LogProxyUtilInstance{
        private static final LogDlogfileUtil INSTANCE = new LogDlogfileUtil();
    }

    public static LogDlogfileUtil getInstance(){
        return LogDlogfileUtil.LogProxyUtilInstance.INSTANCE;
    }

    @Override
    public void debug(Object message){
        if (DLOGFILE.isDebugEnabled()){
            DLOGFILE.debug(message);
        }
    }

    @Override
    public void info(Object message){
        if (DLOGFILE.isInfoEnabled()){
            DLOGFILE.info(message);
        }
    }

    @Override
    public void warn(Object message){
        DLOGFILE.warn(message);
    }

    @Override
    public void error(Object message){
        DLOGFILE.error(message);
    }

    @Override
    public void fatal(Object message){
        DLOGFILE.fatal(message);
    }
}
