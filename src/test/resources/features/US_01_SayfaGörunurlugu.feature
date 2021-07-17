@sayfaGörunurlugu
Feature: Kullanici gerekli bilgileri yazmadan uyelik islemi gerceklesmemeli

    Background: TC_001 Travian sayfasina gidis
      Given kullanici "travian" adresine gider

  @oyunDropdown
  Scenario: TC_002 Kullanici dropdown icindeki linkleri kontrol eder
    Given kullanici oyun dropdownuna gider
    And oyun tarzi linkine tiklar ve geri döner
    And oyuncu etkilesimine tiklar ve geri döner
    And imparatorluk kur linkine tiklar ver geri döner
    And Carpisma linkine tiklar ve geri döner
    And Gec oyun linkine tiklar ve geri döner

  @tournamentlinki
  Scenario: TC_003 Kullanici tournament linkini kontrol eder
    Given tournament linkine tiklar ve geri döner

  @medyaDropdown
  Scenario: TC_004 Kullanici medya dropdown icindeki linkleri kontrol eder
    Given kullanici medya linkine gider
    And ekran göruntuleri linkine tiklar ve geri döner
    And tv reklamlari linkine tiklar ve geri döner

  @discordlinki
  Scenario: TC_005 Kullanici discord linkini kontrol eder
    Given discord linkine tiklar ve geri döner