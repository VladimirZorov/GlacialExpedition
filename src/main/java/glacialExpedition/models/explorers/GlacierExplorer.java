package glacialExpedition.models.explorers;

public class GlacierExplorer extends BaseExplorer{

    private static final double ENERGY = 40;

    public GlacierExplorer(String name) {
        super(name, ENERGY);
    }

    @Override
    public void search() {
        if (getEnergy()-15 < 0) {
            setEnergy(0);
        } else {
            setEnergy(getEnergy() - 15);
        }
    }
}
