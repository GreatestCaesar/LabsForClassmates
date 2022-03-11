package MyException;

public class MyException extends Exception{
    private int d;

    public MyException(int d){
        this.d = d;
    }

    public String toString(){
        return "Введенное число превышает допустимое на: " + d;
    }
}
