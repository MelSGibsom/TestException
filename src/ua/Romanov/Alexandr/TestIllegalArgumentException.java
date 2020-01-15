package ua.Romanov.Alexandr;

public class TestIllegalArgumentException {
     int age =23;
     int age2 =0;

    public TestIllegalArgumentException(int age, int age2) {
        this.age = age;
        this.age2 = age2;
    }

    int getAge(){

       if (age == 0||age<0){
           throw new IllegalArgumentException("Illegal Argument Exception");
       } return age;
    }
   int geAge2(){
        return  age2;
   }
}
