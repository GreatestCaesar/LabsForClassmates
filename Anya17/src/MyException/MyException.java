package MyException;

public class MyException extends Exception{
    private String text;
    public MyException(){
        this.text = "Буквы повторяются!";
    }

    @Override
    public String toString() {
        return "Моё исключение{" +
                "Ошибка='" + text + '\'' +
                '}';
    }
}
