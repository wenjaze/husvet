## Husvet

**Project made for university class : Szoftverfejlesztés (SE).**
**The purpose of this project is to implement logging technics
using Markers and Thread Context**

#### Project description:
``` 
Húsvéti naplózás

A feladatban az Apache Log4j 2 alábbi két lehetőségének használatát kell bemutatni:

    Markerek
    Thread Context

A markerek a naplóüzenetek címkézésére szolgálnak, mely lehetővé teszi a különböző fajta üzenetek szűrését. Például különböző markerek használhatók a felhasználói felület eseményeinek és az adatbázis műveleteknek a naplózásához. A Thread Context pedig lehetővé teszi kulcs-érték párok értékeinek automatikus beszúrását a naplóüzenetekbe.

Hozz létre egy Apache Maven projektet az alábbi két függőséggel:

    org.apache.logging.log4j:log4j-api:2.14.1
    org.apache.logging.log4j:log4j-core:2.14.1

Készíts egy olyan pkg.Main osztályt, melynek main metódusa egy húsvéti locsolóvers sorait naplózza többször egymás után, ahol az iterációk száma parancssor argumentumként legyen megadható. A verssorok naplózása különböző szinteken történjen. A naplózáshoz legalább két különböző markert kell használni, a ciklusban egy kivételével minden egyes naplóüzenetet meg kell jelölni valamelyik markerrel. Például különböző markerek használhatók a kijelentésekhez ("Zöld erdőben jártam") és a kérelmekhez ("Szabad-e locsolni?"). Az egyes iterációk között legyen egy kis késleltetés, ehhez használd a Thread.sleep(long millis) metódust.

A projekthez készíts egy log4j2.xml állományt, mely egy ConsoleAppender-t és megfelelő számú FileAppender-t konfigurál az alábbi módon.

A konzolon minden naplóüzenetnek meg kell jelennie. A különböző markerekkel megjelölt naplóüzeneteket különböző állományokba kell kiírni, a fenti példánál maradva külön állományokba kerüljenek a kijelentések és a kérelmek. Ehhez MarkerFilter-eket kell használni. A markerrel nem megjelölt naplóüzeneteket is egy külön állományba kell kiírni egy NoMarkerFilter segítségével.

A konzolon és a naplóállományokban minden egyes üzenetben meg kell, hogy jelenjen az aktuális iteráció száma, melyet a ThreadContext osztály és a Pattern Layout %X konverziós mintájának révén kell beilleszteni a kimenetbe. Tilos az iterációszám közvetlen használata a naplózó metódusokban!

Az egyik FileAppender-t úgy kell konfigurálni, hogy a kijárási tilalom ideje alatt (azaz 20:00 és 05:00 között) naplózott üzenetek a Győrfi_Pál.log állományba kerüljenek kiírásra. Ehhez egy megfelelően konfigurált TimeFilter szükséges.

Megoldásként a GitHub tároló URL-jét kell beküldeni. A határidő után tilos a tárolóban bármiféle módosítást végezni.
```
