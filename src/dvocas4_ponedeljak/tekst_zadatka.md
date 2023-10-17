# Predavanje 4

	4 Nizovi
	4.2 FOR EACH naredba

# Zadatak 1

Napraviti klasu **Predmet** u paketu **dvocas4_ponedeljak.zadatak1** koja ima:

- atribut **naziv** koji predstavlja naziv predmeta

**Problem: Hteo bih da zapamtim više vrednosti, ali ne znam koliko pa ne mogu da napravim pojedinačne promenljive za svaku vrednost.**

- atribut **ocene** koji predstavlja niz sa ocenama koje su dobili studenti na ispitu iz tog predmeta. Ocene mogu biti u rasponu od 5 do 10. **(nizovi u Javi, deklaracija niza)**


**Problem: nizovi moraju da se inicijalizuju na određeni kapacitet pre nego što mogu da se koriste.**

- inicijalizovati atribut (niz) **ocene** tako da se smatra da je predmet polagalo najviše 100 studenata. **(Inicijalizacija niza - odmah pri deklaraciji, kapacitet niza, istovremena (brza) inicijalizacija niza i dodeljivanje vrednosti)**

- konstruktor koji nema parametre, ali inicijalizuje niz **ocene** na kapacitet 100. Ispraviti da se inicijalizacija NE vrši odmah pri deklaraciji ovog niza. **(konstruktor klase, smisao, eksplicitni i default tj. implicitni konstruktor, inicijalizacija niza u konstruktoru)**

- konstruktor koji prima samo naziv predmeta i postavlja atribut naziv na unetu vrednost, a kapacitet niza **ocene** postavlja na 100. **(bezparametarski i parametrizovani konstruktor, klasa može imati više konstruktora po potrebi)**

**Problem: možda je broj studenata koji je polagao ispit veći od 100? Ili mnogo manji, pa nema smisla inicijalizovati toliko dugačak niz.**

- konstruktor koji prima dva parametra: naziv predmeta i broj studenata koji su polagali ispit. Konstruktor treba da postavi atribut naziv na unetu vrednost za naziv, a da niz ocene inicijalizuje tako da mu kapacitet bude jednak unetom broju studenata. Ako je uneti broj studenata nula ili manji od nule, ispisati poruku o grešci na ekranu i inicijalizovati niz na kapacitet 100.




- Napraviti metodu **ispisi** koja na ekranu ispisuje naziv predmeta i sve elemente niza ocene. **(pristupanje elementima niza, indeksi elemenata niza, kapacitet niza - length, iteracija kroz niz)**

Napraviti klasu **TestPredmet** u paketu **dvocas4_ponedeljak.zadatak1** koja ima main metodu i u kojoj se testiraju atributi i metode klase Predmet. Napraviti objekat klase Predmet za predmet "Programiranje 2" koji je polagalo 8 studenata. Ispisati na ekranu sve podatke iz objekta klase Predmet.**(uključiti debugger za poziv metode ispisi i poziv konstruktora)**



Dodati u klasu **Predmet**:

- metodu **unesiOcenu** koja kao parametar prima ocenu i unosi je u niz **ocene**. Ocena mora biti u rasponu od 5 do 10 (uključujući i te vrednosti), inače se ne unosi već se ispisuje poruka o grešci na ekranu. Takođe, ocena se unosi na prvo slobodno mesto u nizu (vrednost elementa niza na to mestu je 0). Ako u nizu nema slobodnih mesta, ispisuje se poruka o grešci na ekranu.**(iteracija kroz niz sa selekcijom, prekidanje petlje)**


U main metodi klase **TestPredmet** u već napravljeni objekat klase Predmet uneti ocene: 10, 10, 8, 9, 5, 6. **(objasniti da niz nije popunjen do kraja i razliku između kapaciteta i popunjenosti niza)**



**Problem: ako se svaki put prolazi kroz ceo niz, možda nema potrebe da se uvodi brojač petlje?**


- Napisati metodu **ispisi** preko for-each petlje **(for-each petlja, samo za kolekcije, skoro samo za read-only pristup)**


Dodati u klasu **Predmet**:

- metodu **izracunajProsek** koja izračunava i vraća prosečnu ocenu na ispitu. Ne uzimati u razmatranje one elemente niza koji imaju vrednost 0. **(algoritam za prosek, for, while i for-each varijanta)**

- metodu **pronadjiNajvisuOcenu** koja pretražuje niz **ocene** i na ekranu ispisuje najvišu ocenu na ispitu. Ne uzimati u razmatranje one elemente niza koji imaju vrednost 0. **(algoritam za maksimum, početna vrednost za maksimum, pokazati ovaj algoritam u debugger-u)**

- metodu **izracunajProlaznost** koja izračunava i na ekranu ispisuje procenat studenata koji je položio ispit. Ne uzimati u razmatranje one elemente niza koji imaju vrednost 0.**(objasniti kako deljenje celih brojeva može imati neočekivane posledice, u ovom slučaju procenat je 0)**


U klasi **TestPredmet** pozvati ove nove metode i proveriti njihov rad.


**Problem: da li postoji mogućnost da se ubrza svaki od ovih algoritama, i nekako optimizuje rad klase? Ovde može veoma lako jer se elementi niza unose od početka niza i nema izbacivanja.**


Napraviti kopiju klase Predmet sa nazivom **Predmet2** i uvesti u nju sledeće izmene:
- Uvesti atribut **brojac** koji pamti koliko je ocena zaista uneto u niz (ne koliki je kapacitet). Ovaj atribut ima početnu vrednost 0, a uvećava se posle svakog unosa. 
- Promeniti kod svih metoda tako da rade koristeći atribut brojac.