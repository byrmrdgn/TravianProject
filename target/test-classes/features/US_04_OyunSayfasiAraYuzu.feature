Feature: Hammadde KaynaklariEski

  Background: TC_001 Travian sayfasina gidis
  Given kullanici "travian" adresine gider
  And giris yap linkkine tiklar
  And oynadigi serveri secer
  And kullanici kutusuna kullanici adini girer
  And sifre kutusuna sifesini girer
  And giris yap butonuna tiklar

  @hammaddeKaynaklari
  Scenario: Kullanici hammadde kaynaklarini kontrol eder
    And kullanici hammadde kaynaklarina tiklar ve geri döner

  @odunKaynaklari
  Scenario: Kullanici odun kaynaklarini kontrol eder
    And kullanici hammadde kaynaklarina tiklar ve geri döner
    And kullanici en az gelismis olani odun kaynagini secer ve onu gelistirir

#  @binaAlanlari
#  Scenario: Kullanici alanlarini kontrol eder
#    And kullanici bina alanlarina tiklar ve geri döner



