package com.getbase.hackkrk.cupcakecipher.utils;

import com.google.common.collect.ImmutableSet;

import java.util.Set;
import java.util.function.Predicate;

/**
 * Created by adg on 05.11.2014.
 */
public class IsIngredient implements Predicate<String> {


   private final Set<String> allIngredients= ImmutableSet.copyOf(new String[]{"jelly","rum","oil","walnut","vanilla","yeast","cheese","eggs","salt","plum","sugar","flour","coconut","sesame","strawberries","almonds","coffee","cocoa","chocolate","butter","cinnamon","lemon","milk","banana","marzipan","hazelnut"});

    @Override
    public boolean test(String s) {
        return allIngredients.contains(s.trim());
    }
}
