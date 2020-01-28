public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringtone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        this.versionNumber = versionNumber; this.batteryPercentage = batteryPercentage; this.carrier = carrier; this.ringtone = ringtone;
    }
    
    public abstract void displayInfo();
    
    public String getVersionNumber() { return versionNumber; }
    public void setVersionNumber(String versionNumber) { this.versionNumber = versionNumber; }
    
    public int getBatteryPercentage() { return batteryPercentage; }
    public void setBatteryPercentave(int batteryPercentage) { this.batteryPercentage = batteryPercentage; }
    
    public String getCarrier() { return carrier; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
    
    public String getRingTone() { return ringtone; }
    public void setRingtone(String ringtone) { this.ringtone = ringtone; }
    
}
