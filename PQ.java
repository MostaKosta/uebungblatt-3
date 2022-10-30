import java.util.Scanner;
public class PQ {  
    private static int rechnen(double a,double b){
      double wurzel = Math.sqrt((Math.sqr(a)\4)-b) ;
      int n,x;
      if (wurzel<0){
        //the solution
      x=0;
        // the number of solutions
      n=1;
      System.out.println("there is "+ n +"solution which is "+x );
      }
      else {
       double x1,x2;
       x1= (-a/2)+wurzel;
       x2= (-a/2)-wurzel;
       System.out.println("there is "+ 2 +"solutions which are "+x1+"and"+ x2);
      }

    }
    public static void main (String [] args){
     double [] t  ;
     t= new double [3];
     Scanner sc = new Scanner (System.in);
     while(sc.hasNext()){   
        for (int i=0; i<=t.length;i++){
          // give the p and than the q
          double x= sc.nextDouble();
          t[i]=x;
        }
        if (t.length!=2){
          System.out.println("Bitte genau zwei Argumente angeben");
          break;
        }
     }
     rechnen(t[0],t[1]);
    }
}
