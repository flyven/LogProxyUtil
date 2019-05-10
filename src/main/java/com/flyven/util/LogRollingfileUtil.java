package com.flyven.util;

/**
 * @Author ZhuWen
 * @Date:2019/5/10 17:12
 */
public class LogRollingfileUtil implements Logger{

    private LogRollingfileUtil(){}

    private static final org.apache.log4j.Logger ROLLINGFILE = org.apache.log4j.Logger.getLogger("ROLLINGFILE");

    private static class LogProxyUtilInstance{
        private static final LogRollingfileUtil INSTANCE = new LogRollingfileUtil();
    }

    public static LogRollingfileUtil getInstance(){
        return LogRollingfileUtil.LogProxyUtilInstance.INSTANCE;
    }

    @Override
    public void debug(Object message){
        if (ROLLINGFILE.isDebugEnabled()){
            ROLLINGFILE.debug(message);
        }
    }

    @Override
    public void info(Object message){
        if (ROLLINGFILE.isInfoEnabled()){
            ROLLINGFILE.info(message);
        }
    }

    @Override
    public void warn(Object message){
        ROLLINGFILE.warn(message);
    }

    @Override
    public void error(Object message){
        ROLLINGFILE.error(message);
    }

    @Override
    public void fatal(Object message){
        ROLLINGFILE.fatal(message);
    }
}
