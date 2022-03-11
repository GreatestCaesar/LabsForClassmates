package Task1;

public class Main {
    public static void main(String[] args){
        VideoPlayer v = new VideoPlayer("Sony",16,".mp3, .wav, .bmp, .aiff, .flac, .alac",10,"USA",2,"CD, DVD, Blu-ray-диски");
        System.out.println(v);
        v.numsongs();
        v.numtime();
        v.format(".exe");
        v.format(".bmp");
    }
}
