package es.pildoras.aop.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.Configuracion;
import es.pildoras.aop.LecturaDAO;

public class Principal {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		LecturaDAO lectura = contexto.getBean("lecturaDAO", LecturaDAO.class);
		
		lectura.lecturaFichero();
		
		contexto.close();
	}
}
