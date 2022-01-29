/**
 *Clase que representa el movimiento de una ficha
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
 public class Movimiento{
     Ficha p;
     int fF;
     int cF;
     public Movimiento(Ficha p, int fF, int cF){
	 this.p=p;
	 this.fF=fF;
	 this.cF=cF;
     }
     public Ficha getFicha(){
	 return p;
     }
     public int getFilaFinal(){
	 return fF;
     }
     public int getColumnaFinal(){
	 return cF;
     }
     public String toString(){
	 return "<"+p.toString()+"> de <"+p.getFila()+","+p.getColumna()+"> a<"+fF+","+cF+">";
     }
 }
