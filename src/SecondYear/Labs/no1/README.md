# Warmup in first labs
Rewind from classes and basic OOP
### This program is for digital class register functionality - for now it's just a prewiew version
Methods are ready to be used and perhaps connected to database.

<hr>

#### Excercise:  
Make a program witch abstracts Student and Students list. Use **hermetization* and **encapsulation* for class fields, constructor field should be automatically filled with present date. Implement CRUD/show student info/search for student and some other functionalities.

#### Style Points:
Implement funcionality to make custom std:o prompts on user input.
[README.md](README.md)
<hr>

### More advanced stuff:
Implement **serialisation/deserialization* for Students class. Save it in "students.bin".  
Make methods to save and read Students from XML/JSON file.
Load students.bin on startup. If it does not exist - prompt on std:o


<hr>

## New things that I've learned
* Serialisation/Deserialization (tutorial in polish: https://www.samouczekprogramisty.pl/serializacja-w-jezyku-java/; in english: https://www.youtube.com/watch?v=DfbFTVNfkeI)

#### Serialisation in 5 minutes:
It means basically to save and object to file, so it can be transferred independently of code. So take a students list -> create .bin of it -> use it were you want (but firstly deserialize it).

