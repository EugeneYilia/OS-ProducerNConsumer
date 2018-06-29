public class Simulator {
    private Simulator(){}
    public static void simulatePNC(){
        Thread ConsumerThread1 = new Thread(new Consumer());
        Thread ConsumerThread2 = new Thread(new Consumer());
        Thread ConsumerThread3 = new Thread(new Consumer());
        Thread ConsumerThread4 = new Thread(new Consumer());


        Thread ProducerThread1 = new Thread(new Producer());
        Thread ProducerThread2 = new Thread(new Producer());
        Thread ProducerThread3 = new Thread(new Producer());
        Thread ProducerThread4 = new Thread(new Producer());
        Thread ProducerThread5 = new Thread(new Producer());

        ConsumerThread1.start();
        ProducerThread1.start();

        ConsumerThread2.start();
        ProducerThread2.start();

        ConsumerThread3.start();
        ProducerThread3.start();

        ConsumerThread4.start();
        ProducerThread4.start();

        ProducerThread5.start();
    }
}
