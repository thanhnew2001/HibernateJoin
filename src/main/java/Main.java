
import rmit.config.AppConfig;
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

        Person person1 = new Person();
        person1.setName("hoang");
        personService.savePerson(person1);

        List<Person> people1 = personService.getAllPersons();

        List<Person> people2 = personService.getPersonByName("h");

        List<Person> people3 = personService.getPersonByName2("h");

        List<Person> people4 = personService.getPersonByName3("h");

        Person person2 = personService.getPersonById(person.getId());
        System.out.println(person2.getName());

        Person person3 = personService.getPersonById(person1.getId());
        System.out.println(person3.getName());

        System.out.println(people2);

        System.out.println(people3);

        System.out.println(people4);

    }

}
