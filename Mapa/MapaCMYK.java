public class MapaCMYK extends Mapa{
    
     private PixelCMYK[][] pixels;
     
     public MapaCMYK(int altura, int largura){
         this.pixels = new PixelCMYK[altura][largura];
     };    
    
     public Pixel[][] getPixels(){
         return this.pixels;
     };
     
     public Pixel getPixel(int x, int y){
         return this.pixels[x][y];
     }; 
     
     public void setPixel(int x, int y, Pixel pixel){
         this.pixels[x][y] = (PixelCMYK)pixel;
     };     
    
}
