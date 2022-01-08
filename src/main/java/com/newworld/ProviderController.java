package com.newworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by George on 2021/12/19.
 * ProviderController
 */
@RestController
public class ProviderController {

    private static Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.info("hello debug world " + new Date());
        logger.debug("hello debug world " + new Date());
        logger.error("hello debug world " + new Date());
        return "Hello World";
    }

}
