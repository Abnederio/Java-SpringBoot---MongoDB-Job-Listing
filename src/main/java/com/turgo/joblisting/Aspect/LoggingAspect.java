package com.turgo.joblisting.Aspect;
//AOP
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.turgo.joblisting.Model.Post;

import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.turgo.joblisting.Controller.PostController.getAllPosts())")
    public void logBefore(){
        LOGGER.info("getAll posts called from aspect");
    }

    @After("execution(* com.turgo.joblisting.Controller.PostController.getAllPosts())")
    public void logAfter(){
        LOGGER.info("getAll posts method Executed");
    }

}
