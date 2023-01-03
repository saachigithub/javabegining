import java.util.Scanner;
class Exp33U 
{
 public static void main(String[] args) 
 {
   System.out.println("Enter Year:");
   Scanner n=new Scanner(System.in);
   int yr=n.nextInt();
   int day=0;
   for(int i=1997;i<=yr;i++) 
   {  
     day=day+365;
     if(i%4==0)
     {
      System.out.print(i+", ");
      day=day+1;
     }
   }
   System.out.println("\nTotal Days: "+day);
 }
}