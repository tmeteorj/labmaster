package cn.edu.tju.labmaster.common;

public class Response<T> {
    private boolean isSuccessful;
    private String message;
    private T result;

    public Response() {
    }

    public Response(T result) {
        this.isSuccessful = true;
        this.result = result;
    }

    public Response(String message) {
        this.isSuccessful = false;
        this.message = message;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
