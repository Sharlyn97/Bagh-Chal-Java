//VariablesGlobales
import javax.swing.*;
import java.awt.*;
public class Metodos extends JFrame//meprivate todo constructor
{
  private Ficha fichas;
  public Ficha tablero[][];
  
  boolean turnoTigre=true;//juega un bando y despues se pone en opuesto al valo
  boolean turnoCabra=false;
  
  int turnos=0;
  
  int tigresInmoviles=0;//lleva el conteo de cuantos tigres estan en pociciones inmoviles.
  int fichasCabrasInicializadas;//numero de cabras lanzadas por el usuario.
  
  
  public Metodos()
  {
    tablero=new Ficha[5][5];
  }
  
  public void turnoDeLasCabras()
  {
    if(turnoCabra==true)
    {
      turnoCabra=false;
      turnoTigre=true;
      if(fichasCabrasInicializadas<20) //llama metodo a poner ficha en un espacio en null.
      {
        for(int fila=0; fila<tablero.length; fila++)
        {
          for (int columna=0; columna<tablero[0].length; columna++)
          {
            if(tablero[fila][columna]!=null)//arreglar el tablero 
            {
              if(tablero[fila][columna].getTipo()==1)//1 para jugador cabra
              {
                
              }
            }
        }
      }
      }else
      {
       //llama método mover fichasCabras en en Campo.
      }
    }
    
  }//Fin del metodoTurnoCabra.
  
  public void ponerFicha()//pone la ficha por turnos
  {
    if(turnos%2==0)//si es 1 es el turno de las cabras
    {
      turnoDeLasCabras();
    }
    else
    {
      turnoDeLosTigres();
    }
  }
  
  public void turnoDeLosTigres()
  {
    if(turnoTigre==true)
    {
      turnoTigre=false;//pasa turnoTigre a false para que sea el tueno de las cabras
      turnoCabra=true;//puede entrar a un métodoTurnoDe las Cabras.
      if(tigresInmoviles<4)
      {int seleccionTigre;
        seleccionTigre=seleccionTigreAzar();//selecionTigre obtiene un número de 1 a 4.
        if(encontroVecinoCabra()==true)//si existre un veciono proximo mueve, si hay dos vecinos hay que llamar un merodo rando de los dos botones.
        {//MetodoAtraparCabra();
          tigresInmoviles=0;//si encuentra posiciones durante el juego, esta variables pasa en "0" si no el else agrega los 4inmociles y pierde
        }
        else if (encontroEspacioCasillaTigre()==true)
        {
          //metodoMoverFichaTigre();
          tigresInmoviles=0;//si llega a 4 pierde 
        }
        else
        {
          tigresInmoviles++;//si suma cuatro
          turnoDeLosTigres();//recursividad se llama a si mismo otra ves
        }
      }
    }
    else
    {
      perdio();
    }
  }//Fin del método
  
  public int seleccionTigreAzar()//
  {
    int tigreRandom=(int)(Math.random()*4+1);//escoje un número del 1 al 4(TIGRES)
    return tigreRandom;
  }
  
  public void perdio()
  {
    
  }
  
  public boolean encontroVecinoCabra()//Aplicar recursibidad.buscar botones vecinos que posea= boton(contador).elqual(fichaCabra)
  {
    boolean x=false;
    return x;
  }
  
  public boolean encontroEspacioCasillaTigre()//busca botones igual a null.
  {
    boolean y=false;
    return y;
  }
  
  
}//Fin de la clase.
