package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InformarLectura {

	@Before("execution(public void lecturaFichero())")
	public void estaPorInformar()
	{
		System.out.println("Se va a procesar la lectura del fichero...");
	}
}
