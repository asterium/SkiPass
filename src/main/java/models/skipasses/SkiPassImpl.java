package models.skipasses;

import strategies.AccountingStrategy;

/**
 * Created by Asterium on 05.09.2016.
 */
public abstract class SkiPassImpl {

    private long id;
    private SkiPassType type;
    private AccountingStrategy accountingStrategy;

    public abstract void pass();

}
