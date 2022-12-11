import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int r=scanner.nextInt(),c=scanner.nextInt();
        int [][]input= new int[r][c];
        int [][]output= new int[c][r];

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                input[i][j]= scanner.nextInt();

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                output[j][i]=input[i][j];

        for(int i=0;i<c;i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }


    }
}