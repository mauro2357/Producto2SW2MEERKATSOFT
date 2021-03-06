package rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class ApplicationConfig extends Application {

	public Set<Class<?>> getClasses() {
        return getRestClasses();
    }
    
	//Auto-generated from RESTful web service wizard
    private Set<Class<?>> getRestClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		resources.add(Servicios.consultaproductosService.class);
		resources.add(Servicios.consultameserosService.class);
		resources.add(Servicios.consultaTotalVentasService.class);
		resources.add(Servicios.consultaclientesService.class);
		resources.add(Servicios.consultaTotalivaService.class);
		resources.add(Servicios.consultagustomusicalService.class);
		resources.add(Servicios.consultadespachadorService.class);
		resources.add(Servicios.consultanumeroventasService.class);
		resources.add(Servicios.consultamejormeseroService.class);
		resources.add(Servicios.consultamasvendidoService.class);
		return resources;    
    }
}