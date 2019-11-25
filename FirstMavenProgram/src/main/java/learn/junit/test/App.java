package learn.junit.test;

import learn.junit.test.TwoSum;
 /* 
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int res [] = sum.twoSum(new int [] {2,4,-5,1,6,5,0,4,8,9}, 8);
        System.out.println( res[0] +" " + res[1]);
        
    }
}
