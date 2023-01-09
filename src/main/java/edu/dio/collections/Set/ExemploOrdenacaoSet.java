package edu.dio.collections.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(final String[] args) {
        System.out.println("\n\tOrdem aleatória");
        final Set<Serie> mySeries = new HashSet<>() {
            {
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("Modern Family", "Comedia", 22));
                add(new Serie("The Mandalorian", "Ação", 40));
            }
        };
        for (final Serie serie : mySeries)
            System.out.println(serie.getTitle() + " - "
                    + serie.getGender() + " - " + serie.getDurationTime() + "m");

        System.out.println("\n\tOrdem de inserção");
        final Set<Serie> mySeries1 = new LinkedHashSet<>() {
            {
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("The Mandalorian", "Ação", 40));
                add(new Serie("Modern Family", "Comedia", 22));
            }

        };
        for (final Serie serie : mySeries1)
            System.out.println(serie.getTitle() + " - "
                    + serie.getGender() + " - " + serie.getDurationTime() + "m");

        System.out.println("\n\tOrdem de natural (Tempo de episodio)");
        final Set<Serie> mySeries2 = new TreeSet<>(mySeries1);
        for (final Serie serie : mySeries2)
            System.out.println(serie.getTitle() + " - "
                    + serie.getGender() + " - " + serie.getDurationTime() + "m");

        System.out.println("\n\tOrdem de natural (Titulo/Gênero/Tempo de episodio)");
        final Set<Serie> mySeries3 = new TreeSet<>(new ComparatorTitleGenderDurationTime());
        mySeries3.addAll(mySeries);
        for (final Serie serie : mySeries3)
            System.out.println(serie.getTitle() + " - "
                    + serie.getGender() + " - " + serie.getDurationTime() + "m");

    }
}

class Serie implements Comparable<Serie> {

    private final String title;
    private final String gender;
    private final Integer durationTime;

    public Serie(final String title, final String gender, final Integer durationTime) {
        this.title = title;
        this.gender = gender;
        this.durationTime = durationTime;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    @Override
    public String toString() {
        return "[Titulo: " + title + ", gênero: " + gender + ", tempo de episódio: " + durationTime + " minutos]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((durationTime == null) ? 0 : durationTime.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (durationTime == null) {
            if (other.durationTime != null)
                return false;
        } else if (!durationTime.equals(other.durationTime))
            return false;
        return true;
    }

    @Override
    public int compareTo(final Serie otherSerie) {
        final int durationTime = Integer.compare(this.getDurationTime(), otherSerie.getDurationTime());
        if (durationTime != 0)
            return durationTime;

        return this.getGender().compareToIgnoreCase(otherSerie.getGender());
    }

}

class ComparatorTitleGenderDurationTime implements Comparator<Serie> {

    @Override
    public int compare(final Serie serie, final Serie otherSerie) {
        final int title = serie.getTitle().compareToIgnoreCase(otherSerie.getTitle());
        if (title != 0)
            return title;

        final int gender = serie.getGender().compareToIgnoreCase(otherSerie.getGender());
        if (gender != 0)
            return gender;

        return Integer.compare(serie.getDurationTime(), otherSerie.getDurationTime());
    }

}