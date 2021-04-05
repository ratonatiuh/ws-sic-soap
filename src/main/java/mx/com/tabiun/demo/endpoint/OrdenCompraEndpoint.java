/**
 * 
 */
package mx.com.tabiun.demo.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.com.tabiun.demo.repository.OrdenCompraRepository;
import mx.com.tabiun.demo.sic_service.GetOrdenCompraRequest;
import mx.com.tabiun.demo.sic_service.GetOrdenCompraResponse;
import mx.com.tabiun.demo.sic_service.OrdenCompra;
/**
 * @author parallels
 *
 */

@Endpoint
public class OrdenCompraEndpoint {
	private static final String NAMESPACE_URI = "http://tabiun.com.mx/demo/sic-service";
	
	private OrdenCompraRepository ordenCompraRepository;
	
	@Autowired
	public OrdenCompraEndpoint(OrdenCompraRepository ordenCompraRepository) {
		this.ordenCompraRepository = ordenCompraRepository;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOrdenCompraRequest")
	@ResponsePayload
	public GetOrdenCompraResponse getOrdenCompra(@RequestPayload GetOrdenCompraRequest request) {
		GetOrdenCompraResponse response = new GetOrdenCompraResponse();
		List<OrdenCompra> ordenesCompra = ordenCompraRepository.listAllOrdenesCompra();
		for(int i = 0;i<ordenesCompra.size();i++) {
			response.getOrdenCompra().add(ordenesCompra.get(i));
		}
		return response;
	}

}
