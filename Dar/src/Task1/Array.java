package Task1;

public class Array {
    public static void main(String[] args){
        int[] a = new int[15];
        int sum = 0;
        System.out.println("Ваш массив: ");
        for(int i=0;i<a.length;i++){
            a[i] = (int) ((0 + Math.random())*50);
            System.out.print(a[i] + "   ");
        }
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                sum+=a[i];
            }
        }
        System.out.println("\nСумма элементов = " + sum);
    }
}
