import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCell {

    private boolean living;
    private boolean[] neighbours = new boolean[8];

    SimpleCell() {
        this.living = false;
        Arrays.fill(neighbours, false);
    }


}
