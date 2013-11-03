
package airiva.graphics.color;

/** @author benji */
public class ColorParser {

    private static ColorValidator cv = new ColorValidator();
    private String hexForm;
    private byte R, G, B;
    
    public ColorParser(String hexForm) throws InvalidColorFormatException
    {
        if (!cv.isHexFormValid(hexForm))
            throw new InvalidColorFormatException(
                    "Invalid color hexadecimal representation. ");
        byte[] rgbArr = parseHexForm(hexForm);
        R = rgbArr[0];
        G = rgbArr[1];
        B = rgbArr[2];
    }
    
    public ColorParser(Color colorName)
    {
        byte[] rgbArr = parseHexForm(colorName.getHexForm());
        R = rgbArr[0];
        G = rgbArr[1];
        B = rgbArr[2];
    }
    
    public ColorParser(byte R, byte G, byte B) throws InvalidColorFormatException
    {
        if (!cv.isRGBRangeValid(R, G, B))
            throw new InvalidColorFormatException(
                    "Number parts are 0 <= x <= 255");
        this.R = R; this.G = G; this.R = R;
        hexForm = Integer.toString(R, 16) + Integer.toString(B, 16) +
                           Integer.toString(G, 16);
    }
    
    private byte[] parseHexForm(String hexForm)
    {
        byte[] resultArr = new byte[3];
        int startIndex = 0;
        for(int i = 0; i < 3; i++)
            resultArr[i] = Byte.parseByte(hexForm.substring(
                                    startIndex, (startIndex += 2)), 16);
        return resultArr;
    }
   
    /** Will return hexadecimal representation of color as string
     * @return string containing hexadecimal representation of color
     */
    public String getHexForm()
    {
        return hexForm;
    }
    
    /** Will return hexadecimal representation of color, (improved
     * with additional flags)
     * @param includingHash hex. repr. will contains # at the beggining,
     * f.e. #00ffff
     * @param lowercase possible numbers will be lowercase if true, otherwise
     * uppercase, f.e. true -> 00ffff, false -> 00FFFF
     * @return hex. representation of color
     */
    public String getHexForm(boolean includingHash, boolean lowercase)
    {
        return "#" + hexForm.toUpperCase();
    }
     
    /** Will return value of Red in color
     * @return byte(0-255) value of Red in color
     */
    public byte getR()
    {
        return R;
    }

    /** Will return value of Green in color
     * @return byte(0-255) value of Green in color
     */    
   public byte getG()
    {
        return G;
    }
   
   /** Will return value of Blue in color
    * @return byte(0-255) value of Blue in color
    */
    public byte getB()
    {
        return B;
    }
    
}
