package com.flyven.util;


/**
 * @Author ZhuWen
 * @Date:2019/5/10 15:44
 */
public class LogFileUtil implements Logger{

    private LogFileUtil(){}

    private static final org.apache.log4j.Logger FILE = org.apache.log4j.Logger.getLogger("FILE");

    private static class LogProxyUtilInstance{
        private static final LogFileUtil INSTANCE = new LogFileUtil();
    }

    public static LogFileUtil getInstance(){
        return LogProxyUtilInstance.INSTANCE;
    }

    @Override
    public void debug(Object message){
        if (FILE.isDebugEnabled()){
            FILE.debug(message);
        }
    }

    @Override
    public void info(Object message){
        if (FILE.isInfoEnabled()){
            FILE.info(message);
        }
    }

    @Override
    public void warn(Object message){
        FILE.warn(message);
    }

    @Override
    public void error(Object message){
        FILE.error(message);
    }

    @Override
    public void fatal(Object message){
        FILE.fatal(message);
    }

}
