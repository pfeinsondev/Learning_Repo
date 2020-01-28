import java.util.*;

public class Portfolio {
    LinkedList<Project> projects;
    
    public Portfolio(LinkedList<Project> projects) {
        this.projects = projects;
    }
    
    public LinkedList<Project> getProjects() { return projects; }
    
    public void showPortfolio() {
        for(Project p : projects) {
            System.out.println(p.elevatorPitch());
        }
    }
    
    public double getPortfolioCost() {
        double total = 0.0;
        for(Project p : projects) {
            total += p.getInitialCost();
        }
        return total;
    }
}   
