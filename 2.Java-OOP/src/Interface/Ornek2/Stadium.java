package Interface.Ornek2;

public class Stadium implements Hockey, Football{
    String homeName;
    String visitingName;
    int homePoints;
    int visitingPoints;
    int timePeriod;
    int endPeriod;


    @Override
    public void homeTeamScored(int points) {
        homePoints = points;
    }

    @Override
    public void visitingTeamScored(int points) {
        visitingPoints = points;
    }

    @Override
    public void overTimePeriod(int overTimePeriod) {
        timePeriod = overTimePeriod;
    }

    @Override
    public void endOfPeriod(int period) {
        endPeriod = period;
    }

    @Override
    public void setHomeTeam(String name) {
        homeName = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        visitingName = name;
    }

    public String getVisitingName(){
        return visitingName;
    }

    public String getHomeName(){
        return homeName;
    }
}
