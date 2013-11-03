
package airiva.graphics.color;

/** @author benji */
public class ColorParser {

    private static ColorValidator cv = new ColorValidator();
    private String hexForm;
    private int R, G, B;
    
    public ColorParser(String hexForm) throws InvalidColorFormatException
    {
        if (!cv.isHexFormValid(hexForm))
            throw new InvalidColorFormatException(
                    "Invalid color hexadecimal representation. ");
        int[] rgbArr = parseHexForm(hexForm);
        R = rgbArr[0];
        G = rgbArr[1];
        B = rgbArr[2];
    }
    
    public ColorParser(Color colorName)
    {
        int[] rgbArr = parseHexForm(colorName.getHexForm());
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
    
    private int[] parseHexForm(String hexForm)
    {
        int[] resultArr = new int[3];
        int startIndex = 0;
        for(int i = 0; i < 3; i++)
            resultArr[i] = Integer.parseInt(hexForm.substring(
                                    startIndex, (startIndex += 2)), 16);
        return resultArr;
    }
    
    public String getHexForm()
    {
        return hexForm;
    }
    
    public int getR()
    {
        return R;
    }
     
   public int getG()
    {
        return G;
    }
    public int getB()
    {
        return B;
    }
    
}
