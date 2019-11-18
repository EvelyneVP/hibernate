package org.hibernate.evelyn.hibernate_evelyn;
import java.util.Date;
public class App 
{
	
	
	

	public  static void  imprimir(String mensaje){
		System.out.println(mensaje);
		
	}
	
	
    public static void main( String[] args )
    {
        
    	
    	crear();
    	read();
    	update();
    	delete();
    	
    }

    //(long id, String nombre, String apellidos, Date fechaNac, String telefono, char estado)
    
	public static void crear(){
		ClienteDao daoCliente = new ClienteDao();
		@SuppressWarnings("deprecation")
		Cliente cliente = new Cliente(0,"evelyn","verdesoto",new Date("12/11/1750"),"0954091959",'A');		
		daoCliente.setup();
		daoCliente.crear(cliente);
		@SuppressWarnings("deprecation")
		Cliente cliente2 = new Cliente(0,"naruto","uzumaki",new Date("12/11/1750"),"0954091959",'A');		
		daoCliente.crear(cliente2);
	
		
	}
	
	
	public static void read(){
		ClienteDao daoCliente = new ClienteDao();
		Cliente cliente=new Cliente();
		daoCliente.setup();
		cliente=daoCliente.read(1);
		imprimir(cliente.toString());
		
		//daoProducto.setup();
		//imprimir(producto.toString());
		//book.imprimir();
	}

	
	public static void update(){

		ClienteDao daoCliente = new ClienteDao();
		daoCliente.setup();
		Cliente cliente =daoCliente.read(1);
		cliente.setNombre("dario");
		daoCliente.update(cliente);
		
		
	}
	

	
	public static void delete(){
		ClienteDao daoCliente = new ClienteDao();
		daoCliente.setup();
		daoCliente.delete(1);
		
	}
	
	
	
	
}
