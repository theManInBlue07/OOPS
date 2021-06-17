package com.flowstatements;

class Movies {
    private String name;

    public Movies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "no plot here";
    }
}
 class Jaws extends Movies {
    public Jaws() {
        super("jaws");
    }

    public String plot() {
        return "A Shark attcking people on a beach";
    }
}
 class IndependenceDay extends Movies {
    public IndependenceDay() {
        super("Indepemdence day");
    }

    public String plot() {
        return "Aliens tries to capture Earth";
    }
}
class HarryPotter extends Movies{
                public HarryPotter(){
                    super("Harry potter");
                }

    @Override
    public String plot() {
        return "A vicious villian trying to kill a villian";
    }
}
class TanuWedsManu extends Movies{
                public TanuWedsManu(){
                    super("Tanu Weds Manu");
                }

    @Override
    public String plot() {
        return "A love story of 2 opposite people";

    }
}
class MazeRunner extends Movies{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids trying to escape from a maze";
    }
}
class ForgottenMovies extends Movies{
    public ForgottenMovies(){
        super(" FOrgotten");
    }
// no plot method will be implemented here
}

public class Main {

    public static void main(String[] args) {
	for(int i =0;i<11;i++){
	    Movies movie = randomMovie();
        System.out.println("Movie name ="+i+
                           ": "+movie.getName()+"\n"+
                           "Plot :"+movie.plot());

    }
    }
    public static Movies randomMovie(){
        // generating a random number here
        // using Math.random generating a double for values between 0 and 1.
        // multiplying the value by 5 and adding 1.
        int randomNumber =((int)(Math.random()*6) +1);
        System.out.println("Random number generated was, "+randomNumber );
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new HarryPotter();
            case 4:
                return new TanuWedsManu();
            case 5:
                return new MazeRunner();
            case 6:
                return new ForgottenMovies();
        }
        return null;
    }

}
