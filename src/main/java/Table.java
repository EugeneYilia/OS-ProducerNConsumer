public class Table {
    private Table() {
    }

    public static final Integer fullPosition = 10000;
    public static volatile Integer usedPosition = 0;

    //    public static volatile Table table = new Table();
    public synchronized static void showNumber(boolean isProducer, boolean isEdge) {
        if (isProducer) {
            if (isEdge) {
                System.out.println("Left dish count:" + Table.usedPosition + ".Dish is full now,producer is waiting.");
            } else {
                System.out.println("A dish was cooked.Now the left dish is " + Table.usedPosition);
            }
        } else {
            if (isEdge) {
                System.out.println("Left dish count:" + Table.usedPosition + ".Dish is empty now,consumer is waiting.");
            } else {
                System.out.println("A dish was eaten.Now the left dish is " + Table.usedPosition);
            }
        }
    }
}
