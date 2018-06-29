public class Producer implements Runnable {
    public void run() {
        while (true) {
            synchronized (Table.usedPosition) {
                if (Table.usedPosition >= Table.fullPosition) {
                    Table.showNumber(true, true);
                    continue;
                } else {
                    Table.showNumber(true, false);
                }
            }
        }
    }
}
