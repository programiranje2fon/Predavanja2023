davanje 8

	10.1 Apstraktne klase
	10.2 Interfejsi
	
# Zadatak 1


Napraviti javnu klasu **MotornoVozilo** u paketu **dvocas8_ponedeljak.zadatak1** koja ima:

- privatni atribut **markaModel** koji predstavlja marku i model vozila (npr. "Ford Focus").
- privatni atribut **registarskaOznaka** koji predstavlja registarsku oznaku i broj vozila (npr. "BG234RD").
- privatni atribut **kubikaza** koji predstavlja kolika je radna zapremina motora tog vozila (npr. 1398).
- privatni atribut **snaga** koji predstavlja snagu motora tog vozila u kilovatima (npr. 51).


- javne **get i set metode** za sve atibute.
- redefinisanu javnu **toString** metodu koja vraća String sa svim podacima o MotornomVozilu.
- redefinisanu javnu **equals** metodu koja poredi dva objekta klase MotornoVozilo i vraća true ako su im iste registarske oznake, a false ako nisu.

**Problem: Treba sada izračunati cenu registracije vozila. Način za računanje registracije vozila zavisi od toga koji tip motornog vozila je u pitanju (automobil, motocikl, kamion, autobus...). Svakako bi metoda trebalo da se zove izracunajRegistraciju i da vraća double vrednost kao cenu registracije, ali nije moguće napisati telo metode.**

Prepraviti klasu **MotornoVozilo** tako da bude **apstraktna** klasa, a onda u nju dodati:**(apstraktne klase, rezervisana reč abstract)**

 - javnu apstraktnu metodu **izracunajRegistraciju** koja nema parametre, a vraća double vrednost kao cenu registracije vozila.**(apstraktne metode nemaju telo, apstraktna klasa može imati atribute, obične i apstraktne metode)**
 

Napraviti javnu klasu **TestVozila** u paketu **dvocas8_ponedeljak.zadatak1.test** u čijoj main metodi se pravi jedan objekat klase MotornoVozilo.**(nije moguće napraviti instancu tj. objekat apstraktne klase, poenta je u podklasama)**


Napraviti javnu klasu **Automobil** u paketu **dvocas8_ponedeljak.zadatak1** koja nasleđuje klasu MotornoVozilo i ima:**(nasleđivanje apstraktne klase)**

- implementiranu metodu **izracunajRegistraciju** koja izračunava i vraća cenu registracije vozila po sledećoj formuli:6000 dinara za tehnički pregled + kubikaza x 8 + snaga x 2.**(implementacija apstraktne metode u podklasi)**


Napraviti javnu klasu **Motocikl** u paketu **dvocas8_ponedeljak.zadatak1** koja nasleđuje klasu MotornoVozilo i ima:

- implementiranu metodu **izracunajRegistraciju** koja izračunava i vraća cenu registracije vozila po sledećoj formuli:4000 dinara za tehnički pregled + kubikaza x 4 + snaga x 2.**(drugačija implementacija apstraktne metode u podklasi)**


U main metodu klase **TestVozila** dodati kod kojim se pravi jedan objekat klase Automobil i jedan objekat klase Motocikl. Automobil je Ford Focus, snage 70 kilovata, kubikaže 1799 kubika, registarskih oznaka "BG123JK". Motocikl je Suzuki GS 750, snage 100 kilovata, kubikaže 749 kubika, registarskih oznaka "NS987TT". Ispisati podatke oba objekta na ekranu. Onda prepraviti promenljive koje se odnose na Automobil i Motocikl tak oda budu klase MotornoVozilo. Ponovo pokrenuti kod.**(kompatibilnost klasa, polimorfizam)**


U klasi **TestVozila** napraviti javnu statičku metodu **izracunajUkupnuRegistraciju** koja kao parametar prima niz objekata klase MotornoVozilo i izračunava i ispisuje na ekranu ukupnu cenu registracije svih vozila iz niza.NAPOMENA: u nizu se mogu naći objekti klasa Automobil i Motocikl, a neki elementi niza mogu biti null.**(kompatibilnost klasa i polimorfizam, pisanje generičkog koda)**


