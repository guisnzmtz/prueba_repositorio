
public class Alumno {
	private String dni;
	private String numExpediente;
	private String nombre;
	private String apellido;
	public List<Modulo> listaModulos;
	public Vehiculo vehiculo;
	private Grupo grupo;
	private String apodo;
	private int edad;


	public Alumno(String dni, String numExpediente, String nombre, String apellido, Grupo grupo, String apodo, int edad ) {
		this.dni = dni;
		this.numExpediente = numExpediente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.grupo = grupo;
		this.listaModulos = new ArrayList<>();
		this.apodo = apodo;
		this.edad = edad;
	}
	
	public void matriculaModulo(Modulo modulo) {
		listaModulos.add(modulo);
	}
}
