package br.com.banco.service.mapper;

import br.com.banco.domain.Transferencia;
import br.com.banco.service.dto.TransferenciaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransferenciaMapper {

    Transferencia toTransferencia (TransferenciaDTO transferenciaDTO);

    TransferenciaDTO toTransferenciaDtoDTO (Transferencia transferencia);

}
