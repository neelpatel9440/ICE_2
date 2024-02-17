/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author DELL
 */
public class passwordValidator {
    
    
    public boolean validatePassword(String password) {
   
        
        return password.length() >= 8 && containsSpecialCharacter(password);
    }
    
    private boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
