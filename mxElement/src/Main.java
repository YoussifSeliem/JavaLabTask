import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        int mx=0;
        for (int i=0;i<arr.length;i++) {
            arr[i]=scanner.nextInt();
            if(mx<arr[i])mx=arr[i];
        }
        System.out.println(mx);
    }
}