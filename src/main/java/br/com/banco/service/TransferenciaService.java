package br.com.banco.service;

import br.com.banco.repository.TransferenciaRepository;
import br.com.banco.service.dto.TransferenciaDTO;
import br.com.banco.service.mapper.TransferenciaMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransferenciaService {

    @Autowired
    private TransferenciaMapper transferenciaMapper;
    @Autowired
    private TransferenciaRepository transferenciaRepository;

    public List<TransferenciaDTO> getTransferencias() {
        return transferenciaRepository.findAll()
                .stream()
                .map(this.transferenciaMapper::toTransferenciaDtoDTO)
                .sorted(Comparator.comparing(TransferenciaDTO::getDataTransferencia))
                .collect(Collectors.toList());
    }
}
