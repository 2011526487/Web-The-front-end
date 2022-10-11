package java作业;
import java.util.Arrays;
import java.util.Scanner;
public class 实验二 {
    public static void main ( String[] args ) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int b = 0;
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "输入第一个查找的数" );
        int number = sc.nextInt ( );
        int redix = -1;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[ i ] == number ) {
                redix = i;
                break;
            }
        }

        Arrays.sort ( arr );
        int head = 0;
        int end = arr.length - 1;
        int c = 0;
        while (head <= end) {
            c = c + 1;
            int mdile = mdile = ( head + end ) / 2;
            if ( number == arr[ mdile ] ) {
                break;
            }
            else if ( number < arr[ mdile ] ) {
                end = mdile - 1;
            }
            else {
                head = mdile + 1;
            }

        }

        int suoyin = redix;

        if ( suoyin != -1 ) {
            System.out.println ( "try " + c + "," + "pos " + suoyin );
        }
        else {
            System.out.println ( "try " + c + "," + "not found" );
        }


    }
}