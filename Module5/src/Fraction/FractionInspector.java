package Fraction;

public class FractionInspector {
	

    public static void main(String[] args){
        Fraction fr1 = new Fraction(1, 2);
   
   System.out.println(fr1.getSum() + "/" + fr1.getDen());

   Fraction[] mas = new Fraction[5];
   
   System.out.println(mas[0]);
   mas[0] = new Fraction(1, 2);
   mas[1] = new Fraction(2, 3);
        
    }
      
}