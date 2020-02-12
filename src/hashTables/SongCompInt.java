package hashTables;

import cs1c.SongEntry;

/**
 * SongCompInt is a wrapper class for a SongEntry object.
 * It uses this to compare objects based on the songs int id field.
 *
 * @author Pires, Marilize.
 */
public class SongCompInt implements Comparable<Integer> {

    private SongEntry songObject;

    /**
     * Constructor that initializes the class attribute.
     * @param song SongEntry type.
     */
    public SongCompInt(SongEntry song) {
        this.songObject = song;
    }

    /**
     * This overridden method compares two IDs.
     * @param key to be compared.
     * @return difference between the IDs.
     */
    @Override
    public int compareTo(Integer key) {
        return songObject.getID() - key;
    }

    /**
     * This overridden method checks to see if two IDs are equal.
     * @param object to be compared.
     * @return true if equal, false otherwise.
     */

    public boolean equals(SongCompInt object) {
        return songObject.equals(object.songObject);
    }

    /**
     * This overridden method returns the hashed ID.
     * @return hashed ID.
     */
    @Override
    public int hashCode() {
        return songObject.getID();
    }

    /**
     * This overridden method returns a song as a string.
     * @return string.
     */
    @Override
    public String toString() {
        return songObject.toString();
    }
}
