package Exception;

public class MyException extends Exception{
    private String error;
    public MyException(){
        error = "Длина слова больше 16 символов";
    }

    public String toString(){
        return error;
    }
}
