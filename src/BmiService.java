public class BmiService {
        public long calculate (long weight,long height) {
            long bmi = (weight / (height * height) / 100);


        return bmi;
    }
}
