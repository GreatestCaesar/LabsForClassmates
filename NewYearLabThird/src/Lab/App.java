package Lab;

public class App {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(20);
        linkQueue.insert(40);
        linkQueue.insert(90);
        linkQueue.insert(10);
        linkQueue.insert(80);
        linkQueue.insert(60);
        linkQueue.displayQueue();
        linkQueue.remove();
        linkQueue.remove();
        linkQueue.find();
        linkQueue.displayQueue();
    }
}
