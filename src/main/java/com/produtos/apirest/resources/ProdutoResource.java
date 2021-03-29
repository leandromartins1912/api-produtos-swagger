package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produtos;
import com.produtos.apirest.repository.ProdutosRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="API Rest Produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    @Autowired
    private ProdutosRepository produtosRepository;

    @GetMapping("/produto")
    @ApiOperation("Retorna Lista Produtos")
    public List<Produtos> listaPordutos(){
        return produtosRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation("Retorna Produto por id")
    public Produtos listaPorduto(@PathVariable("id") long id){
        return produtosRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation("Cria produto")
    public Produtos salvaProduto(@RequestBody Produtos produtos){
        return produtosRepository.save(produtos);
    }

    @DeleteMapping("/produto")
    @ApiOperation("Deleta Produtos")
    public void deletaProduto(@RequestBody Produtos produtos){
        produtosRepository.delete(produtos);
    }

    @PutMapping("/produto")
    @ApiOperation("Altera produto")
    public Produtos atualizaProduto(@RequestBody Produtos produtos){
        return produtosRepository.save(produtos);
    }
}
