import java.util.*;
public class ProjectTester {
    public static void main(String[] args) {
        Project ProjectTest = new Project("SAMPLE NAME", "SAMPLE DESCRIPTION");
        ProjectTest.setInitialCost(200.5);
        Project ProjectTest2 = new Project("SAMPLENAME", "SAMPLEDESCRIPTION");
        ProjectTest2.setInitialCost(100.00);
        Project ProjectTest3 = new Project(".....", ".........");
        ProjectTest3.setInitialCost(25);
        LinkedList<Project> projects = new LinkedList<Project>();
        projects.push(ProjectTest);
        projects.push(ProjectTest2);
        projects.push(ProjectTest3);
        Portfolio port = new Portfolio(projects);
        port.showPortfolio();
        System.out.println(port.getPortfolioCost());
   }
}
