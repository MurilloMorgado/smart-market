package morgado.com.br.smart_market.framework.output;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.output.MarcaOutput;
import morgado.com.br.smart_market.framework.output.jpa.MarcaRepository;

@Service
@RequiredArgsConstructor
public class MarcaFramework implements MarcaOutput {
  
  private MarcaRepository marcaRepository;
}
