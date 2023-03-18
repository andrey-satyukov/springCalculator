package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorSericeImpl implements CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(Integer num1, Integer num2) {
            return Integer.toString(num1 + num2);
    }

    public String minus(Integer num1, Integer num2) {
            return Integer.toString(num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
            return Integer.toString(num1 * num2);
    }

    public String divide(Double num1, Double num2) {
            return Double.toString(num1 / num2);
    }
}