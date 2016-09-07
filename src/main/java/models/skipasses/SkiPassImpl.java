package models.skipasses;

import models.interfaces.Passable;
import models.interfaces.SkiPassConfiguration;
import models.interfaces.ValidationStrategy;

/**
 * Created by Asterium on 05.09.2016.
 */
public abstract class SkiPassImpl implements Passable {

    private long id;
    private SkiPassDayType type;
    private SkiPassConfiguration configuration;
    private ValidationStrategy validationStrategy;

    @Override
    public abstract void pass();

}
