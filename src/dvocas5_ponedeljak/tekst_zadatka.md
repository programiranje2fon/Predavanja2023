# Predavanje 5

	5 Klasa String
	6 Klasa LocalDateTime

# Zadatak 1

Napraviti klasu **Osoba** u paketu **dvocas5_ponedeljak.zadatak1** koja ima:


- atribut **ime** koji predstavlja ime osobe. Početna vrednost je "nepoznato".**(Klasa String - [dokumentacija](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), razlika u odnosu na char[], inicijalizacija String-a, String vrednosti " " i char vrednosti ' ', dokumentacija: )**
- atribut **prezime** koji predstavlja prezime osobe. Početna vrednost je "nepoznato".
- atribut **adresa** koji predstavlja adresu stanovanja osobe u formatu "ULICA;BROJ;GRAD" (npr. "Jove Ilica;154;Beograd").


- metodu **postaviIme** koja kao parametar dobija novu vrednost za ime osobe i postavlja atribut ime na tu vrednost samo ako je uneto ime različito od null i nije prazan String. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu. **(null vrednost, prazan String, razlike između ta dva, isEmpty + length metode, metoda trim)**

- metodu **postaviPrezime** koja kao parametar dobija novu vrednost za prezime osobe i postavlja atribut prezime na tu vrednost samo ako je uneto ime različito od null i nije prazan String. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu. 

- metodu **postaviAdresu** koja kao parametar dobija novu vrednost za adresu osobe i postavlja vrednost atributa adresa na tu vrednost, samo ako je različita od null, dužine je 5 znakova ili više i sadrži dva znaka ';' na različitim pozicijama. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu. **(indeksi znakova u String-u, dve varijante metode: charAt() i indexOf, lastIndexOf)**

- metodu **istaAdresa** koja kao tri parametra dobija: ulicu, broj i grad neke druge osobe. Metoda proverava da li je u pitanju ista adresa, ili bar isti grad i ispisuje odgovarajuću poruku na ekranu ("potpuno ista adresa", "samo isti grad", "nije ista adresa").**(nadovezivanje String vrednosti sa +, poređenje String vrednosti - equals, equalsIgnoreCase a NE sa ==, metoda endsWith/startsWith)**  

- metodu **ispisi** koja na ekranu ispisuje sve podatke o osobi, i to tako da u posebnim redovima budu ime, prezime, ulica, broj i grad.**(metoda substring, metoda split)**


Napraviti klasu **TestOsoba** u paketu **dvocas5_ponedeljak.zadatak1** koja ima main metodu i u kojoj se testiraju atributi i metode klase Osoba. Napraviti objekat klase Osoba: Pera Perić, Jove Ilića 154, Beograd.Ispisati na ekranu sve podatke iz objekta i proveriti da li je adresa Vojislava Ilića 154, Beograd, ista adresi te osobe.

**Problem**: niz znakova u klasi String je nepromenljiv ("immutable"). Kada se unosi nova vrednost, pravi se novi String. Uvode se dve klase koje rešavaju taj problem u slučaju da je potrebno:
- StringBuffer - u redu je za višenitni rad ("thread-safe"), ali je sporija. [dokumentacija](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html)
- StringBuilder - nije ok za višenitni rad, ali je brža. [dokumentacija](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)


# Zadatak 2


Napraviti klasu **FilmskaPremijera** u paketu **dvocas5_ponedeljak.zadatak2** koja ima:


- atribut **nazivFilma**.
- atribut **datumPremijereAmerika** koji predstavlja datum premijere filma u Americi. Početna vrednost za ovaj atribut je trenutni datum i vreme. **(predstavljanje datuma u Javi, LocalDateTime klasa - [dokumentacija](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) i LocalDate/LocalTime/ZonedDateTime, import, klase Date i GregorianCalendar, početna vrednost datuma pri inicijalizaciji)**
- atribut **datumPremijereSvet** koji predstavlja datum premijere filma u ostatku sveta. Početna vrednost za ovaj atribut je 21.3.2022.**(inicijalizacija datuma na konkretne vrednosti)**

- metodu **postaviNaziv** koja kao parametar dobija novu vrednost za naziv filma i postavlja atribut nazivFilma na tu vrednost samo ako je uneti naziv različit od null i nije prazan String. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu.
- metodu **postaviDatumePremijera** koja ima dva parametra: datum premijere u Americi i datum premijere u ostatku sveta. Ova metoda postavlja unete vrednosti u odgovarajuće atribute, ali samo ako su oba datuma različita od null, i ako se odnose na vremenske trenutke u budućnosti. Ako to nije slučaj, ispisati samo poruku greške.**(before i after metode)**
- metodu **ispisi** koja na ekranu ispisuje sve podatke o filmskoj premijeri.**(malo lepši ispis datuma, pojedinačno uzimanje polja)**
- metodu **pomeriPremijere** koja pomera premijere za godinu dana unapred.



Napraviti klasu **TestFilmskaPremijera** u paketu **dvocas5_ponedeljak.zadatak2** koja ima main metodu u kojoj pravi objekat klase FilmskaPremijera sa sledećim vrednostima atributa: Addams Familiy 2, 15.11.2021., 16.11.2021.Ispisati na ekranu sve podatke iz objekta.**(Inicijalizacija datuma preko konstruktora i preko set metode)**
 