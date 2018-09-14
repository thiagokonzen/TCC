package br.com.tcc.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import br.com.tcc.dao.EstadoDAO;
import br.com.tcc.domain.Estado;

@Path("estado")
public class EstadoService {
	@GET
	public String listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> estados = estadoDAO.listar("nome");

		Gson gson = new Gson();
		String json = gson.toJson(estados);

		return json;
	}
}
