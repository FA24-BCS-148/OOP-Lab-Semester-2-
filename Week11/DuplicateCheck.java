public class DuplicateCheck {
    public void Check(Shape[] array){
        for (int c = 0;c <= 4;c++){
            for (int n = 0; n<=4;n++){
                if (n == c){
                    continue;
                }
                if (array[c].equals(array[n]) == true){
                    System.out.println("Duplicates Found!");
                }
            }
        }
        for (int c = 5;c <= 9;c++){
            for (int n = 0; n<=4;n++){
                if (n == c){
                    continue;
                }
                if (array[c].equals(array[n]) == true){
                    System.out.println("Duplicates Found!");
                }
            }
        }
        for (int c = 10;c <= 14;c++){
            for (int n = 0; n<=4;n++){
                if (n == c){
                    continue;
                }
                if (array[c].equals(array[n]) == true){
                    System.out.println("Duplicates Found!");
                }
            }
        }
        for (int c = 14;c <= 19;c++){
            for (int n = 0; n<=4;n++){
                if (n == c){
                    continue;
                }
                if (array[c].equals(array[n]) == true){
                    System.out.println("Duplicates Found!");
                }
            }
        }
    }
}
