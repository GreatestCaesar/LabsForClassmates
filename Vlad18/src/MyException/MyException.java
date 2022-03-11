package MyException;

public class MyException extends Exception{
    private int n;

    public MyException(int n){
        this.n = n;
    }

    public String toString(){
        return "Ключевое слово превышает слово зашифровки на "+ n + " символов";
    }
}
