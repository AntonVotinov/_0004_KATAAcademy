package D20220724;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.math.BigDecimal;

public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(() -> new BigDecimal("1234567").pow(100000));
        System.out.println(time);
    }
}