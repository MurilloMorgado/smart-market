package morgado.com.br.smart_market.framework.mapper;

import org.springframework.stereotype.Component;

import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.framework.models.ProdutoDB;

@Component
public class ProdutoMapper {

  public Produto toDomain(ProdutoDB produtoDB) {

    return new Produto(
        produtoDB.getId(),
        produtoDB.getNome(),
        produtoDB.getCategoria());
  }

  public ProdutoDB toEntity(Produto produto) {

    return new ProdutoDB(
        produto.getId(),
        produto.getNome(),
        produto.getCategoria());
  }

}
