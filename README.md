# Projeto-Youtube-em-JAVA

Automação em Java para abrir o YouTube.  

---

## 🔧 Pré-requisitos

- Java JDK 8+ (ou versão compatível com o seu projeto)  
- Maven instalado (caso use Maven como build / dependências) **ou** configuração apropriada no seu IDE  
- IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code + extensão Java, etc.)  

---

## 📁 Estrutura do Projeto

Projeto-Youtube-em-JAVA/
├── .idea/ ← configurações da IDE (opcional)
├── automacao-youtube/ ← código-fonte da automação / testes
├── pom.xml ← (se for um projeto Maven)
└── README.md ← este arquivo

yaml
Copiar código

> Se o projeto usar Maven, a convenção comum é: colocar o código-fonte em `src/main/java` e testes em `src/test/java`. :contentReference[oaicite:1]{index=1}  
>  
> Esse layout ajuda a manter o código e os testes separados, garantindo que os testes não entrem no artefato final compilado. :contentReference[oaicite:2]{index=2}

---

## 🚀 Como usar / rodar

### 1. Clonar o repositório

```bash
git clone https://github.com/DenisJR1910/Projeto-Youtube-em-JAVA.git
cd Projeto-Youtube-em-JAVA
2. Abrir no IDE
Abra o projeto no seu IDE favorito.

Se usar Maven: importe o projeto como um “Maven Project” para que as dependências sejam resolvidas automaticamente.

3. Compilar / construir (se aplicável)
Se for Maven, rode:

bash
Copiar código
mvn clean compile
Isso compila o código-fonte.

4. Rodar os testes / automação
Se tiver testes unitários com JUnit (ou outro framework), rode:

bash
Copiar código
mvn test
Ou, caso seja apenas um script/automação, execute a classe principal diretamente no IDE. 
Automation Panda
+2
Medium
+2

Para limpar artefatos antigos antes de executar, use:

bash
Copiar código
mvn clean test
(obs: clean remove a pasta target/, evitando conflito com resultados de execuções anteriores) 
Automation Panda

5. Ver resultados / logs
Se houver testes, o Maven (ou seu IDE) exibirá no console se passaram ou falharam.

Para automação tipo “abrir YouTube”, você verá a automação executando conforme implementado — por exemplo, abrindo o navegador, acessando o YouTube etc.
