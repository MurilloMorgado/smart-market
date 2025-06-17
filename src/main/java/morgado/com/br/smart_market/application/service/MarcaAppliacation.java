package morgado.com.br.smart_market.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import morgado.com.br.smart_market.application.input.MarcaInput;
import morgado.com.br.smart_market.application.output.MarcaOutput;
import morgado.com.br.smart_market.domain.models.Marca;

@Service
@RequiredArgsConstructor
public class MarcaAppliacation implements MarcaInput {

  private final MarcaOutput marcaOutput;

  @Override
  public List<Marca> listarMarcas() {
    
    return marcaOutput.listarMarcas();
  }

  @Override
  public Marca buscarMarca(Long idMarca) {
    
    return marcaOutput.buscarMarca(idMarca);
  }

  @Override
  public Long criarMarca(Marca marca) {
    
    return marcaOutput.criarMarca(marca);
  }

  @Override
  public void atualizarMarca(Marca marca, Long idMarca) {

    marcaOutput.atualizarMarca(marca, idMarca);
  }

  @Override
  public void deletarMarca(Long idMarca) {
    
    marcaOutput.deletarMarca(idMarca);
  }

}
