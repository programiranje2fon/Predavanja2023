# Predavanje 6

	7.1 Nasleđivanje
	7.2 Klasa Object
	8.1 Nivoi pristupa
	8.3 Paketi

# Zadatak 1

Napraviti klasu **Osoba** u paketu **dvocas6_ponedeljak.zadatak1.osoba** koja ima:**(objasniti pakete, podpakete i vezu sa folderima na disku)**


- atribut **ime** koji predstavlja ime osobe. Početna vrednost je "nepoznato".
- atribut **prezime** koji predstavlja prezime osobe. Početna vrednost je "nepoznato".
- atribut **adresa** koji predstavlja adresu stanovanja osobe. Početna vrednost je "nepoznato".


- metodu **postaviIme** koja kao parametar dobija novu vrednost za ime osobe i postavlja atribut ime na tu vrednost samo ako je uneto ime različito od null i nije prazan String. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu.
- metodu **postaviPrezime** koja kao parametar dobija novu vrednost za prezime osobe i postavlja atribut prezime na tu vrednost samo ako je uneto prezime različito od null i nije prazan String. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu. 

- metodu **postaviAdresu** koja kao parametar dobija novu vrednost za adresu osobe i postavlja vrednost atributa adresa na tu vrednost, samo ako je različita od null, dužine je 5 znakova ili više. Ako uneta vrednost nije u redu, samo se ispisuje poruka o grešci na ekranu.  

- metodu **ispisi** koja na ekranu ispisuje sve podatke o osobi u jednom redu.


Napraviti klasu **TestOsoba** u paketu **dvocas6_p  onedeljak.zadatak1.proba** koja ima main metodu i u kojoj se testiraju atributi i metode klase Osoba. Napraviti objekat klase Osoba: Pera Peric, Jove Ilica 154, Beograd. Ispisati na ekranu sve podatke iz objekta. **(objasniti default tj. paketski pristup, objasniti import naredbu)**

**Problem: klasi Osoba se ne može pristupiti jer je u drugom paketu**

Izmeniti klasu **Osoba** tako da klasa bude javna.

**Problem: atributima i metodama klase Osoba se ne može pristupiti jer je u drugom paketu**

Izmeniti klasu **Osoba** tako da svi atributi i metode klase budi javni.

**Problem: šta ako negde u aplikaciji imam klasu sa istim nazivom?**

Potražiti klasu **Osoba** u drugim paketima, od prethodnih predavanja **(identifikator klase = naziv paketa i naziv klase, konvencija za nazive paketa u Javi prema domenu, važnost import naredbe)**


**Problem: atributima klase Osoba se može pristupati direktno, zaobilazeći metode postaviIme, postaviPrezime i postaviAdresu i njihovu logičku kontrolu.(modifikatori pristupa: private i public)**


Izmeniti klasu **Osoba** iz paketa **dvocas6_ponedeljak.zadatak1.osoba** tako da:

- svi atributi budu privatni. **(modifikator private, probati sada direktan pristup iz TestOsoba klase, atributima se može pristupiti samo u okviru klase Osoba)** 


Izmeniti kod klase **TestOsoba** tako da se vrše pozivi samo preko metoda.


**Problem: potrebno je da imamo i neke javne metode za (preu)uzimanje vrednosti atributa, a ne samo za postavljanje.(privatni atributi + javne metode za pristup = učaurenje atributa/enkapsulacija/encapsulation)**


Dodati u klasu **Osoba**:

- javnu metodu **vratiIme** koja samo vraća vrednost atributa ime.
- javnu metodu **vratiPrezime** koja samo vraća vrednost atributa prezime.
- javnu metodu **vratiAdresu** koja samo vraća vrednost atributa adresa.

Izmeniti kod klase **TestOsoba** tako da se pozivaju i metode vratiIme, vratiPrezime i vratiAdresu.


Napraviti javnu klasu **Student** u paketu **dvocas6_ponedeljak.zadatak1.student** koja ima::
- privatne atribute **ime, prezime, adresa** ali i **fakultet i prosek**
- javne metode **postaviIme, postaviPrezime, postaviAdresu, vratiIme, vratiPrezime, vratiAdresu**, ali i **postaviFakultet, vratiFakultet, postaviProsek i vratiProsek**.  

**Problem: kod iz klase Osoba se velikim delom ponavlja i u klasi Student. NIKADA ne treba ponavljati isti kod na više mesta, misleći tu i na atribute i na metode...**


Staviti da klasa **Student** NASLEĐUJE klasu Osoba.**(nasleđivanje, jednostruko nasleđivanje klasa u Javi, rezervisana reč extends)**

- napraviti u klasi Student samo atribute i metode koji se ne pojavljuju u klasi Osoba: **fakultet i prosek** kao i **postaviFakultet, vratiFakultet, postaviProsek i vratiProsek**. Prosek mora biti u rasponu od 6 do 10, a naziv fakulteta ne sme biti null niti prazan String.

U klasi **TestOsoba** napraviti objekat klase Student sa podacima: Mitar Mikic, Vojvode Stepe 114, Beograd, FON, 9.02. Ispisati podatke ovog objekta na ekranu.


**Problem: metoda ispisi, ne radi ispis kako treba za studenta - nedostaju naziv fakulteta i prosek u ispisu. Da li može nekako da se izmeni metoda ispisi ali samo za klasu Student?**


Izmeniti kod klase **Student** tako da se:


- napiše nova javna metoda **ispisi** koja ispisuje sve podatke o studentu, uključujući i fakultet i prosek. **(redefinisanje metoda, polimorfizam, rezervisana reč super)**

U klasi **TestOsoba** ponovo pokrenuti ispis oba objekta na ekranu.**(objasniti razliku, objasniti kompatibilnost klasa i class cast)**


**Problem: da li postoji neki standardizovaniji način da se vrše neke uobičajene operacije nad objektima, kao što je ispis na ekranu. A šta ako treba uporediti dva objekta ili npr. klonirati objekte.(klasa Object, metode toString, equals i clone)**

Izmeniti klase **Osoba** i **Student** tako da se umesto metode ispisi, koriste metode toString. Izmeniti i kod u klasi **TestOsoba** tako da se koriste toString metode.


Uvesti u klase **Osoba** i **Student** metode equals za poređenje dva objekta po jednakosti. Dodati kod u klasu **TestOsoba** tako da se napravi još po jedan objekat klase Osoba i Student i koristi equals metoda da se uporede.
