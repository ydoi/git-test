import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int count = 0;
        for(;cin.hasNext();) {
            System.out.println(++count + "s–Ú:" + cin.nextLine());
        }
    }
}