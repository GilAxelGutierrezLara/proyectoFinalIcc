import java.util.Scanner;
public class MainTablero{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      Tablero t1 = new Tablero(6,6);	 
      System.out.println("JUEGO DE EXTINCION");	 
      System.out.println("BIENVENIDO, SELECCIONA UNA OPCION");
      Syatem.out.println("Si desea jugar oprima  ......  1  ");	 
      System.out.println("Si deasea salir del juego oprima .....  2  ");
      int eleccion = sc.nextInt();
      switch(eleccion){
        case 1:
          
          System.out.println("MODO DE JUEGO:");
          
          System.out.println("Seleccione el numero de jugadores");
          System.out.println("Para un solo jugador oprima   .....  3 ");
          
          System.out.println("Para dos jugadores seleccione  ..... 4 ");
             
          break;
          
        case 2:
          //Salir del juego
                             
                             }
      
      
      t1.llenarTablero();
	 
      t1.mostrarTablero();
    }
}
