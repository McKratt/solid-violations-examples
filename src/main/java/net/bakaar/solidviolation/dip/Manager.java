package net.bakaar.solidviolation.dip;

public class Manager {
    private Worker worker;
    private SuperWorker superWorker;

    public Manager(Worker worker) {
        this.worker = worker;
    }

    public Manager(SuperWorker superWorker) {
        this.superWorker = superWorker;
    }

    public void manage() {
        if (worker != null) {
            worker.work();
        } else if (superWorker != null) {
            superWorker.work();
        }
    }

}
