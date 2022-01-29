/**
 *Clase que representa un peon en el juego de extincion y que hereda de Ficha
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Peon extends Ficha{
    public Peon(int color,int fila,int columna){
	super(color,fila,columna);
    }
    public String toString(){
	if(color==BLANCO)
	    return "P";
	else
	    return "p";
    }
    public Ficha copiar(){
	return new Peon(this.color,this.fila,this.columna);
    }
    public boolean validarMovimiento(Tablero tablero,int fF,int cF){
	if((fF<0) || (fF>5))
	    return false;
	if(cF<0|| cF>5)
	    return false;
	Ficha p;
	p = tablero.get(fF,cF);
	//valores para el movimiento del peon
	int incremento = (this.color==BLANCO)?-1:1;
	int filaSalida = (this.color==BLANCO)?6:1;
	//movimiento normal de los peones
	if(this.columna==cF && this.fila+incremento==fF){
	    if(p!=null)
		return false;
	    return true;
	}
	else if((this.columna == cF)&&(this.fila==filaSalida)&&(fF==filaSalida+2*incremento)){
	//no puede comer asi
	if(p!=null)
	    return false;
	//no hay ficha en la mitad
	p=tablero.get(this.fila+incremento,this.columna);
	//no se puede saltar a otra ficha
	if(p!=null)
	    return false;
	return true;
	}
    //Movimiento de comer

	else if(((cF==this.columna+1)||(cF==this.columna-1))&&(fF==this.fila+incremento)){
	//No hay nada que comer
	    if(p==null)
		return false;
	//No es una ficha rival
	    if(getColor()==this.color)
		return false;
	    return true;
	}
	return false;
    }
}
	
    
		    

