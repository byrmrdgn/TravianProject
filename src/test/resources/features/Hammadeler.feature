@Hammaddeler
Feature: Hammadde Kaynaklari

  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider
    And giris yap linkkine tiklar
    And oynadigi serveri secer
    And kullanici kutusuna kullanici adini girer
    And sifre kutusuna sifesini girer
    And giris yap butonuna tiklar
    Then kullanici cerez uyarisini kabul eder

  @ormaniGelistir
  Scenario: Kullanici Orman Kaynaklarini Gelistirir
    Given kullanici ormani gelistirmek icin alan secer
    And ve ormani gelistirir

  @tuglayiGelistir
  Scenario: Kullanici Tugla Kaynaklarini Gelistirir
    Given kullanici tuglayi gelistirmek icin alan secer
    And ve tuglayi gelistirir

  @demiriGelistir
  Scenario: Kullanici Demir Kaynaklarini Gelistirir
    Given kullanici demiri gelistirmek icin alan secer
    And ve demiri gelistirir

  @tahiliGelistir
  Scenario: Kullanici Tahil Kaynaklarini Gelistirir
    Given kullanici tahil gelistirmek icin alan secer
    And ve tahil gelistirir