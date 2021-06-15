import java.util.ArrayList;
import java.util.List;

public class ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int times = 32;
        int res = 0;
        List<Integer> list = new ArrayList<>();

        //populating the list
        while(times > 0){
            int temp = n & 1;
            list.add(temp);
            n = n >> 1;
            times--;
        }

        for(int i = 0; i < list.size(); i++){
            res = res << 1;
            res = res | list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int res = reverseBits(00110);
        System.out.println(res);
    }
}
