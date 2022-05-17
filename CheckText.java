/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.*;
import GUI.*;
import java.util.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class CheckText {
    public static boolean isNumber(String number) { //kt có phải là số không
        try {
            if (Double.parseDouble(number) < 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean haveNumber(String string){ // kt có số hay không
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
     
    public static boolean isLength50(String ten){ // ký tự không quá 50 và không ít hơn 1
        if(ten.length() > 50 || ten.length() < 1)
        {
            return false;
        }
        return true;
    }
     
     public static boolean isName(String name){ // kt có chứa ký tự đặc biệt hay không
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]");
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            return false;
        }
        return true;
        
    }
    
/*     ^ Asserts position at start of the string
       ( Denotes the start of a capturing group
        \d Numerical digit, 0, 1, 2, ... 9. Etc.
        {1,2} one to two times.
        ) You guessed it - Closes the group.
        $ Assert position at end of the string
*/
    public static boolean isDate(String date){
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            return true;
        }
        return false;
        
    }
    
    
    public static boolean isGmail(String gmail){
    Pattern pattern = Pattern.compile("^[\\w.+\\-]+@gmail\\.com$");
        Matcher matcher = pattern.matcher(gmail);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
    
    public static boolean isPhoneNumber(String number){ //số điện thoại có số đầu là 03 2-9 || 05 678 || 07 06-9 09 0-44-6
        Pattern pattern = Pattern.compile("^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {
            return true;
        }
        return false;
        
    }
    
}
