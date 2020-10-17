package part1.lesson02.task03;

import java.util.Random;

public class FillPersonArray {

    Random random = new Random();
public int ageRandSelect(){

    return random.nextInt(100);
}
public String randSexForPerson(){
   String s="W";
    int numForSelectiont=random.nextInt(2);
    if(numForSelectiont==0) s = "M";
    return s;
}

}
