package morgado.com.br.smart_market.application.input;

import java.util.List;

import morgado.com.br.smart_market.domain.models.Compra;
import morgado.com.br.smart_market.domain.models.Request.CompraRequest;

public interface CompraInput {
  
  List<Compra> listarCompras();

  Compra buscarCompra(Long idCompra);

  Compra criarCompra(CompraRequest compra);

}
