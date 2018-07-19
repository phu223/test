/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Tachibana Kanade
 */
public class Scholarship {

    /*camel case notation*/
    public static int getAward(double gpa) {
        if (gpa > 10 || gpa < 0) {
            return -1;
        } else if (gpa >= 9 && 10 >= gpa) {
            return 1_000_000;
        } else if (gpa >= 8 && gpa < 9) {
            return 500_000;
        } else {
            return 0;
        }
    }
    
}
