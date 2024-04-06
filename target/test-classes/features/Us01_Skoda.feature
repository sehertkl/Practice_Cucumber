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




