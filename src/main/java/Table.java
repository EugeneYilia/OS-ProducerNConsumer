import javafx.scene.control.Tab;

public class Table {
    private Table() {
    }

    public static final Integer fullPosition = 1000;
    public static volatile Integer usedPosition = 0;

    //    public static volatile Table table = new Table();
    public synchronized static void showNumber(boolean isProducer, boolean isEdge) {
        if (isProducer) {
            if (isEdge) {
                if (Table.usedPosition != Table.fullPosition) {
                    return;
                }
                System.out.println("Left dish count:" + Table.usedPosition + ".Dish is full now,producer is waiting.");
            } else {
                if (Table.usedPosition >= Table.fullPosition) {
                    return;
                }
                System.out.println("A dish is ready to be cooked.Now the left dish is " + Table.usedPosition);
                Table.usedPosition++;
                System.out.println("A dish was cooked.Now the left dish is " + Table.usedPosition);
            }
        } else {
            if (isEdge) {
                if (Table.usedPosition != 0) {
                    return;
                }
                System.out.println("Left dish count:" + Table.usedPosition + ".Dish is empty now,consumer is waiting.");
            } else {
                if (Table.usedPosition <= 0) {
                    return;
                }
                System.out.println("A dish is ready to be eaten.Now the left dish is " + Table.usedPosition);
                Table.usedPosition--;
                System.out.println("A dish was eaten.Now the left dish is " + Table.usedPosition);
            }
        }
    }
}
