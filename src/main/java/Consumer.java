public class Consumer implements Runnable {
    public void run() {
        while (true) {
            synchronized (Table.usedPosition) {
                if (Table.usedPosition <= 0) {
                    Table.showNumber(false, true);
                    continue;
                } else {
                    Table.showNumber(false, false);
                }
            }
        }
    }
}
