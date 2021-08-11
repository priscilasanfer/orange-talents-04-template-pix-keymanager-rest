# Bootcamp Orange Talents 

Conteúdo: https://github.com/zup-academy/nosso-cartao-documentacao/tree/master/orange-talent-4

## Desafio Pix  

Implementar um sistema distribuído que simule o funcionamento do PIX

Requisitos: https://github.com/zup-academy/orange-stack-documentacao/tree/master/desafio-01/01-key-manager#desafio-pix   

## Tecnologias utilizadas:
- Kotlin
- Micronaut
- gRPC
- Kubernetes
- Mockito
- BDDMockito
- Junit

### Funcionalidades implementadas:   
[X] - 025-setup-do-projeto-key-manager-rest  
[X] - 030-expondo-para-o-frontend-registro-da-chave-pix  
[X] - 031-testando-exposicao-de-registro-de-chave-pix  
[X] - 035-expondo-para-o-frontend-remocao-de-uma-chave-pix-existente  
[X] - 036-testando-exposicao-de-remocao-de-uma-chave-pix-existente  
[X] - 040-expondo-para-o-frontend-detalhamento-de-uma-chave-pix  
[X] - 041-testando-exposicao-de-detalhamento-de-uma-chave-pix-existente  
[X] - 045-expondo-para-o-frontend-listagem-de-chaves-pix  
[X] - 046-testando-exposicao-de-listagem-de-chaves-pix  
[X] - 050-deployment-dos-servicos-dockerfile  
[X] - 055-deployment-dos-servicos-manifestos-k8s  
[X] - 060-deployment-dos-servicos-codebuild  
[X] - 065-deployment-dos-servicos-validando  


### Rodar a Aplicação

- Rodar sem o docker:
  - .\gradlew build
  - java -jar .\build\libs\key-manager-rest-0.1-all.jar

- Rodar com docker:
  - docker build -t key-manager-rest:latest .
  - docker run -d -p 8080:8080 key-manager-rest
  - docker logs -f <container_id>
