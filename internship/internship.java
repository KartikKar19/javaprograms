public class internship {
    public static void checkEligibility(String name, int age, int jExp, int dExp, String location) {
        if (age >= 25 && age <= 40) {
            if (jExp > 3 && dExp >= 0 && dExp <= 5) {
                if (location == "chennai" || location == "bangalore") {
                    System.out.println("You are eligible for R&D Intern... Congrats...");
                }
            }
            if (jExp > 5 && dExp > 5) {
                if (location == "chennai" || location == "bangalore" || location == "mumbai") {
                    System.out.println("You are eligible for Data Analysis Intern... Congrats...");
                }
            }
            if (jExp >= 0 && dExp >= 0) {
                if (location == "chennai") {
                    System.out.println("You are eligible for Programming Intern... Congrats...");
                }
            }
        } else {
            System.out.println("You are not eligible for Intern... Better luck next time....");
        }
    }
}