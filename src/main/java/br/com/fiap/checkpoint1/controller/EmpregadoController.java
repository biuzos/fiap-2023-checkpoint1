package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.service.EmpregadoService;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

	@Autowired
	private EmpregadoService empregadoService;

	@GetMapping
	public List<Empregado> listarTodos() {
		return empregadoService.listar();

	}

	@PostMapping
	public Empregado adicionar(@RequestBody Empregado empregado) {

		Empregado empregadoInsert = new Empregado();
		empregadoInsert.setNome(empregado.getNome());
		empregadoInsert.setEndereco(empregado.getEndereco());

		return empregadoService.salvar(empregadoInsert);
	}

	@PutMapping
	public Empregado atualizar(@RequestBody Empregado empregado) {
		Empregado result = empregadoService.salvar(empregado);
		return result;

	}

}
