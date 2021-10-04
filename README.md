# Flyweight
Atividade escolar utilizando padrão Flyweight
Como exemplo, foi criado um programa que simule um ambiente empresarial, onde uma empresa contrata funcionários, funcionários possuem cargos, e cargos possuem nome e salário.
A ideia deste padrão é a reutilização dos objetos, evitando instancias desnecessárias, uma vez instanciado um cargo ele fica salvo em uma lista e no momento da contratação do funcionário, só será instanciado um novo cargo caso o mesmo não exista no lista.
Nos casos de testes, o primeiro realiza um retorno de todos funcionários da empresa, e é realizado a comparação dos nomes, e  o outro teste realiza uma contagem dos funcionários contratados e exibe quantos cargos foram salvos, exibindo a instância única dos cargos sem repetições.
