package morgado.com.br.smart_market.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.CompraInput;
import morgado.com.br.smart_market.application.output.CompraOutput;
import morgado.com.br.smart_market.domain.models.Compra;

@Service
@RequiredArgsConstructor
public class CompraApplication implements CompraInput {

  private final CompraOutput compraOutput;

  @Override
  public List<Compra> listarCompras() {
    
    return compraOutput.listarCompras();

  }

  @Override
  public Compra buscarCompra(Long idCompra) {
   
    return compraOutput.buscarCompra(idCompra);

  }

}
