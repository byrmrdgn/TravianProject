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
    And askeri us kurmak icin alan secer
    And ve binayi insa eder

@AskeriUsseGir
  Scenario: Kullanici Askeri ussunde islemler yapar
    And Kullanici Köy Merkezi linkine tiklar
    And askeri usse giris yapar

@AskeriUssuGelistir
  Scenario: Kullanici Askeri ussu gelsitirir
    And Kullanici Köy Merkezi linkine tiklar
    And askeri usse giris yapar
    And ve binayi gelistirir

@SiginakKur
  Scenario: Kullanici Köyune Siginak Kurar
    And Kullanici Köy Merkezi linkine tiklar
    And siginak kurmak icin alan secer
    And ve binayi insa eder

@SiginagiGelistir
  Scenario: Kullanici siginagi gelistirir
    And Kullanici Köy Merkezi linkine tiklar
    And siginaga giris yapar
    And ve binayi gelistirir

@HammaddeDeposuKur
  Scenario: Kullanici Köyune Hammadde Deposu Kurar
    And Kullanici Köy Merkezi linkine tiklar
    And hammadde deposu kurmak icin alan secer
    And ve binayi insa eder

@TahilAmbariKur
  Scenario: Kullanici Köyune Tahil ambari Kurar
    And Kullanici Köy Merkezi linkine tiklar
    And tahil ambari kurmak icin alan secer
    And ve binayi insa eder

@MerkezBinasiniGelistir
  Scenario: Kullanici Merkez binasini gelistirir
    And Kullanici Köy Merkezi linkine tiklar
    And merkez binasina giris yapar
    And ve binayi gelistirir

@KislaKur
  Scenario: Kullanici Köyune Kisla Kurar
    And Kullanici Köy Merkezi linkine tiklar
    And kisla kurmak icin alan secer
    And askeri yapi kurmak icin askeri butona tiklar
    And ve binayi insa eder