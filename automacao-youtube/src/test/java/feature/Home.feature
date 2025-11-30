Feature: Busca no YouTube
  Scenario: Procurar por 'Selenium'
    Given eu pesquiso por "Radiohead - Creep"
    Then o título da página deve conter "Radiohead - Creep"

