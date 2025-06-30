package morgado.com.br.smart_market.application.output;

import java.util.List;

import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.domain.models.Request.ProdutoRequest;

public interface ProdutoOutput {

  List<Produto> listarProdutos();

  Produto buscarProduto(Long idProduto);

  Produto criarProduto(ProdutoRequest produtoRequest);

  void atualizarProduto(Produto produto, Long idProduto);

  void deletarProduto(Long idProduto);

}
