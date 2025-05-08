package morgado.com.br.smart_market.application.output;

import java.util.List;

import morgado.com.br.smart_market.domain.models.Produto;

public interface ProdutoOutput {

  List<Produto> listarProdutos();

  Produto buscarProduto(Long idProduto);

  Produto criarProduto(Produto produto);

  void atualizarProduto(Produto produto, Long idProduto);

  void deletarProduto(Long idProduto);

}
