package clases;

public class Estudiante {
	
	private String nombreEstudiante;
	private String edadEstudiante;
	private String identificacionEstudiante;
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public String getEdadEstudiante() {
		return edadEstudiante;
	}
	public void setEdadEstudiante(String edadEstudiante) {
		this.edadEstudiante = edadEstudiante;
	}
	public String getIdentificacionEstudiante() {
		return identificacionEstudiante;
	}
	public void setIdentificacionEstudiante(String identificacionEstudiante) {
		this.identificacionEstudiante = identificacionEstudiante;
	}
	public String toString() {
		return ("Nombre del estudiante: "+nombreEstudiante+
				"\nEdad del estudiante: "+edadEstudiante+
				"\nIdentificacion del estudiante: "+identificacionEstudiante);
	}	
}


