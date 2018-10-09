package Fraction;

public class Fraction {

    private int sum;
    private int den;
    
    public Fraction() {
    	sum = 0;
    	den = 1;
    }

    public Fraction(int sum, int den){
        this.sum = sum;
        this.den = den;
    }

   public int getSum() {
	   return sum;
    }
   
   public int getDen() {
	   return den;
   }
}                               