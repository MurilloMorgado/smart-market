package morgado.com.br.smart_market.framework.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.ProdutoInput;
import morgado.com.br.smart_market.domain.models.Produto;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

  private final ProdutoInput produtoInput;

  @GetMapping
  public ResponseEntity<List<Produto>> listarProdutos() {
    List<Produto> listaDeProdutos = produtoInput.listarProdutos();
    return ResponseEntity.ok().body(listaDeProdutos);
  }

  @GetMapping(path = "/{idProduto}")
  public ResponseEntity<Produto> buscarProduto(@PathVariable Long idProduto) {
    Produto produto = produtoInput.buscarProduto(idProduto);
    return ResponseEntity.ok().body(produto);
  }

  @PostMapping
  public ResponseEntity<Long> criarProduto(@RequestBody Produto produto) {
    Long idProduto = produtoInput.criarProduto(produto).getId();
    return ResponseEntity.ok().body(idProduto);
  }

  @PutMapping(path = "/{idProduto}")
  public ResponseEntity<Void> atualizarProduto(@RequestBody Produto produto, @PathVariable Long idProduto) {
    produtoInput.atualizarProduto(produto, idProduto);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping(path = "/{idProduto}")
  public ResponseEntity<Void> deletarProduto(@PathVariable Long idProduto) {
    produtoInput.deletarProduto(idProduto);
    return ResponseEntity.ok().build();
  }
}
