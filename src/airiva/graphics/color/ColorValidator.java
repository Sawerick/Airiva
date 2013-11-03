
package airiva.graphics.color;

import java.util.regex.Pattern;

/** @author benji */
public class ColorValidator {

    private final  Pattern hexFormPattern = Pattern.compile(
            "#?(?:[\\da-f]){3}",
            Pattern.CASE_INSENSITIVE);
    
    /** Will return boolean value depending on whether givenString
     * is valid color representation in hexadecimal form
     * @param hexForm hexadecimal representation of color
     * @return true or false depending on validity
     */
    public boolean isHexFormValid(String hexForm)
    {
        return hexFormPattern.matcher(hexForm).matches();
    }
    
    private boolean isColorPartValid(byte cp)
    {
        return cp >= 0 && cp <= 255; 
    }
    
    /** Will return boolean value depending on whether all 3 numbers
     * are in range 0-255 
     * @param R R part of color
     * @param G G part of color
     * @param B B part of color
     * @return true or false, depending on validity of given color parts
     */
    public boolean isRGBRangeValid(byte R, byte G, byte B)
    {
        return isColorPartValid(R) && isColorPartValid(G) &&
                   isColorPartValid(B);
    }
    
}
