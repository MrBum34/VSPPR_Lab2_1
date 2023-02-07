package by.vstu.zamok.lab2.component;

import org.springframework.stereotype.Service;

@Service("mult")
public class OppMultiply implements Operation {


    @Override
    public double operate(double op1, double op2) {
        return op1*op2;
    }

    @Override
    public String getOpsName() {
        return " umnogenie ";
    }
}
