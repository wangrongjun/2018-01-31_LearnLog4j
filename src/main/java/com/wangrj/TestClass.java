package com.wangrj;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class TestClass {

    private Logger logger;

    @Before
    public void initLogger() {
        logger = Logger.getLogger("robin");
    }

    @Test
    public void testLog() {
        logger.info("info4234   得分v111");
    }

}
