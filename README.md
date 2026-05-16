# PC Mania 💻

Projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos (C06).
O sistema simula uma loja de computadores chamada **PC Mania**, permitindo que um cliente escolha entre diferentes promoções de PCs e finalize sua compra.

---

## Sobre o Projeto

O sistema foi desenvolvido utilizando conceitos de:

* Programação Orientada a Objetos (POO)
* Classes e Objetos
* Encapsulamento
* Construtores
* Arrays
* Pacotes em Java
* Associação entre classes

O cliente pode selecionar computadores de diferentes promoções e, ao finalizar a compra, o sistema exibe:

* Dados do cliente
* Computadores adquiridos
* Valor total da compra

---

## Promoções Disponíveis

### Promoção 1

* Marca: Apple
* Processador: Pentium Core i3 (2200 MHz)
* Memória RAM: 8 GB
* HD: 500 GB
* Sistema Operacional: macOS Sequoia 64 bits
* Brinde: Pen-drive 16 GB

### Promoção 2

* Marca: Samsung
* Processador: Pentium Core i5 (3370 MHz)
* Memória RAM: 16 GB
* HD: 1 TB
* Sistema Operacional: Windows 8 64 bits
* Brinde: Pen-drive 32 GB

### Promoção 3

* Marca: Dell
* Processador: Pentium Core i7 (4500 MHz)
* Memória RAM: 32 GB
* HD: 2 TB
* Sistema Operacional: Windows 10 64 bits
* Brinde: HD Externo 1 TB

---

## 📂 Estrutura do Projeto

```bash
PCMania/
│
├── src/
│   ├── cliente/
│   │   └── Cliente.java
│   │
│   ├── computador/
│   │   ├── Computador.java
│   │   ├── HardwareBasico.java
│   │   ├── MemoriaUSB.java
│   │   └── SistemaOperacional.java
│   │
│   ├── pedido/
│   │   └── ProcessarPedido.java
│   │
│   └── Main.java
│
└── README.md
```

---

## Como Executar

### Pré-requisitos

* Java JDK 8 ou superior
* IDE Java (IntelliJ, Eclipse, VSCode ou NetBeans)

### Passos

1. Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
```

2. Abra o projeto na sua IDE.

3. Execute o arquivo:

```bash
Main.java
```

---

## Exemplo de Uso

```text
Digite seu nome: João
Digite seu CPF: 12345678900

---- PROMOÇÕES DISPONÍVEIS ----
1 - Promoção 1
2 - Promoção 2
3 - Promoção 3
0 - Finalizar compra

Digite o código da promoção desejada: 1

PC Apple adicionado!

Digite o código da promoção desejada: 0

Compra finalizada!
```

---

## Conceitos Aplicados

* Relacionamento entre objetos
* Composição
* Encapsulamento
* Modularização com pacotes
* Reutilização de código
* Manipulação de arrays sem ArrayList

---

## Autor

**Júlia do Amaral Vicentini**
Engenharia de Software - INATEL
