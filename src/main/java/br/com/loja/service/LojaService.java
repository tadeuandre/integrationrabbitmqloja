package br.com.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.repository.ProdutoRepository;

@Service
public class LojaService {

	private ProdutoRepository produtoRepository;

	@Autowired
	public void setDao(ProdutoRepository repository) {
		this.produtoRepository = repository;
	}
}
