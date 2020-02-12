package hashTables;

import cs1c.SongEntry;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * TableGenerator class will create and populate two hash tables of type FHhashQPwFind class.
 *
 * @author Pires, Marilize.
 */
public class TableGenerator {

    //Hash table based on SongCompInt.
    private FHhashQPwFind<Integer, SongCompInt> tableOfSongIDs;

    //Hash table based on SongsCompGenre.
    private FHhashQPwFind<String, SongsCompGenre> tableOfSongGenres;

    private ArrayList<String> nameOfGenres;

    /**
     * Constructor that initializes the class attributes.
     */
    public TableGenerator() {
        this.tableOfSongIDs = new FHhashQPwFind<>();
        this.tableOfSongGenres = new FHhashQPwFind<>();
        this.nameOfGenres = new ArrayList<>();
    }

    /**
     * This method populates the tableOfIDs hash table.
     *
     * @param songs to be stored.
     * @return table of song IDs.
     */
    public FHhashQPwFind<Integer, SongCompInt> populateIDtable(SongEntry[] songs) {
        for (int i = 0; i < songs.length; i++) {
            tableOfSongIDs.insert(new SongCompInt(songs[i]));
        }
        return tableOfSongIDs;
    }

    /**
     * This method populates the tableOfGenres hash table and ArrayList of genre names.
     *
     * @param songs to be stored.
     * @return table of genre of songs.
     */
    public FHhashQPwFind<String, SongsCompGenre> populateGenreTable(SongEntry[] songs) {

        for (int i = 0; i < songs.length; i++) {
            try {
                SongsCompGenre genre = tableOfSongGenres.find(songs[i].getGenre());
                genre.addSong(songs[i]);
            } catch (NoSuchElementException e) {
                SongsCompGenre song = new SongsCompGenre(songs[i].getGenre(), songs[i]);
                tableOfSongGenres.insert(song);
                nameOfGenres.add(songs[i].getGenre());
            }
        }
        return tableOfSongGenres;
    }

    /**
     * Getter method that returns the list of name of genres.
     *
     * @return list of name of genres.
     */
    public ArrayList<String> getGenreNames() {
        return nameOfGenres;
    }
}
