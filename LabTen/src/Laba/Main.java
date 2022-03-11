package Laba;

public class Main {
    public static void main(String[] args){
         CorrespondenceStudent s = new CorrespondenceStudent("Юлиан", "Гисич", true, 0, true,5430);
         s.pay();
         System.out.println("-----------------------------------------------------------------------------");
         s.tru();
         System.out.println("-----------------------------------------------------------------------------");
         System.out.println(s.hostel());
         System.out.println("-----------------------------------------------------------------------------");
         System.out.println(s);
         System.out.println("-----------------------------------------------------------------------------");
         s.Cost();
         System.out.println("-----------------------------------------------------------------------------");
         System.out.println(s);
         System.out.println("-----------------------------------------------------------------------------");
    }
}
