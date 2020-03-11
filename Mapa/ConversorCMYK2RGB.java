public class ConversorCMYK2RGB implements ConversorCor{
    public Mapa getNovoMapa(int altura, int largura){
        return new MapaRGB(altura, largura);
    };
    public Pixel converter(Pixel original){
        PixelCMYK cmyk = (PixelCMYK) original;
        
        int red = (int)(255 * ((1 - (cmyk.getCyan() / 100.0))
                      *  (1- (cmyk.getKey() / 100.0)))); 
        int green = (int)(255 * ((1 - (cmyk.getMagenta() / 100.0))
                        *  (1- (cmyk.getKey() / 100.0))));
        int blue = (int)(255 * ((1 - (cmyk.getYellow() / 100.0))
                        *  (1- (cmyk.getKey() / 100.0))));
        return new PixelRGB(red, green, blue);  
    };     
}
