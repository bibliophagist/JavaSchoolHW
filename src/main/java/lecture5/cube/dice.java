package lecture5.cube;


import java.util.Random;

public class dice {

    public int diceThrow(){
        final Random random =new Random();
        return 1+(random.nextInt());
    }
}
