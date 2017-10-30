import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();


        if(a<=40)

                System.out.print(a*100);

        else
            System.out.print(4000+(a-40)*120);

    }
}
