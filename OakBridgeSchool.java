package org.example;


public class OakBridgeSchool
{
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        if (math.length == 0 || science.length == 0 || english.length == 0)
        {
            return new int[0];
        }
        int size = math.length;
        int[] total_mark = new int[size];
        for(int i=0;i<size;i++)
        {
            total_mark[i]=math[i]+science[i]+english[i];
        }
        return total_mark;
    }
    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects)
    {
        int size = totalMarks.length;
        if(noOfSubjects != 0 )
        {
            int[] average_mark = new int[size];
            for(int i=0;i<average_mark.length;i++)
            {
                average_mark[i]=(totalMarks[i]/noOfSubjects);
            }
            return average_mark;
        }
        return new int[0];
    }
    public double calculateAverageScienceMarks (int[] science,int len)
    {
        int size = science.length;
        double science_sum = 0;
        double science_avg = 0;
        for(int i = 0; i<size;i++)
        {
            science_sum= science[i]+science_sum;
        }
        science_avg = (science_sum / len);
        return science_avg;
    }
    public double calculateAverageEnglishMarks(int[] english, int len)
    {
        int size = english.length;
        double english_sum = 0;
        double english_avg = 0;
        for(int i = 0; i<size;i++)
        {
            english_sum= english[i]+english_sum;
        }
        english_avg = (english_sum / len);
        return english_avg;
    }
    public double calculateAverageMathMarks (int[] math,int len)
    {
        int size = math.length;
        double math_sum = 0;
        double math_avg = 0;
        for(int i = 0; i<size;i++)
        {
            math_sum= math[i]+math_sum;
        }
        math_avg = (math_sum / len);
        return math_avg;
    }
    public char findGradeInMath(int math) {
        if (math >= 90) {
            return 'A';
        } else if (math >= 80) {
            return 'B';
        } else if (math >= 70) {
            return 'C';
        } else if (math >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public char findGradeInScience(int science) {
        if (science >= 90) {
            return 'A';
        } else if (science >= 80) {
            return 'B';
        } else if (science >= 70) {
            return 'C';
        } else if (science >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public char findGradeInEnglish(int english) {
        if (english >= 90) {
            return 'A';
        } else if (english >= 80) {
            return 'B';
        } else if (english >= 70) {
            return 'C';
        } else if (english >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public int[] sortByTotalMarks(int[] totalMarks)
    {
        int size = totalMarks.length;
        for(int i = 1;i<size;i++)
        {
            int temp = totalMarks[i];
            int j = i-1;
            while(j >=0 && totalMarks[j]>temp)
            {
                totalMarks[j+1]=totalMarks[j];
                j--;
            }
            totalMarks[j+1]=temp;

        }
        return totalMarks;
    }
    public boolean checkIfNamesAreRepeated(String[] studentNames) {
        int i, j;
        for (i = 0; i < studentNames.length; i++) {
            for (j = i + 1; j < studentNames.length; j++) {
                if (studentNames[i].equals(studentNames[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    //write the logic to find the top score using recursion
    public int findTopScore(int[] totalMarks, int len) {
        if (len <= 0 || len > totalMarks.length) return 0; // Add length check to prevent out-of-bounds
        if (len == 1) {
            return totalMarks[0];
        }
        int max = findTopScore(totalMarks, len - 1);
        return Math.max(max, totalMarks[len - 1]);
    }
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo )
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Grading and Evaluation");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                                                  ");
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name                Roll No");
        System.out.println("--------------------------------------------------");
        System.out.println(studentName+"              "+ rollNo);
        System.out.println("The total marks scored   :" +" "+totalMark+"/300");
        System.out.println("The average marks scored :" +" " + averageMark);
        System.out.println("--------------------------------------------------");
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        System.out.println("Grade in Math    :" + mathGrade);
        System.out.println("Grade in Science :" + scienceGrade);
        System.out.println("Grade in English :" + englishGrade);
        System.out.println("--------------------------------------------------");
    }
    public StringBuilder[] generateResultMesssage(String[] studentName, int[] totalScore) {
        StringBuilder[] new_String = new StringBuilder[studentName.length];
        for (int i = 0; i < studentName.length; i++) {
            new_String[i] = new StringBuilder("Hi " + studentName[i] + " you have secured " + totalScore[i]);
        }
        return new_String;
    }
    public static void main(String[] args)
    {
        int[] math = {88,89,100,70,60,80,35,3,25,56};
        int[] science={80,83,99,67,56,84,38,9,32,65};
        int[] english={90,98,100,65,54,82,40,13,45,67};
        int math_size=math.length;
        int science_size=science.length;
        int english_size=english.length;
        String[] studentNames ={"Michelle","Kate","Ann","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        char[] gradeinmath = new char[studentNames.length];
        char[] gradeinscience = new char[studentNames.length];
        char[] gradeinenglish = new char[studentNames.length];
        int[] rollNos={102,109,101,103,104,108,110,105,106,107};
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        int[] totalmark=oakBridgeSchool.calculateTotalMarks(math,science,english);
        int totalmark_size = totalmark.length;
        int noOfsubjects = 3;
        int[] averagemark=oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalmark,noOfsubjects);
        for (int i = 0; i < studentNames.length; i++)
        {
            gradeinmath[i] = oakBridgeSchool.findGradeInMath(math[i]);
            gradeinscience[i] = oakBridgeSchool.findGradeInScience(science[i]);
            gradeinenglish[i] = oakBridgeSchool.findGradeInEnglish(english[i]);
        }
        System.out.println("Average Science marks scored by the class is :" +oakBridgeSchool.calculateAverageScienceMarks(science,science_size));
        System.out.println("Average Math marks scored by the class is    :" +oakBridgeSchool.calculateAverageMathMarks(math,math_size));
        System.out.println("Average English marks scored by the class is :" +oakBridgeSchool.calculateAverageEnglishMarks(english,english_size));
        for (int i =0 ; i <studentNames.length;i++)
        {
            oakBridgeSchool.displayDetails(totalmark[i],averagemark[i],gradeinmath[i],gradeinscience[i],gradeinenglish[i],studentNames[i],rollNos[i]);
        }
        boolean checker=oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        if ( checker == true)
        {
            System.out.println("Names are repeated");
        }
        else
        {
            System.out.println("Names are not repeated");
        }
        StringBuilder[] result = oakBridgeSchool.generateResultMesssage(studentNames,totalmark);
        for(int i = 0; i < studentNames.length; i ++)
        {
            System.out.println(result[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Report");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        int[] totalmarkascending=oakBridgeSchool.sortByTotalMarks(totalmark);
        for(int i = 0 ; i< totalmarkascending.length ;i++)
        {
            System.out.println(totalmarkascending[i]);
        }
        System.out.println("The top score is" + oakBridgeSchool.findTopScore(totalmark,totalmark_size));




    }
}