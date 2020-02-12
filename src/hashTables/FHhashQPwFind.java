package hashTables;

import java.util.NoSuchElementException;

/**
 * FHhashQPwFind implement the class FHhashQPwFind to extend FHhashQP.
 *
 * @param <KeyType> type of data.
 * @param <E>       generic type.
 * @author Pires, Marilize
 */
public class FHhashQPwFind<KeyType, E extends Comparable<KeyType>>
        extends FHhashQP<E> {


    /**
     * This method returns the found object,
     * or throws a java.util.NoSuchElementException.
     *
     * @param key to find an object in the table.
     * @return found object, or throws a java.util.NoSuchElementException.
     */
    E find(KeyType key) {
        int position = findPosKey(key);
        if (mArray[position].state == FHhashQP.ACTIVE) {
            return mArray[findPosKey(key)].data;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * This protected method provides a trivial modification to myHash(),
     * which uses the key rather than the object, to hash.
     *
     * @param key to find an object in the table.
     * @return value of the hash key.
     */
    protected int myHashKey(KeyType key) {
        int hashValue;
        hashValue = key.hashCode() % mTableSize;
        if (hashValue < 0) {
            hashValue += mTableSize;
        }
        return hashValue;
    }

    /**
     * This protected method provides trivial modification to findPos(),
     * which uses the key rather than the object, to get a position.
     *
     * @param key to find an object in the table.
     * @return index of the hash key.
     */
    protected int findPosKey(KeyType key) {
        int kthOddNumber = 1;
        int index = myHashKey(key);

        while ((mArray[index].state != EMPTY) &&
                (mArray[index].data.equals(key))) {
            index += kthOddNumber;
            kthOddNumber += 2;
            if (index >= mTableSize) {
                index -= mTableSize;
            }
        }
        return index;
    }
}
