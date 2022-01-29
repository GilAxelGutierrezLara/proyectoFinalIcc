/**
 *Clase donde ejecutamos el juego de extincion
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
import java.util.Scanner;
public class JuegoDeExtincion{
    /**
     *Metodo principal 
     *@param Args Los argumentos
     **/
    public static void main(String[] args){
      Scanner uno= new Scanner(System.in);
      Scanner dos= new Scanner(System.in);
      Tablero tablero = new Tablero(6,6,12,12);
      String player2;
      String player1;
      
      Jugador p2 = new Jugador("P2",0,tablero);
      Jugador p1 = new Jugador("Gil",1,tablero);
      
      
     
      System.out.println("JUEGO DE EXTINCION");	 
      System.out.println("BIENVENIDO, SELECCIONA UNA OPCION");
      System.out.println("Si desea jugar oprima  ......  1  ");	 
      System.out.println("Si deasea salir del juego oprima .....  2  ");
      int eleccion1 = uno.nextInt();
      switch(eleccion1){
        case 1:
          
          System.out.println("MODO DE JUEGO:");          
          System.out.println("Seleccione el numero de jugadores");
          System.out.println("Para un solo jugador oprima   .....  3 ");        
          System.out.println("Para dos jugadores seleccione  ..... 4 ");
	  int eleccion2 = uno.nextInt();
	  if(eleccion2==3){
	      System.out.println("Por favor ingrese su nombre");
	      player1 = dos.nextLine();
	      p1.setNombre(player1);
	  }else{
	      //Dos jugadores
	      System.out.println("Por favor ingrese el nombre del primer jugador");
	      player1 = dos.nextLine();
	      p1.setNombre(player1);
	      System.out.println("Por favor ingrese el nombre del segundo jugador");
	      player2 = dos.nextLine();
	      p2.setNombre(player2);
	      System.out.println("Comencemos");
	      
	  }
             
          break;
          
        case 2:
	    System.exit(0);
      }
      System.out.println("JUEGO DE EXTINCION");
      System.out.println(p1.getNombre() + " VS " +p2.getNombre());
      tablero.mostrarTablero();
      System.out.println(p1.getFichasVivas());
      p1.realizarJugada(4,4,4,3);
    }
}
