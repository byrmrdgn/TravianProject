@hemenOyna
Feature: Kullanici Hemen Oyna linkine tikladigi zaman oyuna kayit olabilmeli

  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider

  Scenario: TC_021 Kullanici Hemen Oyna linkini kontrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    Then oyun dunyalarini kontrol eder

