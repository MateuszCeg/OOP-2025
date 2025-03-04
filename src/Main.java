import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point pkt1 = new Point();
        pkt1.x = 3;
        pkt1.y = 6;
        System.out.println(pkt1+"\n");
        pkt1.translate(8,11);
        System.out.println(pkt1);
        System.out.println(pkt1);


        Segment[] arr = new Segment[3];
        arr[0].p1.x = 2;
        arr[0].p1.y = 3;
        arr[0].p2.x = 5;
        arr[0].p2.y = 8;

        arr[1].p1 = arr[1].p1.translated(2,5);
        arr[1].p2 = arr[1].p2.translated(6,1);

        arr[2].p1 = arr[1].p1.translated(1,3);
        arr[2].p2 = arr[1].p2.translated(2,3);

        //Arrays.sort();
    }
}