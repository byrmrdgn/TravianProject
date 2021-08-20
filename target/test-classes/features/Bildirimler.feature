@Bildirimler
  Feature: Kullanici Bildirimler sayfasinda islemler yapar

    Background: TC_001 Travian sayfasina gidis
      Given kullanici "travian" adresine gider
      And giris yap linkkine tiklar
      And oynadigi serveri secer
      And kullanici kutusuna kullanici adini girer
      And sifre kutusuna sifesini girer
      And giris yap butonuna tiklar
      Then kullanici cerez uyarisini kabul eder


    @hepsiRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki hepsi linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And hepsi linkini tiklar ve raporlari göruntuler
      And tumunu secer

    @saldiriRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki saldiri linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And saldiri linkini tiklar ve raporlari göruntuler
      And tumunu secer

    @savunmaRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki savunma linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And savunma linkini tiklar ve raporlari göruntuler
      And tumunu secer

    @gözetlemeRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki gözetleme linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And gözetleme linkini tiklar ve raporlari göruntuler
      And tumunu secer

    @digerleriRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki digerleri linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And digerleri linkini tiklar ve raporlari göruntuler
      And tumunu secer

    @arsivRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki arsiv linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And arsiv linkini tiklar ve raporlari göruntuler
      And tumunu secer

    @cevreRaporlariniGöruntule
    Scenario: TC_XXX kullanici bildirimler sayfasindaki cevre linkini kontrol eder
      Given kullanici bildirimler linkini tiklar
      And cevre linkini tiklar ve raporlari göruntuler
