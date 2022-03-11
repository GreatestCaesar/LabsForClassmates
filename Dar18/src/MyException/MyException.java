package MyException;

public class MyException extends Throwable {
    private String text;
    public MyException(){
        this.text = "Обнаружена цифра в слове";
    }

    @Override
    public String toString() {
        return "Моё исключение{" +
                "Ошибка='" + text + '\'' +
                '}';
    }
}
