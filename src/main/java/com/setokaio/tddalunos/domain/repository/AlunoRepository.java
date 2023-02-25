package com.setokaio.tddalunos.domain.repository;

import com.setokaio.tddalunos.domain.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

    public Aluno findByNome(String nome);
}
