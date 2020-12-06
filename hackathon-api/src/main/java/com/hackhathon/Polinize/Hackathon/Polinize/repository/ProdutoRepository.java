package com.hackhathon.Polinize.Hackathon.Polinize.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hackhathon.Polinize.Hackathon.Polinize.model.Produto;
/*Repositório que será controlado em ProdutoController
 * 
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	/*Busca por algum dado dentro da tabela produtos podendo ser tanto
	 * letras maiúsculas como minúsculas
	 */
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Produto> findAllByTipoContainingIgnoreCase(String tipo);
	
	public List<Produto> findAllByMarcaContainingIgnoreCase(String marca);

	public List<Produto> findAllByTamanhoContainingIgnoreCase(String tamanho);
}
