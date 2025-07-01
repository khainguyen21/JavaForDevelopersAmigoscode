package com.khaidevcode.person;

import static com.khaidevcode.utils.StringUtils.isEmptyorNull;

public class PersonService {
    public static int totalPeople = 0;
    public int addPerson(Person person) {
        if (isEmptyorNull(person.getFirstName())) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }

        totalPeople++;
        return totalPeople;
    }
}
