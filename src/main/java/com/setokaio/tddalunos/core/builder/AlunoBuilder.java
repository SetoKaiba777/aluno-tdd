package com.setokaio.tddalunos.core.builder;


import com.setokaio.tddalunos.domain.entity.Aluno;
import lombok.Builder;

@Builder
public class AlunoBuilder {

    private long id;
    private String nome;
    private String numDocumento;
    private int numPosicao;

    public Aluno toEntity(){
        return new Aluno(id,nome,numDocumento,numPosicao);
    }
}
