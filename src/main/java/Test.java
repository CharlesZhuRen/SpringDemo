import com.neusoft.spring.Calculator;
import com.neusoft.spring.Calculator2;
import com.neusoft.spring.CalculatorService;
import com.neusoft.spring.beans.CellPhone;
import com.neusoft.spring.beans.IPhone;
import com.neusoft.spring.beans.Teacher;
//import jdk.jfr.events.FileReadEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws Exception {
//        Calculator cal = new Calculator();
//
//        BufferedReader br = new BufferedReader(new FileReader("d:\\conf.properties"));
//        Properties prop = new Properties();
//        prop.load(br);
//        String calClass = prop.getProperty("calClass");
//
//        CalculatorService cal = (CalculatorService)Class.forName(calClass).newInstance();
////        CalculatorService cal = new Calculator2();
//
//        System.out.println(cal.add(0.12,0.345));//0.465
//        System.out.println(cal.substract(1,0.42));
//        System.out.println(cal.multiply(1.2345,100));
//        System.out.println(cal.divide(123.3,100));

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Teacher teacher = (Teacher)ctx.getBean("ttt");
//        Teacher teacher2 = (Teacher)ctx.getBean("teacher");
//        CellPhone phone = (CellPhone)ctx.getBean("phone");
//        phone.call();
        System.out.println(teacher);//singleton

    }
}
