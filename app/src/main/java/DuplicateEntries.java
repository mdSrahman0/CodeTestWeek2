import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Given a 2d String array, write a method that will return a list with all the positions of
 * dulpicate entries. For example:
 *
 * a,b,c
 * d,e,f
 * g,a,b
 *
 * will return {0,0 | 0,1 | 2,1 | , 2,2 }
 */

public class DuplicateEntries {

    // this will be our array for testing
    public static final char[][] c = {{'a','b','c'},
            {'d','e','f'},
            {'g','a','b'}};
    public static void main(String[] args) {

        // Will be used to store first occurrence
        // Remember, every key is associated with at most one value
        Dictionary<Character, Coordinate> dict = new Hashtable<Character, Coordinate>();

        //Will be used to check for duplicates
        HashSet<Character> hash = new HashSet<Character>();

        // will store our list of duplicates
        HashSet<Coordinate> list = new HashSet<Coordinate>();

        // loop thru entire array
        for(int i = 0; i<c.length; i++) {
            for(int j = 0; j<c[i].length; j++) {
                // if not already in hash, insert this element
                if(hash.add(c[i][j])) {
                    dict.put(c[i][j], new Coordinate(i, j));
                }
                // upon encountering a duplicate
                else {
                    // retrieve first occurence
                    Coordinate secCoord = dict.get(c[i][j]);
                    list.add(secCoord); //

                    // add second occurence to the list
                    Coordinate coord = new Coordinate(i, j);
                    list.add(coord);
                }
            }
        } // end outer for

        // print out all occurences we have encountered
        Iterator<Coordinate> i = list.iterator();
        while(i.hasNext()) {
            Coordinate c = (Coordinate) i.next();
            System.out.println("(" + c.x + " , " + c.y + ")");
        }
    }
}

// A class to hold the indexes of each element as necessary
class Coordinate{
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int x;
    public int y;
}
