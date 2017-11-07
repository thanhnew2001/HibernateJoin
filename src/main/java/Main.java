
import rmit.config.AppConfig;
import rmit.entity.Course;
import rmit.service.PersonService;
import rmit.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by CoT on 10/13/17.
 */
public class Main {


    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = (PersonService) context.getBean("personService");

        Person person = new Person();
        person.setName("henry");
        personService.savePerson(person);

        Course sadi = new Course();
        sadi.setName("Sadi");
        sadi.setPerson(person);
        personService.save(sadi);

        Course wp = new Course();
        wp.setName("Web programming");
        wp.setPerson(person);
        personService.save(wp);

        Person newPerson = personService.getPersonById(1);
        //Do nothing
        System.out.println(newPerson.getCourses().size());
        for(Course course: newPerson.getCourses()){
            System.out.println(course.getName());
        }

        Course newCourse = personService.getCourseById(1);
        System.out.println(newCourse.getPerson().getName());

    }

}
