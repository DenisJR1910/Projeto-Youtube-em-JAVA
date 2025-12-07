📌 1. Pré-requisitos obrigatórios

Antes de executar o projeto, instale:
1.1 Java JDK

Versão recomendada: JDK 17

Também funciona com: JDK 11 ou JDK 8

Para verificar se o Java está instalado:

java -version

1.2 Maven

Versão recomendada: Maven 3.8+

Verificar:

mvn -version

1.3 Navegador Google Chrome

Atualizado

Versão recomendada: Chrome 120+

1.4 ChromeDriver (Gerenciado automaticamente)

Seu projeto pode usar:
✔ WebDriverManager (recomendado)
ou
✔ ChromeDriver manual

Se quiser WebDriverManager, precisa adicionar no pom.xml:

<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.7.0</version>
</dependency>

▶️ 4. Como rodar o projeto
PASSO 1 — Clonar o projeto
git clone https://github.com/DenisJR1910/Projeto-Youtube-em-JAVA.git
cd Projeto-Youtube-em-JAVA

PASSO 2 — Abrir no IntelliJ ou Eclipse

No IntelliJ:

File → Open → escolha o projeto

Ele irá carregar automaticamente o Maven

PASSO 3 — Instalar dependências

No terminal do IntelliJ:

mvn clean install


Se tudo ok → Maven baixa Selenium + WebDriverManager.

PASSO 4 — Executar a Automação

Existem duas formas de rodar:

✔ FORMA 1 – Executar a classe principal

Exemplo (pode variar dependendo de como você criou):

package br.com.youtube;

public class Main {
    public static void main(String[] args) {
        Util.openWeb("https://www.youtube.com");
    }
}


No IntelliJ:
➡ clique com botão direito > Run 'Main'

✔ FORMA 2 – Executar com Runner do Cucumber (se seu projeto tiver Cucumber)

Classe exemplo:

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


Rodar:

➡ Clique com botão direito na classe RunCucumberTest
➡ Run 'RunCucumberTest'

🧪 5. O que a automação faz

Quando executada:

Abre o navegador Chrome

Entra em https://www.youtube.com

Finaliza o navegador após o teste (Hooks)
