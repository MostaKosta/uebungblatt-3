import java.util.Arrays ;
import java.util.Scanner;
class MinMax {
    public static void main (String[] args) {     
      Scanner sc= new Scanner (System.in);
        String str = sc.nextLine() ;
        // Error when no argument
        if (str.length()==0) {
          System.out.println("ERROR"); 
          System.exit(0) ;            
        }
        //Breaking the sentence into words
        String [] s = str.split(" ");
        int max= Integer.valueOf(s[0]);

        //finding the maximum of the list
        for (int i=1;i<=s.length;i++) {
            if (Integer.valueOf(s[i])>=max){
                max=Integer.valueOf(s[i]);
            }
        }

        // finding the minimum of the list
        int min=Integer.valueOf(s[0]);
        for (int i=1;i<=s.length;i++) {
            if (Integer.valueOf(s[i])<=min){
                max=Integer.valueOf(s[i]);
            }
        }
        
      System.out.println(min + "\n "+max );
      



    } 
}
    