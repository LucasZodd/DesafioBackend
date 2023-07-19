package br.com.banco.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaDTO {

    private Long id;
    @EqualsAndHashCode.Exclude
    @JsonFormat(pattern = "MMM dd yyyy")
    private Timestamp dataTransferencia;
    @EqualsAndHashCode.Exclude
    private BigDecimal valor;
    @EqualsAndHashCode.Exclude
    private String tipo;
    @EqualsAndHashCode.Exclude
    private String nomeOperador;
    @EqualsAndHashCode.Exclude
    private Long contaId;

}
