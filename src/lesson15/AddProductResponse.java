package lesson15;

public class AddProductResponse {

    private boolean success;
    private String errorMessage;

    public AddProductResponse(boolean success,
                              String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
