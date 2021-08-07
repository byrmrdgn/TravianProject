@KöyMerkezi

Feature: Köy Merkezi
  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider
    And giris yap linkkine tiklar
    And oynadigi serveri secer
    And kullanici kutusuna kullanici adini girer
    And sifre kutusuna sifesini girer
    And giris yap butonuna tiklar
    Then kullanici cerez uyarisini kabul eder

@AskeriUsKur
  Scenario: Kullanici Köyune Askeri Us Kurar
    And Kullanici Köy Merkezi linkine tiklar
    And bina gelistirmek icin alan secer
    And ve binayi insa eder

@AskeriUsseGir
  Scenario: Kullanici Askeri ussunde islemler yapar
    And Kullanici Köy Merkezi linkine tiklar
    And askeri usse giris yapar

@AskeriUssuGelistir
  Scenario: Kullanici Askeri ussu gelsitirir
    And Kullanici Köy Merkezi linkine tiklar
    And askeri usse giris yapar
    And ve askeri ussu gelistirir
