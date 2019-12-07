
public class Human {

        int age;
        int weight;
        int height;
        String name;
        boolean isMale;

        public void Human ( int age, int weight, int height, String name,  boolean gender){
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.isMale = gender;
        }

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public int getWeight(){
            return weight;
        }
        public int getHeight(){
            return height;
        }
        public boolean isMale(){
            return isMale;
        }

    }
