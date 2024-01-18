import java.util.ArrayList;
import java.util.List;

interface test{
     int abc1(int a);
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        List<Integer> list=new ArrayList<Integer>();
        for(Integer a : list){

        }
        test r= x-> 2;
        Runnable run=()->System.out.println("");
        Runnable run1=new Runnable() {
            @Override
            public void run() {
                System.out.println("")
            }
        };

    }
}
