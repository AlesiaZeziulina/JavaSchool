package Task_6;

class Application {
    public static int main(String[] args) {
        Student st = new Student();
        //st.name = randomString(random, chars, 5);
        //st.lastName = randomString(random, chars, 5);
        int studentsNumber = 5;
        int[] results = new int[studentsNumber];

        for (int i = 0; i < studentsNumber; i++) {
            int rand = (1 + (int) (Math.random() * 5));
            results[i] = rand;
            System.out.println(results[i] + " ");
        }

        //sum of scores
        int sum = 0;
        for (int i = 0; i < results.length; i++) {
            sum = sum + results[i];
        }
    }
}


