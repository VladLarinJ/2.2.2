package web.service;

public class incorrectParamException extends Throwable {
    public String getError() {
        return "Number's of cars can't be negative";
    }
}
