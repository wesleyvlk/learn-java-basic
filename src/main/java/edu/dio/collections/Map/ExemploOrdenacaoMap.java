package edu.dio.collections.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Exemplo:
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
*/
public class ExemploOrdenacaoMap {
    public static void main(final String[] args) {
        System.out.println("\n\tOrdem aleatória");
        final Map<String, Book> myBooks = new HashMap<>() {
            {
                put("Victor Hugo", new Book("Os Miseráveis", 2097));
                put("Colleen Hoover", new Book("E assim que começa", 344));
                put("William Gibson", new Book("Neuromancer", 334));
            }
        };
        for (final Map.Entry<String, Book> book : myBooks.entrySet())
            System.out.println(
                    book.getKey() + " - " + book.getValue().getTitle() + ", pages: " + book.getValue().getPages());

        System.out.println("\n\tOrdem de inserção");
        final Map<String, Book> myBooks1 = new LinkedHashMap<>() {
            {
                put("Victor Hugo", new Book("Os Miseráveis", 2097));
                put("Colleen Hoover", new Book("E assim que começa", 344));
                put("William Gibson", new Book("Neuromancer", 374));
            }
        };
        for (final Map.Entry<String, Book> book : myBooks1.entrySet())
            System.out.println(
                    book.getKey() + " - " + book.getValue().getTitle() + ", pages: " + book.getValue().getPages());

        System.out.println("\n\tOrdem natural (Autores)");
        final Map<String, Book> myBooks2 = new TreeMap<>(myBooks);
        for (final Map.Entry<String, Book> book : myBooks2.entrySet())
            System.out.println(
                    book.getKey() + " - " + book.getValue().getTitle() + ", pages: " + book.getValue().getPages());

        System.out.println("\n\tOrdem natural (Livros)");
        final Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new ComparatorTitle());
        myBooks3.addAll(myBooks.entrySet());
        for (final Map.Entry<String, Book> book : myBooks3)
            System.out.println(
                    book.getKey() + " - " + book.getValue().getTitle() + ", pages: " + book.getValue().getPages());

        System.out.println("\n\tOrdem natural (Paginas)");
        final Set<Map.Entry<String, Book>> myBooks4 = new TreeSet<>(new ComparatorPages());
        myBooks4.addAll(myBooks.entrySet());
        for (final Map.Entry<String, Book> book : myBooks4)
            System.out.println(
                    book.getKey() + " - " + book.getValue().getTitle() + ", pages: " + book.getValue().getPages());

        System.out.println("\n\tOrdem natural (Autores/Livros/Paginas)");
        final Set<Map.Entry<String, Book>> myBooks5 = new TreeSet<>(new ComparatorAuthorTitlePages());
        myBooks5.addAll(myBooks.entrySet());
        for (final Map.Entry<String, Book> book : myBooks5)
            System.out.println(
                    book.getKey() + " - " + book.getValue().getTitle() + ", pages: " + book.getValue().getPages());
    }
}

class Book {
    private final String title;
    private final Integer pages;

    public Book(final String title, final Integer pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((pages == null) ? 0 : pages.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Book other = (Book) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (pages == null) {
            if (other.pages != null)
                return false;
        } else if (!pages.equals(other.pages))
            return false;
        return true;
    }

}

class ComparatorTitle implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(final Entry<String, Book> book, final Entry<String, Book> otherBook) {
        return book.getValue().getTitle().compareToIgnoreCase(otherBook.getValue().getTitle());
    }

}

class ComparatorPages implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(final Entry<String, Book> book, final Entry<String, Book> otherBook) {
        return book.getValue().getPages().compareTo(otherBook.getValue().getPages());
    }

}

class ComparatorAuthorTitlePages implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(final Entry<String, Book> book, final Entry<String, Book> otherBook) {
        final int author = book.getKey().compareToIgnoreCase(otherBook.getKey());
        if (author != 0)
            return author;

        final int title = book.getValue().getTitle().compareToIgnoreCase(otherBook.getValue().getTitle());
        if (title != 0)
            return title;

        return book.getValue().getPages().compareTo(otherBook.getValue().getPages());
    }
}