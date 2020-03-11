public class App{
    public void run(){
        MapaCMYK mapa = new MapaCMYK(2,2);
        mapa.setPixel(0, 0, PixelCMYK.red);
        mapa.setPixel(0, 1, PixelCMYK.orange);        
        mapa.setPixel(1, 0, PixelCMYK.blue);        
        mapa.setPixel(1, 1, PixelCMYK.green);        
        
        Conversor conversor = new Conversor();
        MapaRGB mapa2 = (MapaRGB) conversor.converter(mapa, new ConversorCMYK2RGB());
        
        for(int i = 0; i < mapa2.getAltura(); i++)
           for(int j = 0; j < mapa2.getLargura(); j++)        
             System.out.println(mapa2.getPixel(i, j));
        
    }    
}

