package Chapter3.DataType.NonPrimitive;

public class ArrayDemo {
     int[] teamScores = {50, 80, 75, 77};
     String[] team = {"John", "Peter", "Elilly" ,"Ali"};
     int[][] dethHighScore = {{20, 40, 20,}, {30 , 40 , 7}};
    Student[] teamObjects = {
            new Student("John"),
            new Student("Peter"),
            new Student("Elilly"),
            new Student("Ali")
    };

     public void display() {
         System.out.println("1."+" "+ team[0] +":" + teamScores[0]);
         System.out.println("2."+" "+ team[1] +":" + teamScores[1]);
         System.out.println("3."+" "+ team[2] +":" + teamScores[2]);
         System.out.println("4."+" "+ team[3] +":" + teamScores[3]);

         String[] scoredHigh = new String[2];
         scoredHigh[0] =  team[1];
         scoredHigh[1] =  team[3];
         System.out.println("High Scores:" + " " + scoredHigh[0]+" (" + dethHighScore[0][0]+" ," +" " + dethHighScore[0][1]+" ,"+" " +" " + dethHighScore[0][2]+" ," + " )"+ "&"+" " +scoredHigh[1] +" (" + dethHighScore[1][0]+" ," +" " + dethHighScore[1][1]+" ," +" " + dethHighScore[1][2]+" ,"  +" )" );
     }


}
