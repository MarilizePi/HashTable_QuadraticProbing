package hashTables;

import cs1c.SongEntry;

import java.util.ArrayList;

/**
 * SongsComGenre class compares objects based on the songs String genre field.
 * It determines the number of songs in each genre.
 *
 * @author Pires, Marilize.
 */
public class SongsCompGenre implements Comparable<String> {
    private String songGenre; //Name of the genre.
    private ArrayList<SongEntry> songData; //Attribute containing all songs in the genre.

    /**
     * Default constructor.
     */
    public SongsCompGenre() {
        songGenre = "unknown";
        songData = new ArrayList<>();
    }

    /**
     * Constructor that initializes the class attributes.
     *
     * @param genre String type.
     * @param song  SongEntry type.
     */
    public SongsCompGenre(String genre, SongEntry song) {
        this();
        this.songGenre = genre;
        addSong(song);
    }

    /**
     * This overridden method compares two genres.
     *
     * @param compare it compares the name name of the genre.
     * @return difference between the two genres.
     */
    @Override
    public int compareTo(String compare) {
        return songGenre.compareTo((compare));
    }

    /**
     * This overridden method checks to see if two genres are equal.
     *
     * @param object to be compared.
     * @return true if equal, false otherwise.
     */
    public boolean equals(SongsCompGenre object) {
        return songData.equals(object.songGenre);
    }

    /**
     * This overridden method returns the hashed genre name.
     *
     * @return hashed genre name.
     */
    @Override
    public int hashCode() {
        return songGenre.hashCode();
    }

    /**
     * This overridden method returns the list of genre names.
     *
     * @return string, list of genre names.
     */
    @Override
    public String toString() {
        return songData.toString();
    }

    /**
     * AddSong method adds a song to the list of songs.
     *
     * @param e song to be added.
     */
    void addSong(SongEntry e) {
        songData.add(e);
    }

    /**
     * Getter method that returns the name of the genre.
     *
     * @return name of the genre.
     */
    public String getName() {
        return songGenre;
    }

    /**
     * Getter method that returns the genre of songs.
     *
     * @return genre of songs.
     */
    public ArrayList<SongEntry> getData() {
        return songData;
    }
}
