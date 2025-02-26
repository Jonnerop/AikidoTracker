class TrainingSession {
    private String date;
    private int duration;

    public TrainingSession(String date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }
}