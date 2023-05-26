# Kolekcje:
Interfejs Collection, oprócz tego że stoi na szczycie hierarchii jest przy okazji dostawcą większości metod,  z  których  korzystają  dziedziczące  interfejsy.  Do  metod  tych  należą  między  innymi:  add (dodawanie  do kolekcji), remove  (usuwanie  z  kolekcji), clear (czyszczenie  kolekcji), size (zwracanie rozmiaru kolekcji).

# List 
Najczęściej używany rodzaj kolekcji. Charakteryzuje się tym, że jej elementy posiadają określoną kolejność. Dodatkowo są one indeksowane, dzięki czemu można pobrać obiekt znajdujący się na konkretnej pozycji (indeksie) w liście. Na przykład możemy użyć metody get(2), gdzie 2 to numer pozycji, którą chcemy pobrać. Dostaniemy wtedy trzeci element listy (pozycje są numerowane od 0). Interfejs jest implementowany przez następujące klasy:ArrayList, LinkedList, Vector  (ta  klasa  jest jeszcze rozszerzana przez Stack, który nie implementuje bezpośrednio interfejsu List)
# Queue (kolejki)
Najważniejszą cechą tej kolejki jest zachowanie kolejności według zasady FIFO (First In -First Out). Oznacza to, że pierwszy element wprowadzony do kolejki będzie z niej również pobierany jako pierwszy. Interfejs jest implementowany przez: PriorityQueue
# Deque (Double ended queue)
Kolejki te, zgodnie z nazwą, wspierają zarówno FIFO jak i LIFO (Last In -First Out). To drugie oznacza, że ostatni element wprowadzony do kolejki będzie z niej pobierany jako pierwszy. W tym miejscu warto sobie wyobrazić stos, na którym układamy kolejne elementy, by później  zdejmować  je  począwszy  od  tego  na  samej  górze  i  potem  dalej  w  dół.  Interfejs  jest implementowany  przez:ArrayDeque, LinkedList (ta klasa implementuje zarówno interfejs List jak i Deque)
# Set (zbiory)
Najważniejszą cechą tego rodzaju kolekcji jest unikalność jej elementów. Porównanieobiektów następuje przez wykorzystanie metody equals. W zbiorze nigdy nie będą istniały dwa obiekty (ani więcej), dla których metoda ta zwraca wartość true. Sety nie posiadają numerowanychpozycji w postaci indeksów. Zatem nie odwołamy się tutaj do konkretnej pozycji celem pobrania obiektu. Interfejs jest implementowany przez klasy: 
* HashSet, 
* LinkedHashSet (rozszerza klasę HashSet, ale implementuje też bezpośrednio interfejs Set)

# SortedSet
Zbiory  posortowane  mają  dokładnie  te  same  cechy  co  "zwykłe"  zbiory,  z  tym  że dodatkowo zapewniają one kolejność elementów. Sortowanie odbywa się na podstawie wykorzystania specjalnej metody, o której jeszcze nie mówiliśmy, ale która pojawi się w niedługim czasie w naszym kursie. Interfejs jest implementowany przez: 
* TreeSet
Listy są dostarczane w ramach kolekcji za pośrednictwem interfejsu List z pakietu java.util. Listę możemy  zasadniczo  zdefiniować  jako  bardziej  elastyczną  wersję tablicy.  Jest  to  jednak  pewne uproszczenie, dlatego też przyjrzyjmy się teraz dokładnie jakie są cechy charakterystyczne list:
  * Elementy listy mają określoną kolejność.•Dozwolone są duplikaty elementów.
  * Elementy można umieścić na liście w określonej pozycji.
  * Element znajdujący się w określonej pozycji można prosto pobrać z listy.
  * Element w określonej pozycji możemy łatwo podmienić na inny.
  * Listy możemy łatwo sortować.
  * Nie musimy deklarować na początku rozmiaru listy (choć ogólnie warto to robić, jeśli jesteśmy w stanie przewidzieć jej rozmiar).
