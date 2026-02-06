import java.util.Scanner;
class Formula {
    
    double calculateArea(float radius){
               return Math.PI*Math.pow(radius,2);
                }
    double calculateArea(float length,float breadth){
                   return length*breadth;
                  }
    double calculateArea(double base,double height){
                   return 0.5*base*height;
                  }
   }
 public class AreaCalculator {    

    public static void main(String[] args) {
        Formula obj=new Formula();
        Scanner sc = new Scanner(System.in);
        float radius=sc.nextFloat();
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
        double base=sc.nextDouble();
        double height =sc.nextDouble();
        
         System.out.printf("%.2f\n",obj.calculateArea(radius));
         System.out.printf("%.2f\n",obj.calculateArea(length,breadth));
         System.out.printf("%.2f\n",obj.calculateArea(base,height));
    }
}
