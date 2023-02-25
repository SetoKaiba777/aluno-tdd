package com.setokaio.tddalunos.domain.service;

import com.setokaio.tddalunos.domain.entity.Aluno;

import java.util.List;

public interface AlunoService {

    public List<Aluno> encontrarTodos();

    public Aluno encontrarPorId(Long id);

    public Aluno salvarAluno(Long id);

    public void deletarAlunoPorId(Long id);

    public Aluno atualizarAluno(Aluno aluno);
}
