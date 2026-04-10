Sistema de Gestão de Funcionários com Herança, Polimorfismo e Composição em Java

Objetivo
O trabalho tem como objetivo aplicar os conceitos fundamentais da Programação Orientada a Objetos (POO) — herança, polimorfismo e composição — em um projeto prático de Java. O sistema simula a gestão de funcionários em uma empresa, permitindo o cadastro de diferentes tipos de colaboradores e demonstrando como a linguagem Java trata a reutilização de código e o comportamento dinâmico dos objetos.

Estrutura do Projeto
Classe Funcionario

Representa a base do sistema.

Contém atributos comuns a todos os funcionários (nome, cargo, salário e matrícula).

Implementa métodos de acesso (getters), além de toString(), equals() e hashCode().

Classe Gerente (herança)

Especializa a classe Funcionario.

Adiciona atributos específicos: departamento e percentual de bônus.

Sobrescreve o método toString() para incluir informações adicionais.

Implementa calcularSalarioTotal(), que retorna o salário acrescido do bônus.

Classe Empresa (composição)

Contém uma coleção (SortedSet) de funcionários, ordenados por salário.

Possui métodos para contratar (contratarFuncionario) e listar (listarEquipe).

Demonstra polimorfismo ao imprimir informações de funcionários e gerentes de forma diferenciada.

Classe Main

Cria uma instância de Empresa.

Instancia três objetos da classe Funcionario e dois da classe Gerente.

Contrata todos os colaboradores e lista a equipe, mostrando ordenação e polimorfismo em ação.

Conceitos Aplicados
Herança: Gerente herda atributos e métodos de Funcionario.

Polimorfismo: O método toString() é sobrescrito e chamado dinamicamente, exibindo informações diferentes conforme o tipo do objeto.

Composição: A classe Empresa contém e gerencia uma coleção de objetos Funcionario.

Ordenação: Uso de TreeSet com Comparator para organizar os funcionários por salário.

Resultados
Ao executar o programa, o sistema lista os funcionários em ordem crescente de salário. Os gerentes aparecem com informações adicionais e têm seu salário total calculado com bônus. Isso demonstra na prática como os pilares da POO podem ser aplicados em um cenário realista de gestão empresarial.
