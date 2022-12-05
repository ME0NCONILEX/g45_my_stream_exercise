package se.me0nly.service;
import se.me0nly.model.Person;
import java.util.List;

public interface People {

    People INSTANCE = PeopleImpl.getInstance();

    List<Person> getPeople();
}
