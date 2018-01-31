/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/

public class PrimeFactor {
    public static void main(String args[]){
       PrimeFactor obj = new PrimeFactor();
       obj.prime(13195);
      // obj.prime(600851475143);
    }

    public void prime(long num){
        for(long i = 2 ; i <= num; i++) {
            while (num % i == 0 ) {
                System.out.println("prime factor is " + i);
                num = num / i;
            }
        }
    }
}
