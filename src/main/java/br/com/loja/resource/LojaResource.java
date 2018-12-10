package br.com.loja.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.service.LojaService;

@RestController
public class LojaResource {

	@Autowired
	private LojaService lojaService;
}
