public interface Sensor {
    abstract public double readValue();
    abstract public String getStatus();
    abstract public void reset();
}
