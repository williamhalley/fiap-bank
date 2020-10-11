package br.com.fiap.fiapbank.service;

import br.com.fiap.fiapbank.dto.AlunoDTO;
import br.com.fiap.fiapbank.entity.Aluno;

public interface AlunoService {

    AlunoDTO saveAluno(AlunoDTO alunoDTO);
    Iterable<AlunoDTO> findAll();
    AlunoDTO findById(Long id);
    String delete(Long id);
    AlunoDTO updateAluno(Long id,AlunoDTO alunoDTO);
    
}
