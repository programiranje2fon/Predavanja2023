# Predavanje 7

	8.2 JavaBean specifikacija
	9 Nizovi objekata
	
# Zadatak 1


Napraviti javnu klasu **Student** u paketu **dvocas7_ponedeljak.zadatak1** koja ima:

- privatni atribut **ime** koji predstavlja ime studenta.
- privatni atribut **prezime** koji predstavlja prezime studenta.
- privatni atribut **brojIndeksa** koji predstavlja broj indeksa studenta u formatu BBBB/GGGG (npr. "0084/2020").
- privatni atribut **ocena** koji predstavlja ocenu koju je student dobio na ispitu (u rasponu od 5 do 10).


**Problem: Privatni atributi zahtevaju javne metode za pristup i upisivanje, ali nazivi tih metoda mogu biti bilo kakvi (uzmiIme, vratiIme, preuzmiIme ili postaviIme, unesiIme, namestiIme...). Uveden je [JavaBean](https://en.wikibooks.org/wiki/Java_Programming/JavaBeans) standard/konvencija koji je prvenstveno bio namenjen za grafičke komponente, ali se primenjuje i na druge (obične) klase.**

Dodati u klasu **Student**:

 - javne **get i set metode** za sve atibute. Nedozvoljene vrednosti za ime i prezime su null i prazni String-ovi, a broj indeksa ne sme biti null i mora biti dužine 9 znakova. Ocena mora biti u rasponu od 5 do 10. U slučaju unosa nedozvoljenih vrednosti samo ispisati poruku greške na ekranu.**(get i set metode, automatsko generisanje get i set metoda u Eclipse-u)**

- redefinisanu toString metodu koja vraća String sa svim podacima o Studentu. **(automatsko generisanje toString metode u Eclipse-u)**

- redefinisanu equals metodu koja poredi dva objekta klase Student i vraća true ako su im isti brojevi indeksa, a false ako nisu. **(automatsko generisanje equals metode u Eclipse-u)**



**Problem: Nizovi sa elementima prostog tipa su ograničeni jer ne mogu da sadrže više podataka u jednom elementu niza. Zato se uvode nizovi objekata - svaki element niza je objekat neke klase.**

Napraviti javnu klasu **IspitniSpisak** u paketu **dvocas7_ponedeljak.zadatak1** koja ima:

- privatni atribut **nazivPredmeta** koji predstavlja naziv predmeta na koji se odnosi spisak.
- privatni atribut **studenti** koji predstavlja niz objekata klase Student. To je niz sa podacima o studentima i ocenama koje su oni dobili na ispitu iz tog predmeta. **(nizovi objekata u Javi, deklaracija niza objekata)**


- javne **get i set metode** za nazivPredmeta. Nedozvoljeni su null vrednost i prazan String.U slučaju unosa nedozvoljenih vrednosti samo ispisati poruku greške na ekranu.

- javni konstruktor koji prima dva parametra: naziv predmeta i broj studenata koji su polagali ispit. Konstruktor treba da postavi atribut nazivPredmeta na uneti naziv, a da niz studenti inicijalizuje tako da mu kapacitet bude jednak unetom broju studenata. Ako je uneti broj studenata nula ili manji od nule, ispisati poruku o grešci na ekranu i inicijalizovati niz na kapacitet 100. **(Inicijalizacija niza - ista kao i za nizove sa elementima prostog tipa, početna vrednost elementa niza je null, pozivanje set metoda iz konstruktora - setNazivPredmeta)**

- javnu metodu **ispisi** koja na ekranu ispisuje naziv predmeta i sve studentske podatke iz niza (po jedan red za svakog studenta). **(pristupanje elementima niza, korišćenje toString metode za ispis objekata, varijanta sa forEach petljom)**


Napraviti javnu klasu **TestIspitnispisak** u paketu **dvocas7_ponedeljak.zadatak1** koja ima main metodu u kojoj se pravi objekat klase IspitniSpisak za predmet "Programiranje 2" koji je polagalo 8 studenata. Ispisati na ekranu sve podatke iz objekta IspitniSpisak.



Dodati u klasu **IspitniSpisak**:


- javnu metodu **daLiPostoji** koja kao parametar dobija objekat klase Student i proverava da li se u nizu **studenti** već nalazi isti taj student. Ako se nalazi, metoda vraća true, a inače false. Obratiti pažnju na prazna mesta u nizu.**(korišćenje equals metode za poređenje dva objekta, preduslov je da se redefiniše)**

- javnu metodu **unesiStudenta** koja kao parametar prima objekat klase Student i unosi ga u niz **studenti** na prvo slobodno mesto u nizu (vrednost elementa niza na to mestu je null) samo ako u nizu NE POSTOJI isti taj student. Ako u nizu nema slobodnih mesta ili je već unet isti student, ispisuje se poruka o grešci na ekranu.


U main metodi klase **TestIspitniSpisak** u već napravljeni objekat IspitniSpisak uneti studente: Pera Perić 0084/2020 8, Mika Mikić 1019/2020 10, Žika Žikić 0332/2020 6. Pozvati ponovo metodu ispisi.


Dodati u klasu **IspitniSpisak**:

- metodu **izracunajProsek** koja izračunava i vraća prosečnu ocenu na ispitu. Ne uzimati u razmatranje prazne elemente niza (imaju vrednost null) i studente sa ocenom 5.

- metodu **pronadjiNajvisuOcenu** koja pretražuje niz **studenti** i na ekranu ispisuje najvišu ocenu na ispitu. Ne uzimati u razmatranje prazne elemente niza (imaju vrednost null).

- metodu **izracunajProlaznost** koja izračunava i na ekranu ispisuje procenat studenata koji je položio ispit. Ne uzimati u razmatranje prazne elemente niza.


U klasi **TestIspitniSpisak** pozvati ove nove metode i proveriti njihov rad.