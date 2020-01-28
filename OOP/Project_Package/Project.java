
public class Project {
    private String name, description;
    private double initialCost;
    
    public Project () {
        this("", "");
    }
    
    public Project (String name) {
        this(name, "");
    }
    
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public String elevatorPitch() {
        return (name + "(" + initialCost +  "): " + description + "\n");
    }
    
    public void setName(String name) { this.name = name; }
    
    public String getName() { return name; }
    
    public void setDescription(String description) { this.description = description; }
    
    public String getDescription() { return description; }
    
    public void setInitialCost(double initialCost) { this.initialCost = initialCost; }
    
    public double getInitialCost() { return initialCost; }
    
}
