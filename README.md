# 🍻 Boteco Dilos — aprendendo SOLID sem complicação

Bem-vindo ao Boteco Dilos! Cada personagem mostra, de um jeito divertido, como um código pode dar problema quando um princípio SOLID é ignorado — e como organizar melhor a solução.

Os exemplos são curtos, independentes e usam Java puro, sem frameworks ou banco de dados.

## Organização do projeto

Cada princípio tem seu próprio diretório. Em cada diretório, há duas classes principais: uma com a situação problemática e outra com a versão organizada.

```text
Solid/
├── README.md
├── SRP/
│   ├── Dilos.java
│   └── DilosOrganizado.java
├── OCP/
│   ├── JuninDesenrola.java
│   └── JuninDesenrolaFlexivel.java
├── LSP/
│   ├── TonhaoDaChapa.java
│   └── TonhaoDaChapaCorreto.java
├── ISP/
│   ├── BetoVaptVupt.java
│   └── BetoVaptVuptCorreto.java
└── DIP/
    ├── MarleneDoCaixa.java
    └── MarleneDoCaixaFlexivel.java
```

## Os personagens

| Princípio | Personagem | O que acontece |
|---|---|---|
| **SRP** — Responsabilidade Única | **Dilos**, o dono faz-tudo | Quer atender, cozinhar e fechar o caixa sozinho. |
| **OCP** — Aberto/Fechado | **Junin Desenrola**, o garçom | Cada novo canal de atendimento exige alterar o código antigo. |
| **LSP** — Substituição de Liskov | **Tonhão da Chapa**, o cozinheiro | É colocado no lugar do garçom, mas não consegue cumprir o contrato de atendimento. |
| **ISP** — Segregação de Interfaces | **Beto Vapt-Vupt**, o entregador | É obrigado a implementar tarefas que não são dele. |
| **DIP** — Inversão de Dependência | **Marlene do Caixa** | O caixa fica preso diretamente a uma forma concreta de pagamento. |

## Como estudar cada princípio

1. Abra primeiro a classe com o nome do personagem: ela representa o código problemático.
2. Observe o que está errado e por que isso causa dificuldade.
3. Abra a segunda classe, com sufixo `Organizado`, `Correto` ou `Flexivel`: ela mostra uma alternativa melhor.
4. Compare os dois códigos.

## 1. SRP — Single Responsibility Principle

**Dilos, o dono faz-tudo:** abre o boteco, prepara os petiscos, atende as mesas e fecha o caixa. “Se eu não fizer, ninguém faz!”

- Problemático: `SRP/Dilos.java`
- Organizado: `SRP/DilosOrganizado.java`

A classe problemática reúne atividades diferentes. Na versão organizada, atendimento, cozinha e caixa ficam em classes separadas.

## 2. OCP — Open/Closed Principle

**Junin Desenrola:** cada vez que surge uma nova forma de atendimento, alguém precisa alterar o método cheio de `if/else`. “Chefe, tem que mexer naquele código de novo!”

- Problemático: `OCP/JuninDesenrola.java`
- Organizado: `OCP/JuninDesenrolaFlexivel.java`

A versão organizada permite acrescentar novas formas de atendimento por meio de novas implementações da interface `FormaDeAtendimento`, sem modificar o código que inicia o atendimento.

## 3. LSP — Liskov Substitution Principle

**Tonhão da Chapa:** alguém decide colocá-lo no lugar do garçom. Quando pedem para anotar um pedido, ele responde: “Eu sou cozinheiro, não sou garçom!”

- Problemático: `LSP/TonhaoDaChapa.java`
- Organizado: `LSP/TonhaoDaChapaCorreto.java`

Uma subclasse deve poder substituir a classe-base sem quebrar o comportamento esperado. Na versão organizada, cozinheiro e garçom não são tratados como se fossem o mesmo tipo de funcionário.

## 4. ISP — Interface Segregation Principle

**Beto Vapt-Vupt:** foi contratado para entregar, mas Dilos exige que também saiba cozinhar e atender mesa. “Patrão, eu só fui contratado para entregar!”

- Problemático: `ISP/BetoVaptVupt.java`
- Organizado: `ISP/BetoVaptVuptCorreto.java`

A versão organizada usa uma interface específica para o entregador, sem obrigá-lo a implementar métodos que não utiliza.

## 5. DIP — Dependency Inversion Principle

**Marlene do Caixa:** o caixa foi programado para aceitar somente Pix. “Aqui só recebe Pix porque foi assim que programaram!”

- Problemático: `DIP/MarleneDoCaixa.java`
- Organizado: `DIP/MarleneDoCaixaFlexivel.java`

O caixa passa a depender da abstração `FormaDePagamento`, e não diretamente da classe concreta `PagamentoPix`. Assim, pode receber diferentes formas de pagamento.

## Executar os exemplos

É necessário ter o JDK instalado. Na pasta raiz do projeto, compile cada diretório separadamente:

```bash
javac SRP/*.java
javac OCP/*.java
javac LSP/*.java
javac ISP/*.java
javac DIP/*.java
```

Depois, execute as classes:

```bash
java -cp SRP Dilos
java -cp SRP DilosOrganizado

java -cp OCP JuninDesenrola
java -cp OCP JuninDesenrolaFlexivel

java -cp LSP TonhaoDaChapa
java -cp LSP TonhaoDaChapaCorreto

java -cp ISP BetoVaptVupt
java -cp ISP BetoVaptVuptCorreto

java -cp DIP MarleneDoCaixa
java -cp DIP MarleneDoCaixaFlexivel
```

> **Observação:** o exemplo problemático de LSP lança uma exceção de propósito. Ela representa a quebra do comportamento esperado quando Tonhão é usado como se fosse um atendente.

## Resumo para a prova

- **SRP:** uma classe deve ter um único motivo para mudar.
- **OCP:** aberto para extensão, fechado para modificação.
- **LSP:** objetos de uma subclasse devem poder substituir objetos da classe-base sem quebrar o programa.
- **ISP:** prefira interfaces específicas a uma interface geral e inchada.
- **DIP:** dependa de abstrações, não de implementações concretas.

**Moral do Boteco Dilos:** se todo mundo faz tudo, ninguém sabe direito o que está fazendo. E se cada novidade exige quebrar o que já funciona, a conta chega! 🍻
