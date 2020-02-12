project folder:
MarilizePi-cs1c-project07

Brief description of submitted files:

src/hashTables/FHhashQP.java
    - Hash table class with quadratic probing.

src/hashTables/FHhashQPPwFind.java
    - FHhashQPwFind implement the class FHhashQPwFind to extend FHhashQP.

src/hashTables/HashEntry.java
    - HashEntry class for use by FHhashQP.

src/hashTables/MyTunes.java
    - Read the input files and tests the class FHhashQPwFind.java.
    - Contains main.

src/hashTables/SongCompInt.java
    - SongCompInt is a wrapper class for a SongEntry object.
    - It uses this to compare objects based on the songs int id field.

src/hashTables/SongsCompGenre.java
    - SongsComGenre class compares objects based on the songs String genre field.
    - It determines the number of songs in each genre.

src/hashTables/TableGenerator.java
    - TableGenerator class will create and populate two hash tables of type FHhashQPwFind class.


src/cs1c/MillionSongDataSubset.java
    - One object of class MillionSongDataSubset parses a JSON data set and stores each entry in an array.

src/cs1c/SongEntry.java
    - Stores a simplified version of the genre data set from the Million Song Data set.

src/cs1c/TimeConverter.java
    - Converts duration into a string representation.

-----

resources/findGenres.txt
    - Tests hashing for genres.

resources/findIDs.txt
    - Tests hashing for ID names.

resources/findGenres2.txt
    - Tests hashing for repeated genres and genres that don't exist.

resources/findIDs2.txt
    - Tests hashing for repeated IDs and IDs that don't exist.

resources/findGenres3.txt
    - Tests hashing for empty genre.

resources/findIDs3.txt
    - Tests hashing for empty IDs.

resources/music_genre_subset.json
    - Contains songs in a JSON format (over 59600 songs).

resources/RUN.txt
    - Console outputs various tests/runs of MyTunes.java class.

-----

.gitignore
    - .gitignore content tells git to ignore specified files or folder.

-----

README.txt
    - Description of submitted files.