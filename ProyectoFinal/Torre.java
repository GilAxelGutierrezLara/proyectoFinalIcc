public class Torre extends Ficha{
    //Constructor
    public Torre(int color, int fila, int columna){
	super(color,fila,columna);
    }
    public String toString(){
	if(color == BLANCO){
	    return "T";
	}else{
	    return "t";
	}
    }
    public Ficha copiar(){
	return new Torre(this.color,this.fila,this.columna);
    }
    public boolean validarMovimiento(Tablero tablero,int fF, int cF){
	if((fF<0) || (fF>5))
	    return false;
	if(cF<0|| cF>5)
	    return false;
    
    
    int difFila = fF - this.fila;
    int difColumna = cF - this.columna;
    
    Ficha p = tablero.get(fF,cF);
    if ((this.fila == fF) || (this.columna == cF))
	if (p != null )
	    if (p.getColor() == this.color)
		return false;
    if (Math.abs(difFila) <= 1 && Math.abs(difColumna)<= 1) {
	if (p != null )
	    if (p.getColor() == this.color)
		return false;
	return true;
    }else
	return false;
    }
 
}
