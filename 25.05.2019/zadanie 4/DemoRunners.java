public class DemoRunners {

    public void setRunner(Runner runner){
        Athlete athlete = new Athlete();
        Machine machine = new Machine();
        PoliticalCandidate politicalCandidate = new PoliticalCandidate();

        athlete.run();
        machine.run();
        politicalCandidate.run();
    }
}
