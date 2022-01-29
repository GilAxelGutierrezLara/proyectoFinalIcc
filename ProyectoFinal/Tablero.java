/**
 *Clase que representa un tablero del juego de extincion
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Tablero{
    static Ficha[][] tablero;
    private int x ;
    private int y ;
    private int numeroFichasP1;
    private int numeroFichasP2;
    
    /**
     *Constructor que recibe
     **/
    public Tablero(int x, int y, int numeroFichasP1, int numeroFichasP2){
	this.tablero = new Ficha[x][y];
	this.numeroFichasP1 = 12;
	this.numeroFichasP2 = 12;
    }
    public void setNumeroFichas(int numeroFichasP1){
	this.numeroFichasP1=numeroFichasP1;
    }
    public void setNumeroFichasP2(int numeroFichasP2){
	this.numeroFichasP2=numeroFichasP2;
    }
    public void setFilas(int filas){
	this.x = filas;	
    }
    public void setColumnas(int columnas){
	this.y = columnas;
    }
    public int getNumeroFichasP1(){
	return this.numeroFichasP1;
    }
    public int getNumeroFichasP2(){
	return this.numeroFichasP2;
    }
    public int getFilas(){
	return this.x;
    }
    public int getColumnas(){
	return this.y;    
    }
    public void mostrarTablero(){

	for(int i = 0;i<tablero.length;i++){
	    for(int j=0; j<tablero[x].length; j++){

		System.out.print(tablero[i][j]);
	    }
	    System.out.println("");
	}
	
    }
    public void addFicha(int i, int j, Ficha f){
	tablero[i][j]=f;
    }
    public Ficha get(int i, int j){
	return tablero[i][j];
    }
    public void llenarTablero(){
		for(int i = 0;i<tablero.length;i++){
	    for(int j=0; j<tablero[x].length; j++){
		Torre torre = new Torre(1,i,j);
		tablero[i][j]= torre;
	    }
	}
    }
}
    
