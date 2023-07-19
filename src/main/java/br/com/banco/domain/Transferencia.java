package br.com.banco.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TRANSFERENCIA")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @JsonFormat(pattern = "MMM dd yyyy")
    @Column(name = "DATA_TRANSFERENCIA")
    private Timestamp dataTransferencia;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "NOME_OPERADOR_TRANSACAO")
    private String nomeOperador;

    @Column(name = "CONTA_ID")
    private Long contaId;

}
