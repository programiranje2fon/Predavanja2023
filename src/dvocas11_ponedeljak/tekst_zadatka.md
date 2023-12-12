# Predavanje 11

	13.2 Rad sa tekstualnim fajlovima
	13.3 Serijalizacija


# Zadatak 1



Napraviti javnu klasu **BlogPost** u paketu **dvocas11_ponedeljak.zadatak1** koja ima:


- privatni atribut **naslov** koji predstavlja tekst naslova blog post-a.
- privatni atribut **sadrzaj** koji predstavlja tekst sadržaja blog post-a.
- privatni atribut **datum** koji predstavlja datum kreiranja blog post-a.

- javni besparametarski konstruktor koji samo postavlja atribut datum na trenutni datum i vreme.
- javne **get i set metode** za sve atribute. Atributi naslov, tekst i datum ne smeju biti null. U slučaju unosa nedozvoljenih vrednosti baciti izuzetak klase NullPointerException sa odgovarajućom porukom.
- redefinisanu javnu **toString** metodu koja vraća String sa svim podacima o iz BlogPost-a, i to tako da se datum vraća u prvom redu teksta, da onda ide prazan red teksta, da onda ide naslov, pa opet prazan red teksta i onda tekst Blogpost-a.**(ručno unošenje znaka za kraj reda \n)**


Napraviti javnu klasu **TestBlog** u paketu **dvocas11_ponedeljak.zadatak1.test** koja u main metodi pravi jedan objekat klase BlogPost i unosi u njega naslov "Prvi post" i tekst "Danas je lep dan.". Ispisati napravljeni BlogPost na ekranu.



**Problem:** blog postovi su podugački, bilo bi bolje ako bi mogli da ih napišemo u nekom editoru, a posle samo učitamo iz tekstualnog fajla.


Dodati u klasu **BlogPost**:

- javni konstruktor koji kao parametar dobija putanju do tekstualnog fajla u kojem se nalazi celokupan tekst blog post-a (i naslov i sadržaj). Ovaj konstruktor iz tekstualnog fajla učitava tekst naslova (prvi red fajla), a onda i sadržaj blog post-a (drugi red teksta iz fajla pa nadalje) i postavlja te vrednosti u odgovarajuće atribute. I ovaj konstruktor takođe postavlja atribut datum na trenutni datum i vreme.**(učitavanje iz tekstualnog fajla preko klase BufferedReader, klasa FileReader, try with resources blok, indikator za kraj fajla, obavezno zatvaranje fajla)**


Izmeniti kod klase **TestBlog** tako da se u main metodi kreira još jedan objekat klase BlogPost čiji se sadržaj učitava iz tekstualnog fajla "post.txt". **(pravljenje tekstualnog fajla ručno iz Eclipse okruženja, putanja do fajla - apsolutna i relativna)**


Napraviti javnu klasu **Blog** u paketu **dvocas11_ponedeljak.zadatak1** koja ima:


- privatni atribut **postovi** koji je lista objekata klase BlogPost. Odmah inicijalizovati ovu listu kao ArrayList.


- javnu metodu **dodajPost** koja kao parametar dobija objekat klase BlogPost i dodaje ga u listu postovi na poslednje mesto.



Izmeniti kod klase **TestBlog** tako da se u main metodi kreira i objekat klase Blog i u njega se dodaju dva već napravljena objekta klase Blogpost.


**Problem:** Svi podaci (ceo blog) iz programa nestaju čim se program isključi. Trebalo bi ih sačuvati u neki fajl da bi mogli da se pročitaju/učitaju kasnije.


Izmeniti kod klase **Blog** tj. dodati u nju:


- javnu metodu **sacuvajBlogTXT** koja kao parametar dobija putanju do tekstualnog fajla i u taj fajl upisuje sav sadržaj svih postova iz blog-a.**(pravljenje tekstualnog fajla iz Jave, PrintWriter klasa i njene metode, FileWriter klasa, otvaranje fajla za upis u rewrite i append režimu)**


**Problem:** Ovi podaci iz bloga su sačuvani u tekstualnom formatu. Učitavanje podrazumeva parsiranje teksta u druge formate. Da li može da se sačuva u nekom binarnom formatu.



Izmeniti klasu **BlogPost** tako da implementira interfejs Serializable. Dodati i identifikacioni ključ za serijalizaciju.**(serijalizacija i deserijalizacija objekata u Javi, interfejs Serializable, identifikacioni ključ za serijalizaciju - serialVersionUID)**


Dodati u klasu **Blog**:


- javnu metodu **serijalizujBlog** koja u fajl "blog.dat" upisuje sve podatke o celom blogu.**(ObjectOutputStream klasa i njene metode, dve varijante za serijalizaciju ovog primera: pojedinačni BlogPost-ovi i cela lista)**

- javnu metodu **deserijalizujBlog** koja iz fajla "blog.dat" učitava sve podatke o celom blogu.**(ObjectInputStream klasa i njene metode, dve varijante za deserijalizaciju ovog primera: pojedinačni BlogPost-ovi i cela lista)**


Izmeniti kod klase **TestBlog** tako da se u main metodi testiraju sve metode za čuvanje/učitavanje bloga iz fajla/ u fajl.