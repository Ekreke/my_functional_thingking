package examples2;

import com.sun.scenario.effect.Effect;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/08/05/16:49
 * @Description:
 */
public class PerfectNumberStream {
    public  class  NumberClassifier{
        public static  IntStream factorsOf(int number){
            return range(1,number + 1).filter(potential -> number % potential == 0);
        }

        public static int aliquotSum(int number){
            return factorsOf(number).sum() - number;
        }

        public static boolean isPerfect(int number){
            return aliquotSum(number) == number;
        }

        public static boolean isAbundant(int number){
            return aliquotSum(number) > number;
        }

        public static boolean isDeficient(int number){
            return aliquotSum(number) < number;
        }


    }


}
