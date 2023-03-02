

<h1 align="center"> API REST com Spring Security JWT </h1>

<p align= "center">
Evento exclusivo, promovido pela DIO o Bootcamp JAVA Developer para
ensino de tecnologias. </p>

<p align="center">
<a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;
&nbsp;&nbsp;
<a href="#-sprintsecurityjwt">Sprint Security JWT</a>&nbsp;&nbsp;&nbsp;
</p>

<p align="center">
<img alt="" src="https://img.shields.io/security">
</p>

<br>

<p align="center">
<img alt="SeguraçaJWT" src="https://user-images.githubusercontent.com/106537496/222296535-2e458104-d85b-4418-b4f1-d7e85a99a759.png" width="50%"></p>
<br>

## 🚀 Tecnologias

Esse projeto foi desenvolvidos com as seguintes tecnologias:
- JAVA
- Spring Security JWT
- Git e Github

  
<br>
  
## 💻 Projeto

Projeto foi desenvolvido para mostra como se utilizar segurança no código, quando realizado o cadastro do usuário.

<br>

## 📑 Spring Security JWT

### Spring
É considerado um framework confiável no ecossistema **Java** e é amplamente utilizado. 

## O que é JWT?

JSON Web token (JWT) é um padrão para codificação de informações que podem ser transmitidas com segurança como um objeto JSON.

Como funciona o Spring Security ao expomos uma API POST pública para a autenticação, e ao passar as credenciais corretas, irá gerar um JWT. Se um usuário tentar
acessar a API protegida, ela permitirá o acesso somente se uma solicitação tiver um JWT válido. A validação acontecerá no filtro cadastrado na cadeia de filtros do 
Spring Security.

### Spring Security
Que é uma estrutura de autenticação e autorização poderosa e personalizável. Ele é considerado o padrão de fato para proteger aplicativos baseados em Spring.

* **Autenticação** refere-se ao processo de verificação da identidade de um usuário, com base nas credenciais fornecidas. Exemplos: é inserir um nome de usuário e 
uma senha ao fazer login em um site. Pode se pensar como uma resposta à pergunta _Quem é você?_.

* **Autorização** refere-se ao processo de determinar se um usuário tem permissão adequada para executar uma ação específica ou ler dados específicos, supondo que o
usuário seja autenticado com sucesso. Pergunta _Um usuário pode fazer/ler isso?_.

<br>

## Como uso o Spring Security com a API REST

Pronto para uso, o Spring Security vem com autenticação baseada em sessão, que é útil para aplicativos da Web MVC clássicos, mas podemos configurá-lo para
oferecer suporte à autenticação sem estado baseado em JWT para APIs REST.

## Autenticação usando JWT com Spring Security

Para usa o Spring Serurity para JWT, precisa - se de uma classe de configuração anotada com ` @EnableWebSecurity ` anotação em nosso caminho de classe. Além disso,
para simplificar o processo de personalização, a estrutura expõe um ` WebSecurityConfigurerAdapter ` classe. 

## Quão seguro é o Spring Security?

O Spring Security é bastante seguro. Ele se integra facilmente com aplicativos baseados em Spring, oferece suporte a muitos tipos de autenticação prontos para uso
e é capaz de programação de segurança declarativa.

## Por que o Spring Security é usado?

Porque ele se integra perfeitamente com outros ecossistemas Spring, e muitos desenvolvedores preferem reutilizar a soluções existentes em vez de reinventar a roda.


<br>





---

Feito com 🖤 by DIO 
