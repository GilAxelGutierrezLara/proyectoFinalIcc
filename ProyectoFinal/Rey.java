/**
 *Clase que representa al Rey en el juego de extincion y que hereda de Ficha
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Rey extends Ficha{
    public Rey(int color, int x, int y){
	super(color,x,y);
    }
    public String toString(){
	if(color==BLANCO)
	    return "R";
	else
	    return "r";
    }
    public Ficha copiar(){
	return new Rey(this.color,this.fila,this.columna);
    }
    public boolean validarMovimiento(Tablero tablero,int fF,int cF){
		if((fF<0) || (fF>5))
	    return false;
	if(cF<0|| cF>5)
	    return false;
	Ficha p;
	p = tablero.get(fF,cF);
	int difF=this.fila-fF;
	int difC=this.columna-cF;
	//Solo se puede mover una casilla a su alrededor
	if(Math.abs(difF)<=1 && Math.abs(difC)<=1){
	    //Solo podemos comer piezas enemigas
	    if(p!=null)
		if(p.getColor()==this.color)
		    return false;
	    return true;
	}
	else
	    return false;
    }
    
}
