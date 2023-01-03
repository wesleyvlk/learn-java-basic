package br.edu.dio.collections.Streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import br.edu.dio.collections.Contact;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato) exemplo;
id = 1 - Contato = nome: Simba, numero: 2222;
*/

public class RefatoracaoOrdenacaoMap {
    public static void main(final String[] args) {
        System.out.println("\n\tOrdem aleatória");
        final Map<Integer, Contact> agenda = new HashMap<>() {
            {
                put(1, new Contact("Baby", 661));
                put(4, new Contact("My", 5991));
                put(3, new Contact("Mom", 7599));
            }
        };

        // Refatoração de forEach for pelo metodo forEach Lambda
        agenda.entrySet().forEach(contact -> {
            System.out.println(
                    contact.getKey() + " - " + contact.getValue().getName() + ": " + contact.getValue().getPhone());
        });

        System.out.println("\n\tOrdem de inserção");
        final Map<Integer, Contact> agenda1 = new LinkedHashMap<>() {
            {
                put(1, new Contact("Baby", 661));
                put(4, new Contact("My", 5991));
                put(3, new Contact("Mom", 7599));
            }
        };
        agenda1.entrySet().forEach(contact -> {
            System.out.println(
                    contact.getKey() + " - " + contact.getValue().getName() + ": " + contact.getValue().getPhone());
        });

        System.out.println("\n\tOrdem id");
        final Map<Integer, Contact> agenda2 = new TreeMap<>(agenda1);
        agenda2.entrySet().forEach(contact -> {
            System.out.println(
                    contact.getKey() + " - " + contact.getValue().getName() + ": " + contact.getValue().getPhone());
        });

        // Aqui começa a refatoração dos comparator
        System.out.println("\n\tOrdem Telefone");

        /*
         * // Classe Anonima:
         * Set<Map.Entry<Integer, Contact>> agenda3 = new TreeSet<>(new
         * Comparator<Map.Entry<Integer, Contact>>() {
         * 
         * @Override
         * public int compare(Entry<Integer, Contact> contact, Entry<Integer, Contact>
         * otherContact) {
         * return Integer.compare(contact.getValue().getPhone(),
         * otherContact.getValue().getPhone());
         * }
         * });
         * agenda3.addAll(agenda.entrySet());
         */

        /*
         * // Classe Anonima comparing
         * Set<Map.Entry<Integer, Contact>> agenda3 = new
         * TreeSet<>(Comparator.comparing(
         * new Function<Map.Entry<Integer, Contact>, Integer>() {
         * 
         * @Override
         * public Integer apply(Entry<Integer, Contact> contact) {
         * return contact.getValue().getPhone();
         * }
         * }));
         * agenda3.addAll(agenda.entrySet());
         */

        // Lambda
        final Set<Map.Entry<Integer, Contact>> agenda3 = new TreeSet<>(
                Comparator.comparing(
                        contact -> contact.getValue().getPhone()));
        agenda3.addAll(agenda.entrySet());

        agenda3.forEach(contact -> {
            System.out.println(
                    contact.getKey() + " - " + contact.getValue().getName() + ": " + contact.getValue().getPhone());
        });

        System.out.println("\n\tOrdem Nome");
        final Set<Map.Entry<Integer, Contact>> agenda4 = new TreeSet<>(Comparator.comparing(
                contactName -> contactName.getValue().getName()));
        agenda4.addAll(agenda.entrySet());

        agenda4.forEach(contact -> {
            System.out.println(
                    contact.getKey() + " - " + contact.getValue().getName() + ": " + contact.getValue().getPhone());
        });
    }
}
