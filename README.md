# mainBooks2
Projeto spring boot git java
 # Equipe: Brenda Reimberg
#        Felipe Moreira
#        Matheus Graciki
#        Mirele Viana
#        Ricardo Sommer Barbosa 

Java Web Crud User
Um projeto crud para que o usuário aprenda o básico de java web.

Tecnologias Utilizadas: 
Spring Tools: https://spring.io/tools
(Foram aplicados as dependências: Spring Boot DevTools, Spring Web, Spring Data JPA, MySQL Driver, Thymeleaf, Lombok e Validation)
MySQL Workbench: https://dev.mysql.com/downloads/workbench/

Guia de configuração:

Passo 1:
Após realizar o download dos softwares necessários, instalação dos mesmos e também do projeto aqui disponibilizado, você deve abrir o MySQL Workbench e criar uma Conexão MySQL. Após concluído esse procedimento, clique nesta conexão e coloque seu usuário para efetuar o login na sua database.

![MSYQL 1](https://user-images.githubusercontent.com/108704014/231904063-f1633fdf-0240-4c0f-9f61-60f1f39aaeb3.png)


Passo 2:
Com o login efetuado, vá até o canto esquerdo e clique com o botão direito, escolha a opção "Create Schema" e coloque o nome "mainbook" e então clique em "Apply".

![MYSQL 2](https://user-images.githubusercontent.com/108704014/231904078-c7acd446-b526-44a6-9cd5-3a08c5f3a453.png)

![MYSQL 3](https://user-images.githubusercontent.com/108704014/231904085-feec9a5d-e597-48bc-895a-f0100570480c.png)


Passo 3:
Com o schema criado, abra o arquivo MySQL disponibilizado neste repositório  através da opção "File" > "Open SQL Script", vá até a pasta onde salvou este arquivo, clique nele e dê Ok. Nele consta as informações necessárias para que o banco de dados funcione corretamente. E após a importação ser concluída, dê um duplo clique no banco de dados "maibook" para seleciona-lo e então clique no ícone de raio para que o banco de dados comece a rodar. Com isso encerramos a parte do MySQL, mas lembrando: não feche este programa, apenas deixe minimizado.

![MYSQL 4](https://user-images.githubusercontent.com/108704014/231904119-1f131de2-9d2d-4994-a4b9-2fc8457b53ea.png)


![MYSQL 5](https://user-images.githubusercontent.com/108704014/231904195-28817f63-8767-4b9c-9e9f-76426cf1ef69.png)

![MYSQL 6](https://user-images.githubusercontent.com/108704014/231904207-e217214f-6ea7-4f55-a332-e981fdc999cb.png)

Passo 4:
Abra o STS (Spring Tool Suite) e vá até a opção "File" > "Import" > "General" > "Projects from Folder or Archive".
E então na parte "Import Source", clique em Directory e clique (mas não abra) a pasta do projeto. Na área abaixo, em "Folder", irá aparecer o projeto a ser importado. Apenas dê "Finish" para concluir a importação.


![STS 1](https://user-images.githubusercontent.com/108704014/231904227-77cb0586-db1d-4f05-af27-5fba20b17e7f.png)

![STS 2](https://user-images.githubusercontent.com/108704014/231904231-2173d85a-96a5-431c-8745-89329fe02ba4.png)

![STS 3](https://user-images.githubusercontent.com/108704014/231904233-edfeab92-8b18-40ed-b8ba-d3c36eef2a47.png)

![STS 4](https://user-images.githubusercontent.com/108704014/231904235-43c255d1-9398-4845-9fc3-d0c67b7781a8.png)

Passo 5:
Com o projeto importado, agora iremos apenas configurar as variáveis do ambiente para a conexão com o banco de dados. Para isso, precisará expandir o projeto, clicar em "src/main/resources". Clique para abrir "application.properties" e alterar "root" para o nome de seu banco de dados aplicado no MySQL, bem como no campo seguinte, onde "password" deve ser a sua senha que escolheu no momento da configuração de seu banco de dados no MySQL.

![STS 5](https://user-images.githubusercontent.com/108704014/231904237-69ddecb7-abcf-42c8-92ac-8951f3ba0a9c.png)

Ligando o projeto:
Clique com o botão direito de seu mouse em "mainBooks", escolha a opção "Run As" e então escolha "Spring Boot App"

![STS 6](https://user-images.githubusercontent.com/108704014/231904239-61643f6a-b3c3-4840-b260-e15d59c14eda.png)


