package introobject;

public class object {
	 public static void main(String[] args) {
	     // TODO Auto-generated method stub  
	     Estudiante e = new Estudiante();
	    	
	   	 e.setNombres("juan camilo");
	     e.setApellidos("londono perez");
	   	 e.setDocumento(1091885106);
	   	 e.setCorreo("alejoplay27@gmail.com");
	   	 e.setEdad(19);
	    	
	   	 Estudiante e2 = new Estudiante("claudia","londono","correo@gmail",1091885106,19);
	   	 e2.setNombres("Fernando");
	   	 System.out.println(e.getNombres() +" " + e.getApellidos() +":"+ e.getDocumento() +","+ e.getCorreo() + ","+ e.getEdad() + ".");
	   	 
	     System.out.println(e2.getNombres() +" " + e2.getApellidos() +":"+ e2.getDocumento() +","+ e2.getCorreo() + ","+ e2.getEdad() + ".");
	    }
	}
	

