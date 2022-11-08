public class TestVoting {
    public static void main(String[] args) {
        
        VotingMachine vm = new VotingMachine();

        vm.VoteLabour();
        vm.VoteLabour();
        vm.VoteLabour();
        vm.VoteConservative();
        vm.ViewVotes();

    }
}
