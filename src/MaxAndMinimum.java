import java.util.Scanner;

public class MaxAndMinimum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter limit of array :");
        int limit = sc.nextInt();
        int  [] arr = new int[limit] ;
        System.out.println("Enter "+limit +"items :");
        for (int i = 0 ;i<limit;i++){
            arr [i] = sc.nextInt();
        }
        int min = arr[0] , max = arr[0] ;
        for (int i = 0 ; i< limit;i++){
            if (min > arr[i] ){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Min = "+min+"and Max = " +max);
    }


}
