# 🍻 Boteco Dilos — aprendendo SOLID sem complicação

Bem-vindo ao Boteco Dilos! Aqui, cada personagem mostra, do jeito mais atrapalhado possível, como **não** organizar um código.

A ideia é aprender os cinco princípios SOLID com situações de um boteco. As histórias são analogias: SOLID é aplicado ao projeto de software, não à administração real de um bar.

## Os cinco personagens

| Personagem | Princípio | A confusão |
|---|---|---|
| **Dilos**, o dono faz-tudo | SRP | Quer cuidar de tudo sozinho. |
| **Junin Desenrola**, o garçom | OCP | Toda novidade obriga a mexer no código antigo. |
| **Tonhão da Chapa**, o cozinheiro | LSP | É colocado no lugar do garçom, mas não consegue cumprir o combinado. |
| **Beto Vapt-Vupt**, o entregador | ISP | É obrigado a implementar tarefas que não são dele. |
| **Marlene do Caixa** | DIP | O caixa fica preso a uma forma concreta de pagamento. |

## Como estudar

Leia cada exemplo nesta ordem:

1. Veja a situação engraçada do boteco.
2. Observe o código problemático.
3. Entenda qual é o problema.
4. Veja a versão melhorada.

Os exemplos são independentes e usam Java puro, sem framework ou banco de dados.

## 1. SRP — Princípio da Responsabilidade Única

**Dilos, o dono faz-tudo:** abre o boteco, prepara os petiscos, atende as mesas e fecha o caixa. Se alguém pergunta por que faz tudo, ele responde: “Se eu não fizer, ninguém faz!”

No código, a classe `BotecoSRP` acumula tarefas diferentes. A versão melhorada separa as responsabilidades.

Arquivo: `src/Srp.java`

## 2. OCP — Princípio Aberto/Fechado

**Junin Desenrola:** cada vez que o boteco inventa uma nova forma de atendimento, alguém precisa alterar o método cheio de `if/else`. “Chefe, tem que mexer naquele código de novo!”

A ideia é permitir extensão sem precisar modificar a lógica que já funciona. A versão melhorada usa uma abstração para cada tipo de atendimento.

Arquivo: `src/Ocp.java`

## 3. LSP — Princípio da Substituição de Liskov

**Tonhão da Chapa:** alguém decide colocá-lo no lugar do garçom. Só tem um detalhe: quando pedem para anotar um pedido, ele responde: “Eu sou cozinheiro, não sou garçom!”

Uma subclasse deve poder substituir sua classe-base sem quebrar o comportamento esperado. Se um tipo não consegue cumprir o contrato, a hierarquia foi mal planejada.

Arquivo: `src/Lsp.java`

## 4. ISP — Princípio da Segregação de Interfaces

**Beto Vapt-Vupt:** foi contratado para entregar, mas Dilos exige que também saiba cozinhar, atender mesa e operar o caixa. “Patrão, eu só fui contratado para entregar!”

Em vez de uma interface enorme que obriga todos a implementar tudo, use interfaces menores e específicas.

Arquivo: `src/Isp.java`

## 5. DIP — Princípio da Inversão de Dependência

**Marlene do Caixa:** o caixa foi programado para aceitar somente Pix. Quando alguém pergunta se pode pagar em dinheiro ou cartão, ela responde: “Aqui só recebe Pix porque foi assim que programaram!”

O módulo de alto nível (o caixa) não deve depender diretamente de uma implementação concreta. Ele deve depender de uma abstração, como `FormaDePagamento`.

Arquivo: `src/Dip.java`

## Executar os exemplos

É necessário ter o JDK instalado. Na pasta do projeto, execute:

```bash
javac src/*.java
java -cp src Srp
java -cp src Ocp
java -cp src Lsp
java -cp src Isp
java -cp src Dip
```

## Resumo para a prova

- **SRP:** uma classe deve ter um único motivo para mudar.
- **OCP:** aberto para extensão, fechado para modificação.
- **LSP:** objetos de uma subclasse devem poder substituir objetos da classe-base sem quebrar o programa.
- **ISP:** prefira interfaces específicas a uma interface geral e inchada.
- **DIP:** dependa de abstrações, não de implementações concretas.

**Moral do Boteco Dilos:** se todo mundo faz tudo, ninguém sabe direito o que está fazendo. E se cada novidade exige quebrar o que já funciona, a conta chega! 🍻
