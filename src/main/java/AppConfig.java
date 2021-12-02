import com.conference.repository.HibernateSpeakerRepositoryImpl;
import com.conference.repository.SpeakerRepository;
import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImp;
import com.conference.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.conference"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calFactory()
    {
        CalendarFactory calendarFactory=new CalendarFactory();
        calendarFactory.addDays(33);
        return calendarFactory;
    }

    @Bean
    public Calendar cal() throws  Exception
    {
        return calFactory().getObject();
    }
/*
    @Bean(name="spe akerService")
    //@Scope(value = "singleton")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImp service= new SpeakerServiceImp(getSpeakerRepository());
        //SpeakerServiceImp service=new SpeakerServiceImp();
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return  new HibernateSpeakerRepositoryImpl();
    }*/




}
