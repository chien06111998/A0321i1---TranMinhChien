package classes_and_objects_in_java.thuc_hanh.bai_tap.stop_watch;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch() {
        this.starTime = System.currentTimeMillis();
    }
    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void star() {
        this.starTime = System.currentTimeMillis();
    }
    public void end() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.starTime;
    }
}
