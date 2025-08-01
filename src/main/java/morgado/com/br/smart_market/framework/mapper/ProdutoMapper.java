package morgado.com.br.smart_market.framework.mapper;

import org.springframework.stereotype.Component;

import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.domain.models.Request.ProdutoRequest;
import morgado.com.br.smart_market.framework.models.ProdutoDB;

@Component
public class ProdutoMapper {

  public Produto toDomain(ProdutoDB produtoDB) {

    return new Produto(
        produtoDB.getId(),
        produtoDB.getNome(),
        produtoDB.getCategoria(),
        produtoDB.getMarcaProduto());
  }

  public ProdutoDB toEntity(Produto produto) {

    return new ProdutoDB(
        produto.getId(),
        produto.getNome(),
        produto.getCategoria(),
        produto.getMarcaProduto());
  }

  public ProdutoDB produtoRequestToProdutoDB(ProdutoRequest produtoRequest) {

    ProdutoDB produtoDB = new ProdutoDB(
        null,
        produtoRequest.getNome(),
        produtoRequest.getMarca(),
        produtoRequest.getCategoria());
        
    return produtoDB;
  };

}
