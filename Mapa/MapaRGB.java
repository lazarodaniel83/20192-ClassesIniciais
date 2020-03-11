public class MapaRGB extends Mapa{
    
     private PixelRGB[][] pixels;
     
     public MapaRGB(int altura, int largura){
         this.pixels = new PixelRGB[altura][largura];
     };       
    
     public Pixel[][] getPixels(){
         return this.pixels;
     };
     
    
     public Pixel getPixel(int x, int y){
         return this.pixels[x][y];
     };  
     
     public void setPixel(int x, int y, Pixel pixel){
         this.pixels[x][y] = (PixelRGB)pixel;
     };
    
}
