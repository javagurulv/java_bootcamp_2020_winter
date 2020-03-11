package lesson10.persocode;

public interface PersonStorageSystem {

    void addNewPerson(Person person) throws DuplicatePersonalCodeException;

    Person getPerson(String code) throws PersonNotFoundException;

}
