# navegacao-marte
Projeto com a finalidade de criar um robô, que receba coordenadas de marte e responsa com imagens


Projeto dividido em Backend e Frontend

```bash
# Clonar o repositório
- git clone <HTTPS ou SSH do projeto>
- cd navegacao-marte
```

Para uso do projeto é necessário ter instalado na maquina:
- [Maven](https://maven.apache.org/install.html)
- [Node](https://nodejs.org/en)

# robos-navegacao-backend
Neste projeto foi realizado uma integração com a API : [NASA APIs](https://api.nasa.gov/), a qual contém imagens de satélite de marte;
O projeto foi feito com backend em Java e com a framework Quarkus, para fins de automatizar o processo de desenvolvimento;

## Para rodar o projeto backend:

```bash
# Rodar o projeto backend
- cd robos-navegacao-backend
- mvn clean compile install
- mvn quarkus:dev
```

# robos-navegacao-frontend
Este projeto é onde podemos ver a aplicação funcionando, ao rodar o projeto é apresentado uma tela com uma imagem de fundo e um robô em marte;
Podem se realizar comandos pelo teclado, que estão descritos na legenda da tela, em que o robô irá se mover e buscar imagens de marte;
O frontend é integrado com um backend, buscando as imagens da API;
A lógica implementada foi de que a cada 5 passos o robô consulta o backend e trás uma imagem para o usuário;

## Para rodar o projeto frontend:

Em um novo terminal, o anterior deve ficar aberto com o backend rodando

```bash
# Rodar o projeto frontend
- cd robos-navegacao-frontend
- npm i ou npm install
- npm start
```



<h3 align="center">Desenvolvido por Gabriela Farias</h3>

