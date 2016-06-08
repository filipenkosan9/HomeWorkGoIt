package ua.goit.module4.task2;


public class TemperatureConvertor {

        public static double convertFarengeitToCelsium(double farengeitDegree) {
            return ((farengeitDegree - 32) * (5 / 9));
        }

        public static double convertCelsiumToFarengeit(double celsiumDegree)        {

            return ((9 / 5) * celsiumDegree + 32);
        }


}
