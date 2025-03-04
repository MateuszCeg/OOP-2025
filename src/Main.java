public class Main {
    public static void main(String[] args) {

        Point pkt1 = new Point();
        pkt1.setX(3);
        pkt1.setY(6);
        System.out.println(pkt1+"\n");
        Point p2 = pkt1.translated(4,6);
        System.out.println(p2);
        System.out.println(pkt1);


        Segment[] arr = new Segment[3];
        for (int i = 0 ; i<3; i++) {
            arr[i] = new Segment();
            arr[i].p1 = new Point();
            arr[i].p2 = new Point();
        }
        arr[0].p1.setX(2);
        arr[0].p1.setY(3);

        arr[0].p2.setX(5);
        arr[0].p2.setY(8);

        arr[1].p1 = arr[1].p1.translated(2,5);
        arr[1].p2 = arr[1].p2.translated(2,5);

        arr[2].p1 = arr[1].p1.translated(1,3);
        arr[2].p2 = arr[1].p2.translated(2,0);

        Segment bigg;
        bigg = Segment.sort_segment(arr);
        System.out.println(bigg.p2);

        //Arrays.sort();
    }
}