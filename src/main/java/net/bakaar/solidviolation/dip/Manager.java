package net.bakaar.solidviolation.dip;

public class Manager {

    private Worker worker;

    public void manage() {
        worker.work();
    }

    public void setWorker(Worker empl) {
        this.worker = empl;
    }

}
