public class Test4{

   public static void main(String[] args){

     System.out.println("byte的最大值=" + Byte.MAX_VALUE);
     System.out.println("byte的最小值=" + Byte.MIN_VALUE);
  
     System.out.println("short的最小值=" + Short.MIN_VALUE);  
     System.out.println("short的最大值=" + Short.MAX_VALUE);
     
      System.out.println("int的最大值=" + Integer.MAX_VALUE);  
      System.out.println("int的最小值=" + Integer.MIN_VALUE); 
     
     long num1 = -2147483649L;
     long num2 = 2147483648L;
     System.out.println(num1);
     System.out.println(num2);
      
   }
}