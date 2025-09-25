package ladder;

public class LadderRunner {

    private final Row[] rows;

    public LadderRunner(Row[] rows) {
        this.rows = rows;
    }

    public int run(Position position){
        for (int i = 0; i < rows.length; i++) {
            rows[i].nextPosition(position);
        }

        return position.getValue();
    }

    public void runWithPrint(Position position){

        LadderPrinter ladderPrinter = new LadderPrinter(rows);

        for (int i = 0; i < rows.length; i++) {
            ladderPrinter.renderLadderWithPosition(position,i);
            rows[i].nextPosition(position);
            ladderPrinter.renderLadderWithPosition(position,i);
        }
    }

}
