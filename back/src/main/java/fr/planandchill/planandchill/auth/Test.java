package fr.planandchill.planandchill.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @GetMapping("/123")
    public String test() {
        logger.info("TEST");
        return "Controller is working!";
    }
}
