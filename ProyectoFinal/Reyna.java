/**
 *Clase que representa a la reina en el juego de extincion y que hereda de Ficha
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Reyna extends Ficha{
    public Reyna(int color,int x,int y){
	super(color,x,y);
    }
    public String toString(){
	if(color==BLANCO)
	    return "D";
	else
	    return "d";
    }
    public Ficha copiar(){
	return new Reyna(this.color,this.fila,this.columna);
    }
    public boolean validarMovimiento(Tablero tablero,int fF,int cF){
	if((fF<0) || (fF>5))
	    return false;
	if(cF<0|| cF>5)
	    return false;
	Torre t= new Torre(this.color,this.fila,this.columna);
	Alfil a= new Alfil(this.color,this.fila,this.columna);
	if(t.validarMovimiento(tablero,fF,cF)||a.validarMovimiento(tablero,fF,cF))
	    return true;
	return false;
    }
}
