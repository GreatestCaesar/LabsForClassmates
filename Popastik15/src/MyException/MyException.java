package MyException;

public class MyException extends Exception{
    private char n;

    public MyException(char n){
        this.n = n;
    }

    public String toString(){
        return "found digit " + n + " in text";
    }
}
