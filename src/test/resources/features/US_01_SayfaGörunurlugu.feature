@sayfaGörunurlugu
Feature: Kullanici gerekli bilgileri yazmadan uyelik islemi gerceklesmemeli

    Background: Travian sayfasina gidis
      Given kullanici "travian" adresine gider

  @oyunDropdown
  Scenario: Oyun dropdown'u
      Given kullanici oyun dropdownuna gider
      And dropdown icindekileri kontrol eder
