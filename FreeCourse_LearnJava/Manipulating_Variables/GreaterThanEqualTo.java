// Greater / Less Than or Equal To

// Greater than or equal to operator : >=
// Lesser than or equal to operator : <=
package FreeCourse_LearnJava.Manipulating_Variables;
public class GreaterThanEqualTo {
  public static void main(String[] args){
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;
    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
    boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
    System.out.println(isChallengeComplete);
  }       
}