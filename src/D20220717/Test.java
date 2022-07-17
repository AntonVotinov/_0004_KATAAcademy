// здесь мы проверяем как работают Импорты Пакетов

package D20220717;

import D20220717.Forest.*;
import D20220717.Forest.SamePackage.SameClass;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SameClass someClass1 = new SameClass();
        Tree t1 = new Tree();
        Squirell s1 = new Squirell();
        System.out.println("Qua");
    }
}