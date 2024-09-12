public class pattern {

    public static void main(String[] args) {
        pattern18(5);
    }
     
    // * * *
    // * * *
    // * * *
    static void pattern1(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // * 
    // * *
    // * * *
    static void pattern2(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //1
    //1 2
    //1 2 3
    static void pattern3(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //1
    //2 2 
    //3 3 3
    //4 4 4 4
    static void pattern4(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    // # # # #
    // # # #
    // # #
    // #
    static void pattern5(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // 1 2 3 4 
    // 1 2 3
    // 1 2
    // 1
    static void pattern6(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    //        * 
    //      * * * 
    //    * * * * *
    //  * * * * * * *
    static void pattern7(int n){
        for(int i=0 ; i<n ; i++){
            //space
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j<(2*i+1) ; j++){
                System.out.print("*");
            }
            //space
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //    * * * * * * *
    //      * * * * *
    //        * * *  
    //          *
    static void pattern8(int n){
        for(int i=0 ; i<n ; i++){
            //space
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j<(2*n-2*i-1) ; j++){
                System.out.print("*");
            }
            //space
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

  //patter 9 merge pattern 7 and 8
    //          * 
    //        * * * 
    //      * * * * *
    //    * * * * * * *
    //  * * * * * * * * *
    //  * * * * * * * * * 
    //    * * * * * * *
    //      * * * * *
    //        * * *  
    //          *


    //#
    //# #
    //# # #
    //# # # # 
    //# # # # # 
    //# # # # 
    //# # # 
    //# # 
    //#
    static void pattern10(int n){
        for(int i=1 ; i<=2*n-1 ; i++){
            int stars=i;
            if(i>n){
                stars = 2*n-i; 
            }
            for(int j=1 ; j<=stars ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //1
    //0 1
    //1 0 1
    static void pattern11(int n){
        int start=1;
        for(int i=0 ; i<=n ; i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j=0; j<=i ; j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }



    //1             1
    //1 2         2 1
    //1 2 3     3 2 1
    //1 2 3 4 4 3 2 1
    static void pattern12(int n){
        for(int i=1 ; i<=n ; i++){
            //DIGIT
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1 ; j<=(2*n-2*i) ; j++){
                System.out.print(" ");
            }
            //digit
            for(int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //1
    //2 3
    //4 5 6 
    //7 8 9 10
    static void pattern13(int n){
        int start=1 ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }


    //A
    //A B
    //A B C 
    //A B C D
    static void pattern14(int n){
        char start='A' ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
            start='A';
        }
    }



    // A B C D
    // A B C
    // A B
    // A
    static void pattern15(int n){
        char start = 'A';
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<n-i+1 ; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
            start='A';
        }
    }



    //A
    //B B
    //C C C 
    //D D D D
    static void pattern16(int n){
        char start='A' ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(start+" ");
            }
            System.out.println();
            start++;
        }
    }




    //        A 
    //      A B A 
    //    A B C B A 
    //  A B C D C B A
    static void pattern17(int n){
        for(int i=0 ; i<n ; i++){
            //space
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            //CHARACTERS
            char start='A';
            int breakp = (2*i+1)/2  ;
            for(int j=1 ; j<=(2*i+1) ; j++){
                System.out.print(start);
                if(j<=breakp){
                    start++;
                }
                else{
                    start--;
                }
            }
            //space
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }



    //E
    //D E
    //C D E 
    //B C D E
    //A B C D E
    static void pattern18(int n){
        for(int i=0 ; i<n ; i++){
            for(char ch = (char)('E' - i); ch<= 'E' ; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }









}