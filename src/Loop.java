public class Loop {
    public static void main(String[] args) {

        for(int i =1;i<11;i++) {
            for (int x = 1; x < 11; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

       for(int i =1;i<6;i++) {
           for (int x = 0; x < i; x++) {
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i = 4;i>=0;i--){
           for (int x = 0; x<i;x++){
               System.out.print(" ");
           }
           for (int j = 5; j>i;j--){
               System.out.print("*");
           }
           System.out.println();
       }
    }

}
