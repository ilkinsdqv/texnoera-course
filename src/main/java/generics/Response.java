package generics;

public class Response<T> {
    //Response<T> adlı class yaradın. Aşağıdakı field-ləri olsun:
    //T data
    //String message
    //int code
    //Constructor və getter metodlarını yazın.
    private T data;
    private String message;
    private int code;

    public Response(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public T getData() {
        return data;
    }
    public String getMessage() {
        return message;
    }
    public int getCode() {
        return code;
    }

}
