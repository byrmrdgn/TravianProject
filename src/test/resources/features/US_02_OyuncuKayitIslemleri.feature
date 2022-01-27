@US_02_OyuncuKayitIslemleri
# BU SAYFA KOMPLE GÖZDEN GECIRILMELI
@hemenOynaLinki
Feature: Kullanici oyuna kayit olabilmeli

  Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider

 @hemenOyna
   # Assert Edildi
  Scenario: TC_020 Kullanici Hemen Oyna linkini kontrol eder
    Given hemen oyna linkine tiklar
    And sayfada asagi inerek cikan kaydol linkine tiklar
    And sayfanin altindaki hemen oyna linkine tiklar

 @oyunDunyalari
   # Assert Edildi
  Scenario: TC_021 Kullanici oyun bölgelerini kontrol eder
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    Then oyun dunyalarini kontrol eder

 @hemenOynaUluslararasi
  # Assert Edildi
  Scenario: TC_022 Kullanici Hemen Oyna linki icinde var olan uluslararasi bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    And acilan pencereden uluslararasi bölgenin oynandigi gun sayilarina bakararak en yeni olani secer

 @hemenOynaArap
  # Assert Edildi
  Scenario: TC_023 Kullanici Hemen Oyna linki icinde var arap bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    And acilan pencereden arap bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer

 @hemenOynaAmerika
 # Assert Edildi
 Scenario: TC_024 Kullanici Hemen Oyna linki icinde var olan amerika bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    And acilan pencereden amerika bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer

 @hemenOynaAsya
  # Assert Edildi
  Scenario: TC_025 Kullanici Hemen Oyna linki icinde var olan asya bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    And acilan pencereden asya bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer

 @hemenOynaAvrupa
  # Assert Edildi
  Scenario: TC_026 Kullanici Hemen Oyna linki icinde var olan avrupa bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    And acilan pencereden avrupa bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer

 @enYeniServer
  # Assert Edildi
  Scenario: TC_027 Kullanici Hemen Oyna linki icinde var olan bölgelerden en yeni olan bölgeyi secer
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    Then acilan dunyalardan en yeni server'i secer

 @isimsizKayit
  # Assert Edildi
  Scenario: TC_028 Kullanici sisteme kullanici adi girmeden kayit olmaya calisir
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    Then acilan dunyalardan en yeni server'i secer
    Then ePosta kutusuna e posta adresini girer
    Then hemen Kaydol butonuna tiklar

 @EmailsizKayit
  #Assert Edildi
  Scenario: TC_029 Kullanici sisteme eposta adresini girmeden kayit olmaya calisir
    Given hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar
    Then acilan dunyalardan en yeni server'i secer
    Then isim kutusuna ismini girer
    Then hemen Kaydol butonuna tiklar

 @GecersizEmailIleKayit
  Scenario: TC_030 Kullanici sisteme gecersiz eposta ile kayit olmaya calisir
    Given hemen oyna linkine tiklar
    And oyun dunyasini degistir linkine tiklar
    Then acilan dunyalardan en yeni server'i secer
    Then isim kutusuna ismini girer
    Then email kutusuna gecersiz email girer
    Then hemen Kaydol butonuna tiklar

 @genelSartlarKabulEdilmedenGiris
  Scenario: TC_031 Kullanici sisteme genel sartlar ve kosullari kabul etmeden kayit olmaya calisir
    Given hemen oyna linkine tiklar
    And oyun dunyasini degistir linkine tiklar
    Then acilan dunyalardan en yeni server'i secer
    Then isim kutusuna ismini girer
    Then email kutusuna email girer
    Then hemen Kaydol butonuna tiklar

 #@gecerliKayit
  #Scenario: TC_032 Kullanici sisteme gecerli veriler ile kayit olmaya calisir
    #Given hemen oyna linkine tiklar
    #And oyun dunyasini degistir linkine tiklar
    #Then acilan dunyalardan en yeni server'i secer
    #Then isim kutusuna ismini girer
    #Then email kutusuna email girer
    #Then genel sartlari kabul eder
    #Then hemen Kaydol butonuna tiklar

