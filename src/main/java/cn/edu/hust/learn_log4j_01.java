package cn.edu.hust;

import org.apache.log4j.Logger;

public class learn_log4j_01 {

    private static Logger logger=Logger.getLogger(learn_log4j_01.class); // 获取logger实例

    public static void main(String[] args) {

        logger.fatal("fatal msg");
        logger.error("error msg");
        logger.warn("warn msg");
        logger.info("info msg");
        logger.debug("debug msg");
        logger.trace("tarce msg");

    }
}
