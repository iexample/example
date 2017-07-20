package com.upercy.iexample.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HelloWorld
 *
 * @author: fengwang
 * @date: 2017/7/20 20:13
 * @version: 1.0
 * @since: JDK 1.7
 */
public class HelloWorld {
    /**
     * 日志
     */
    private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    public void hello() {
        log.debug("Come on concurrency");

        log.debug("HelloWorld");
    }
}
