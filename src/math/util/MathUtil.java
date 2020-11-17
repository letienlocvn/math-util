/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import loclt.util.MathUtility;

/**
 *
 * @author WIN
 */
public class MathUtil {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5!= " + MathUtility.getFactorial(5));
        // Coi thực tế hàm chạy là bao nhiêu - ACTUAL 
        // So sánh với cái mong đợi trước khi tính, EXPECTED 120
        // ACTUAL == EXPECTED, HÀM CHẠY ĐÚNG CHO TÌNH HUÔNG NÀY, TEST CASE NÀY
        System.out.println("0!= " + MathUtility.getFactorial(0));
        // ACTUAL - Chạy mới biết hàm bằng mấy
        // EXPECTED: 1
        System.out.println("-5!= " + MathUtility.getFactorial(-5));
        // EXPECTED: Throw new IllegalArgumentException
        
        // Cách test kiểu này gọi là: Manual
        // Vì ta nhìn bằng mắt để suy luận ra kết quả 
        
        // Tối ưu hơn, ta dùng màu sắc xanh đỏ để luận kết quả đúng sai của hàm
        // Cách này gọi là: TEST AUTOMATION
    }
    
}
