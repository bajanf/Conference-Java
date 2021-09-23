import com.conference.repository.HibernateSpeakerRepositoryImpl;
import com.conference.repository.SpeakerRepository;
import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImp service= new SpeakerServiceImp(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }


    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return  new HibernateSpeakerRepositoryImpl();
    }




}
