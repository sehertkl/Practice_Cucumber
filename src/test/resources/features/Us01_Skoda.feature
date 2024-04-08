Feature: Kullanıcı Skoda sitesine gider header bölümündeki iki ögelenin görünürlüğünü test eder,
         ürün aramaları yapar.


  Scenario:Kullanıcı siteye gider ve ogelerin görünürlüğünü test eder

    * Kullanıcı "https://www.skoda.com.tr/" adresli sayfaya gider
    * Kullanıcı "Kabul Et" tıklar
    * Kullanıcı "Modeller" "Fiyat Listesi" göründüğünü test eder
    * Kullanıcı sayfayı kapatır

  @hb
  Scenario: Kullanıcı Modelleri inceler ve test eder
    * Kullanıcı "https://www.skoda.com.tr/" adresli sayfaya gider
    * Kullanıcı "Modeller" tıklar
    * Kullanıcı "Škoda Kodiaq" "Škoda Fabia" "Škoda Superb" göründüğünü test eder
    * Kullanıcı sayfayı kapatır

  Scenario: Kullanıcı satış iletişim formunu doldurur
    *  Kullanıcı "https://www.skoda.com.tr/" adresli sayfaya gider
    *  Kullanıcı "Kabul Et" tıklar
    *  Kullanıcı "Satış İletişim Formu" tıklar
    *  Kullanıcı "Škoda Modeli" tıklar
    *  Kullanıcı "Škoda Fabia" tıklar
    *  Kullanıcı "Tercih Edilen Bölge" tıklar
    *  Kullanıcı "Ege" tıklar
    *  Kullanıcı "Kullandığınız Otomobil Markası" tıklar
    *  Kullanıcı "Dacia" tıklar
    *  Kullanıcı tarih seçer
    *  Kullanıcı "Yetkili Satıcı" tıklar
    *  Kullanıcı "Lena Otomotiv - Aydın" tıklar
    *  Kullanıcı "Araç Değişimi için Tarih Seçiniz" tıklar
    *  Kullanıcı "6 ay içinde" tıklar







