package IfElseExamples;

public class IfvsElseIf {
    public static void main(String[] args) {
        int number = 2;

        if (number == 0) {
            System.out.println("number : 0");
        } else if (number == 1 || number == 0) {
            System.out.println("number : 1 or 0");
        }  else if (number == 2 ) {
            System.out.println("number : 3");
        }
        if (number == 2 ) {
            System.out.println("number : 2");
        }
    }

    //if bloğu koşula uyduysa altında yine bir if bloğu varsa görür. Ama Else İf' e bakmaz.
    //if bloğu koşula uymadıysa alt satıra geçer. Kim varsa bakar.(Elseİf' e de bakar, İf'e de bakar)
    //Else İf bloğu koşula uyduysa alt satıra bakmaz. koşul bloklarını kırar.
    //Else if bloğu koşula uymadıysa alt satıra geçer. Kim varsa bakar.
}


