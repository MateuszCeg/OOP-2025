import java.lang.reflect.Array;

public class Segment {
    public Point p1,p2;
    public double length() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
    public static Segment sort_segment(Segment[] arr){
        int n = Array.getLength(arr);
        int numb=0;
        double max=arr[0].length();
        for (int i = 1; i<n ; i++){
            if(max<arr[i].length()) {
                max = arr[i].length();
                numb = i;
            }
        }

        return arr[numb];
    }
}
