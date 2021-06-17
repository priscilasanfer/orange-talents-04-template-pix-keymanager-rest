# Por favor faça um Fork desse projeto!

## Está em dúvida de como fazer um Fork? Não tem problema! [Aqui tem uma explicação do que entendemos que você deve considerar!](https://docs.github.com/en/github/getting-started-with-github/fork-a-repo)

Rodar sem o docker:
- .\gradlew build
- java -jar .\build\libs\key-manager-rest-0.1-all.jar

rodar com docker:
- docker build -t key-manager-rest:latest .
- docker run -d -p 8080:8080 key-manager-rest
- docker logs -f <container_id>
