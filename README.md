# Desenvolvimento TDD
Essa pequena aplicação foi desenvolvida para servir como base de uma breve aula sobre TDD. 

Listarei as regras de negócio para aqueles que demonstrarem interesse em praticar através deste repositório. 

### Regras de negócio
* A posição deve ser um número entre 1 e 30.
* Um aluno não pode ocupar a mesma posição de outro aluno.
* O numero do documento deve ser único para cada aluno

### Regras da Controller
* Ao cadastrar um aluno, devemos retornar uma DTO de resposta a qual armazena uma mensagem
"Aluno {numDocumeto} cadastrado com sucesso!"
* Deve-se criar uma DTO de entrada para criação de Alunos e outra para atualização
