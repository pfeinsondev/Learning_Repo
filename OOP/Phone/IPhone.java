public class IPhone extends Phone implements Ringable { 
    public IPhone (String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring() { return String.format("%s says %s", "IPhone " + super.getVersionNumber(), super.getRingTone()); }
    public String unlock() { return "Unlocking via Facial Recognition"; }
    public void displayInfo() { System.out.printf("%s by %s%n", "IPhone " + super.getVersionNumber(), super.getCarrier()); }
}
