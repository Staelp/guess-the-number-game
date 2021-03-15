package academy.learnprogramming;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Component
public class NumberGeneratorImpl implements NumberGenerator{

    // == fields ==
    @Getter(AccessLevel.NONE)
    private final Random random = new Random();


    private final int maxNumber;

    private final int minNumber;

    // == constructors ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==//
    public int next() {
        //return random int between min and max
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
/* Not needed because of @Getter annotation from Lombok
    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() { return minNumber; }
*/
}
