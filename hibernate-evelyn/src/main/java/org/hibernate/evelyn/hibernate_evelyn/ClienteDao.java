package org.hibernate.evelyn.hibernate_evelyn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class ClienteDao{
	
	
protected SessionFactory sessionFactory;
	
	public void setup(){
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try{
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e){
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	
	
	public void crear(Cliente  cliente){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	public Cliente read(long clienteId){
		Session s =  sessionFactory.openSession();
		Cliente cliente = s.get(Cliente.class,clienteId);
		s.close();
		return cliente;
		
	}
	
	
	
	public void update(Cliente producto){
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(producto);
		s.getTransaction().commit();
		s.close();
	}
	

	
	
	//le mando el id del producto a eliminar
	public void delete(int clienteID){
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Cliente cliente =read(clienteID);
		s.delete(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	
	

}
