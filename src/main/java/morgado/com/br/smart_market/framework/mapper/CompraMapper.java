package morgado.com.br.smart_market.framework.mapper;

import org.springframework.stereotype.Component;

import morgado.com.br.smart_market.domain.models.Compra;
import morgado.com.br.smart_market.domain.models.Request.CompraRequest;
import morgado.com.br.smart_market.framework.models.CompraDB;

@Component
public class CompraMapper {

  public Compra toDomain(CompraDB compraDB) {
    return new Compra(
        compraDB.getId(),
        compraDB.getIdProdutoSupermercado(),
        compraDB.getData(),
        compraDB.getValorProduto());
  }

  public CompraDB toEntity(CompraRequest compra) {
    return new CompraDB(
        null,
        compra.getIdProdutoSupermercado(),
        null,
        compra.getValorProduto());
  }
}
