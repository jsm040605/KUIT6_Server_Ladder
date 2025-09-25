package ladder;

public class LadderPosition {
    private final int x;
    private final int y;

    public LadderPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LadderPosition ladderPosition) {
            return this.x == ladderPosition.x && this.y == ladderPosition.y;
        }

        return false;
    }
}
