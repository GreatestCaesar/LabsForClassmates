package MyException;

public class MyException extends Exception{
    private String err;

    public MyException(String err){
        this.err = err;
    }

    @Override
    public String toString() {
        System.out.println("╔═════════════════════════════════════════════════════════════════════════════");
        return "║ "+getClass()+":"+err+" не соответствует требуемому значению\n╚═════════════════════════════════════════════════════════════════════════════";
    }
}
