/**
 *Clase que representa un jugador del Juego de extincion y que implementa la interfaz Constantes
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Jugador implements Constantes{
    String nombre;
    int color;
    Tablero tablero;
    int fichasVivas = 0;

    public Jugador(String nombre, int color, Tablero tablero){
	int posicion;
	if (color == BLANCO)
	    posicion =1;
	else
	    posicion = 0;
	Ficha t;
	//Crear torres
	for(int i = 0;i<2;i++){
	    t = new Torre(color,5*posicion,5*i);
	    fichasVivas++;
	    tablero.addFicha(5*posicion,5*i,t);
	}
	//Crear peones
	for(int i=0;i<6;i++){
	    t = new Peon(color,3*posicion+1,i);
	    fichasVivas++;
	    tablero.addFicha(3*posicion+1,i,t);
	}
	//Crear rey
	t = new Rey(color,5*posicion,2);
	fichasVivas++;
	tablero.addFicha(5*posicion,2,t);
	//Crear reina
	t = new Reyna(color,5*posicion,3);
	fichasVivas++;
	tablero.addFicha(5*posicion,3,t);
	//Crear caballos
	for(int i=0;i<2;i++){
	    t = new Caballo(color,5*posicion,3*i+1);
	    fichasVivas++;
	    tablero.addFicha(5*posicion,3*i+1,t);
	}
    }
    
    
    public void realizarJugada(int fI, int cI, int fF,int cF){
	Ficha pAcomer,pAmover;
	boolean bResultado;
	//ficha a mover
	pAmover = tablero.get(fI,cI);
	//fichaa a comer(si hay)
	pAcomer = tablero.get(fF,cF);
	//Hay que comer una ficha
	if(pAcomer!=null)
	    fichasVivas--;
	    pAcomer.setEstado(true);
	if(pAmover!=null){
	    tablero.addFicha(fF,cF,pAmover);
	    tablero.addFicha(fI,cI,null);
	    pAmover.setPosicion(fF,cF);
	    
	}
	tablero.mostrarTablero();		
    }
    public String getNombre(){
	return nombre;
       
    }
    public void setNombre(String nombre){
	this.nombre= nombre;
    }
    public boolean perdio(){
	if(fichasVivas==0)
	    return true;
	else
	    return false;
    }
    public int getFichasVivas(){
	return this.fichasVivas;
    }
}
