public class Conversor { 
    public Mapa converter(Mapa mapa, ConversorCor conversor){
        Mapa novo = conversor.getNovoMapa(mapa.getAltura(), mapa.getLargura());
        for(int iCont = 0; iCont < mapa.getAltura(); iCont++) 
          for(int jCont = 0; jCont < mapa.getLargura(); jCont++){ 
              Pixel pixel = mapa.getPixel(iCont, jCont); 
              Pixel novoPixel = conversor.converter(pixel); 
              novo.setPixel(iCont, jCont, novoPixel); 
          } 
        return novo; 
    } 
}