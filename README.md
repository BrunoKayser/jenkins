# jenkins
Repositório para utilização e aprendizagem do Jenkins, a fim de ter um exemplo prático para trabalho da disciplina de Gereência de Configuração - Unisinos

# Configuração
### Baixar o Jenkins e instalar
- https://www.jenkins.io/download/
- Lembrar de alterar a porta de 8080 para uma outra


### Configurar jenkins no GITHUB com webhock
- Tutorial que me euxiliou: https://hevodata.com/learn/jenkins-github-webhook/#:~:text=Go%20to%20the%20%E2%80%9CSource%20Code,is%20for%20Jenkins%20GitHub%20Webhook.

- Precisa configurar via ngrok a porta localhost para compartilhar com oservidor do git
  
  - Passo 1: baixar ngrok : https://ngrok.com/download
  - Passo 2: Abrir o executável
  - Passo 3: abrir uma porta via ngrok ```ngrok http <pora em que o jenkins esta executando>```
  - Passo 4: Adicionar a webhock do git a porta https dada no terminal do ngrok

Feito isto pode realizar o push em seu projeto que gerará um build no jenkins