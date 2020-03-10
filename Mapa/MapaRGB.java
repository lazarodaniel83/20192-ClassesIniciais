public class MapaRGB extends Mapa{
    
     private PixelRGB[][] pixels;
    
     public Pixel[][] getPixels(){
         return this.pixels;
     };
     
    
     public Pixel getPixel(int x, int y){
         return this.pixels[x][y];
     };     
    
}
