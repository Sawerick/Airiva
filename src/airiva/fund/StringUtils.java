
package airiva.fund;

/** @author benji */
public class StringUtils {

    /** String containing all ascii-vowels */
    public static final String VOWELS = "aAeEiIuUoOyY";
    
    /** String containing all ascii-consonants */
    public static final String CONSONANTS = "bBcCdDfFgGhHjJkKlLmMnNpPqQrRsStTvVwWxXzZ";
    
    /** Will reverse given string, e.g. cha -> ahc 
     * @param str String you want to reverse
     * @return reversed string 'str' */
    public static String reverse(String str)
    {
        StringBuilder buf = new StringBuilder(str);
        buf.reverse();
        return buf.toString();
        
    }
    
    /** Will transform string to 'pig Latin', e.g. 'banana' -> 'anana-bay', 
     * or 'car' -> 'ar-cay'.
     * @param str Given string which you want to transform.
     * @return Transformed form of given string (first letter of str will be
     * moved behind hyphen (which will be immediately after 'str') and
     * 'ay' will be affixed). If empty string was given, '-ay' will be returned
     * (it's natural). */
    public static String toPigLatin(String str)
    {
        if (str.length() < 1) return "-ay";
        char prefix = str.charAt(0);
        return str.substring(1) + "-" + prefix + "ay";
    }
    
    /** Used only internally by methods numberOfVowels and numberOfConsonants,
     * for purpose of avoiding redundant code */
    private static int getNumberOfXXX(String str, String charGroup)
    {
        int num = 0;
        for (char letter : str.toCharArray())
        {
            if (charGroup.contains(Character.toString(letter))) num += 1;
        }
        return num;
    }
    
    /** Will return number of vowels in given string 'str'
     * @param str string where you want to count vowels
     * @return number of vowels in string 'str' */
    public static int getNumberOfVowels(String str)
    {
        return getNumberOfXXX(str, VOWELS);
    }
    
     /** Will return number of consonants in given string 'str'
     * @param str string where you want to count consonants
     * @return number of consonants in string 'str' */   
    public static int getNumberOfConsonants(String str)
    {
        return getNumberOfXXX(str, CONSONANTS);
    }
    
    /** Will return string without redundant spaces,
     * that means string 'str' will be trimmed
     * and all 'groups-of-more-than-one-spaces'(if any)
     * will be replaced by exactly one space.
     * @param str string where you want to remove redundant spaces
     * @return trimmed string with only space between each group of chars(if any)
     */
    public static String removeRedundantSpaces(String str)
    {
        return str.trim().replaceAll("\\s+", "");
    }
    
    public static boolean isPalindrome(String str)
    {
        // TODO..
        return true; // only temporary
    }
              
    
}

