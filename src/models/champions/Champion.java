package models.champions;

import models.Being;
import models.Buff;
import models.items.Build;
import models.masteries.MasteryPage;
import models.runes.RunePage;

import java.util.List;

public class Champion extends Being {

    protected Build items;
    protected RunePage runes;
    protected MasteryPage masteries;
    protected List<Buff> buffs;

    protected int qLevel;
    protected int zLevel;
    protected int eLevel;
    protected int rLevel;

    protected float qCooldown;
    protected float zCooldown;
    protected float eCooldown;
    protected float rCooldown;
    protected float passiveCooldown;
}
