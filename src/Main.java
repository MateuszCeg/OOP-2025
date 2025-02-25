public class Main {
    public static void main(String[] args) {

        Point pkt1 = new Point();
        pkt1.x = 3;
        pkt1.y = 6;
        System.out.println(pkt1+"\n");
        pkt1.translate(8,11);
        System.out.println(pkt1);

    }
}