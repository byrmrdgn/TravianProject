@US_01_sayfaGörunurlugu
Feature: Ilk sayfa kullanicilar icin kullanisli olmali
    # Assert edildi
  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider

  @oyunDropdown
    # Assert edildi
  Scenario: TC_002 Kullanici dropdown icindeki linkleri kontrol eder
    Given kullanici oyun dropdownuna gider
    And oyun tarzi linkine tiklar ve geri döner
    And oyuncu etkilesimine tiklar ve geri döner
    And imparatorluk kur linkine tiklar ver geri döner
    And Carpisma linkine tiklar ve geri döner
    And Gec oyun linkine tiklar ve geri döner
    And Kullanici driveri kapatir

  @tournamentlinki
    # Assert edildi
  Scenario: TC_003 Kullanici tournament linkini kontrol eder
    Given tournament linkine tiklar ve geri döner
    And Kullanici driveri kapatir

  @medyaDropdown
    # Assert edildi
  Scenario: TC_004 Kullanici medya dropdown icindeki linkleri kontrol eder
    Given kullanici medya linkine gider
    And ekran göruntuleri linkine tiklar ve geri döner
    And tv reklamlari linkine tiklar ve geri döner
    And Kullanici driveri kapatir

  @discordlinki
    # Assert edildi
  Scenario: TC_005 Kullanici discord icindeki linkleri kontrol eder
    Given discord dropdownuna gider
    And blog linkine tiklar
    And discord linkine tiklar
    And calender linkine tiklar
    And Kullanici driveri kapatir

  @logo
    # Assert edildi
  Scenario: TC_006 Kullanici logoyu görur
    Given travian logosunun görunurlugunu test eder
    And Kullanici driveri kapatir

  @dilSecenekleri
    # Assert edildi
  Scenario: TC_007 Kullanici dil seceneklerinden dil secer
    Given dil secenekleri linkini tiklar
    And acilan sayfadan dilleri secer
    And Kullanici driveri kapatir

  @buyukYaziGörunurMu
    # Assert edildi
  Scenario: TC_008 Kullanici buyuk yazinin varligini kontrol eder
    Given ana sayfada buyuk yazinin görunup görunmedigine bakar
    And Kullanici driveri kapatir

  @kucukYaziGörunurMu
    # Assert edildi
  Scenario: TC_009 Kullanici kucuk yazinin varligini kontrol eder
    Given ana sayfada kucuk yazinin görunup görunmedigine bakar
    And Kullanici driveri kapatir

  @hemenOynaGörunurMu
    # Assert edildi
  Scenario: TC_010 Kullanici hemen oyna yazisinin varligini kontrol eder
    Given ana sayfada hemen oyna yazisinin görunup görunmedigine bakar
    And Kullanici driveri kapatir

  @kaleArkaPlaniResmiGörunurMu
    # Assert edildi
  Scenario: TC_011 Kullanici kale arka plan resminin varligini kontrol eder
    Given ana sayfada kale arka plan resminin görunup görunmedigine bakar
    And Kullanici driveri kapatir

  @romaOrdusuResmiGörunurMu
    # Assert edildi
  Scenario: TC_012 Kullanici roma ordusu resminin varligini kontrol eder
    Given ana sayfada roma ordusu resminin görunup görunmedigine bakar
    And Kullanici driveri kapatir

  @romaKomutaniResmiGörunurMu
    # Assert edildi
  Scenario: TC_013 Kullanici roma komutan resminin varligini kontrol eder
    Given ana sayfada roma komutan resminin görunup görunmedigine bakar
    And Kullanici driveri kapatir

  @facebooklinki
    # Assert edildi
  Scenario: TC_014 Kullanici sayfanin altindaki facebook linkini kontrol eder
    Given facebook linkine tiklar ve geri döner
    And Kullanici driveri kapatir

  @sayfaAltiDiscordlinki
    # Assert edildi
  Scenario: TC_015 Kullanici sayfanin altindaki discord linkini kontrol eder
    Given sayfanin altindaki discord linkine tiklar
    And Kullanici driveri kapatir

  @sayfaAltiYoutubelinki
    # Assert edildi
  Scenario: TC_016 Kullanici sayfanin altindaki youtube linkini kontrol eder
    Given sayfanin altindaki youtube linkine tiklar
    And Kullanici driveri kapatir

  @sayfaAltiDesteklinki
    # Assert edildi
  Scenario: TC_017 Kullanici sayfanin altindaki destek linkini kontrol eder
    Given sayfanin altindaki destek linkine tiklar ve geri döner
    And Kullanici driveri kapatir

  @sayfaAltiDahaFazlaOynalinki
    # Assert edildi
  Scenario: TC_018 Kullanici sayfanin altindaki daha fazla oyna linkini kontrol eder
    Given sayfanin altindaki daha fazla oyna linkine tiklar ve geri döner
    And Kullanici driveri kapatir

  @sayfaAltiOyunKurallarilinki
    # Assert edildi
  Scenario: TC_019 Kullanici sayfanin altindaki oyun kurallari linkini kontrol eder
    Given sayfanin altindaki oyun kurallari linkine tiklar ve geri döner
    And Kullanici driveri kapatir