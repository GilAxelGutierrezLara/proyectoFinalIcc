/**
 *Clase que representa un caballo en el juego de extincion y que hereda de Ficha
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Caballo extends Ficha{

    public Caballo(int color,int x, int y){
	super(color,x,y);
    }
    public String toString(){
	if(color==BLANCO)
	    return "C";
	else
	    return "c";
    }
    public Ficha copiar(){
	return new Caballo(this.color,this.fila,this.columna);
    }
    public boolean validarMovimiento(Tablero tablero,int fF,int cF){
	if((fF<0) || (fF>5))
	    return false;
	if(cF<0|| cF>5)
	    return false;
	int difF,difC;
	Ficha p = tablero.get(fF,cF);
	difF=Math.abs(this.fila-fF);
	difC=Math.abs(this.columna-cF);
	//El movvimiento del caballo puede ser un salto de una fila
	//y dos columnas o visceversa en valor absoluto
	if(((Math.abs(difF)==1)&&(Math.abs(difC)==2))||(Math.abs(difF)==2&&(Math.abs(difC)==1))){
		    //Solo podemos comer fichas enemigas
		    if(p!=null)
			if(p.getColor()==this.color)
			    return false;
		    return true;
		}
		else
		    return false;
    }
}
