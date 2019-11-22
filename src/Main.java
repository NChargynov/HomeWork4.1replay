public class Main {

    public static void main(String[] args) {

        Runner runner1 = new Runner();
        runner1.setName("Runner1");
        runner1.start();
        try {
            runner1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner1.getName() + " берет палочку");

        Runner runner2 = new Runner();
        runner2.setName("Runner2");
        runner2.start();
        try {
            runner2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner1.getName() + " бежит к " + runner2.getName());
        System.out.println(runner2.getName() + " берет палочку");

        Runner runner3 = new Runner();
        runner3.setName("Runner3");
        runner3.start();
        try {
            runner3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner2.getName() + " бежит к " + runner3.getName());
        System.out.println(runner3.getName() + " берет палочку");

        Runner runner4 = new Runner();
        runner4.setName("Runner4");
        runner4.start();
        try {
            runner4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner3.getName() + " бежит к " + runner4.getName());
        System.out.println(runner4.getName() + " берет палочку");

        Runner runner5 = new Runner();
        runner5.setName("Runner5");
        runner5.start();
        try {
            runner5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner4.getName() + " бежит к " + runner5.getName());
        System.out.println(runner5.getName() + " берет палочку");
        System.out.println(runner5.getName() + " бежит к финишу");
        System.out.println(runner5.getName() + " бежит к " + runner4.getName());

        try {
            runner4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            runner4.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(runner4.getName() + " берет палочку");
        System.out.println(runner4.getName() + " бежит к " + runner3.getName());

        try {
            runner3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            runner3.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner3.getName() + " берет палочку");
        System.out.println(runner3.getName() + " бежит к " + runner2.getName());

        try {
            runner2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            runner2.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner2.getName() + " берет палочку");
        System.out.println(runner2.getName() + " бежит к " + runner1.getName());

        try {
            runner1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner1.getName() + " берет палочку");
    }
}
