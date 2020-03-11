public class PixelRGB extends Pixel{
    
    private int red;
    private int green;
    private int blue;
    
    public PixelRGB(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    } 
    
    public int getRed(){
      return this.red;
    };    
    
    public int getGreen(){
      return this.green;
    };    
  
    public int getBlue(){
      return this.blue;
    };    

    public int getLuminosidade(){
        return (int)((100 * ((0.3 * this.red) + (0.59 * this.green)
                     + (0.11 * this.blue)))
                      /255.0);
    };
    
    public String toString(){
        return "<" + this.red + ";" + this.green + ";" + this.blue + ">";
    }    
}
