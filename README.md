# Códigos Simples - Base Java

Repositório com exercícios práticos e projetos simples para aprender os fundamentos de **Java**. Este espaço é dedicado a consolidar conceitos básicos da linguagem através de exemplos didáticos e funcionais.

## 📚 Projetos

### 1. **ifelse.java**

Programa que demonstra o uso de **estruturas condicionais (if/else)**.

**Funcionalidade:**

- Solicita um número ao usuário
- Determina se o número é **par** ou **ímpar**
- Utiliza operador módulo (%) para a verificação

**Conceitos:** Condicional if/else, Scanner, operadores

---

### 2. **contador.java**

Programa que exemplifica o uso de **loops com while**.

**Funcionalidade:**

- Implementa uma contagem de 1 a 5
- Exibe cada número da sequência no console
- Incrementa a variável a cada iteração

**Conceitos:** Loop while, incremento de variáveis, saída de dados

---

### 3. **AtribuiçãoCumulativa.java**

Programa que demonstra o uso de **operadores de atribuição cumulativa**.

**Funcionalidade:**

- Simula um controle de saldo bancário
- Realiza operações de adição, subtração, multiplicação e divisão
- Utiliza operadores +=, -=, \*=, /= para atualizar o saldo em tempo real
- Exibe o resultado após cada operação

**Conceitos:** Operadores de atribuição cumulativa (+=, -=, \*=, /=), variáveis inteiras, saída de dados

---

### 4. **SwitchCase.java**

Programa que demonstra o uso de **estrutura switch/case**.

**Funcionalidade:**

- Solicita ao usuário um número entre 1 e 7
- Imprime o **dia da semana** correspondente
- Utiliza `switch/case` para seleção baseada em valor

**Conceitos:** Switch/case, Scanner, fluxo de controle, saída de dados

---

### 5. **EstudoWhile.java**

Programa que ilustra o uso de **loop `while`** em um contexto de acumulação.

**Funcionalidade:**

- Solicita números ao usuário até que digite **0**
- Soma todos os valores informados
- Exibe o total somado no final

**Conceitos:** Loop while, acumulação, Scanner, controle de fluxo

---

## � Exercícios - While Curso

Pasta dedicada a exercícios práticos com aplicação de **loops while** em diferentes contextos:

### 1. **ex1Senha.java**

Programa que valida entrada de **senha** utilizando loop while.

**Funcionalidade:**

- Solicita ao usuário uma senha
- Continua pedindo a senha enquanto estiver incorreta
- Permite acesso apenas quando a senha correta (**2002**) é digitada
- Exibe mensagem de sucesso após validação

**Conceitos:** Loop while, condição de parada, Scanner, validação

---

### 2. **ex2Cartesiano.java**

Programa que identifica **quadrantes do plano cartesiano** baseado em coordenadas.

**Funcionalidade:**

- Solicita coordenadas X e Y ao usuário
- Determina em qual quadrante o ponto está localizado:
  - **1º Quadrante:** X > 0 e Y > 0
  - **2º Quadrante:** X < 0 e Y < 0
  - **3º Quadrante:** X > 0 e Y < 0
  - **4º Quadrante:** X < 0 e Y > 0
- Continua pedindo coordenadas até que ambas sejam **0** (condição de parada)

**Conceitos:** Loop while, condicionais if/else, lógica de coordenadas, Scanner

---

### 3. **ex3Combustíveis.java**

Programa que realiza uma **votação sobre tipo de combustível preferido** e conta as preferências.

**Funcionalidade:**

- Exibe menu com opções de combustíveis:
  - 1 - Álcool
  - 2 - Gasolina
  - 3 - Diesel
  - 4 - FIM
- Solicita ao usuário para votar
- Continua coletando votos enquanto não digitar **4**
- Contabiliza o número de votos para cada tipo de combustível
- Exibe o resultado final da votação

**Conceitos:** Loop while, switch/case (implícito com if/else), contadores, acumulação de dados

---

## �🚀 Como Compilar e Executar

### 1) Compilar

```powershell
javac NomeDoArquivo.java
```

### 2) Executar

```powershell
java NomeDaClasse
```

> 📝 O nome da classe executável deve coincidir com o nome do arquivo (sem extensão).

### Exemplos (Windows / Linux / Mac)

```powershell
javac ifelse.java
java ifelse

javac contador.java
java contador

javac EstudoWhile.java
java EstudoWhile

javac SwitchCase.java
java SwitchCase

javac AtribuiçãoCumulativa.java
java AtribuiçãoCumulativa
```

### Compilar e Executar Exercícios

Para compilar os exercícios na pasta `exerciciosWhileCurso/`, navegue até a pasta raiz e use:

```powershell
javac exerciciosWhileCurso/ex1Senha.java
java exerciciosWhileCurso.ex1Senha

javac exerciciosWhileCurso/ex2Cartesiano.java
java exerciciosWhileCurso.ex2Cartesiano

javac exerciciosWhileCurso/ex3Combustíveis.java
java exerciciosWhileCurso.ex3Combustíveis
```

> 📝 Como os exercícios estão em um pacote (`exerciciosWhileCurso`), utilize a notação de ponto (.) ao executar, não a barra invertida.

## 📝 Requisitos

- Java 8 ou superior instalado
- JDK (Java Development Kit) configurado em PATH

## 🎯 Objetivo

Este repositório serve como base para praticar:

- Sintaxe fundamental de Java
- Variáveis e tipos de dados
- Estruturas de controle (if/else, while)
- Entrada e saída de dados
- Programação orientada a procedimentos

## 📈 Próximos Passos

Novos projetos e exercícios serão adicionados conforme o progresso dos estudos.

---

**Status:** Em desenvolvimento | **Última atualização:** Março de 2026
