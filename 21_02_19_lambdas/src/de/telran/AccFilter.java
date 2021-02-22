package de.telran;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class AccFilter {
    public List<Account> filter(List<Account> accounts, Predicate<Account> predicate) {
        List<Account> res = new ArrayList<>();
        for (Account account : accounts) {
            if (predicate.test(account))
                res.add(account);
        }
        /*return return accounts.stream()
        .filter(predicate)
        .collect(Collectors.toList());*/
        return res;
    }
}
