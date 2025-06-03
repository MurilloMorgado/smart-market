package morgado.com.br.smart_market.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.SupermercadoInput;
import morgado.com.br.smart_market.application.output.SupermercadoOutput;
import morgado.com.br.smart_market.domain.models.Supermercado;

@Service
@RequiredArgsConstructor
public class SupermercadoApplication implements SupermercadoInput {

  private final SupermercadoOutput supermercadoOutput;

  @Override
  public List<Supermercado> listarSupermercado() {
    
    return supermercadoOutput.listarSupermercado();
  }
  
}
