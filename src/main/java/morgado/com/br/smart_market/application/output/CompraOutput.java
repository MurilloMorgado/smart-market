package morgado.com.br.smart_market.application.output;

import java.util.List;

import morgado.com.br.smart_market.domain.models.Compra;

public interface CompraOutput {
  
  List<Compra> listarCompras();
}
