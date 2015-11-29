public class Ficha 
{
  //private int cabra=1;
  //private int tigre=2;
  private int tipo; //dependiendo el turno si es el del jugador el tipo es 1 
  private int fila;
  private int columna;
  
  public Ficha(int tipo, int fila, int columna)
  {
    this.tipo=tipo;
    this.fila=fila;
    this.columna=columna;
  }
  
  public void setTipo(int tipo)
  {
    this.tipo=tipo;
  }
  public int getTipo()
  {
    return tipo;
  }
  public void setFila(int fila)
  {
    this.fila=fila;
  }
  public int getFila()
  {
    return fila;
  }
  public void setColumna(int columna)
  {
   this.columna=columna;
  }
  public int getColumna()
  {
    return columna;
  }
}
