package Introduction;

public class Casting {
     public static void main(String[] args){
         //En un año ubicar 30 perros
         //Cuantos perros fueron ubicados al mes

         double monthlyDogs = 30.0/12.0;
         System.out.println(monthlyDogs);
         // Estimacion
         int estimatedMonthlyDogs = (int) monthlyDogs;
         System.out.println(estimatedMonthlyDogs);
         //Exactitud
         int a = 30;
         int b = 12;

         double c = (double) a / b;
         System.out.println(c);

         char n = '1';
         int n1 = n;
         System.out.println(n1);

         short s = (short) n;
         System.out.println(s);

     }
}
