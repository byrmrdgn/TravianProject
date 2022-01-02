@US_01_sayfaGörunurlugu
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
  Scenario: TC_005 Kullanici discord icindeki linkleri kontrol eder
    Given discord dropdownuna gider
    And blog linkine tiklar
    And discord linkine tiklar
    And calender linkine tiklar

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

  @buyukYaziGörunurMu
  Scenario: TC_009 Kullanici buyuk yazinin varligini kontrol eder
    Given ana sayfada buyuk yazinin görunup görunmedigine bakar

  @kucukYaziGörunurMu
  Scenario: TC_010 Kullanici kucuk yazinin varligini kontrol eder
    Given ana sayfada kucuk yazinin görunup görunmedigine bakar

  @hemenOynaGörunurMu
  Scenario: TC_011 Kullanici hemen oyna yazisinin varligini kontrol eder
    Given ana sayfada hemen oyna yazisinin görunup görunmedigine bakar

  @kaleArkaPlaniResmiGörunurMu
  Scenario: TC_012 Kullanici kale arka plan resminin varligini kontrol eder
    Given ana sayfada kale arka plan resminin görunup görunmedigine bakar

  @romaOrdusuResmiGörunurMu
  Scenario: TC_013 Kullanici roma ordusu resminin varligini kontrol eder
    Given ana sayfada roma ordusu resminin görunup görunmedigine bakar

  @romaKomutaniResmiGörunurMu
  Scenario: TC_014 Kullanici roma komutan resminin varligini kontrol eder
    Given ana sayfada roma komutan resminin görunup görunmedigine bakar

  @facebooklinki
  Scenario: TC_015 Kullanici sayfanin altindaki facebook linkini kontrol eder
    Given facebook linkine tiklar ve geri döner

  @sayfaAltiDiscordlinki
  Scenario: TC_016 Kullanici sayfanin altindaki discord linkini kontrol eder
    Given sayfanin altindaki discord linkine tiklar

  @sayfaAltiYoutubelinki
  Scenario: TC_017 Kullanici sayfanin altindaki youtube linkini kontrol eder
    Given sayfanin altindaki youtube linkine tiklar

  @sayfaAltiDesteklinki
  Scenario: TC_018 Kullanici sayfanin altindaki destek linkini kontrol eder
    Given sayfanin altindaki destek linkine tiklar ve geri döner

  @sayfaAltiDahaFazlaOynalinki
  Scenario: TC_019 Kullanici sayfanin altindaki daha fazla oyna linkini kontrol eder
    Given sayfanin altindaki daha fazla oyna linkine tiklar ve geri döner

  @sayfaAltiOyunKurallarilinki
  Scenario: TC_020 Kullanici sayfanin altindaki oyun kurallari linkini kontrol eder
    Given sayfanin altindaki oyunk kurallari linkine tiklar ve geri döner