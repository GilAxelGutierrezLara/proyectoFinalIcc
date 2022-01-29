
/**
 *Clase que representa a una ficha del juego de extincion
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public abstract class Ficha implements Constantes{
    boolean comida;
    int color;
    //Ubicacion en el tablero
    int fila,columna; 

    public Ficha(int color,int fila, int columna){
	this.color = color;
	this.fila = fila;
	this.columna = columna;
    }
    public void setFila(int fila){
	this.fila = fila;
    }
    public void setColumna(int columna){
	this.columna = columna;
    }
    public int getColor(){
	return this.color;
    }
    public void setColor(){
	this.color = color;
    }
    public int getFila(){
	return this.fila;
    }
    public int getColumna(){
	return this.columna;
    }
    
    //Metodos especiales
    public abstract String toString();
    public void setPosicion(int f, int c){
	this.fila = f;
	this.columna = c;
    }
    public void setEstado(boolean comida){
	this.comida = comida;
    }
    public boolean getEstado(){
	return comida;
    }
    public abstract Ficha copiar();
    public abstract boolean validarMovimiento (Tablero tablero,int fF,int cF);
    
}
