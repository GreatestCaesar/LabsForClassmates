package MyException;

public class MyException extends Exception{
    private int n;

    public MyException(int n){
        this.n = n;
    }

    public String toString(){
        return "Вы ввели " + n + " из 16 допустимых символов";
    }
}
