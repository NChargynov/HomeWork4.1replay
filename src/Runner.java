public class Runner extends Thread {
    private Runner nextRunner;

    public Runner(String name, Runner nextRunner) {
        this.setName(name);
        this.nextRunner = nextRunner;
    }

    public Runner(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (nextRunner != null){
            nextRunner.start();
        }
        System.out.println(getName() + "берет палочку");
        if (nextRunner != null) {
            System.out.println(getName() + "бежит к " + nextRunner.getName());
            try {
                nextRunner.join();
                nextRunner.sleep(3000);
                System.out.println(nextRunner.getName() + "бежит к " + getName());
                System.out.println(getName() + "берет палочку");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(getName() + "бежит к финишу");
        }
    }
}
