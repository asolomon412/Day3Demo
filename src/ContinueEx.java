
public class ContinueEx {

	public static void main(String[] args) {
        System.out.println("Continue statement example below:");

        for (int i = 0; i < 5; i++) { // will execute at least 5 times
            int randomNum2 = (int) (Math.random() * 10); // generate random # 0 - 9

            if (randomNum2 > 7) {
                System.out.println(randomNum2 + " invalid number -- continue loop");
                continue;
            }
            System.out.println(randomNum2); // only executes if randomNum2 <= 7
        }

	}

}
