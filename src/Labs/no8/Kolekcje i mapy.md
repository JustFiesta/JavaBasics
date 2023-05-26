# Kolekcje
Interfejs Collection, oprócz tego że stoi na szczycie hierarchii jest przy okazji dostawcą większości metod,  z  których  korzystają  dziedziczące  interfejsy.  Do  metod  tych  należą  między  innymi:  add (dodawanie  do kolekcji), remove  (usuwanie  z  kolekcji), clear (czyszczenie  kolekcji), size (zwracanie rozmiaru kolekcji).

### List 
Najczęściej używany rodzaj kolekcji. Charakteryzuje się tym, że jej elementy posiadają określoną kolejność. Dodatkowo są one indeksowane, dzięki czemu można pobrać obiekt znajdujący się na konkretnej pozycji (indeksie) w liście. Na przykład możemy użyć metody get(2), gdzie 2 to numer pozycji, którą chcemy pobrać. Dostaniemy wtedy trzeci element listy (pozycje są numerowane od 0). Interfejs jest implementowany przez następujące klasy:
* ArrayList, 
* LinkedList, 
* Vector  (ta  klasa  jest jeszcze rozszerzana przez Stack, który nie implementuje bezpośrednio interfejsu List)
### Queue (kolejki)
Najważniejszą cechą tej kolejki jest zachowanie kolejności według zasady FIFO (First In -First Out). Oznacza to, że pierwszy element wprowadzony do kolejki będzie z niej również pobierany jako pierwszy. Interfejs jest implementowany przez: PriorityQueue
### Deque (Double ended queue)
Kolejki te, zgodnie z nazwą, wspierają zarówno FIFO jak i LIFO (Last In -First Out). To drugie oznacza, że ostatni element wprowadzony do kolejki będzie z niej pobierany jako pierwszy. W tym miejscu warto sobie wyobrazić stos, na którym układamy kolejne elementy, by później  zdejmować  je  począwszy  od  tego  na  samej  górze  i  potem  dalej  w  dół.  Interfejs  jest implementowany  przez:ArrayDeque, LinkedList (ta klasa implementuje zarówno interfejs List jak i Deque)
### Set (zbiory)
Najważniejszą cechą tego rodzaju kolekcji jest unikalność jej elementów. Porównanieobiektów następuje przez wykorzystanie metody equals. W zbiorze nigdy nie będą istniały dwa obiekty (ani więcej), dla których metoda ta zwraca wartość true. Sety nie posiadają numerowanychpozycji w postaci indeksów. Zatem nie odwołamy się tutaj do konkretnej pozycji celem pobrania obiektu. Interfejs jest implementowany przez klasy: 
* HashSet, 
* LinkedHashSet (rozszerza klasę HashSet, ale implementuje też bezpośrednio interfejs Set)

### SortedSet
Zbiory  posortowane  mają  dokładnie  te  same  cechy  co  "zwykłe"  zbiory,  z  tym  że dodatkowo zapewniają one kolejność elementów. Sortowanie odbywa się na podstawie wykorzystania specjalnej metody, o której jeszcze nie mówiliśmy, ale która pojawi się w niedługim czasie w naszym kursie. Interfejs jest implementowany przez: 
* TreeSet
Listy są dostarczane w ramach kolekcji za pośrednictwem interfejsu List z pakietu java.util. Listę możemy  zasadniczo  zdefiniować  jako  bardziej  elastyczną  wersję tablicy.  Jest  to  jednak  pewne uproszczenie, dlatego też przyjrzyjmy się teraz dokładnie jakie są cechy charakterystyczne list:
  * Elementy listy mają określoną kolejność.•Dozwolone są duplikaty elementów.
  * Elementy można umieścić na liście w określonej pozycji.
  * Element znajdujący się w określonej pozycji można prosto pobrać z listy.
  * Element w określonej pozycji możemy łatwo podmienić na inny.
  * Listy możemy łatwo sortować.
  * Nie musimy deklarować na początku rozmiaru listy (choć ogólnie warto to robić, jeśli jesteśmy w stanie przewidzieć jej rozmiar).

### TWORZENIE LISTY
Dobrą praktyką jest zadeklarowanie instancji listy z parametrem typu, na przykład: 
* List<Object> listAnything = new ArrayList<Object>(); 
* List<Integer> listNumbers = new ArrayList<Integer>(); 
* List<String> linkedWords = new LinkedList<String>();

Od Javy 7 możemy usunąć parametr typu po prawej stronie, co upraszcza zapis do następującej postaci: List<Integer> listNumbers = new ArrayList<>(); List<String> linkedWords = new LinkedList<>();
Od Javy 9 możemy utworzyć kolekcję z ustalonego zestawu elementów: List listNumbers = List.of(1, 2, 3, 4, 5, 6);
Od Javy 10 można jeszcze bardziej skrócić tworzenie kolekcji, używając słowa var: var items = new ArrayList<Item>();

# Mapy 
Przechowują pary klucz - wartość w postaci obiektów o nazwie entry. Zwyczajowo mówimy zatem, że mapa jest kolekcją entries, gdzie każde entry składa się z pary:
Klucz - Wartość (Key - Value)
Przykład dla tworzenia mapy filmów w wypożyczalni, ustawiamy klucz w postaci nr identyfikujących, a wartością są nazwy filmów.
849, Avatar 123,
Szeregowiec Ryan
543, Mission Impossible

### CECHY MAP:
* Nie są dozwolone duplikaty kluczy.
* Wartości mogą się duplikować.
* Mogą być sortowalne lub nie - zależy od konkretnej implementacji interfejsu.
* Klucze mogą być null-ami lub nie - zależy od konkretnej implementacji interfejsu (TreeMapy nie pozwalają na nulle).

### IMPLEMENTACJE MAP:
* HashMap z pakietu java.util - Bardzo często stosowana implementacja. Elementy są nieposortowane. Ich kolejność nie odpowiada również kolejności wkładania do zbioru. Może przechowywać jednego null-a wśród kluczy.
* LinkedHashMap z pakietu java.util - Implementacja przechowująca elementy w kolejności ich dodawania. Rozszerza klasę HashMap. Zatem może być przydatna jeśli zależy nam zarówno na unikalności kluczy jak i na tworzeniu historii unikalnych wpisów. Może przechowywać jednego null-a wśród kluczy.
* TreeMap z pakietu java.util - Nie pozwala na przechowywanie nulla w miejscu klucza. Elementy są przechowywane pod postacią drzewa. Elementy są poukładane według kluczy w sposób posortowany (rosnąco). Przydaje się gdy chcemy zapewnić unikalność elementów oraz podstawowe sortowanie.
### TWORZENIE MAPY
* Map<Object, Object> mapOfAnything = new HashMap<Object,Object>();
* Map<Integer, String> linkedWordsWithIds = new LinkedHashMap<Integer,String>(); 
* Map<Integer, String> sortedWordsWithIds = new TreeMap<Integer,String>();