package morgado.com.br.smart_market.framework.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
