/**
 *Clase que representa un alfil en el juego de ajedrez y hereda de Ficha
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Alfil extends Ficha{
    public Alfil(int color,int x,int y){
	super(color,x,y);
    }
    public String toString(){
	if(color==BLANCO)
	    return "A";
	else
	    return "a";
    }
    public Ficha copiar(){
	return new Alfil(this.color,this.fila,this.columna);
    }
    public boolean validarMovimiento(Tablero tablero,int fF,int cF){
	if((fF<0) || (fF>5))
	    return false;
	if(cF<0|| cF>5)
	    return false;
	//Diferencia entre las filas y las columnas para sus movimientos
	int difF,difC;
	Ficha p;
	p=tablero.get(fF,cF);
	difF=Math.abs(this.fila-fF);
	difC=Math.abs(this.columna-cF);
	//Si ambas diferencias son iguales entonces nos movemos en diagonal
	if(difF==difC){
	    //La casilla de destino esta ocupaada
	    if(p!=null)
		//NO podemos comer del mismo color
		if(p.getColor()==this.color)
		    return false;
	//No podemos pasar sobre otras fichas
	for(int i=1;i < difF;i++){
	    p=tablero.get(this.fila+i*((fF-this.fila)/difF),this.columna+i*((cF-this.columna)/difF));
			  //Intenta saltar a una ficha
			  if(p!=null)
			     return false;	  
	}
		return true;
	}
	//NO es un movimiento en diagonal
	else
	    return false;
    }
}
    
