package com.turgo.joblisting.Aspect;
//AOP
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.turgo.joblisting.Model.Post;


@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.turgo.joblisting.Controller.PostController.getAllPosts())") //Before executiion
    public void logBefore(){
        LOGGER.info("getAll posts called from aspect");
    }

    @AfterReturning("execution(* com.turgo.joblisting.Controller.PostController.getAllPosts())") //After method execution
    public void logAfter(){
        LOGGER.info("getAll posts method Executed");
    }

    @AfterThrowing("execution(* com.turgo.joblisting.Controller.PostController.getAllPosts())") //When triggers Exception
    public void logException(){
        LOGGER.info("Issue");
    }

}
