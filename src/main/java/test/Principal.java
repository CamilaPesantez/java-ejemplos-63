package test;
import java.util.Scanner;
import clases.Profesor;
import clases.Estudiante;
import clases.Asignatura;

public class Principal {
	public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion;

        boolean salir = false;

        while (!salir) {
            System.out.println("---------------Menú de Opciones------------------");
            System.out.println("Escoja la accion que desea realizar");
            System.out.println("1. Ingresar datos del profesor");
            System.out.println("2. Ingresar datos del estudiante");
            System.out.println("3. Ingresar datos de la asignatura");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la Opción 1");
            		Profesor datosProfesor = new Profesor();

            		Scanner entradaUno = new Scanner (System.in);
            		System.out.println("Ingrese Nombre completo del profesor");
            		String NombreProfesor = entradaUno.nextLine();
            		System.out.println("Ingrese Edad del profesor");
            		String EdadProfesor = entradaUno.nextLine();
            		System.out.println("Ingrese Identificacion del profesor");
            		String IdentificacionProfesor = entradaUno.nextLine();
            		System.out.println("Ingrese Conocimiento");
            		String Conocimiento = entradaUno.nextLine();
            		System.out.println("IngreseEspecialidad");
            		String Especialidad = entradaUno.nextLine();

            		System.out.println("--------------------------------------------------------------------------------------------");
            		datosProfesor.setNombreProfesor(NombreProfesor);
            		datosProfesor.setEdadProfesor(EdadProfesor);
            		datosProfesor.setIdentificacionProfesor(IdentificacionProfesor);
            		datosProfesor.setEspecialidad(Especialidad);
            		datosProfesor.setConocimiento(Conocimiento);
            		System.out.println(datosProfesor.toString());
            		System.out.println("\n--------------------------------------------------------------------------------------------");
            		break;
                case 2:
                    System.out.println("Seleccionaste la Opción 2");
                    Estudiante datosEstudiante = new Estudiante();

            		Scanner entradaDos = new Scanner (System.in);
            		System.out.println("Ingrese Nombre completo del estudiante");
            		String NombreEstuiante = entradaDos.nextLine();
            		System.out.println("Ingrese Edad del estudiante");
            		String EdadEstudiante = entradaDos.nextLine();
            		System.out.println("Ingrese Identificacion del estudiante");
            		String IdentificacionEstudiante = entradaDos.nextLine();

            		System.out.println("--------------------------------------------------------------------------------------------");
            		datosEstudiante.setNombreEstudiante(NombreEstuiante);
            		datosEstudiante.setEdadEstudiante(EdadEstudiante);
            		datosEstudiante.setIdentificacionEstudiante(IdentificacionEstudiante);
            		System.out.println(datosEstudiante.toString());
            		System.out.println("\n--------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Seleccionaste la Opción 3");
                    Asignatura datosAsignatura = new Asignatura();

            		Scanner entradaTres = new Scanner (System.in);
            		System.out.println("Ingrese Nombre de la asignatura");
            		String nombreAsignatura = entradaTres.nextLine();
            		System.out.println("Ingrese codigo");
            		String codigo = entradaTres.nextLine();
            		
            		System.out.println("--------------------------------------------------------------------------------------------");
            		datosAsignatura.setNombreAsignatura(nombreAsignatura);
            		datosAsignatura.setCodigo(codigo);
            		System.out.println(datosAsignatura.toString());
            		System.out.println("\n--------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        }

        entrada.close();
    }
}