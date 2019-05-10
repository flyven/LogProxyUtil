package com.flyven.util;

/**
 * @Author ZhuWen
 * @Date:2019/5/10 16:03
 */
public interface Logger {

    void debug(Object message);

    void info(Object message);

    void warn(Object message);

    void error(Object message);

    void fatal(Object message);

}
