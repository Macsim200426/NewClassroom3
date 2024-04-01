package org.maks.newclass;

import java.util.*;


public class Country { //Создаем класс для перечня стран

    static Map<Integer, String> map = new HashMap<>();//Создаем переменную для стран

    public Country() { //Заполняем переменную странами и ключами к ним
        map.put(1, "France");
        map.put(2, "China");
        map.put(3, "Japan");
        map.put(4, "Spain");
        map.put(5, "Africa");
        map.put(6, "Germany");
        map.put(7, "Austria");
        map.put(8, "Australia");

    }

}
