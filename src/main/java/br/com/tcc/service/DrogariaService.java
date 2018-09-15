package br.com.tcc.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/Drogaria/rest/drogaria
@Path("tcc")
public class DrogariaService {
	@GET
	public String exibir(){
		return "Curso de Java";
	}
}
