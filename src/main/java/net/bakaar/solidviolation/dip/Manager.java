package net.bakaar.solidviolation.dip;

public class Manager {
    private Worker worker;
    private SuperWorker superWorker;

    public void manage() {
        if (worker != null) {
            worker.work();
        } else if (superWorker != null) {
            superWorker.work();
        }
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setWorker(SuperWorker worker) {
        this.superWorker = worker;
    }
}
