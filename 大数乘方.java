public class Solution {
    public double Power(double base, int exponent) {
        if(exponent <= 2){
            return Math.pow(base,exponent);
        }
        else{
            double result = 1.0;
            int half = exponent/2;
            result *= Power(base, half);
            result *= Power(base, exponent-half);
            return result;
        }
  }
}