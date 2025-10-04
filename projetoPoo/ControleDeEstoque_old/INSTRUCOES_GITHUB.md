# Instruções para Subir o Projeto no GitHub

Este documento fornece um guia passo a passo para criar um repositório no GitHub e fazer o upload do projeto.

## Pré-requisitos

Antes de começar, certifique-se de ter:

1. Uma conta no GitHub ([https://github.com](https://github.com))
2. Git instalado no seu computador
3. O projeto `ControleDeEstoque` completo no seu computador

## Passo 1: Criar um Repositório no GitHub

1. Acesse [https://github.com](https://github.com) e faça login na sua conta.
2. Clique no botão **"+"** no canto superior direito e selecione **"New repository"**.
3. Preencha as informações do repositório:
   - **Repository name**: `ControleDeEstoque`
   - **Description**: "Sistema de Controle de Estoque - Prova de POO"
   - **Public/Private**: Escolha conforme sua preferência
   - **NÃO** marque a opção "Initialize this repository with a README" (já temos um README no projeto)
4. Clique em **"Create repository"**.

## Passo 2: Configurar o Git Localmente

Abra o terminal (ou Git Bash no Windows) e navegue até a pasta do projeto:

```bash
cd /caminho/para/ControleDeEstoque
```

Configure seu nome e email no Git (se ainda não configurou):

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu.email@exemplo.com"
```

## Passo 3: Inicializar o Repositório Local

Na pasta do projeto, execute os seguintes comandos:

```bash
# Inicializa o repositório Git local
git init

# Adiciona todos os arquivos ao staging area
git add .

# Cria o primeiro commit
git commit -m "Implementação inicial do Sistema de Controle de Estoque"
```

## Passo 4: Conectar ao Repositório Remoto

Conecte seu repositório local ao repositório do GitHub. Substitua `SEU_USUARIO` pelo seu nome de usuário do GitHub:

```bash
git remote add origin https://github.com/SEU_USUARIO/ControleDeEstoque.git
```

## Passo 5: Enviar o Código para o GitHub

Envie o código para o GitHub:

```bash
# Para a branch main (padrão atual do GitHub)
git branch -M main
git push -u origin main
```

Se solicitado, insira suas credenciais do GitHub.

## Passo 6: Verificar o Upload

1. Acesse o repositório no GitHub: `https://github.com/SEU_USUARIO/ControleDeEstoque`
2. Verifique se todos os arquivos foram enviados corretamente.
3. O arquivo `README.md` será exibido automaticamente na página principal do repositório.

## Estrutura de Arquivos no Repositório

Após o upload, seu repositório deve conter a seguinte estrutura:

```
ControleDeEstoque/
├── .gitignore
├── README.md
├── GUIA_IMPLEMENTACAO.md
├── INSTRUCOES_GITHUB.md
└── src/
    └── org/
        ├── model/
        │   └── Produto.java
        ├── view/
        │   └── TelaPrincipal.fxml
        ├── controller/
        │   └── TelaPrincipalController.java
        ├── utils/
        │   └── PathFXML.java
        └── principal/
            └── Main.java
```

## Comandos Git Úteis para o Futuro

Aqui estão alguns comandos Git que você pode precisar:

### Verificar o status dos arquivos

```bash
git status
```

### Adicionar arquivos modificados

```bash
git add .
```

### Criar um novo commit

```bash
git commit -m "Descrição das mudanças"
```

### Enviar mudanças para o GitHub

```bash
git push
```

### Atualizar o repositório local com mudanças do GitHub

```bash
git pull
```

### Ver o histórico de commits

```bash
git log
```

## Solução de Problemas Comuns

### Erro de autenticação

Se você receber um erro de autenticação ao fazer `git push`, o GitHub pode estar exigindo autenticação por token pessoal em vez de senha. Siga estas etapas:

1. Acesse [https://github.com/settings/tokens](https://github.com/settings/tokens)
2. Clique em **"Generate new token"** > **"Generate new token (classic)"**
3. Dê um nome ao token (ex: "ControleDeEstoque")
4. Marque a opção **"repo"** para acesso completo aos repositórios
5. Clique em **"Generate token"**
6. Copie o token gerado (você não poderá vê-lo novamente!)
7. Use o token como senha quando o Git solicitar

### Erro "remote origin already exists"

Se você receber este erro ao tentar adicionar o remote, remova o remote existente primeiro:

```bash
git remote remove origin
git remote add origin https://github.com/SEU_USUARIO/ControleDeEstoque.git
```

### Conflitos de merge

Se houver conflitos ao fazer `git pull`, você precisará resolvê-los manualmente:

1. Abra os arquivos com conflitos no editor
2. Procure por marcadores como `<<<<<<<`, `=======`, e `>>>>>>>`
3. Edite o arquivo para manter o código correto
4. Remova os marcadores de conflito
5. Execute:

```bash
git add .
git commit -m "Resolvendo conflitos"
git push
```

## Compartilhando o Repositório

Para compartilhar seu projeto com o professor ou colegas:

1. Acesse o repositório no GitHub
2. Copie a URL da barra de endereços (ex: `https://github.com/SEU_USUARIO/ControleDeEstoque`)
3. Envie esta URL para quem precisar acessar o projeto

Se o repositório for privado, você precisará adicionar colaboradores:

1. No repositório, clique em **"Settings"**
2. No menu lateral, clique em **"Collaborators"**
3. Clique em **"Add people"**
4. Digite o nome de usuário do GitHub da pessoa e envie o convite

---

**Dica**: Mantenha o arquivo `.gitignore` atualizado para evitar enviar arquivos desnecessários (como arquivos compilados `.class` ou configurações da IDE) para o GitHub.
