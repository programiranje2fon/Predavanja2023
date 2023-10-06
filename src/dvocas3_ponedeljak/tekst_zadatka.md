# Predavanje 3

	2.6 Statički elementi (static)
	3.2. SWITCH naredba
	3.3. FOR naredba
	3.4. WHILE naredba
	3.5 DO-WHILE naredba


# Zadatak 1

Napraviti klasu **Ispisivac** u paketu **dvocas3_ponedeljak.zadatak1**. Ova klasa bi trebalo da ima:

- konstantu **MIN_OCENA** koja sadrži najmanju vrednost ocene đaka u školi tj. 1.

- konstantu **MAX_OCENA** koja sadrži najveću vrednost ocene đaka u školi tj. 5.

- metodu **ispisiOcenu** koja kao parametar dobija ocenu učenika (u rasponu od MIN_OCENA do MAX_OCENA) i na ekranu ispisuje da li je u pitanju ocena: odličan, vrlo dobar, dobar, dovoljan ili nedovoljan. Ako je unet broj koji je veći od MAX_OCENA ili manji od MIN_OCENA, ispisati poruku o grešci.**(prvo varijanta sa if naredbom, onda sa switch naredbom)**

- metodu **ispisiZdravo** koja na ekranu ispisuje poruku "Zdravo" 5 puta. **(uraditi prvo bez petlje, FOR petlja, osnovna sintaksa, kada se koristi, debager objašnjenje i proba)**

Napraviti klasu **TestIspisivac** u paketu **dvocas3_ponedeljak.zadatak1** koja ima main metodu iz koje se pozivaju i proveravaju konstante i metode klase Ispisivac.

**Problem: zašto uopšte praviti objekat klase Ispisivac da bi se pozvala jedna metoda za ispis ili samo konstanta? Klasa ne pamti trenutno stanje (nema atribute, samo konstante), pa zašto onda rezervisati memorijski prostor za objekat uopšte?**

- Izmeniti sve konstante i metode tako da budu statičke. Izmeniti i sve pozive ovih metoda. **(statičke metode)**

Dodati u klasu Ispisivac:
- Statičku metodu **ispisiPoruku** koja kao parametar dobija poruku koju je na ekranu potrebno ispisati 10 puta.
- Statičku metodu **ispisiPoruku** koja ima dva parametra: poruku koju treba ispisati na ekranu i ceo broj koji predstavlja koliko puta treba ispisati tu poruku na ekranu. Metoda na ekranu ispisuje poruku željeni broj puta. **(Preklapanje metoda - overloading)**
- Statičku metodu **ispisiBrojeveOd1Do20** koja nema parametre i koja na ekranu ispisuje brojeve od 1 do 20. Pre ispisa brojeva, treba ispisati reč "START" na ekranu, a posle ispisa svih brojeva reč "STOP". **(Pokazati i isprobati beskonačnu petlju i kako se prekida izvršavanje takvog koda u Eclipse-u, neizvršivu petlju)**


** Problem: kako kontrolisati preciznije izršavanje petlje: prekinuti petlju pre izvršenog uslova za prekid, preskočiti neki krug (iteraciju, ciklus) petlje, kako prekinuti celu metodu.**

- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se ne ispisuje broj 15, a svi ostali ispišu normalno. **(continue naredba)**
- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se ispis brojeva prekida posle broja 18, a da se ipak metoda izvrši do kraja i ispiše reč "STOP" posle ispisa brojeva. **(break naredba)**
- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se izvršavanje metode prekida posle broja 18. **(return naredba, može čak iako metoda ne vraća ništa)**


** Problem: a šta ako nije poznat broj iteracija unapred, pa nema smisla koristiti for petlju?**

Dodati u klasu Ispisivac:

- Statičku metodu **vremeDupliranja** koja kao parametre dobija iznos novca koji je uložen u banku i godišnju kamatu koju banka daje na uložen novac. Metoda na ekranu ispisuje iznos novca u banci posle svake godine i to sve dok se novac ne duplira u odnosu na originalni iznos. Pretpostavlja se da klijent ne podiže novac u međuvremenu tj. da će ići "kamata na kamatu".**(while petlja, i napomenuti da se svaka petlja može ispisati i preko while i preko for naredbe)**