public class SimpleCell {

    private final boolean living;
    private final int livingNeighbours;

    public SimpleCell(boolean living, int livingNeighbours) {
        this.living = living;
        this.livingNeighbours = livingNeighbours;
    }

    public boolean nextGenerationState() {
        if (isLivingWithTwoNeighbours() || livingNeighbours == 3)
            return true;
        return false;
    }

    private boolean isLivingWithTwoNeighbours() {
        return living && livingNeighbours == 2;
    }
}
