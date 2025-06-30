package morgado.com.br.smart_market.framework.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import morgado.com.br.smart_market.domain.models.Produto;
import morgado.com.br.smart_market.domain.models.ProdutoMarca;
import morgado.com.br.smart_market.framework.models.ProdutoDB;
import morgado.com.br.smart_market.framework.models.ProdutoMarcaDB;

@Component
public class ProdutoMapper {

  public Produto toDomain(ProdutoDB produtoDB) {

    List<ProdutoMarca> produtoMarcas = produtoDB.getProdutoMarcas().stream().map(ProdutoMarcaDB::toDomain).collect(Collectors.toList());

    return new Produto(
        produtoDB.getId(),
        produtoDB.getNome(),
        produtoDB.getCategoria(),
        produtoMarcas);
  }

  public ProdutoDB toEntity(Produto produto) {

    return new ProdutoDB(
        produto.getId(),
        produto.getNome(),
        produto.getCategoria(),
        null);
  }

}
