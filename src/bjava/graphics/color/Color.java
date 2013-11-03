
package bjava.graphics.color;

/** @author benji */
public enum Color {
    
    /** Represents white color. */
    WHITE("FFFFFF"),
    
    /** Represents black color. */
    BLACK("000000"),
    
    /** Represents red color. */
    RED("FF0000"),
    
    /** Represents green color. */
    GREEN("00FF00"),
    
    /** Represents blue color. */
    BLUE("0000FF"),
    
    /** Represents yellow color. */
    YELLOW("00FFFF"),
    
    /** Represents orange color. */
    ORANGE("FFA500"),
    
    /** Represents pink color. */
    PINK("FFC0CB"),
    
    /** Represents purple color. */
    PURPLE("A020F0"),
    
    /** Represents aqua color. */
    AQUA("00FFFF"),
    
    /** Represents navy color. */
    NAVY("000080"),
    
    /** Represents teal color. */
    TEAL("008080"),
    
    /** Represents grey color. */
    GREY("C0C0C0"), 
    
    /** Represents violet color. */
    VIOLET("EE82EE"),
    
    /** Represents gold color. */
    GOLD("FFD700"),
    
    /** Represents brown color. */
    BROWN("A52A2A");
    
    private final String hexForm;
    
    private Color(String hexForm)
    {
        this.hexForm = hexForm;
    }
    
    /** Will return hexadecimal representation of color
     * @return string containing hexadecimal represenatation of color
     */
    public String getHexForm()
    {
        return hexForm;
    }
   
}
