package morgado.com.br.smart_market.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.ProdutoInput;
import morgado.com.br.smart_market.application.output.ProdutoOutput;
import morgado.com.br.smart_market.domain.models.Produto;

@Service
@RequiredArgsConstructor
public class ProdutoApplication implements ProdutoInput {

  private final ProdutoOutput produtoOutput;

  @Override
  public List<Produto> listarProdutos() {

    return produtoOutput.listarProdutos();

  }

  @Override
  public Produto buscarProduto(Long idProduto) {

    return produtoOutput.buscarProduto(idProduto);
  }

  @Override
  public Produto criarProduto(Produto produto) {

    return produtoOutput.criarProduto(produto);
  }

  @Override
  public void atualizarProduto(Produto produto, Long idProduto) {

    produtoOutput.atualizarProduto(produto, idProduto);
  }

  @Override
  public void deletarProduto(Long idProduto) {
    
    produtoOutput.deletarProduto(idProduto);
  }

}
