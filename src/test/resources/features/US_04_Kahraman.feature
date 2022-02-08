@Kahraman
  # KOMPLE GÖZDEN GECIRILECEK
Feature: Kahraman

Background: TC_001 Travian sayfasina gidis
    Given kullanici "travian" adresine gider
    And giris yap linkkine tiklar
    And oynadigi serveri secer
    And kullanici kutusuna kullanici adini girer
    And sifre kutusuna sifesini girer
    And giris yap butonuna tiklar
    Then kullanici cerez uyarisini kabul eder

@KahramaniDuzenle
  # bu method calisiyor assert edilecek
  Scenario: Kullanici Kahramani Duzenler
    Given kullanici kahramani secer
    And kahrmani duzenleyi secer
    And kafa seklini secmek icin secenekelere bakar
    And kafa seklini secer
    And sac rengini secmek icin secenekelere bakar
    And sac rengini secer
    And sac seklini secmek icin secenekelere bakar
    And sac seklini secer
    And kulak seklini secmek icin secenekelere bakar
    And kulak seklini secer
    And kas seklini secmek icin secenekelere bakar
    And kas seklini secer
    And göz rengini secmek icin secenekelere bakar
    And göz rengini secer
    And burun seklini secmek icin secenekelere bakar
    And burun seklini secer
    And agiz seklini secmek icin secenekelere bakar
    And agiz seklini secer
    And sakal seklini secmek icin secenekelere bakar
    And sakal seklini secer
    And kahramanin fiziksel degisikliklerini kaydeder

@MacerayaGit
  # bu method calisiyor assert edilecek
  Scenario: Kullanici kahramani maceraya gönderir
    Given kullanici kahramani secer
    And saglik seviyesini alir
    And macera butonuna tiklar
    And macerayi baslatir
    And ve macerayi onaylar

@1.itemiSec
  Scenario: Kullanici kahramana At alir
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

@saglikSeviyesiniAl
  Scenario: Kullanici kahramaninin saglik seviyesini alir
    Given kullanici kahramani secer
    And saglik seviyesini alir

@KahramaninSaldiriBonusunuFullArttir
  Scenario: Kullanici Kahramanin saldiri bonusunu tam puan arttirir.
    Given kullanici kahramani secer
    And kahramanin saldiri bonusunu arttirir
    And degisiklikleri kaydeder

@ItemSec
  Scenario: Kullanici kahramana item ekler
  Given kullanici kahramani secer
  And item ekler
  And itemi onaylar

@sifaMerhemineTeklifYap
  #bu code'a calisilacak, tum senaryolara bakilmasi lazim
  Scenario: Kullanici acik arttirmaya katilir
    Given kullanici kahramani secer
    And acik arttirma linkine tiklar
    And sifa merhemine tiklar
    And teklfi ver butonuna tiklar ve teklif edecegi miktari girerek teklifi onaylar


