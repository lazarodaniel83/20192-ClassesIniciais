public enum CampoHarmonico{
    DO('C'), RE('D'), MI('E'), FA('F'), SOL('G'), LA('A'), SI('B');
    
    char value;
    
    CampoHarmonico(char value){
        this.value = value;
    }    
    
    public char getValor(){
        return this.value;
    }    
    
}
