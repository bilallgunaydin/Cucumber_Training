Feature: Register Test

  Background:
    Given Navigate to Website
    And click Sign in button
    And type email "bilal@gmail.com"
    And click on Create an Account button


    Scenario: Kisi 1
      And type firstname "bilal" and lastname "günaydın"
      And type password "bilal23"

    Scenario: Kisi 2
      And type Company "techno study"
      And type address "asdasdad "

    Scenario Outline: Kisi 3
      And type firstname "<isim>" and lastname "<soyisim>"
      And type password "<sifre>"
      And  type Company "<sirket>"
      And  type address "<adres>"
      Examples:
        |isim|soyisim|sifre|sirket|adres|
        |Mustafa|Ozdemir|1234|Amazon|limesStrasse|
        |Fatih  |Ozdemir|4567|Dell  |goetheplats5|





