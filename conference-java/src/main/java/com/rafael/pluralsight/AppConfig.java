package com.rafael.pluralsight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.rafael.pluralsight"})
public class AppConfig {

  /*
  @Bean(name = "speakerService")
  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
  public SpeakerService getSpeakerService() {
    SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
    //SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
    // speakerService.setRepository(getSpeakerRepository());
    return speakerService;
  }

  @Bean(name = "speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new HibernateSpeakerRepositoryImpl();
  }
   */
}
