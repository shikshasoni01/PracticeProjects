package com.product;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] names= new String[10];
        names[7]="Anisha";
        System.out.println(names[7]);
        System.out.println(names[4]);

        Optional<String> check= Optional.ofNullable(names[4]);
        if (check.isPresent())
        {
            System.out.println(names[4].toUpperCase());
        }else
        {
            System.out.println(check.orElse("Value is missing"));
            //check.orElseThrow();
            //System.out.println(check.get());
        }
    }
}
