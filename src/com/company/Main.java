package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // The program below is for testing algorithms
        Scanner scanner = new Scanner(System.in);
        ArrayList<BooksToSearch> books = new ArrayList<BooksToSearch>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new BooksToSearch(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.parseInt(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

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

    

