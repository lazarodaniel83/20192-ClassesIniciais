public class Atlas{
    private Mapa[] mapas;
    
    public Mapa getMapaMaisSimilar(Fragmento fragmento){
        Mapa mapa = null;
        double simMapa = 0;
        for(Mapa atual : this.mapas){
            double simAtual = atual.getSimilaridade(fragmento);
            if(simMapa < simAtual){
                mapa = atual;
                simMapa = simAtual;
            }    
        } 
        return mapa;
    }    
    
}
