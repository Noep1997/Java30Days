class Student extends Person {
	private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    char calculate() {
        // calculate the mean
        double mean = 0;
        for (int i = 0; i < testScores.length; i++)
            mean += testScores[i];
        mean = mean / testScores.length;

        // check for letter and return it
        if (mean >= 90)
            return 'O';
        else if (mean >= 80 && mean < 90)
            return 'E';
        else if (mean >= 70 && mean < 80)
            return 'A';
        else if (mean >= 55 && mean < 70)
            return 'P';
        else if (mean >= 40 && mean < 55)
            return 'D';
        else
            return 'T';
    }
}
