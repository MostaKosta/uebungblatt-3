import java.util.Scanner;

class Chess {
    private static void fillAndprint (String [][] x,int n){
        for (int j=0;j<=n-1;j++){
            for(int i=0;i<=n-1;i++){
                // the black field position
                if (i==j && i+j==4){
                    x [i][j]=new String ("*");
                }
                else {
                    x [i][j]=new String (" ");
                }
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {     
          Scanner sc= new Scanner (System.in);
          int n = sc.nextInt() ;
          if (n>0){
            String matrix [][]= new String [n][n];
            fillAndprint(matrix,n);
          }
          // ERROR message
          else {
            System.out.println("ERROR: Bitte die Gr¨oße des Feldes als Argument ¨ubergeben!");
          }
    }

}
