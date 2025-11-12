# ☕ Ponto de Venda (PDV) - Projeto Java

![Java 8](https://img.shields.io/badge/Java-8-blue.svg?style=for-the-badge&logo=java)
![MySQL 5.5](https://img.shields.io/badge/MySQL-5.5-orange.svg?style=for-the-badge&logo=mysql)
![NetBeans 8.2](https://img.shields.io/badge/NetBeans-8.2-lightblue.svg?style=for-the-badge&logo=apache-netbeans-ide)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow.svg?style=for-the-badge)

Um sistema simples de Ponto de Venda (PDV) desenvolvido em Java com NetBeans IDE para gerenciamento de vendas e produtos.

---

## ✨ Funcionalidades

* [X] Cadastro de Produtos
* [X] Cadastro de Usuarios
* [X] Realização de Vendas
* [X] Geração de Relatórios
* [X] Controle de Estoque
* [X] Login de Usuários (ADM / Padrão)

---

## 🔧 Tecnologias e Versões

Este projeto foi construído utilizando as seguintes tecnologias:

* **IDE:** NetBeans 8.2
* **Linguagem:** Java (JDK 1.8)
* **Banco de Dados:** MySQL Server 5.5
* **Gerenciador de BD:** MySQL Workbench 8

---

## ⚙️ Instalação e Configuração

Siga os passos abaixo para conseguir rodar o projeto localmente.

### Pré-requisitos

* Ter o **JDK 1.8** instalado.
* Ter o **NetBeans 8.2** (ou compatível) instalado.
* Ter o **MySQL Server 5.5** (ou compatível) instalado e rodando.

### 1. Configurar o Banco de Dados
A criação do banco de dados e população das tabelas fica localizado no arquivo pontovenda.sql.

Abra seu cliente MySQL (MySQL Workbench, DBeaver, etc.).

Crie um novo schema (banco de dados). Você pode nomeá-lo de pontovenda.

Importe ou execute o script pontovenda.sql dentro desse schema.

### 2. Abrir o Projeto no NetBeans
Ao abrir o projeto no NetBeans 8.2, é possível que apareça um pop-up ou que o projeto fique com ícones de alerta, indicando problemas para identificar as bibliotecas (.jar).

💡 Resolvendo Problemas de Biblioteca (NetBeans)

Na aba "Projetos", clique nas bibliotecas que não foram encontradas (geralmente com um ícone de "quebrado").

Aponte para as bliblotecas que ficam nesse caminho: ...\PontoDeVenda\lib. As bibliotecas que não foram identificadas estão localizadas aqui.

Basta identificar uma a uma que corrige.

Alternativa (se não der certo):

Clique com o botão direito no projeto PontoDeVenda.

Vá em Propriedades > Bibliotecas e identifique-as lá.

🔌 Alternando a Conexão do Banco (Local vs. Nuvem)
O projeto tem integração com um banco em nuvem (dependendo da data ele pode estar desligado).

Para alterar entre usar o banco na nuvem ou um banco local, vá no arquivo ...\PontoDeVenda\src\principal\Conectar.java. Lá tem os dois tipos de conexão, basta descomentar a linha e utilizar o desejado.

🔑 Login Rápido (Nuvem)
Deixei um login facil para acessar via banco na nuvem, basta logar no sistema como:

Usuário: ADM

Senha: 123

Nota: Dependendo da data, o banco de dados em nuvem pode estar desligado ou indisponível.
