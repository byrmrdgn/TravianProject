@US_02_OyuncuKayitIslemleri

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
  Scenario: TC_022 Kullanici Hemen Oyna linki icinde var olan uluslararasi bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden uluslararasi bölgenin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaArap
  Scenario: TC_023 Kullanici Hemen Oyna linki icinde var arap bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden arap bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaAmerika
  Scenario: TC_024 Kullanici Hemen Oyna linki icinde var olan amerika bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden amerika bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaAsya
  Scenario: TC_025 Kullanici Hemen Oyna linki icinde var olan asya bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden asya bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@hemenOynaAvrupa
  Scenario: TC_026 Kullanici Hemen Oyna linki icinde var olan avrupa bölgesinin oynandigi gun sayisini kotrol eder
    Given hemen oyna linkine tiklar
    And acilan pencereden oyun dunyalarina bakar
    And acilan pencereden avrupa bölgesinin oynandigi gun sayilarina bakar
    Then en kucuk gun sayisi olani secer

@enYeniServer
  Scenario: TC_027 Kullanici Hemen Oyna linki icinde var olan bölgelerden en yeni olan bölgeyi secer
  Given hemen oyna linkine tiklar
  And oyun dunyasini degistir linkine tiklar
  Then acilan dunyalardan en yeni server'i secer

@isimsizKayit
  Scenario: TC_028 Kullanici sisteme kullanici adi girmeden kayit olmaya calisir
    Given hemen oyna linkine tiklar
    And oyun dunyasini degistir linkine tiklar
    Then acilan dunyalardan en yeni server'i secer
    Then ePosta kutusuna e posta adresini girer
    Then hemen Kaydol butonuna tiklar

@EmailsizKayit
  Scenario: TC_029 Kullanici sisteme eposta adresini girmeden kayit olmaya calisir
    Given hemen oyna linkine tiklar
    And oyun dunyasini degistir linkine tiklar
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

@gecerliKayit
  Scenario: TC_032 Kullanici sisteme gecerli veriler ile kayit olmaya calisir
    Given hemen oyna linkine tiklar
    And oyun dunyasini degistir linkine tiklar
    Then acilan dunyalardan en yeni server'i secer
    Then isim kutusuna ismini girer
    Then email kutusuna email girer
    Then genel sartlari kabul eder
    Then hemen Kaydol butonuna tiklar

