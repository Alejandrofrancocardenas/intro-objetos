package introobject;


public class Estudiante {
	    private String nombres;
	    private String apellidos;
	    private int documento;
	    private String correo;
	    private int edad;

	    public Estudiante() {
	        
	    }

	    public Estudiante(String nombres, String apellidos, String correo, int documento, int edad) {
	        this.nombres = nombres;
	        this.apellidos = apellidos;
	        this.correo = correo;
	        this.documento = documento;
	        this.edad = edad;
	    }

	    public String getNombres() {
	        return nombres;
	    }

	    public void setNombres(String nombres) {
	        this.nombres = nombres;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public int getDocumento() {
	        return documento;
	    }

	    public void setDocumento(int documento) {
	        this.documento = documento;
	    }

	    public String getCorreo() {
	        return correo;
	    }

	    public void setCorreo(String correo) {
	        this.correo = correo;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	}


