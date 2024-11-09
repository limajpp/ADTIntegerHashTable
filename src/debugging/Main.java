package debugging;

import entities.ADTIntegerHashTable;

public class Main {
    public static void main(String[] args) {
        ADTIntegerHashTable hashTable = new ADTIntegerHashTable(10);

        System.out.println(hashTable);

        hashTable.insert(35);
        hashTable.insert(42);
        hashTable.insert(99);
        hashTable.insert(87);
        hashTable.insert(14);
        hashTable.insert(1);

        System.out.println(hashTable);

        System.out.println(hashTable.contains(5));
        System.out.println(hashTable.contains(35) + "\n");

        hashTable.remove(99);
        hashTable.remove(42);

        System.out.println(hashTable);

        System.out.println(hashTable.search(3));
        System.out.println(hashTable.search(4));
    }
}