U main metodi klase **TestVozila** staviti sve napravljene objekte u niz objekata klase MotornoVozilo i pozvati metodu izracunajUkupnuRegistraciju.




**Problem: A šta ako je potrebno samo imati više metoda koje se moraju implementirati u nekoj podklasi? Šta ako jednostruko nasleđivanje nije dovoljno?**


# Zadatak 2

Napraviti javni interfejs **AutomatZaKafu** u paketu **dvocas8_ponedeljak.zadatak2** koji ima:**(interfejsi u Javi, rezervisana reč interface)**

- javnu metodu **napraviKafu** koja kao parametar dobija iznos novca koji je korisnik uneo da bi platio kafu a ne vraća ništa.**(u interfejsu su sve metode apstraktne)** 



Napraviti javni interfejs **AutomatZaCokoladice** u paketu **dvocas8_ponedeljak.zadatak2** koji ima:

- javnu metodu **izbaciCokoladicu** koja kao parametar dobija iznos novca koji je korisnik uneo da bi platio čokoladicu, a ne vraća ništa.**(u interfejsu su sve metode apstraktne)** 


Napraviti javnu klasu **MesovitiAutomat** u paketu **dvocas8_ponedeljak.zadatak2** koja implementira oba interfejsa (AutomatZaKafu i AutomatZaCokoladice) i ima:**(implementacija interfejsa, implementacija više interfejsa)**


- privatni atribut **kolicinaKafe** koji predstavlja koliko je još doza kafe ostalo u automatu (npr. 4). Početna vrednost je 100.
- privatni atribut **brojCokoladica** koji predstavlja koliko je još čokoladica ostalo u automatu (npr. 10). Početna vrednost je 35.
- privatni atribut **kolicinaNovca** koji predstavlja koliko je novca trenutno u automatu (npr. 2632 dinara). Početna vrednost je 0.


- implementiranu javnu metodu **napraviKafu** koja kao parametar dobija iznos novca koji je korisnik uneo da bi platio kafu. Metoda proverava da li je korisnik uneo bar 50 dinara i, ako jeste, dodaje uneti iznos na količinu novca u automatu, smanjuje količinu kafe za 1 i ispisuje na ekranu da je kafa napravljena. Ako kafe nema dovoljno, ili ako je uneto manje od 50 dinara, metoda samo ispisuje poruku o grešci na ekranu. **(implementiranje metode interfejsa)**

- implementiranu javnu metodu **izbaciCokoladicu** koja kao parametar dobija iznos novca koji je korisnik uneo da bi platio čokoladicu. Metoda proverava da li je korisnik uneo bar 60 dinara i, ako jeste, dodaje uneti iznos na količinu novca u automatu, smanjuje broj čokoladica za 1 i ispisuje na ekranu da je čokoladica izbačena. Ako čokoladica nema dovoljno, ili ako je uneto manje od 60 dinara, metoda samo ispisuje poruku o grešci na ekranu.



Napraviti javnu klasu **UtopijskiMesovitiAutomat** u paketu **dvocas8_ponedeljak.zadatak2** koja implementira oba interfejsa (AutomatZaKafu i AutomatZaCokoladice) i ima:**(implementacija interfejsa, implementacija više interfejsa)**

- implementiranu javnu metodu **napraviKafu** koja kao parametar dobija iznos novca koji je korisnik uneo da bi platio kafu. Metoda samo ispisuje na ekranu da je kafa besplatna, i da je napravljena.**(implementiranje metode interfejsa)**

- implementiranu javnu metodu **izbaciCokoladicu** koja kao parametar dobija iznos novca koji je korisnik uneo da bi platio čokoladicu. Metoda samo ispisuje na ekranu da je čokoladica besplatna, i da je izbačena.


Napraviti javnu klasu **TestAutomat** u paketu **dvocas8_ponedeljak.zadatak2.test** u čijoj main metodi se kreiraju objekti prethodnih klasa i testiraju njihove metode.**(ne može se napraviti instanca interfejsa)**