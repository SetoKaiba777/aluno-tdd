package com.setokaio.tddalunos.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_aluno",nullable = false)
    private String nome;
    @Column(name="num_documento",nullable = false,unique = true)
    private String numDocumento;
    @Column(name = "lugar",nullable = false, unique = true)
    private int numPosicao;
}
