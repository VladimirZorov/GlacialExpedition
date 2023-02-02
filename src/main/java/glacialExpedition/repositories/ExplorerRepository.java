package glacialExpedition.repositories;

import glacialExpedition.models.explorers.Explorer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExplorerRepository implements Repository<Explorer>{

    private Collection<Explorer> explorers;

    public ExplorerRepository() {
        this.explorers = new ArrayList<Explorer>();
    }

    @Override
    public Collection<Explorer> getCollection() {
        return Collections.unmodifiableCollection(explorers);
    }

    @Override
    public void add(Explorer explorer) {

    }

    @Override
    public boolean remove(Explorer explorer) {
        return false;
    }



    @Override
    public Explorer byName(String name) {
        for (Explorer explorer : explorers) {
            if (explorer.getName().equals(name)) {
                return  explorer;
            }
        }
        return null;
    }
}
