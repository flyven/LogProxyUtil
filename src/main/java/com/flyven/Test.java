package com.flyven;

import com.flyven.util.LogDlogfileUtil;
import com.flyven.util.LogFileUtil;
import com.flyven.util.LogRollingfileUtil;

/**
 * @Author ZhuWen
 * @Date:2019/5/10 17:30
 */
public class Test {
    public static void main(String[] args) {

        LogFileUtil.getInstance().debug("logfile");

        LogDlogfileUtil.getInstance().debug("logdlogfile");

        LogRollingfileUtil.getInstance().debug("logrollingfile");

    }
}
