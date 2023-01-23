package com.company;

import java.awt.print.Book;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here





    }
    public static int linearSearch(ArrayList<BooksToSearch> books, int searchedId) {
        int i = 0;
        for (BooksToSearch temp : books) {
            if (temp.getId() == searchedId) {
                return i;
            }
            i++;
        }
        return -1;

    }

    public static int binarySearch(ArrayList<BooksToSearch> books, long searchedId) {
        //indexes
        int first = 0;
        int last = books.size() - 1;
        int foundIndex = -1;


        while (first <= last) {

            int middle = (first + last) / 2;

            if (books.get(middle).getId() == searchedId) {
                foundIndex = middle;
                break;
            } else if (books.get(middle).getId() < searchedId) {
                first = middle + 1;
            } else if (books.get(middle).getId() > searchedId) {
                last = middle - 1;
            }

        }

        return foundIndex;

    }
}

    

