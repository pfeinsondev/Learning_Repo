public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring() { return String.format("%s says %s", "Galaxy " + super.getVersionNumber(), super.getRingTone()); }
    public String unlock() { return "Unlocking via Facial Recognition"; }
    public void displayInfo() { System.out.printf("%s by %s%n", "Galaxy " + super.getVersionNumber(), super.getCarrier()); }

}
