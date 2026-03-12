public class funtions {

     /* static void  sum(){
        int a = 10;
        int b = 20;
        int c =a+b;
        System.out.print(c);
    } */

       int apple_price = 20;
       int apple_count= 4;

       void total_money(){
        System.out.print(apple_price*apple_count);

       } 

    public static void main(String[] args) {
        
       // funtions addition = new funtions();
        //sum();

        funtions obj = new funtions();

        System.out.print("the toatal amount is :");
        obj.total_money();


    }
}