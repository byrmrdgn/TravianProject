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

  @logo
  Scenario: TC_006 Kullanici logoyu görur
    Given travian logosunun görunurlugunu test eder

  @dilSecenekleri
  Scenario: TC_007 Kullanici dil seceneklerinden dil secer
    Given dil secenekleri linkini tiklar
    And acilan sayfadan dilleri secer

  @haberlerLinki
  Scenario: TC_008 Kullanici haberler linkini kontrol eder
    Given haberler linkine tiklar ve geri döner

  @buyukYazi
  Scenario: TC_009 Kullanici buyuk yazinin varligini kontrol eder
    Given ana sayfada buyuk yazinin görunup görunmedigine bakar

  @kucukYazi
  Scenario: TC_010 Kullanici kucuk yazinin varligini kontrol eder
    Given ana sayfada kucuk yazinin görunup görunmedigine bakar