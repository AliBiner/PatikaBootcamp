package com.alibiner.Week7.Optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        Integer length = optionalName.map(String::length).orElse(0);
        optionalName.ifPresentOrElse(System.out::println,()-> System.out.println("Veri Yok"));
        System.out.println(length);

        System.out.println(optionalName.orElse("Veri Yok"));

        Consumer<Optional<String>> nameLength = n -> System.out.println(n.orElse("Veri Yok."));

        nameLength.accept(optionalName);

    }
}
