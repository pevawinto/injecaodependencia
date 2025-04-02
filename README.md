Sistema de Pagamentos com Injeção de Dependência
Projeto Java demonstrando a implementação prática do princípio de Injeção de Dependência (DI) através de um sistema de processamento de pagamentos simples.

Aqui no Gist temos um markdown mais detalhado da comparação entre usar ou não injeção de dependência: 
https://gist.github.com/pevawinto/d3b78924b1f2c3706ef8c85972e651b1

Objetivo
Ilustrar como a DI permite:

-Baixo acoplamento entre componentes
-Fácil extensibilidade

-Maior testabilidade

-Manutenção simplificada



Padrão de Design: Injeção de Dependência

Como ver o projeto
Clone o repositório:

git clone https://github.com/pevawinto/injecaodependencia

Ou baixe por zip!
Benefícios da Implementação
-Extensibilidade: Adicionar novos métodos de pagamento sem modificar o serviço principal (baixo acoplamento)
-Testabilidade: Fácil de mockar dependências para testes unitários
-Manutenção: Alterações em um processador não afetam os outros componentes
