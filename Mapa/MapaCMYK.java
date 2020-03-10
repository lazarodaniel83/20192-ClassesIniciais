public class MapaCMYK extends Mapa{
    
     private PixelCMYK[][] pixels;
    
     public Pixel[][] getPixels(){
         return this.pixels;
     };
     
     public Pixel getPixel(int x, int y){
         return this.pixels[x][y];
     };        
    
}
