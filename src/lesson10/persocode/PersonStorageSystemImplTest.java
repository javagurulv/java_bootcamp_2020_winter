package lesson10.persocode;

public class PersonStorageSystemImplTest {

    public static void main(String[] args) {
        PersonStorageSystemImplTest test = new PersonStorageSystemImplTest();
        test.shouldAddNewPersonCorrectly();
        test.shouldFailWithDuplicatePersonalCodeException();
        test.shouldGetPerson();
        test.shouldThrowPersonNotFoundExceptionWhenPersonNotFoundByCode();
    }

    public void shouldThrowPersonNotFoundExceptionWhenPersonNotFoundByCode() {
        PersonStorageSystem system = new PersonStorageSystemImpl();
        try {
            system.getPerson("1234");
            System.out.println("TEST FAIL!");
        } catch (PersonNotFoundException e) {
            System.out.println("OK!");
        }
    }

    public void shouldGetPerson() {
        Person person = new Person("Vasja", "Pupkin", "1234");
        PersonStorageSystem system = new PersonStorageSystemImpl();

        try {
            system.addNewPerson(person);
            Person getPerson = system.getPerson("1234");
            if (getPerson.equals(person)) {
                System.out.println("OK!");
            } else {
                System.out.println("TEST FAIL!");
            }
        } catch (DuplicatePersonalCodeException
                | PersonNotFoundException e) {
            System.out.println("TEST FAIL!");
        }
    }

    public void shouldFailWithDuplicatePersonalCodeException() {
        Person person = new Person("Vasja", "Pupkin", "1234");
        PersonStorageSystem system = new PersonStorageSystemImpl();
        try {
            system.addNewPerson(person);
            system.addNewPerson(person);
            System.out.println("TEST FAIL!");
        } catch (DuplicatePersonalCodeException e) {
            System.out.println("OK!");
        }
    }

    public void shouldAddNewPersonCorrectly() {
        Person person = new Person("Vasja", "Pupkin", "1234");
        PersonStorageSystem system = new PersonStorageSystemImpl();
        try {
            system.addNewPerson(person);
            Person realPerson = system.getPerson("1234");
            if (realPerson.equals(person)) {
                System.out.println("OK!");
            } else {
                System.out.println("TEST FAILED!");
            }
        } catch (DuplicatePersonalCodeException
                | PersonNotFoundException e) {
            System.out.println("TEST FAILED!");
        }
    }

}
