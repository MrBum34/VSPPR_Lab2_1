package by.vstu.zamok.lab2.runner;

import by.vstu.zamok.lab2.component.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("by.vstu.zamok.lab2")
@Component
public class Calculate {
    @Autowired
    @Qualifier("add")
    private Operation ops;

    public static void main(String[] args) {
        Calculate calc=new Calculate();
        calc.execute(10L,15L);
    }
    public void execute(long op1,long op2){
        System.out.println("The result of"+op1+ops.getOpsName()+op2+" is "+ops.operate(op1,op2)+"!");
    }
}
