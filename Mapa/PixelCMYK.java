public class PixelCMYK extends Pixel{
    
    public static final PixelCMYK red = new PixelCMYK(0, 100, 100, 0);
    public static final PixelCMYK green = new PixelCMYK(100, 0, 100, 0);    
    public static final PixelCMYK blue = new PixelCMYK(100, 100, 0, 0);        
    public static final PixelCMYK orange = new PixelCMYK(0, 32, 100, 0);        
    
        
    private int cyan;
    private int magenta;
    private int yellow;    
    private int key;
    
    private PixelCMYK(int cyan, int magenta, int yellow, int key){
        this.cyan = cyan;
        this.magenta = magenta;        
        this.yellow = yellow;
        this.key = key;        
    };    
        
    public int getCyan(){
      return this.cyan;
    };
    
    public int getMagenta(){
      return this.magenta;
    };
    
    public int getYellow(){
      return this.yellow;
    };
    
    public int getKey(){
      return this.key;
    };
    
    
    
    public int getLuminosidade(){
      return this.key;
    };
}
