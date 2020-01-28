public class Trajeto{
  private String nome;
  private Via[] vias;
  
  public boolean isValido(){
      for(int iCont = 0; iCont < this.vias.length - 1; iCont++)
        if(!this.vias[iCont].isAdjacente(this.vias[iCont+1]))
          return false;
      return true;    
  }   

  public double getTempoTotal(int hora){
      double tempo = 0;
      double tempoNaUltimaHora = 0;
      for(Via via : this.vias){
        tempo += via.getTempoMedioTravessia(hora);
        tempoNaUltimaHora += via.getTempoMedioTravessia(hora);
        if(tempoNaUltimaHora > 1){
            hora += tempoNaUltimaHora;
            tempoNaUltimaHora = 0; 
        } 
        if(hora > 23)
          hora = hora - 23;
      }  
      return tempo;  
  } 
  
  public double getTempoTotal(){
      double tempo = this.getTempoTotal(0);
      for(int i = 1; i < 24; i++)
        if(tempo > this.getTempoTotal(i))
          tempo = this.getTempoTotal(i);
      return tempo;   
  } 
  
  public double maisRapido(Trajeto trajeto, int hora){
      return this.getTempoTotal(hora) - trajeto.getTempoTotal(hora);
  }    
  
}
