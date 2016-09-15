package com.example.RomanP.collections;

import java.util.ArrayList;


public class Config
{
    public final static String[] fNames = {"Alex", "Dmitriy", "Vasya"};
    public final static String[] lNames = {"Frost", "Green", "Losev"};
    public final static String[] photos = {"https://c-a.d-cd.net/5d5e482s-960.jpg",
                                            "https://e-a.d-cd.net/d1cb8eu-960.jpg",
                                            "https://s-media-cache-ak0.pinimg.com/736x/9f/58/d7/9f58d7f6ebd01808f1ff8230008f086c.jpg"};

    public ArrayList getPersonData()
    {
        ArrayList listperson = new ArrayList();
        for(int i = 0; i < fNames.length; i++)
        {
            listperson.add(new Person(photos[i],fNames[i],lNames[i]));
        }
        return listperson;
    }
}
