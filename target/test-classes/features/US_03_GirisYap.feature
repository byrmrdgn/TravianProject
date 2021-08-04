@giris
Feature: Kullanici Giris Yap linkine tikladigi zaman oyuna giris yapabilmeli

  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider

@girisYap
  Scenario: TC_0xx Kullanici giris yap linkini kontrol eder
    Given giris yap linkkine tiklar
    And oynadigi serveri secer
    And kullanici kutusuna kullanici adini girer
    And sifre kutusuna sifesini girer
    And giris yap butonuna tiklar

@milletSec
  Scenario: TC_0xx Kullanici oynayacagi milleti secer
    Given giris yap linkkine tiklar
    And oynadigi serveri secer
    And kullanici kutusuna kullanici adini girer
    And sifre kutusuna sifesini girer
    And giris yap butonuna tiklar
    And "milleti" secer
    And oynayacagi haritayi onaylar
