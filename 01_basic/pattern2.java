public class pattern2 {
    public static void main(String[] args) {
        pattern19(5);
    }

    static void pattern19(int n){
        int inis = 0 ;
        for(int i=0 ; i<n ; i++){
            //stars
            for(int j=1 ; j<=n-i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<inis ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=n-i ; j++){
                System.out.print("*");
            }
            inis += 2 ;
            System.out.println();
        }

        inis = 8 ;
        for(int i=0 ; i<n ; i++){
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<inis ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            inis -= 2 ;
            System.out.println();
        }
    }
}
