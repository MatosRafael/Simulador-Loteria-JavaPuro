# 🎲 SimuladorLoteria

**Minimalista • Chamativo • Explicativo**

Um pequeno simulador de loteria em Java que permite o usuário inserir bilhetes (6 números entre 1 e 60), sorteia números aleatórios para cada bilhete e exibe o resultado com a quantidade de acertos.

---

## ✨ Destaques

* Interface de terminal simples e interativa.
* Suporta múltiplos bilhetes por execução.
* Class `Bilhete` separa lógica do sorteio e contagem de acertos.

---

## 🚀 Como executar

**Pré-requisitos**: JDK instalado (Java 8+)

No diretório raiz do projeto (onde está a pasta `secao16`):

```bash
# Compilar
javac secao16/*.java

# Executar
java secao16.SimuladorLoteria
```

> Observação: o projeto usa `package secao16;` — mantenha a estrutura de pastas.

---

## 🧭 Fluxo do programa

1. O programa pede que o usuário digite 6 números para cada bilhete (valores entre 1 e 60).
2. Cada conjunto forma um objeto `Bilhete` que é armazenado em uma lista.
3. Após o usuário finalizar a entrada, o programa realiza sorteio (números aleatórios) para cada bilhete.
4. Para cada bilhete, são exibidos os números escolhidos, números sorteados e o total de acertos. Mensagens de prêmio são mostradas conforme o número de acertos.

---

## 📁 Estrutura principal do projeto

* `secao16/SimuladorLoteria.java` — entrada `main`, gerencia leitura de bilhetes e execução do sorteio.
* `secao16/Bilhete.java` — representa um bilhete; contém os arrays de números do usuário e do sorteio, métodos para sortear, contar acertos e exibir resultado.
