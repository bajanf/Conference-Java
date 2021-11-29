import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String args[]){

        ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        //SpeakerService service=new SpeakerServiceImp();
        SpeakerService service=appContext.getBean("speakerService", SpeakerService.class);

        System.out.print(service.findAll().get(0).getFirstName());
    }
}
