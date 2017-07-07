import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int line_number = 0;
        for(;cin.hasNext();) {
            System.out.println(++line_number + "行目:" + cin.nextLine());
        }
    }
}
