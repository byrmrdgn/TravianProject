@hemenOynaLinki
Feature: Kullanici Hemen Oyna linkine tikladigi zaman oyuna kayit olabilmeli

  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider

@hemenOyna
  Scenario: TC_021 Kullanici Hemen Oyna linkini kontrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    Then oyun dunyalarini kontrol eder

@hemenOynaUluslararasi
  Scenario: TC_022 Kullanici Hemen Oyna linki icinde var olan bölgelerin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden uluslararasi bölgenin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaArap
  Scenario: TC_023 Kullanici Hemen Oyna linki icinde var olan bölgelerin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden arap bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaAmerika
  Scenario: TC_024 Kullanici Hemen Oyna linki icinde var olan bölgelerin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden amerika bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaAsya
  Scenario: TC_025 Kullanici Hemen Oyna linki icinde var olan bölgelerin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden asya bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer