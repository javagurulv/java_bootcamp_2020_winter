package lesson10.persocode;

public class DuplicatePersonalCodeException extends Exception {

    private String duplicateCode;

    public DuplicatePersonalCodeException(String duplicateCode) {
        this.duplicateCode = duplicateCode;
    }

    public String getDuplicateCode() {
        return duplicateCode;
    }
}
