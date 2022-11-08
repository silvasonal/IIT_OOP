
import java.lang.Math;

public class VotingMachine {
    
    private double labour_votes;
    private double Conservative_votes;
    
    public VotingMachine(){};

    public void ClearState(){
        this.labour_votes = 0;
        this.Conservative_votes=0;
    };

    public void VoteLabour(){
        this.labour_votes = this.labour_votes + 1 + GenerateRandomNUmber();
    };

    public void VoteConservative(){
        this.Conservative_votes = this.Conservative_votes + 1 + GenerateRandomNUmber();
    };

    private double GenerateRandomNUmber(){
        return Math.random();
    }; 

    public void ViewVotes(){
        System.out.println("Labour: " + this.labour_votes);
        System.out.println("Conservative: " + this.Conservative_votes);
        
    }
    
}
