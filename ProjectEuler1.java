/* if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/


/*public class ProjectEuler1 {
public static void main(String args[]){
        int array[] = new int[1000];
        int sum = 0;
        for( int i = 1 ; i < 1000 ; i++){
            if( (i % 3 == 0) || ( i % 5 == 0)) {
                array[i] = i;
                //  System.out.println(array[i]);
            }
            sum = sum + array[i];
        }
        System.out.println("sum = " + sum);
    }

}
*/

public class ProjectEuler1 {
    public static void main(String args[]) {
        ProjectEuler1 obj1 = new ProjectEuler1();
        ProjectEuler1 obj2 = new ProjectEuler1();
        obj1.computeMultipleOf3And5(10);
        obj2.computeMultipleOf3And5(1000);
    }


    public void computeMultipleOf3And5(int n) {
        int array[] = new int[n];
        int sum = 0;
        for( int i = 1 ; i < n ; i++){
            if( (i % 3 == 0) || ( i % 5 == 0)) {
                array[i] = i;
                //  System.out.println(array[i]);
            }
            sum = sum + array[i];
        }
        System.out.println("sum = " + sum);
    }
}
