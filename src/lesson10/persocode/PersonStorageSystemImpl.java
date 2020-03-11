package lesson10.persocode;

import java.util.HashMap;
import java.util.Map;

public class PersonStorageSystemImpl implements PersonStorageSystem {

    private Map<String, Person> persons = new HashMap<>();

    @Override
    public void addNewPerson(Person person) throws DuplicatePersonalCodeException {
        String code = person.getCode();
        if (persons.containsKey(code)) {
            // exception
            DuplicatePersonalCodeException e = new DuplicatePersonalCodeException(code);
            throw e;
        } else {
            // ok
            persons.put(code, person);
        }
    }

    @Override
    public Person getPerson(String code) throws PersonNotFoundException {
        if (persons.containsKey(code)) {
            Person person = persons.get(code);
            return person;
        } else {
            PersonNotFoundException e = new PersonNotFoundException(code);
            throw e;
        }
    }

}
