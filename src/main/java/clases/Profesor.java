package clases;

public class Profesor {
	private String nombreProfesor;
	private String edadProfesor;
	private String identificacionProfesor;
	private String conocimiento;
	private String especialidad;
	
	public String getNombreProfesor() {
		return nombreProfesor;
	}


	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}


	public String getEdadProfesor() {
		return edadProfesor;
	}


	public void setEdadProfesor(String string) {
		this.edadProfesor = string;
	}


	public String getIdentificacionProfesor() {
		return identificacionProfesor;
	}


	public void setIdentificacionProfesor(String identificacionProfesor) {
		this.identificacionProfesor = identificacionProfesor;
	}


	public String getConocimiento() {
		return conocimiento;
	}


	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

	public String toString() {
		return ("Nombre del profesor: "+nombreProfesor+
				"\nEdad del profesor: "+edadProfesor+
				"\nIdentificacion del profesor: "+identificacionProfesor+
				"\nConocimientos: "+conocimiento+
				"\nEspecialidad: "+especialidad);
	
	}


}
