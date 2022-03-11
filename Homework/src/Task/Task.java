package Task;

public class Task {
    public static void main(String[] args){
        int[] a = {-41,-42,0,-22,-69,-46,19,19,0,88,-87,12,-42,69,0,87,71,35,54,-34,-46,55,-50,30}; // ,87,71,35,54,-34,-46,55,-50,30,-35,95,34,28,-1,37,0,4
        int b = 0,k=a.length-1;
        int d = 0, t = (a.length)/2;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " | ");
        }

        System.out.println("\n----------------------------------------------------------------------");

        for(int i=1;i<a.length-1;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j] + "\t");
            }
            System.out.println();
            if(a[i]<-1) {
                d = a[i];
                a[i] = a[b];
                a[b] = d;
                b++;
                i=b;
                System.out.println(b);
            }
            if(a[i]>1){
                d = a[i];
                a[i] = a[k];
                a[k] = d;
                k--;
                //System.out.println(k);
            }
            if(a[i]==0){
                continue;
            }
        }
        /*for(int i=0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
         */
    }
}
