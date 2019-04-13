package com.example.demo;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppNameListener implements ApplicationListener<ContextRefreshedEvent> {
  //  private static Logger logger = LoggerFactory.getLogger(AppNameListener.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("容器启动--ApplicationReadyEvent------------------------------------------------");
      //  logger.info("容器启动");
    }
}
