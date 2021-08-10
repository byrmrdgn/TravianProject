@Kahraman
Feature: Kahraman

  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider
    And giris yap linkkine tiklar
    And oynadigi serveri secer
    And kullanici kutusuna kullanici adini girer
    And sifre kutusuna sifesini girer
    And giris yap butonuna tiklar
    Then kullanici cerez uyarisini kabul eder

@MacerayaGit
  Scenario: Kullanici kahramani maceraya gönderir
    Given kullanici kahramani secer
    And macera butonuna tiklar
    And macerayi baslatir
    And ve macerayi onaylar

@1.itemiSec
  Scenario: Kullanici kahramani maceraya gönderir
    Given kullanici kahramani secer
    And birinci itemi kullanir

@SaklanmaSavas
  Scenario: Kullanici saldiri esnasinda kahramani savastirir
    Given kullanici kahramani secer
    And saldiri esnasinda savas
    And degisiklikleri kaydeder

@SavasmaSaklan
  Scenario: Kullanici saldiri esnasinda kahramani saklar
    Given kullanici kahramani secer
    And saldiri esnasinda saklan
    And degisiklikleri kaydeder