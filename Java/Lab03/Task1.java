// Thanyathon Kitsakun
// 6887101


public class Task1 {
    public static void main(String[] args){
        System.out.print("=== Welcome to Customized Wallpaper System ===");
        System.out.println("We have 3 popular styles here:");
        System.out.println("=== Style 1 ===");

        int i, j,  k;
        for (i = 1; i <= 5; i++ ){
            for (j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("=== Style 2 ===");
        for (i = 1; i <= 5; i++){
            for (j = 2; j <= i; j++){

                System.out.print("  ");
            }
            for (k = 5 - i; k >= 0; k--){
                System.out.print("_ ");
            }
            System.out.println();
        }

        System.out.println("=== Style 3 ===");
        for (i = 1; i <= 5; i++){
            for (j = 1; j <= i; j++){

                System.out.print(j+" ");
            }
            for (k = 5 - i; k >= 1; k--){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }
}


