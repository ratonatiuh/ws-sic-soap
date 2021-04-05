package mx.com.tabiun.demo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

import mx.com.tabiun.demo.sic_service.Contacto;
import mx.com.tabiun.demo.sic_service.Egreso;
import mx.com.tabiun.demo.sic_service.OrdenCompra;
import mx.com.tabiun.demo.sic_service.Product;
import mx.com.tabiun.demo.sic_service.Proyecto;

@Component
public class OrdenCompraRepository {
	private static final List<OrdenCompra> ordenesCompra = new ArrayList<OrdenCompra>();
	
	@PostConstruct
	public void initData() {
		Product producto1 = new Product();
		producto1.setPartida(511);
		producto1.setDescripcion("GABINETE EMPRESARIAL, 24 RU, PUERTAS FRONTAL Y POSTERIOR "
				+ "PERFORADAS DE UNA SOLA BISAGRA CON MANGOS OSCILANTES.");
		producto1.setCantidad(1);
		producto1.setUnidad("PIEZA");
		producto1.setPrecio(23414.12F);
		producto1.setIva(0.16F);
	
		Product producto2 = new Product();
		producto2.setPartida(511);
		producto2.setDescripcion("PATCH PANEL 48 PUERTOS 110-MOD 8W8P, "
				+ "T568/B CATEGORIA 6A IP10 DP6 PLUS, 1RU ROHS NEGRO.");
		producto2.setCantidad(1);
		producto2.setUnidad("PIEZA");
		producto2.setPrecio(22539.76F);
		producto2.setIva(0.16F);
		
		Product producto3 = new Product();
		producto3.setPartida(511);
		producto3.setDescripcion("PATCH PANEL 24 PUERTOS 110-MOD 8W8P, "
				+ "T568/B CATEGORIA 6A IP10 DP6 PLUS, 1RU ROHS NEGRO.");
		producto3.setCantidad(1);
		producto3.setUnidad("PIEZA");
		producto3.setPrecio(12067.0100F);
		producto3.setIva(0.16F);
		
		Product producto4 = new Product();
		producto4.setPartida(431);
		producto4.setDescripcion("BARRA DE CONTACTOS HORIZONTAL PARA MONTAJE EN 19'', 23''; "
				+ "6 SALIDAS 5-15R, PLUG NEMA 515P, 110-125V, 15A, CON SUPRESOR DE PICOS");
		producto4.setCantidad(1);
		producto4.setUnidad("PIEZA");
		producto4.setPrecio(4546.2500F);
		producto4.setIva(0.16F);
		
		Product producto5 = new Product();
		producto5.setPartida(512);
		producto5.setDescripcion("SG220-50 50-PORT GIGABIT SMART SWITCH.");
		producto5.setCantidad(1);
		producto5.setUnidad("PIEZA");
		producto5.setPrecio(23414.12F);
		producto5.setIva(0.16F);
		
		Product producto6 = new Product();
		producto6.setPartida(411);
		producto6.setDescripcion("ORGANIZADOR VERTICAL LATERAL FRONTAL Y POSTERIOR 22 RMU, "
				+ "41.5''H X 4.9''W X 12.0''D. PARA INSTALACION CENTRA ENTRE RACKS USAR AXE 310344.");
		producto6.setCantidad(2);
		producto6.setUnidad("PIEZA");
		producto6.setPrecio(23414.12F);
		producto6.setIva(0.16F);

		
		Contacto contacto1 = new Contacto();
		contacto1.setCorreo("fcr@unam.mx");
		contacto1.setTelefono("56220375");
		
		Proyecto proyecto1 = new Proyecto();
		proyecto1.setNProyecto("PRESUPUESTO");
		proyecto1.setNombreProyecto("Presupuesto General");
		
		Egreso egreso1 = new Egreso();
		egreso1.setGasto("10.01.424.01.411.01");
		egreso1.setOrigen("PRESUPUESTO");
		egreso1.setImporte(4929.70F);
		
		Egreso egreso2 = new Egreso();
		egreso2.setGasto("10.01.424.01.431.05");
		egreso2.setOrigen("PRESUPUESTO");
		egreso2.setImporte(5273.65F);
		
		Egreso egreso3 = new Egreso();
		egreso3.setGasto("10.01.424.01.511.04");
		egreso3.setOrigen("PRESUPUESTO");
		egreso3.setImporte(51250.00F);
		
		Egreso egreso4 = new Egreso();
		egreso4.setGasto("10.01.424.01.511.14");
		egreso4.setOrigen("INGRESOS EXTRAORIDINARIOS");
		egreso4.setImporte(16054.23F);
		
		Egreso egreso5 = new Egreso();
		egreso5.setGasto("10.01.424.01.512.07");
		egreso5.setOrigen("PRESUPUESTO");
		egreso5.setImporte(26501.05F);
	
		String dateTime = "2019-04-02T17:05:45.678Z";
		XMLGregorianCalendar fecha1;
		OrdenCompra ordenCompra1 = new OrdenCompra();
		try {
			fecha1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateTime);
			ordenCompra1.setAreaSolicitante("Coordinación de informática y servicios de");
			ordenCompra1.setResponsableAreaSolicitante("Francisco Javier Castañeda Rojas");
			ordenCompra1.setFechaCreacion(fecha1);
			ordenCompra1.setContacto(contacto1);
			ordenCompra1.setProyecto(proyecto1);
			ordenCompra1.setDependencia(424);
			ordenCompra1.setSubdependencia(01);
			ordenCompra1.setEstado("Cancelada");
			ordenCompra1.setTipo("Compra BM");
			ordenCompra1.setOcId("FARQ-19-SC-000232");
			ordenCompra1.getProducto().add(producto1);
			ordenCompra1.getProducto().add(producto2);
			ordenCompra1.getProducto().add(producto3);
			ordenCompra1.getProducto().add(producto4);
			ordenCompra1.getProducto().add(producto5);
			ordenCompra1.getProducto().add(producto6);
			ordenCompra1.getEgreso().add(egreso1);
			ordenCompra1.getEgreso().add(egreso2);
			ordenCompra1.getEgreso().add(egreso3);
			ordenCompra1.getEgreso().add(egreso4);
			ordenCompra1.getEgreso().add(egreso5);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ordenesCompra.add(ordenCompra1);
	}
	
	public List<OrdenCompra> listAllOrdenesCompra() {
		return ordenesCompra;
	}
	
	

}
