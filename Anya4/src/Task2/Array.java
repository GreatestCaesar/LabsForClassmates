package Task2;

public class Array {
    public static void main(String[] args){
        int[][] A = new int[10][10];
        System.out.println("Ваш массив: ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                A[i][j] = (int)(Math.random()*200-100);
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int max = A[0][0];
        for(int i=1;i< A.length;i++){
            for(int j=1;j< A.length;j++){
                if(A[i][j]<0){
                    if(max>A[i][j]){
                        max = A[i][j];
                    }
                }
            }
        }

        System.out.println("Число: " + max);
    }
}
