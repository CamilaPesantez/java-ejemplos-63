package clases;

public class Asignatura {
	private String nombreAsignatura;
	private String codigo;
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String toString() {
		return ("Nombre de la asignatura: "+nombreAsignatura+
				"\nCodigo:"+codigo);
	}

	
}
