package com.hackhathon.Polinize.Hackathon.Polinize.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackhathon.Polinize.Hackathon.Polinize.model.Produto;
import com.hackhathon.Polinize.Hackathon.Polinize.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {
		@Autowired
		private ProdutoRepository repository;
		
		@GetMapping
		public ResponseEntity <List<Produto>> getAll(){
			return ResponseEntity.ok(repository.findAll());
			
		}
		@GetMapping("/{id}")
		public ResponseEntity<Produto>getById(@PathVariable long id){
			return repository.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
		}
		
		@GetMapping("/nome/{nome}")
		public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome){
			return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
		}
		
		@GetMapping("/tipo/{tipo}")
		public ResponseEntity<List<Produto>> getByTipo(@PathVariable String tipo){
			return ResponseEntity.ok(repository.findAllByTipoContainingIgnoreCase(tipo));
		}
		
		@GetMapping("/marca/{marca}")
		public ResponseEntity<List<Produto>> getByMarca(@PathVariable String marca){
			return ResponseEntity.ok(repository.findAllByMarcaContainingIgnoreCase(marca));
		}
		
		@GetMapping("/tamanho/{tamanho}")
		public ResponseEntity<List<Produto>> getByTamanho(@PathVariable String tamanho){
			return ResponseEntity.ok(repository.findAllByTipoContainingIgnoreCase(tamanho));
		}
		
		@PostMapping
		public ResponseEntity<Produto> post (@RequestBody Produto produto){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
			
		}
		@PutMapping
		public ResponseEntity<Produto> put (@RequestBody Produto produto){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
		}
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
		
		
		
		
		
}
