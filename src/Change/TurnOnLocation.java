package src.Change;

import src.Community.SmartHouse;

import java.util.function.Consumer;

public class TurnOnLocation extends ChangeLocation{
    /**
     * Construtor que guarda a mudança
     * @param location Divisão onde vão ser ligados todos os dispositivos
     */
    public TurnOnLocation(String location){
        super(location, (Consumer<SmartHouse>) sH -> sH.applyToLocation(location, sD -> sD.turnOn()));
    }

    /**
     * Construtor de cópiia
     * @param c Mudança a copiar
     */
    public TurnOnLocation(TurnOnLocation c){
        super(c.getLocation(), (Consumer<SmartHouse>)c.getChangeFunction());
    }

    /**
     * Devolve uma cópia da mudança
     * @return uma cópia da mudança
     */
    public Change clone(){
        return new TurnOnLocation((TurnOnLocation) this);
    }
}
