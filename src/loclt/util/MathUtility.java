/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loclt.util;

/**
 *
 * @author WIN
 */
public class MathUtility {

    public MathUtility() {
    }
    // fake but real
    //JDK co class java.util.Math, hava a lot of method static 
    //                              abs() .sin() .sqrt()
    
    public static final double PI = 3.1415;
    // hàm tính n! = 1.2.3.. n!
    // n! tăng nhanh nên mình chỉ tính tới 20! tối đa, 21! tràn long
    // 0! = 1! = 1 quy ước 
    // không có âm giai thừa, nếu tham số n là âm, mình chửi, ném Exception
    public static long getFactorial(int n){
        if (n<0 || n>20) 
            throw new IllegalArgumentException("n must be between 1..20");
        if (n==0 || n==1){
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
