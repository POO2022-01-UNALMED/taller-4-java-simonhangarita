package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	private int codigo;
	private String nombre;
	private Tipo(int codigo) {
		this.codigo = codigo;
	}
  public void setCodigo(int codigo){
    this.codigo=codigo;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public int getCodigo(){
    return codigo;
  }
}