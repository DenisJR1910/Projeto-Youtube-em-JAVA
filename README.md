#  Automação YouTube em Java (Selenium + Maven)

Este projeto realiza uma automação simples utilizando **Java + Selenium WebDriver**, abrindo o site do YouTube automaticamente.  
Ideal para estudos de automação web e primeiros passos com Selenium, Maven e execução via Runner ou classe principal.

---

# 📌 1. Pré-requisitos obrigatórios


Antes de executar o projeto, instale:

---

## ✅ 1.1 Java JDK  

- **Versão recomendada:** JDK 17
  
- Funciona também em: JDK 11 ou JDK 8

   **Download oficial do Java JDK 17:**  
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
  
Verificar instalação:

```java -version```

---
✅ 1.2 Maven
Versão recomendada: Maven 3.8+

  **Download oficial do Maven**
 https://maven.apache.org/download.cgi

Verificar instalação:

```mvn -version```

---
✅ 1.3 Navegador Google Chrome

Mantenha sempre atualizado



---
✅ 1.4 ChromeDriver (Gerenciado automaticamente)
O projeto pode utilizar:

✔ WebDriverManager (recomendado)
ou ChromeDriver manual

Dependência para usar WebDriverManager:

```
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.7.0</version>
</dependency>
```

---
 2. Clonar o projeto

git clone ```https://github.com/DenisJR1910/Projeto-Youtube-em-JAVA.git
cd Projeto-Youtube-em-JAVA```

---
 3. Abrir o projeto no IntelliJ ou Eclipse
No IntelliJ:

Abra o programa

Vá em File → Open

Selecione a pasta do projeto

O IntelliJ irá carregar o Maven automaticamente

---
🔧 4. Instalar dependências

No terminal dentro do IDE execute:

```mvn clean install```

Se tudo estiver correto, o Maven fará o download de:

Selenium WebDriver

WebDriverManager

Outras dependências definidas no pom.xml

---
 5. Como executar a automação

Existem duas maneiras de rodar o projeto:

✔️ FORMA 1 — Executar a classe principal
Exemplo de Main:

java

```
package br.com.youtube;

public class Main {
    public static void main(String[] args) {
        Util.openWeb("https://www.youtube.com");
    }
}
Para rodar:
➡ Clique com o botão direito na classe
➡ Run 'Main'
```

✔️ FORMA 2 — Executar com o Runner do Cucumber
(caso o projeto utilize BDD)

Exemplo de Runner:

java

```
package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps,hooks")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:report.html")
public class RunCucumberTest {
}
```

Para rodar:

➡ Clique com o botão direito na classe

➡ Run 'RunCucumberTest'
