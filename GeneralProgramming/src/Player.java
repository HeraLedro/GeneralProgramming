/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan
 */
public class Player {
    
    //Player name and position
    private String name;
    private String pos;
    
    //Player statistics
    private int goals;  //Applicable for all players; total goals
    private int saves;  //Applicable only if player is the goalie position; total saves
    private int assists;    //Total assists
    private double scoreAverage;    //Average goals per game
    private double saveAverage;
    private double assistsAverage;  //Average assists per game
    
    
    public Player(){ //General empty constructor; failsafe
        name = null;
        pos = null;
        goals = 0;
        saves = 0;
        assists = 0;
        scoreAverage = 0;
        assistsAverage = 0;
        saveAverage = 0;
    }
    
    public Player(String n, String p, int g, int s, int a, int sA, int sV, int aA){
        name = n;
        pos = p;
        goals = g;
        saves = 0;
        if (p.equals("goalie")){
            saves = 0;
        }
        assists = a;
        scoreAverage = 0;
        saveAverage = 0;
        if (p.equals("goalie")){
            saveAverage = sV;
        }
        assistsAverage = aA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public double getScoreAverage() {
        return scoreAverage;
    }

    public void setScoreAverage(double scoreAverage) {
        this.scoreAverage = scoreAverage;
    }

    public double getSaveAverage() {
        return saveAverage;
    }

    public void setSaveAverage(double saveAverage) {
        this.saveAverage = saveAverage;
    }

    public double getAssistsAverage() {
        return assistsAverage;
    }

    public void setAssistsAverage(double assistsAverage) {
        this.assistsAverage = assistsAverage;
    }
    
    
}
