package lesson10.persocode;

public class PersonNotFoundException extends Exception {

    private String incorrectCode;

    public PersonNotFoundException(String incorrectCode) {
        this.incorrectCode = incorrectCode;
    }

    public String getIncorrectCode() {
        return incorrectCode;
    }

}
