import java.util.ArrayList;
import java.util.List;

// Abstract class representing different job roles
abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() { return candidateName; }
    public int getExperienceYears() { return experienceYears; }

    @Override
    public String toString() {
        return candidateName + " - " + experienceYears + " years of experience";
    }
}

// Specific job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }
}

// Generic Resume Screening Class
class Resume<T extends JobRole> {
    private List<T> candidates = new ArrayList<>();

    public void addCandidate(T candidate) {
        candidates.add(candidate);
    }

    public List<T> getCandidates() {
        return candidates;
    }

    // Wildcard method to process resumes dynamically
    public static void screenResumes(List<? extends JobRole> resumes) {
        System.out.println("Screening Resumes:");
        for (JobRole resume : resumes) {
            System.out.println("- " + resume);
        }
    }
}

// Main class for testing
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addCandidate(new SoftwareEngineer("Alice", 5));
        softwareEngineerResumes.addCandidate(new SoftwareEngineer("Bob", 3));

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addCandidate(new DataScientist("Charlie", 4));
        dataScientistResumes.addCandidate(new DataScientist("David", 6));

        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addCandidate(new ProductManager("Eve", 7));

        System.out.println("Software Engineer Candidates:");
        Resume.screenResumes(softwareEngineerResumes.getCandidates());

        System.out.println("\nData Scientist Candidates:");
        Resume.screenResumes(dataScientistResumes.getCandidates());

        System.out.println("\nProduct Manager Candidates:");
        Resume.screenResumes(productManagerResumes.getCandidates());
    }
}
