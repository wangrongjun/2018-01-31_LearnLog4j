package com.wangrj;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

    private Logger logger = Logger.getLogger(TestClass.class);

    @Before
    public void initLogger() {
//        BasicConfigurator.configure();
    }

    @Test
    public void testLog() {
        for (int i = 1; i <= 200; i++) {
            logger.debug("debug_" + i);
            logger.info("info_" + i);
            logger.warn("warn_" + i);
            logger.error("error_" + i);
            logger.fatal("fatal_" + i);
        }
    }

}
